package com.team16.ecoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class VerifyOrderActivity extends AppCompatActivity {
    ImageButton back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_order);
        back = (ImageButton)findViewById(R.id.back_button2);
        Button verify = findViewById(R.id.buttonverify);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();

            }
        });
        verify.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(VerifyOrderActivity.this, pay.class);
                startActivityForResult(intent, 0);
            }
        });

    }
}
