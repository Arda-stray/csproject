package com.example.busapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mapButton;
    private Button searchButton;
    private Button busButton;
    private Button routesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapButton = (Button) findViewById(R.id.mapButton);
        mapButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openMapActivity();
            }
        });

        searchButton = (Button) findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openSearchActivity();
            }
        });

        busButton = (Button) findViewById(R.id.busButton);
        busButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openBusActivity();
            }
        });

        routesButton = (Button) findViewById(R.id.routesButton);
        routesButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openRoutesActivity();
            }
        });
    }

    public void openMapActivity()
    {
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }

    public void openSearchActivity()
    {
        Intent intent = new Intent(this, SearchActivity.class);
        startActivity(intent);
    }

    public void openBusActivity()
    {
        Intent intent = new Intent(this, BusActivity.class);
        startActivity(intent);
    }

    public void openRoutesActivity()
    {
        Intent intent = new Intent(this, RoutesActivity.class);
        startActivity(intent);
    }
}