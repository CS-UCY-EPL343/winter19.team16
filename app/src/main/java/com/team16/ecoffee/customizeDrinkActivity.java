package com.team16.ecoffee;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;


public class customizeDrinkActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView img1,img2,img3,img4,img5,img6,img7;
    ImageButton add,remove;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize__drink__main);

        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        img4=findViewById(R.id.img4);
        img5=findViewById(R.id.img5);
        img6=findViewById(R.id.img6);
        img7=findViewById(R.id.img7);
        add=findViewById((R.id.add));
        remove=findViewById(R.id.remove);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
        img7.setOnClickListener(this);

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



        }
    }
}

