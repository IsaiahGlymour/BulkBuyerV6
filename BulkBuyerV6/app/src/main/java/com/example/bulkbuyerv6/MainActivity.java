package com.example.bulkbuyerv6;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //ADD LOGIN INFO
                startActivity(new Intent(MainActivity.this, HomePage.class));
            }
        });
    }
}
