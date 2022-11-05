package com.example.blinkin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Categories_list extends AppCompatActivity {
    ListView simpleList;
    String categoriesList[] = {"Art & Craft", "Carriers & Accessories", "Consumer Electronics", "Home decor", "Tools & Hardware", "Photography", "Vehicle", "Books", "Garden", "Music", "Sports Equipment"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories_list);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, categoriesList);
        simpleList.setAdapter(arrayAdapter);
    }
}