package com.example.bulkbuyerv6;

//import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Button home = (Button) findViewById(R.id.button8);

        home.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //ADD LOGIN INFO
                startActivity(new Intent(Profile.this, HomePage.class));
            }
        });

    }

}
