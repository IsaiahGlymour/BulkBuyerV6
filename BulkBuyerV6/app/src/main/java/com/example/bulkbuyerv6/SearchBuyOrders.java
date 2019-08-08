package com.example.bulkbuyerv6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class SearchBuyOrders extends AppCompatActivity {

    ListView listView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_buy_orders);

        listView2 = (ListView) findViewById(R.id.searchBuyOrders);

        ArrayList<String> myOrders = new ArrayList<String>();

        myOrders.add("1");
        myOrders.add("2");
        myOrders.add("3");
        myOrders.add("4");
        myOrders.add("5");
        myOrders.add("6");
        myOrders.add("7");
        myOrders.add("8");
        myOrders.add("9");
        myOrders.add("10");
        myOrders.add("1");
        myOrders.add("2");
        myOrders.add("3");
        myOrders.add("4");
        myOrders.add("5");
        myOrders.add("6");
        myOrders.add("7");
        myOrders.add("8");
        myOrders.add("9");
        myOrders.add("10");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, myOrders);
        listView2.setAdapter(arrayAdapter);

        Button home = (Button) findViewById(R.id.button10);

        home.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //ADD LOGIN INFO
                startActivity(new Intent(SearchBuyOrders.this, HomePage.class));
            }
        });
    }
}
