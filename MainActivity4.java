package com.tej.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public String[] source_locations1 =
            {"Mumbai", "Pune", "Delhi"};

}

//    ArrayAdapter<String> categoryAdapter = new ArrayAdapter<>(this,
//            android.R.layout.simple_spinner_dropdown_item, source_locations1);
//    source_locations1.SetAdapter(categoryAdapter);
