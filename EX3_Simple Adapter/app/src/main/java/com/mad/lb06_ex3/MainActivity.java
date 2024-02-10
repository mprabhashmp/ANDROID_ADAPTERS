package com.mad.lb06_ex3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.SimpleTimeZone;

public class MainActivity extends AppCompatActivity {

    ListView simpleListView;
    String[] animalName = {"Rabbit","Squirrel","Dog","Tiger","Elephant","Deer"};

    int[] animalImages = {
            R.drawable.animal1,R.drawable.animal2,R.drawable.animal3,R.drawable.animal4,R.drawable.animal5,R.drawable.animal6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleListView=(ListView) findViewById(R.id.simpleListView);
        ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();

        for (int i =0 ; i<animalName.length;i++){

            HashMap<String,String> hashMap = new HashMap<>();
            hashMap.put("name",animalName[i]);
            hashMap.put("image",animalImages[i]+"");
            arrayList.add(hashMap);

        }

        String[] from = {"name","image"};
        int[] to={R.id.textView,R.id.imageView};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this,arrayList,R.layout.list_view_items,from,to);
        simpleListView.setAdapter(simpleAdapter);


        simpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),animalName[i],Toast.LENGTH_LONG).show();
            }
        });
    }
}