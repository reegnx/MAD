package com.example.exp1_food_order;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    CheckBox chapati , burger , pizza , shaldon;
    Button order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chapati = (CheckBox) findViewById(R.id.c1);
        pizza = (CheckBox) findViewById(R.id.c2);
        burger = (CheckBox) findViewById(R.id.c3);
        shaldon = (CheckBox) findViewById(R.id.c4);
        order = (Button) findViewById(R.id.b1);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalamount = 0;
                StringBuilder result = new StringBuilder();
                result.append("Selected Items :"+" ");
                if (chapati.isChecked()) {
                    result.append("Chapati 30 rs"+" ");
                    totalamount += 30;
                }
                if (pizza.isChecked()) {
                    result.append("Pizza 120 rs" +" ");
                    totalamount += 120;
                }
                if (burger.isChecked()) {
                    result.append("Burger 110 rs"+" ");
                    totalamount += 110;
                }
                if (shaldon.isChecked()) {
                    result.append("Shaldon 1250 rs"+" ");
                    totalamount += 1250;
                }
                result.append("Total amount :" + totalamount + "rs"+" ");

                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();

            }
        });
    }
}