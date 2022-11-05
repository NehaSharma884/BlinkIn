package com.example.blinkin;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class SubCategory extends AppCompatActivity {
    ListView simpleList;
    String updateList[] = {"Update Ios", "Update whatsapp", "Update instagram"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_category);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, updateList);
        simpleList.setAdapter(arrayAdapter);
    }
}