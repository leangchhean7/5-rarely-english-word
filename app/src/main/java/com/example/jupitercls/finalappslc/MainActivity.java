package com.example.jupitercls.finalappslc;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lst;
    String[] itemname = {
            "serendipity",
            "pastiche",
            "onomatopoeia",
            "Incipient",
            "Halcyon"
    };
    String[] descriptionWord = {"serendipity finding something nice while looking for something else", "an art work combining materials from various sources", "a word that sounds like its meaning", "Beginning, in an early stage", " Happy, sunny, care free"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lst = (ListView) findViewById(R.id.list);
        lst.setAdapter(new ArrayAdapter<String>(
                this, R.layout.list_items,
                R.id.firstLine, itemname));


        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1,
                                    int position, long arg3) {
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) lst.getItemAtPosition(position);
                Intent intent = new Intent(getBaseContext(), details_activitys.class);
                intent.putExtra("EXTRA_SESSION_ID", itemValue);
                intent.putExtra("Description_ID",descriptionWord[itemPosition]);
                startActivity(intent);



            }
        });
    }
}
