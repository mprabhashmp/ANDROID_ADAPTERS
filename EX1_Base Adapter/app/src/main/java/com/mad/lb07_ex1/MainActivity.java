package com.mad.lb07_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView simpleGrid;
    int animals[] = {R.drawable.animal1,R.drawable.animal2
                        ,R.drawable.animal3,R.drawable.animal4
            ,R.drawable.animal5,R.drawable.animal6 };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleGrid = (GridView) findViewById(R.id.grid);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),animals);
        simpleGrid.setAdapter(customAdapter);
    }
}