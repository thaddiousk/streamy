package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // 0 = X, 1 = O.
    private int activePlayer = 0;
    // 10 means empty.
    private int[] gameState= {10, 10, 10, 10, 10, 10, 10, 10, 10};

    private int[][] winningPositions = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7},
            {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dropIn(View view) {
        ImageView counter = (ImageView) view;

        int tappedCounter = Integer.parseInt(counter.getTag().toString());

        if (gameState[tappedCounter] == 10) {
            gameState[tappedCounter] = activePlayer;
            counter.setTranslationY(-3000f);
            if (activePlayer == 0) {
                counter.setImageResource(R.drawable.x);
                activePlayer = 1;
            } else {
                counter.setImageResource(R.drawable.o);
                activePlayer = 0;
            }
            counter.animate().translationYBy(3000f).rotation(360f).setDuration(300);

            // Check winning status
            for (int[] winning : winningPositions) {
                if (gameState[winning[0]] == gameState[winning[1]]
                        && gameState[winning[1]] == gameState[winning[2]]
                        && gameState[winning[0]] != 10) {
                    System.out.println(gameState[winning[0]]);
                }
            }

        }

    }
}