package com.team16.ecoffee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class customizeDrinkActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView img1,img2,img3,img4,img5,img6,img7;
    ImageButton add,remove,back;
    TextView quantity, total_price, type, addToCart;
    int count = 1;
    double price = 1.90;
    double total = 1.90;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        if (getIntent().getStringExtra("coffee").equals("frappe"))
            setContentView(R.layout.activity_customize_frappe);
        else
            setContentView(R.layout.activity_customize_freddo);
        back= findViewById(R.id.back_button);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        img4=findViewById(R.id.img4);
        img5=findViewById(R.id.img5);
        img6=findViewById(R.id.img6);
        img7=findViewById(R.id.img7);
        add=findViewById((R.id.add));
        remove=findViewById(R.id.remove);
        quantity = findViewById(R.id.quantity);
        total_price = findViewById(R.id.total_price);
        type = findViewById(R.id.coffee_type);
        addToCart = findViewById(R.id.add_to_cart);
        if (getIntent().getStringExtra("coffee").equals("capp"))
            type.setText("Cappuccino");

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);
        add.setOnClickListener(this);
        remove.setOnClickListener(this);
        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("price", Double.toString(total));
                setResult(Activity.RESULT_OK, intent);
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
            }
        });
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.img1:

                img1.setImageResource(R.drawable.ic_coffeecup1);
                img2.setImageResource(R.drawable.ic_coffee);
                img3.setImageResource(R.drawable.ic_fill_7);

                break;
            case R.id.img2:

                img1.setImageResource(R.drawable.ic_coffeecup);
                img2.setImageResource(R.drawable.ic_coffee_2);
                img3.setImageResource(R.drawable.ic_fill_7);


                break;
            case R.id.img3:


                img1.setImageResource(R.drawable.ic_coffeecup);
                img2.setImageResource(R.drawable.ic_coffee);
                img3.setImageResource(R.drawable.ic_fill_7_1);
                break;

            case R.id.img5:
                img5.setImageResource(R.drawable.ic_group_4_copy_1);
                img6.setImageResource(R.drawable.ic_group_4_copy_2);
                img7.setImageResource(R.drawable.ic_group_4_copy_3);
                img4.setImageResource(R.drawable.ic_group_4_copy_4);
                break;

            case R.id.img6:
                img5.setImageResource(R.drawable.ic_group_4_copy);
                img6.setImageResource(R.drawable.ic_group_4_copy_2_1);
                img7.setImageResource(R.drawable.ic_group_4_copy_3);
                img4.setImageResource(R.drawable.ic_group_4_copy_4);
                break;

            case R.id.img7:
                img5.setImageResource(R.drawable.ic_group_4_copy);
                img6.setImageResource(R.drawable.ic_group_4_copy_2);
                img7.setImageResource(R.drawable.ic_group_4_copy_3_1);
                img4.setImageResource(R.drawable.ic_group_4_copy_4);
                break;

            case R.id.img4:
                img5.setImageResource(R.drawable.ic_group_4_copy);
                img6.setImageResource(R.drawable.ic_group_4_copy_2);
                img7.setImageResource(R.drawable.ic_group_4_copy_3);
                img4.setImageResource(R.drawable.ic_group_4_copy_4_1);
                break;

            case R.id.add:
                count++;
                total = price*count;
                quantity.setText(Integer.toString(count));
                total_price.setText(String.format("€%.2f",total));
                break;

            case R.id.remove:
                if (count <= 1)
                    break;
                count--;
                total = price*count;
                quantity.setText(Integer.toString(count));
                total_price.setText(String.format("€%.2f",total));
                break;
        }
    }
}

