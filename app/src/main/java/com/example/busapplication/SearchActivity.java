package com.example.busapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    private ArrayList<String> busStopList;
    private ListView listView;
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        listView=(ListView)findViewById(R.id.listViewBusStop);
        createBusStopList();
        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, busStopList);
        listView.setAdapter(arrayAdapter);

    }

    private void createBusStopList()
    {
        busStopList = new ArrayList<String>();
        busStopList.add("Bus Stop 1");
        busStopList.add("Bus Stop 1");
        busStopList.add("Bus Stop 1");
        busStopList.add("Bus Stop 1");
        busStopList.add("Bus Stop 1");
        busStopList.add("Bus Stop 1");
    }

}