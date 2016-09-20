package com.example.android.quidditchscores;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreHolly = 0;
    int scoreChudley = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayHolly(0);
    }

    /**
     * Reset Score's to 0
     */
    public void resetScore(View view) {
        scoreHolly = 0;
        scoreChudley = 0;
        displayHolly(scoreHolly);
        displayChudley(scoreChudley);
    }

    /**
     * method for 3 points to Team A
     */
    public void quaffleHolly(View view) {
        scoreHolly = scoreHolly + 10;
        displayHolly(scoreHolly);
    }

    /**
     * method for 2 points to Team A
     */
    public void goldenSnitchHolly(View view) {
        scoreHolly = scoreHolly + 150;
        displayHolly(scoreHolly);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayHolly(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_holly_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * method for 3 points to Team B
     */
    public void quaffleChudley(View view) {
        scoreChudley = scoreChudley + 10;
        displayChudley(scoreChudley);
    }

    /**
     * method for 2 points to Team B
     */
    public void snitchChudley(View view) {
        scoreChudley = scoreChudley + 150;
        displayChudley(scoreChudley);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayChudley(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_chudley_score);
        scoreView.setText(String.valueOf(score));
    }
}
