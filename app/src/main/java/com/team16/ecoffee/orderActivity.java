package com.team16.ecoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class orderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Button freddoButton = findViewById(R.id.freddo_button);
        freddoButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(orderActivity.this, customizeDrinkActivity.class));
            }
        });
    }
}
