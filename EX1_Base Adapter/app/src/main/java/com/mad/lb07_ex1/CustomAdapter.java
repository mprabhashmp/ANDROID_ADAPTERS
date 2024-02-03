package com.mad.lb07_ex1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    int animals[];
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, int[] animals){
        this.context = applicationContext;
        this.animals = animals;
        inflater  = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return animals.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
       view = inflater.inflate(R.layout.activity_grideview,null);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        icon.setImageResource(animals[i]);
        return view;
    }
}
