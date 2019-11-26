package com.team16.ecoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Emailsend extends AppCompatActivity {
    TextView emaill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emailsend);
        emaill = findViewById(R.id.thankss);
        emaill.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(Emailsend.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

}
