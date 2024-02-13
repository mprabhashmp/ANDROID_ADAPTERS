package com.mad.lb06_ex4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView simpleListView;
    String[] animalNames = {"Rabbbit","Squirrel","Dog","Tiger","Elephant","Deer"};

    int[] animalImages = {R.drawable.animal1,R.drawable.animal2,R.drawable.animal3,R.drawable.animal4,R.drawable.animal5,R.drawable.animal6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleListView = (ListView) findViewById(R.id.simpleListView);

        ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();

        for(int i =0 ; i < animalNames.length; i++){
            HashMap<String,String> hashMap = new HashMap<>();
            hashMap.put("name",animalNames[i]);
            hashMap.put("image",animalImages[i] + "");
            arrayList.add(hashMap);
        }

        String[] from = {"name","image"};
        int[] to = {R.id.textView,R.id.imageView};

        CustomAdapter simpleAdapter = new CustomAdapter(this,arrayList,R.layout.list_view_item,from,to);
        simpleListView.setAdapter(simpleAdapter);

        simpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),animalNames[i],Toast.LENGTH_LONG).show();
            }
        });
    }
}