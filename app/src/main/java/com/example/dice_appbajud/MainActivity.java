package com.example.dice_appbajud;

import static com.example.dice_appbajud.R.drawable.dice1;
import static com.example.dice_appbajud.R.drawable.dice2;
import static com.example.dice_appbajud.R.drawable.dice3;
import static com.example.dice_appbajud.R.drawable.dice4;
import static com.example.dice_appbajud.R.drawable.dice5;
import static com.example.dice_appbajud.R.drawable.dice6;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    TextView pointDice1,pointDice2,Total;
    CardView RollDice;
    ImageView Dice1,Dice2;

    int images[] = {dice1,dice2,dice3,dice4,dice5,dice6};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pointDice1 = findViewById(R.id.pointDice1);
        pointDice2 = findViewById(R.id.pointDice2);
        Total = findViewById(R.id.Total);
        RollDice = findViewById(R.id.RollDice);
        Dice1 = findViewById(R.id.Dice1);
        Dice2 = findViewById(R.id.Dice2);

        RollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random = new Random();
                int num = random.nextInt(6);
                int num1 = random.nextInt(6);
                setDice1(num);
                setDice2(num1);
                int calculate = num+num1;
                Total.setText("Calculation of two dice : "+(calculate+2));
            }
            private void setDice1(int num) {
                Dice1.setImageResource(images[num]);
                pointDice1.setText("Dice 1 Point : "+(num+1));
            }
            private void setDice2(int num1) {
                Dice2.setImageResource(images[num1]);
                pointDice2.setText("Dice 2 Point : "+(num1+1));
            }
        });
    }
}