// Create a application which generates random color on each click

package com.example.exp2_color_change;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.b1);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                ConstraintLayout r = findViewById(R.id.main);
                Random gen = new Random();
                r.setBackgroundColor(
                       Color.rgb(
                               gen.nextInt(256),
                               gen.nextInt(256),
                               gen.nextInt(256)
                       )
                );
            }
        });
    }
}