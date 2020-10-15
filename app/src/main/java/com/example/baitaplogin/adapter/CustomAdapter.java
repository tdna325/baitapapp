package com.example.baitaplogin.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.baitaplogin.R;
import com.example.baitaplogin.model.Coffee;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Coffee> {
    private Context context;
    private int resource;
    private ArrayList<Coffee> arrList;


    public CustomAdapter(@NonNull Context context, int resource, ArrayList<Coffee> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.arrList=objects;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.item_listview,parent,false);
        TextView tv_color = (TextView) convertView.findViewById(R.id.tv_color);
        TextView tv_name = (TextView) convertView.findViewById(R.id.tv_name);
        TextView tv_number = (TextView) convertView.findViewById(R.id.tv_number);
        Coffee coffee = arrList.get(position);
        tv_color.setBackgroundColor(coffee.getmColor());
        tv_color.setText((position+1)+"");
        tv_name.setText(coffee.getmName());
        tv_number.setText(coffee.getmNumber());
        return convertView;
    }
}
