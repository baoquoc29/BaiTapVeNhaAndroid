package com.example.danhsachbtvn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_view);
        list.add(new SinhVien("72DCHT20083","Quoc","3/12 Chu Van An","Viet Nam"));
        list.add(new SinhVien("72DCHT20082","Binh","147 Trieu Khuc","Viet Nam"));
        list.add(new SinhVien("72DCHT20081","Minh","So 5 Tu Mo","Viet Nam"));
        list.add(new SinhVien("72DCHT20089","Trung","Cho Trieu Khuc","Viet Nam"));
        list.add(new SinhVien("72DCHT20083","Manh","Van Phu Ha Dong","Viet Nam"));
        list.add(new SinhVien("72DCHT20088","Linh","Bac Giang","Viet Nam"));
        list.add(new SinhVien("72DCHT20080","Huy","Vu Tru","Viet Nam"));
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
        clickto = findViewById(R.id.btnClicko);
        clickto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
    private ListView listView;
    private List<SinhVien> list = new ArrayList<>();
    private Button clickto;
}