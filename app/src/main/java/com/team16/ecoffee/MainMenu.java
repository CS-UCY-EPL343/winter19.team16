package com.team16.ecoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    TextView order, credit, about, history, logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        order = findViewById(R.id.order);
        credit = findViewById(R.id.credit);
        about = findViewById(R.id.about);
        history = findViewById(R.id.history);
        logout = findViewById(R.id.logout);
        order.setOnClickListener(new View.OnClickListener(){
                                      public void onClick(View v){
                                          Intent intent = new Intent(MainMenu.this, orderActivity.class);
                                          startActivity(intent);
                                      }
         });
        credit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainMenu.this, credit.class);
                startActivity(intent);
            }
        });
        about.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainMenu.this, Aboutus.class);
                startActivity(intent);
            }
        });
        history.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainMenu.this, activity_history.class);
                startActivity(intent);
            }
        });
        logout.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainMenu.this, LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}
