package com.example.bulkbuyerv6;

//import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CreateBuyOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_buy_order);

        Button cancel = (Button) findViewById(R.id.button7);

        cancel.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                startActivity(new Intent(CreateBuyOrder.this, HomePage.class));
            }
        });
    }
}
