package com.example.sidhant.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button)findViewById(R.id.roll_button);

        final ImageView LD = (ImageView)findViewById(R.id.image_leftdice);
        final ImageView RD = (ImageView)findViewById(R.id.image_rightdice);
        final int[] DiceArray = {R.drawable.dice1,R.drawable.dice2,
                           R.drawable.dice3,R.drawable.dice4,
                           R.drawable.dice5,R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random rng = new Random();
                int n1 = rng.nextInt(6 );
                LD.setImageResource( DiceArray[n1]);
               int n2 = rng.nextInt(6);
                RD.setImageResource(DiceArray[n2]);
            }
        });

    }



}
