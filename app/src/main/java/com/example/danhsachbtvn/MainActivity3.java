package com.example.danhsachbtvn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        spinner = findViewById(R.id.spn);
        list.add(new Country("Viet Nam"));
        list.add(new Country("Thai Lan"));
        list.add(new Country("Mỹ"));
        list.add(new Country("Campuchia"));
        list.add(new Country("Indonesia"));
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,list);
        spinner.setAdapter(adapter);
    }
    private Spinner spinner;
    private List<Country> list = new ArrayList<>();
}