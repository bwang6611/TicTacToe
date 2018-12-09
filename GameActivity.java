package com.example.blairwang.ttt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    static int player1Counter = 1;
    static int player2Counter = 0;

    public int getWinner() {
        Button topLeft = (Button) findViewById(R.id.Top_Left);
        Button topMid = (Button) findViewById(R.id.Top_Middle);
        Button topRight = (Button) findViewById(R.id.Top_Right);
        Button midLeft = (Button) findViewById(R.id.Middle_Left);
        Button midMid = (Button) findViewById(R.id.Middle_Middle);
        Button midRight = (Button) findViewById(R.id.Middle_Right);
        Button botLeft = (Button) findViewById(R.id.Bottom_Left);
        Button botMid = (Button) findViewById(R.id.Bottom_Middle);
        Button botRight = (Button) findViewById(R.id.Bottom_Right);
        if (topLeft.getText().toString().equals(topMid.getText().toString()) && topLeft.getText().toString().equals(topRight.getText().toString())) {
            if (topLeft.getText().toString().equals("X")) {
                return 1;
            } else if (topLeft.getText().toString().equals("O")) {
                return 2;
            }
        }
        if (midLeft.getText().toString().equals(midMid.getText().toString()) && midLeft.getText().toString().equals(midRight.getText().toString())) {
            if (midLeft.getText().toString().equals("X")) {
                return 1;
            } else if (midLeft.getText().toString().equals("O")) {
                return 2;
            }
        }
        if (botLeft.getText().toString().equals(botMid.getText().toString()) && botLeft.getText().toString().equals(botRight.getText().toString())) {
            if (botLeft.getText().toString().equals("X")) {
                return 1;
            } else if (botLeft.getText().toString().equals("O")) {
                return 2;
            }
        }
        if (topLeft.getText().toString().equals(midLeft.getText().toString()) && topLeft.getText().toString().equals(botLeft.getText().toString())) {
            if (topLeft.getText().toString().equals("X")) {
                return 1;
            } else if (topLeft.getText().toString().equals("O")) {
                return 2;
            }
        }
        if (topMid.getText().toString().equals(midMid.getText().toString()) && topMid.getText().toString().equals(botMid.getText().toString())) {
            if (topMid.getText().toString().equals("X")) {
                return 1;
            } else if (topMid.getText().toString().equals("O")) {
                return 2;
            }
        }
        if (topRight.getText().toString().equals(midRight.getText().toString()) && topRight.getText().toString().equals(botRight.getText().toString())) {
            if (topRight.getText().toString().equals("X")) {
                return 1;
            } else if (topRight.getText().toString().equals("O")) {
                return 2;
            }
        }
        if (topLeft.getText().toString().equals(midMid.getText().toString()) && topLeft.getText().toString().equals(botRight.getText().toString())) {
            if (topLeft.getText().toString().equals("X")) {
                return 1;
            } else if (topLeft.getText().toString().equals("O")) {
                return 2;
            }
        }
        if (topRight.getText().toString().equals(midMid.getText().toString()) && topRight.getText().toString().equals(botLeft.getText().toString())) {
            if (topRight.getText().toString().equals("X")) {
                return 1;
            } else if (topRight.getText().toString().equals("O")) {
                return 2;
            }
        }
        return 0;
    }

    public void resetBoard() {
        Button topLeft = (Button) findViewById(R.id.Top_Left);
        Button topMid = (Button) findViewById(R.id.Top_Middle);
        Button topRight = (Button) findViewById(R.id.Top_Right);
        Button midLeft = (Button) findViewById(R.id.Middle_Left);
        Button midMid = (Button) findViewById(R.id.Middle_Middle);
        Button midRight = (Button) findViewById(R.id.Middle_Right);
        Button botLeft = (Button) findViewById(R.id.Bottom_Left);
        Button botMid = (Button) findViewById(R.id.Bottom_Middle);
        Button botRight = (Button) findViewById(R.id.Bottom_Right);
        topLeft.setText("");
        topMid.setText("");
        topRight.setText("");
        midLeft.setText("");
        midMid.setText("");
        midRight.setText("");
        botLeft.setText("");
        botMid.setText("");
        botRight.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        final Button topLeft = (Button) findViewById(R.id.Top_Left);
        final Button topMid = (Button) findViewById(R.id.Top_Middle);
        final Button topRight = (Button) findViewById(R.id.Top_Right);
        final Button midLeft = (Button) findViewById(R.id.Middle_Left);
        final Button midMid = (Button) findViewById(R.id.Middle_Middle);
        final Button midRight = (Button) findViewById(R.id.Middle_Right);
        final Button botLeft = (Button) findViewById(R.id.Bottom_Left);
        final Button botMid = (Button) findViewById(R.id.Bottom_Middle);
        final Button botRight = (Button) findViewById(R.id.Bottom_Right);

        topLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(topLeft.getText().toString().equals(""))) {
                    Toast.makeText(GameActivity.this, "Choose another tile!", Toast.LENGTH_LONG).show();
                } else {
                    if (player1Counter == 1) {
                        topLeft.setText("X");
                        player1Counter = 0;
                        player2Counter = 1;
                    } else if (player2Counter == 1) {
                        topLeft.setText("O");
                        player1Counter = 1;
                        player2Counter = 0;
                    }
                }
                if (getWinner() == 1) {
                    Toast.makeText(GameActivity.this, "Player 1 Wins!", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(GameActivity.this, "Player 2 Wins!", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
            }
        });

        topMid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(topMid.getText().toString().equals(""))) {
                    Toast.makeText(GameActivity.this, "Choose another tile!", Toast.LENGTH_LONG).show();
                } else {
                    if (player1Counter == 1) {
                        topMid.setText("X");
                        player1Counter = 0;
                        player2Counter = 1;
                    } else if (player2Counter == 1) {
                        topMid.setText("O");
                        player1Counter = 1;
                        player2Counter = 0;
                    }
                }
                if (getWinner() == 1) {
                    Toast.makeText(GameActivity.this, "Player 1 Wins!", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(GameActivity.this, "Player 2 Wins!", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
            }
        });
        topRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(topRight.getText().toString().equals(""))) {
                    Toast.makeText(GameActivity.this, "Choose another tile!", Toast.LENGTH_LONG).show();
                } else {
                    if (player1Counter == 1) {
                        topRight.setText("X");
                        player1Counter = 0;
                        player2Counter = 1;
                    } else if (player2Counter == 1) {
                        topRight.setText("O");
                        player1Counter = 1;
                        player2Counter = 0;
                    }
                }
                if (getWinner() == 1) {
                    Toast.makeText(GameActivity.this, "Player 1 Wins!", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(GameActivity.this, "Player 2 Wins!", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
            }
        });
        midLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(midLeft.getText().toString().equals(""))) {
                    Toast.makeText(GameActivity.this, "Choose another tile!", Toast.LENGTH_LONG).show();
                } else {
                    if (player1Counter == 1) {
                        midLeft.setText("X");
                        player1Counter = 0;
                        player2Counter = 1;
                    } else if (player2Counter == 1) {
                        midLeft.setText("O");
                        player1Counter = 1;
                        player2Counter = 0;
                    }
                }
                if (getWinner() == 1) {
                    Toast.makeText(GameActivity.this, "Player 1 Wins!", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(GameActivity.this, "Player 2 Wins!", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
            }
        });
        midMid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(midMid.getText().toString().equals(""))) {
                    Toast.makeText(GameActivity.this, "Choose another tile!", Toast.LENGTH_LONG).show();
                } else {
                    if (player1Counter == 1) {
                        midMid.setText("X");
                        player1Counter = 0;
                        player2Counter = 1;
                    } else if (player2Counter == 1) {
                        midMid.setText("O");
                        player1Counter = 1;
                        player2Counter = 0;
                    }
                }
                if (getWinner() == 1) {
                    Toast.makeText(GameActivity.this, "Player 1 Wins!", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(GameActivity.this, "Player 2 Wins!", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
            }
        });
        midRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(midRight.getText().toString().equals(""))) {
                    Toast.makeText(GameActivity.this, "Choose another tile!", Toast.LENGTH_LONG).show();
                } else {
                    if (player1Counter == 1) {
                        midRight.setText("X");
                        player1Counter = 0;
                        player2Counter = 1;
                    } else if (player2Counter == 1) {
                        midRight.setText("O");
                        player1Counter = 1;
                        player2Counter = 0;
                    }
                }
                if (getWinner() == 1) {
                    Toast.makeText(GameActivity.this, "Player 1 Wins!", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(GameActivity.this, "Player 2 Wins!", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
            }
        });
        botLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(botLeft.getText().toString().equals(""))) {
                    Toast.makeText(GameActivity.this, "Choose another tile!", Toast.LENGTH_LONG).show();
                } else {
                    if (player1Counter == 1) {
                        botLeft.setText("X");
                        player1Counter = 0;
                        player2Counter = 1;
                    } else if (player2Counter == 1) {
                        botLeft.setText("O");
                        player1Counter = 1;
                        player2Counter = 0;
                    }
                }
                if (getWinner() == 1) {
                    Toast.makeText(GameActivity.this, "Player 1 Wins!", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(GameActivity.this, "Player 2 Wins!", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
            }
        });
        botMid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(botMid.getText().toString().equals(""))) {
                    Toast.makeText(GameActivity.this, "Choose another tile!", Toast.LENGTH_LONG).show();
                } else {
                    if (player1Counter == 1) {
                        botMid.setText("X");
                        player1Counter = 0;
                        player2Counter = 1;
                    } else if (player2Counter == 1) {
                        botMid.setText("O");
                        player1Counter = 1;
                        player2Counter = 0;
                    }
                }
                if (getWinner() == 1) {
                    Toast.makeText(GameActivity.this, "Player 1 Wins!", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(GameActivity.this, "Player 2 Wins!", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
            }
        });
        botRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!(botRight.getText().toString().equals(""))) {
                    Toast.makeText(GameActivity.this, "Choose another tile!", Toast.LENGTH_LONG).show();
                } else {
                    if (player1Counter == 1) {
                        botRight.setText("X");
                        player1Counter = 0;
                        player2Counter = 1;
                    } else if (player2Counter == 1) {
                        botRight.setText("O");
                        player1Counter = 1;
                        player2Counter = 0;
                    }
                }
                if (getWinner() == 1) {
                    Toast.makeText(GameActivity.this, "Player 1 Wins!", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
                if (getWinner() == 2) {
                    Toast.makeText(GameActivity.this, "Player 2 Wins!", Toast.LENGTH_LONG).show();
                    resetBoard();
                }
            }
        });

    }
}
