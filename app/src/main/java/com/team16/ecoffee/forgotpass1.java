package com.team16.ecoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class forgotpass1 extends AppCompatActivity {

    TextView send;
    ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgotpass1);
        send = findViewById(R.id.send_email);
        back = (ImageButton)findViewById(R.id.back_button);
        send.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(forgotpass1.this, Emailsend.class);
                startActivity(intent);
            }
        });
        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
            }
        });
    }
}
