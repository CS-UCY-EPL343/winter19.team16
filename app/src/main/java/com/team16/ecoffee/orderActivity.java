package com.team16.ecoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class orderActivity extends AppCompatActivity {
    ImageButton back,checkout;

    double total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        total = 0;
        setContentView(R.layout.activity_order);
        Button freddoButton = findViewById(R.id.freddo_button);
        Button frappeButton = findViewById(R.id.frappe_button);
        Button cappButton = findViewById(R.id.capuccino_button);
        back = (ImageButton)findViewById(R.id.back_button);
        checkout = (ImageButton)findViewById(R.id.checkout);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();

            }
        });
        freddoButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(orderActivity.this, customizeDrinkActivity.class);
                intent.putExtra("coffee","freddo");
                startActivityForResult(intent, 0);
            }
        });
        frappeButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(orderActivity.this, customizeDrinkActivity.class);
                intent.putExtra("coffee","frappe");
                startActivityForResult(intent, 0);
            }
        });
        cappButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(orderActivity.this, customizeDrinkActivity.class);
                intent.putExtra("coffee","capp");
                startActivityForResult(intent, 0);
            }
        });
        checkout.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(orderActivity.this, VerifyOrderActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Check that it is the SecondActivity with an OK result
        if (requestCode == 0) {
            if (resultCode == RESULT_OK) {

                // Get String data from Intent
                String returnString = data.getStringExtra("price");
                total += Double.parseDouble(returnString);
                // Set text view with string
                TextView textView = findViewById(R.id.total);
                textView.setText(String.format("Total: €%.2f", total));
            }
        }
    }
}
