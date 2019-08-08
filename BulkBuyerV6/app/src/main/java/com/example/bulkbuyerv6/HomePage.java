package com.example.bulkbuyerv6;

//import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        Button createBuyOrder = (Button) findViewById(R.id.button);
        Button searchBuyOrders = (Button) findViewById(R.id.button2);
        Button viewMyOrders = (Button) findViewById(R.id.button3);
        Button viewProfile = (Button) findViewById(R.id.button4);

        createBuyOrder.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //ADD LOGIN INFO
                startActivity(new Intent(HomePage.this, CreateBuyOrder.class));
            }
        });

        searchBuyOrders.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //ADD LOGIN INFO
                startActivity(new Intent(HomePage.this, SearchBuyOrders.class));
            }
        });

        viewMyOrders.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //ADD LOGIN INFO
                startActivity(new Intent(HomePage.this, ViewMyOrders.class));
            }
        });

        viewProfile.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //ADD LOGIN INFO
                startActivity(new Intent(HomePage.this, Profile.class));
            }
        });
    }
}
