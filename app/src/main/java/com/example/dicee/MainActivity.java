package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

/**
 * @author Farhan Rahman
 * @version 08142020_01
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button)findViewById(R.id.rollButton);
        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        final ImageView rightDice = (ImageView)findViewById(R.id.imageView_rightDice);

        final int[] diceArray = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3,
                R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random randomNum = new Random();
                int randomNumberForLeftDice = randomNum.nextInt(6);
                int randomNumberForRightDice = randomNum.nextInt(6);

                leftDice.setImageResource(diceArray[randomNumberForLeftDice]);
                rightDice.setImageResource(diceArray[randomNumberForRightDice]);
            }
        });

    }
}