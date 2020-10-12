package com.example.bingo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button herButton = findViewById(R.id.forHerButton);
        Button hisButton = findViewById(R.id.forHimButton);

        final TextView[] personalTextView = new TextView[10];
        final TextView[] bothTextView = new TextView[15];

        personalTextView[0] = findViewById(R.id.oneOneText);
        personalTextView[1] = findViewById(R.id.oneTwoText);
        personalTextView[2] = findViewById(R.id.oneThreeText);
        personalTextView[3] = findViewById(R.id.oneFourText);
        personalTextView[4] = findViewById(R.id.oneFiveText);
        personalTextView[5] = findViewById(R.id.twoOneText);
        personalTextView[6] = findViewById(R.id.twoTwoText);
        personalTextView[7] = findViewById(R.id.twoThreeText);
        personalTextView[8] = findViewById(R.id.twoFourText);
        personalTextView[9] = findViewById(R.id.twoFiveText);

        bothTextView[0] = findViewById(R.id.threeOneText);
        bothTextView[1] = findViewById(R.id.threeTwoText);
        bothTextView[2] = findViewById(R.id.threeThreeText);
        bothTextView[3] = findViewById(R.id.threeFourText);
        bothTextView[4] = findViewById(R.id.threeFiveText);
        bothTextView[5] = findViewById(R.id.fourOneText);
        bothTextView[6] = findViewById(R.id.fourTwoText);
        bothTextView[7] = findViewById(R.id.fourThreeText);
        bothTextView[8] = findViewById(R.id.fourFourText);
        bothTextView[9] = findViewById(R.id.fourFiveText);
        bothTextView[10] = findViewById(R.id.fiveOneText);
        bothTextView[11] = findViewById(R.id.fiveTwoText);
        bothTextView[12] = findViewById(R.id.fiveThreeText);
        bothTextView[13] = findViewById(R.id.fiveFourText);
        bothTextView[14] = findViewById(R.id.fiveFiveText);

        final HerGeneration herGeneration = new HerGeneration(personalTextView);
        final HisGeneration hisGeneration = new HisGeneration(personalTextView);
        final BothGeneration bothGeneration = new BothGeneration(bothTextView);

        herButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                herGeneration.generate();
                bothGeneration.generate();
            }
        });

        hisButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                hisGeneration.generate();
                bothGeneration.generate();
            }
        });
    }
}
