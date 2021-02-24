package controleur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sn_quiz.R;

import informatique.quiz1;


public class gameActivity<score> extends AppCompatActivity {
    private TextView mGreetingText;
    private EditText mNameInput;
    private Button GAME1;
    private Button GAME2;
    private Button GAME3;
    private Button GAME4;
    private TextView score1;
    private TextView score2;
    private TextView score3;
    private TextView score4;

    public static int temp=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        GAME1 = (Button) findViewById(R.id.activity_game1_btn);
        GAME2 = (Button) findViewById(R.id.activity_game2_btn);
        GAME3 = (Button) findViewById(R.id.activity_game3_btn);
        score2 = (TextView) findViewById(R.id.activity_hist_txt);
        score3 = (TextView) findViewById(R.id.activity_mus_txt);

        int temp1 = (quiz1.temp1);
        int score = (quiz1.juste);

        if (score<temp1){
          score=temp1;
        }
        score1 = (TextView) findViewById(R.id.activity_info_txt);
        score1.setText("votre score est : " + score);
        temp=score;

        GAME1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //user clique sur le boutton
                Intent quiz1intent = new Intent(gameActivity.this, quiz1.class);
                startActivity(quiz1intent);

            }
        });
        GAME2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //user clique sur le button
                Intent quiz2intent = new Intent(gameActivity.this, histoir.quiz2.class);
                startActivity(quiz2intent);

            }
        });
        GAME3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //user clique sur le boutton
                Intent quizintent = new Intent(gameActivity.this, musique.quiz.class);
                startActivity(quizintent);

            }
        });
    }
}