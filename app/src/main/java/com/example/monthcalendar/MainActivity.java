package com.example.monthcalendar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<MonthList> months = new ArrayList<MonthList>();
    ListView monthsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();

        monthsList = findViewById(R.id.monthList);

        MonthListAdapter monthListAdapter = new MonthListAdapter(this, R.layout.list_item, months);
        monthsList.setAdapter(monthListAdapter);

        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MonthList selectedMonth = (MonthList) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), "A fost selectata luna: " + selectedMonth.getMonthName(), Toast.LENGTH_SHORT).show();
            }
        };
        monthsList.setOnItemClickListener(itemListener);
    }

    private void setInitialData() {
        months.add(new MonthList("Ianuarie", R.drawable.ianuarie));
        months.add(new MonthList("Februare", R.drawable.februarie));
        months.add(new MonthList("Martie", R.drawable.martie));
        months.add(new MonthList("Aprilie", R.drawable.aprilie));
        months.add(new MonthList("Mai", R.drawable.mai));
        months.add(new MonthList("Iunie", R.drawable.iunie));
        months.add(new MonthList("Iulie", R.drawable.iulie));
        months.add(new MonthList("August", R.drawable.august));
        months.add(new MonthList("Septembrie", R.drawable.septembrie));
        months.add(new MonthList("Octombrie", R.drawable.octombrie));
        months.add(new MonthList("Noiembrie", R.drawable.noiembrie));
        months.add(new MonthList("Decembrie", R.drawable.decembrie));
    }
}