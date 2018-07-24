//Java folder which contains the backend or the methods for the Application
package com.example.android.courtcounter_bastekball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamA(View view)
    {
        scoreTeamA  =scoreTeamA +3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoForTeamA(View view)
    {
        scoreTeamA = scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }
    public void addFreeThrowForTeamA(View view)
    {
        scoreTeamA = scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreeForTeamB(View view)
    {
        scoreTeamB  =scoreTeamB +3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoForTeamB(View view)
    {
        scoreTeamB = scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }
    public void addFreeThrowForTeamB(View view)
    {
        scoreTeamB = scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View view)
    {
        scoreTeamA =0;
        scoreTeamB =0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}

