package com.mad.lb06_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String animalList[] = {"Lion","Tiger","Monkey","Elephant","Dog","Cat","Camel"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter animals = new ArrayAdapter(this, android.R.layout.simple_spinner_item,animalList);
        animals.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(animals);
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {

        Toast.makeText(getApplicationContext(),animalList[position], Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {


    }
}