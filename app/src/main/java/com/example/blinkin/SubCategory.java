package com.example.blinkin;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


public class SubCategory extends AppCompatActivity {

    ListView simpleList;
    String articlesList[] = {"Connect your headphones", "Sharing data using AirDrop", "Set Up FaceId", "Set Phone Password", "Set up Apple Watch", "Set up your apple wallet", "Vehicle", "Books", "Garden", "Music", "Sports Equipment"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, articlesList);
        simpleList.setAdapter(arrayAdapter);
    }
}