package com.example.sd6501;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;

public class List extends AppCompatActivity {

    Toolbar toolbar;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        toolbar=(Toolbar)findViewById(R.id.listToolBar);
        setSupportActionBar(toolbar);

        ActionBar ab=getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


        listView=(ListView)findViewById(R.id.myBookList);

        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Berserk");
        arrayList.add("Berserk");
        arrayList.add("Berserk");
        arrayList.add("Berserk");
        arrayList.add("Berserk");
        arrayList.add("Berserk");
        arrayList.add("Berserk");
        arrayList.add("Berserk");
        arrayList.add("Berserk");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(List.this,"Clicked item: " + arrayList.get(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}