package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Reset both scores to zero
    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

     // Displays the score for Team A
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    // Team A increment by 3, display
    public void addThreeTeamA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    // Team A increment by 2, display
    public void addTwoTeamA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    // Team A increment by 1, display
    public void addOneTeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    // Team B display score
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    // Team B increment by 3, display
    public void addThreeTeamB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    // Team B increment by 2, display
    public void addTwoTeamB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    // Team B increment by 1, display
    public void addOneTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

}
