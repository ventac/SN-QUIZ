package informatique;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sn_quiz.R;

import controleur.MainActivity;
import controleur.gameActivity;

public class quiz1 extends AppCompatActivity {
    public static int juste;
    private TextView question1;
    private Button reponse1;
    private Button reponse2;
    private Button reponse3;
    private Button reponse4;
    private Button suite;
    private TextView NbPoint;

    public static int temp1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);
        question1 =  (TextView) findViewById(R.id.activity_question_txt);
        reponse1 = (Button) findViewById(R.id.activity_reponse1_btn);
        reponse2 = (Button) findViewById(R.id.activity_reponse2_btn);
        reponse3 = (Button) findViewById(R.id.activity_reponse3_btn);
        reponse4 = (Button) findViewById(R.id.activity_reponse4_btn);
        suite = (Button) findViewById(R.id.activity_suite_btn);
        NbPoint =  (TextView) findViewById(R.id.activity_NbPoint_txt);

        question1.setText("quelle est le masque de 172.30.0.254 ? ");
        reponse1.setText("255.255.0.0");
        reponse1.setBackgroundColor(Color.parseColor("#FF000000"));
        reponse2.setText("255.255.255.0");
        reponse2.setBackgroundColor(Color.parseColor("#FF000000"));
        reponse3.setText("/29");
        reponse3.setBackgroundColor(Color.parseColor("#FF000000"));
        reponse4.setText("/32");
        reponse4.setBackgroundColor(Color.parseColor("#FF000000"));

        suite.setEnabled(false);
        juste =0 ;

        reponse1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                reponse1.setBackgroundColor(Color.parseColor("#90EE90"));
                reponse2.setBackgroundColor(Color.parseColor("#FF0000"));
                reponse3.setBackgroundColor(Color.parseColor("#FF0000"));
                reponse4.setBackgroundColor(Color.parseColor("#FF0000"));
                suite.setEnabled(true);
                reponse1.setEnabled(false);
                reponse2.setEnabled(false);
                reponse3.setEnabled(false);
                reponse4.setEnabled(false);
                juste++;
                NbPoint.setText("nombre de point : " + juste);
            }
        });

        reponse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reponse1.setBackgroundColor(Color.parseColor("#90EE90"));
                reponse2.setBackgroundColor(Color.parseColor("#FF0000"));
                reponse3.setBackgroundColor(Color.parseColor("#FF0000"));
                reponse4.setBackgroundColor(Color.parseColor("#FF0000"));
                suite.setEnabled(true);
                reponse1.setEnabled(false);
                reponse2.setEnabled(false);
                reponse3.setEnabled(false);
                reponse4.setEnabled(false);
            }
        });

        reponse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reponse1.setBackgroundColor(Color.parseColor("#90EE90"));
                reponse2.setBackgroundColor(Color.parseColor("#FF0000"));
                reponse3.setBackgroundColor(Color.parseColor("#FF0000"));
                reponse4.setBackgroundColor(Color.parseColor("#FF0000"));
                suite.setEnabled(true);
                reponse1.setEnabled(false);
                reponse2.setEnabled(false);
                reponse3.setEnabled(false);
                reponse4.setEnabled(false);
            }
        });

        reponse4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reponse1.setBackgroundColor(Color.parseColor("#90EE90"));
                reponse2.setBackgroundColor(Color.parseColor("#FF0000"));
                reponse3.setBackgroundColor(Color.parseColor("#FF0000"));
                reponse4.setBackgroundColor(Color.parseColor("#FF0000"));
                suite.setEnabled(true);
                reponse1.setEnabled(false);
                reponse2.setEnabled(false);
                reponse3.setEnabled(false);
                reponse4.setEnabled(false);
            }
        });

        suite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                question1.setText("quelle est le masque de 192.166.0.254 ? ");
                reponse1.setText("/25");
                reponse1.setEnabled(true);
                reponse1.setBackgroundColor(Color.parseColor("#FF000000"));
                reponse2.setText("/69");
                reponse2.setEnabled(true);
                reponse2.setBackgroundColor(Color.parseColor("#FF000000"));
                reponse3.setText("/24");
                reponse3.setEnabled(true);
                reponse3.setBackgroundColor(Color.parseColor("#FF000000"));
                reponse4.setText("/30");
                reponse4.setEnabled(true);
                reponse4.setBackgroundColor(Color.parseColor("#FF000000"));

                suite.setEnabled(false);

                reponse1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        reponse1.setBackgroundColor(Color.parseColor("#FF0000"));
                        reponse2.setBackgroundColor(Color.parseColor("#FF0000"));
                        reponse3.setBackgroundColor(Color.parseColor("#90EE90"));
                        reponse4.setBackgroundColor(Color.parseColor("#FF0000"));
                        suite.setEnabled(true);
                        reponse1.setEnabled(false);
                        reponse2.setEnabled(false);
                        reponse3.setEnabled(false);
                        reponse4.setEnabled(false);
                    }
                });

                reponse2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        reponse1.setBackgroundColor(Color.parseColor("#FF0000"));
                        reponse2.setBackgroundColor(Color.parseColor("#FF0000"));
                        reponse3.setBackgroundColor(Color.parseColor("#90EE90"));
                        reponse4.setBackgroundColor(Color.parseColor("#FF0000"));
                        suite.setEnabled(true);
                        reponse1.setEnabled(false);
                        reponse2.setEnabled(false);
                        reponse3.setEnabled(false);
                        reponse4.setEnabled(false);
                    }
                });

                reponse3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        reponse1.setBackgroundColor(Color.parseColor("#FF0000"));
                        reponse2.setBackgroundColor(Color.parseColor("#FF0000"));
                        reponse3.setBackgroundColor(Color.parseColor("#90EE90"));
                        reponse4.setBackgroundColor(Color.parseColor("#FF0000"));
                        suite.setEnabled(true);
                        juste++;
                        NbPoint.setText("nombre de point : " + juste);
                        Intent intent = new Intent();

                        reponse1.setEnabled(false);
                        reponse2.setEnabled(false);
                        reponse3.setEnabled(false);
                        reponse4.setEnabled(false);
                    }
                });

                reponse4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        reponse1.setBackgroundColor(Color.parseColor("#FF0000"));
                        reponse2.setBackgroundColor(Color.parseColor("#FF0000"));
                        reponse3.setBackgroundColor(Color.parseColor("#90EE90"));
                        reponse4.setBackgroundColor(Color.parseColor("#FF0000"));
                        suite.setEnabled(true);
                        reponse1.setEnabled(false);
                        reponse2.setEnabled(false);
                        reponse3.setEnabled(false);
                        reponse4.setEnabled(false);
                    }
                });

                suite.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        temp1=(gameActivity.temp);
                        Intent gameActivityIntent = new Intent(quiz1.this, gameActivity.class);
                        startActivity(gameActivityIntent);
                    }
                });
            }
        });


    }
}