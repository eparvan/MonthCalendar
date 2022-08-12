package com.example.monthcalendar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class MonthListAdapter extends ArrayAdapter<MonthList> {
    private LayoutInflater inflater;
    private int layout;
    private List<MonthList> mounts;

    public MonthListAdapter(@NonNull Context context, int resource, List<MonthList> mounts) {
        super(context, resource, mounts);
        this.mounts = mounts;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View view = inflater.inflate(this.layout, parent, false);
        ImageView mrView = (ImageView) view.findViewById(R.id.mr);
        TextView nameView = (TextView) view.findViewById(R.id.name);

        MonthList monthList = mounts.get(position);

        mrView.setImageResource(monthList.getMonthResource());
        nameView.setText(monthList.getMonthName());
        return view;

    }
}
