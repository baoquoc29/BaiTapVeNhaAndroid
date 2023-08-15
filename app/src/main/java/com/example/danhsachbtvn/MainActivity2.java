package com.example.danhsachbtvn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);
            gridView = findViewById(R.id.grid_view);
            list23.add(new SinhVien("72DCHT20083","Quoc","3/12 Chu Van An","Viet Nam"));
            list23.add(new SinhVien("72DCHT20082","Binh","147 Trieu Khuc","Viet Nam"));
            list23.add(new SinhVien("72DCHT20081","Minh","So 5 Tu Mo","Viet Nam"));
            list23.add(new SinhVien("72DCHT20089","Trung","Cho Trieu Khuc","Viet Nam"));
            list23.add(new SinhVien("72DCHT20083","Manh","Van Phu Ha Dong","Viet Nam"));
            list23.add(new SinhVien("72DCHT20088","Linh","Bac Giang","Viet Nam"));
            list23.add(new SinhVien("72DCHT20080","Huy","Vu Tru","Viet Nam"));
            cl = findViewById(R.id.cl);
            ArrayAdapter<SinhVien> adapter = new ArrayAdapter<>(MainActivity2.this, android.R.layout.simple_expandable_list_item_1, list23);
            gridView.setAdapter(adapter);
            cl.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                    startActivity(intent);
                }
            });
        }
        private Button cl;
        private GridView gridView;
        private List<SinhVien> list23 = new ArrayList<>();
    }

