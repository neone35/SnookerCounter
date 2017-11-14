package com.example.android.snookercounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.android.snookercounter.R.id.view;

public class MainActivity extends AppCompatActivity {

    int playerOneScore = 0;
    int playerOneWins = 0;
    int playerTwoScore = 0;
    int playerTwoWins = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addScore (View btnView) {
        TextView scoreCount1 = (TextView) findViewById(R.id.first_player_score);
        TextView scoreCount2 = (TextView) findViewById(R.id.second_player_score);

        String btnViewId = btnView.getResources().getResourceName(btnView.getId());
        if(btnViewId.contains("first")){
            if(btnViewId.contains("red")) {
                playerOneScore = playerOneScore + 1;
            }
            else if(btnViewId.contains("yellow")) {
                playerOneScore = playerOneScore + 2;
            }
            else if(btnViewId.contains("green")) {
                playerOneScore = playerOneScore + 3;
            }
            else if(btnViewId.contains("bronze")) {
                playerOneScore = playerOneScore + 4;
            }
            else if(btnViewId.contains("blue")) {
                playerOneScore = playerOneScore + 5;
            }
            else if(btnViewId.contains("pink")) {
                playerOneScore = playerOneScore + 6;
            }
            else if(btnViewId.contains("black")) {
                playerOneScore = playerOneScore + 7;
            }
            scoreCount1.setText(String.valueOf(playerOneScore));
        }
        else if (btnViewId.contains("second")){
            if(btnViewId.contains("red")) {
                playerTwoScore = playerTwoScore + 1;
            }
            else if(btnViewId.contains("yellow")) {
                playerTwoScore = playerTwoScore + 2;
            }
            else if(btnViewId.contains("green")) {
                playerTwoScore = playerTwoScore + 3;
            }
            else if(btnViewId.contains("bronze")) {
                playerTwoScore = playerTwoScore + 4;
            }
            else if(btnViewId.contains("blue")) {
                playerTwoScore = playerTwoScore + 5;
            }
            else if(btnViewId.contains("pink")) {
                playerTwoScore = playerTwoScore + 6;
            }
            else if(btnViewId.contains("black")) {
                playerTwoScore = playerTwoScore + 7;
            }
            scoreCount2.setText(String.valueOf(playerTwoScore));
        }
    }

    public void modWins (View btnView) {
        TextView winsCount1 = (TextView) findViewById(R.id.first_player_wins_score);
        TextView winsCount2 = (TextView) findViewById(R.id.second_player_wins_score);

        String btnViewId = btnView.getResources().getResourceName(btnView.getId());
        if(btnViewId.contains("first")){
            if(btnViewId.contains("minus")) {
                if (!winsCount1.getText().toString().equals("0")) {
                    playerOneWins = playerOneWins - 1;
                }
            }
            else if(btnViewId.contains("plus")) {
                playerOneWins = playerOneWins + 1;
            }
            winsCount1.setText(String.valueOf(playerOneWins));
        }
        else if(btnViewId.contains("second")){
            if(btnViewId.contains("minus")) {
                if (!winsCount1.getText().toString().equals("0")) {
                    playerTwoWins = playerTwoWins - 1;
                }
            }
            else if(btnViewId.contains("plus")) {
                playerTwoWins = playerTwoWins + 1;
            }
            winsCount2.setText(String.valueOf(playerTwoWins));
        }
    }

    public void resetBtn (View btnView) {
        TextView scoreCount1 = (TextView) findViewById(R.id.first_player_score);
        TextView scoreCount2 = (TextView) findViewById(R.id.second_player_score);

        String btnViewId = btnView.getResources().getResourceName(btnView.getId());
        if(btnViewId.contains("first")){
            scoreCount1.setText(String.valueOf(0));
            playerOneScore = 0;
        }
        else if(btnViewId.contains("second")){
            scoreCount2.setText(String.valueOf(0));
            playerTwoScore = 0;
        }
    }

    public void resetAll (View btnView) {
        TextView scoreCount1 = (TextView) findViewById(R.id.first_player_score);
        scoreCount1.setText(String.valueOf(0));
        playerOneScore = 0;
        TextView scoreCount2 = (TextView) findViewById(R.id.second_player_score);
        scoreCount2.setText(String.valueOf(0));
        playerTwoScore = 0;
        TextView winsCount1 = (TextView) findViewById(R.id.first_player_wins_score);
        winsCount1.setText(String.valueOf(0));
        playerOneWins = 0;
        TextView winsCount2 = (TextView) findViewById(R.id.second_player_wins_score);
        winsCount2.setText(String.valueOf(0));
        playerTwoWins = 0;
    }
}
