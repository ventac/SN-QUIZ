package musique;

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

public class quiz extends AppCompatActivity {
    public static int juste1;
    private TextView question11;
    private Button reponse11;
    private Button reponse21;
    private Button reponse31;
    private Button reponse41;
    private Button suite;
    private TextView NbPoint1;

    public static int temp1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        public void ChangerColeurs(String reponse; String bonneReponse) {
            if(reponse11.text == bonneReponse){
            reponse11.setBackgroundColor(Color.parseColor("#FF0000"));
            points +1;
            }else  reponse11.setBackgroundColor(Color.parseColor("#autre"));

            reponse21.setBackgroundColor(Color.parseColor("#FF0000"));
            reponse31.setBackgroundColor(Color.parseColor("#FF0000"));
            reponse41.setBackgroundColor(Color.parseColor("#FF0000"));

            suite.setEnabled(true);
            reponse11.setEnabled(false);
            reponse21.setEnabled(false);
            reponse31.setEnabled(false);
            reponse41.setEnabled(false);

        }


        //Question | Op1 | Op2 | Op3 | Op4 | Bonne Réponse
        String[][] questionsMUSIQUE = {
        /*1*/{"La chanteuse londonienne Miss Adkins est mieux connue sous quel nom?", "Adele", "Élisabeth", "Jessica Petenon", "Jessie J", "Adele"},
        /*2*/{"La chanteuse londonienne Miss Adkins est mieux connue sous quel nom?", "Adele", "Élisabeth", "Jessica Petenon", "Jessie J", "Adele"}};
        /*3*///{},
        /*4*///{},
        /*5*///{},
        /*6*///{},
        /*7*///{},
        /*8*///{},
        /*9*///{}


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        question11 = (TextView) findViewById(R.id.activity_question11_txt);
        reponse11 = (Button) findViewById(R.id.activity_reponse11_btn);
        reponse21 = (Button) findViewById(R.id.activity_reponse21_btn);
        reponse31 = (Button) findViewById(R.id.activity_reponse31_btn);
        reponse41= (Button) findViewById(R.id.activity_reponse41_btn);
        suite = (Button) findViewById(R.id.activity_suite1_btn);
        NbPoint1 = (TextView) findViewById(R.id.activity_NbPoint1_txt);

        question11.setText(questionsMUSIQUE[0][0]);
        reponse11.setText(questionsMUSIQUE[0][1]);
        reponse11.setBackgroundColor(Color.parseColor("#FF000000"));
        reponse21.setText(questionsMUSIQUE[0][2]);
        reponse21.setBackgroundColor(Color.parseColor("#FF000000"));
        reponse31.setText(questionsMUSIQUE[0][3]);
        reponse31.setBackgroundColor(Color.parseColor("#FF000000"));
        reponse41.setText(questionsMUSIQUE[0][4]);
        reponse41.setBackgroundColor(Color.parseColor("#FF000000"));

        suite.setEnabled(false);
        juste1 = 0;




        reponse11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                reponse11.setBackgroundColor(Color.parseColor("#90EE90"));
                reponse21.setBackgroundColor(Color.parseColor("#FF0000"));
                reponse31.setBackgroundColor(Color.parseColor("#FF0000"));
                reponse41.setBackgroundColor(Color.parseColor("#FF0000"));
                suite.setEnabled(true);
                reponse11.setEnabled(false);
                reponse21.setEnabled(false);
                reponse31.setEnabled(false);
                reponse41.setEnabled(false);
                juste1++;
                NbPoint1.setText("nombre de point : " + juste1);
            }
        });

        reponse21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ChangerColeurs(texte du button; array)
                reponse11.setBackgroundColor(Color.parseColor("#90EE90"));
                reponse21.setBackgroundColor(Color.parseColor("#FF0000"));
                reponse31.setBackgroundColor(Color.parseColor("#FF0000"));
                reponse41.setBackgroundColor(Color.parseColor("#FF0000"));
                suite.setEnabled(true);
                reponse11.setEnabled(false);
                reponse21.setEnabled(false);
                reponse31.setEnabled(false);
                reponse41.setEnabled(false);
            }
        });

        reponse31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reponse11.setBackgroundColor(Color.parseColor("#90EE90"));
                reponse21.setBackgroundColor(Color.parseColor("#FF0000"));
                reponse31.setBackgroundColor(Color.parseColor("#FF0000"));
                reponse41.setBackgroundColor(Color.parseColor("#FF0000"));
                suite.setEnabled(true);
                reponse11.setEnabled(false);
                reponse21.setEnabled(false);
                reponse31.setEnabled(false);
                reponse41.setEnabled(false);
            }
        });

        reponse41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reponse11.setBackgroundColor(Color.parseColor("#90EE90"));
                reponse21.setBackgroundColor(Color.parseColor("#FF0000"));
                reponse31.setBackgroundColor(Color.parseColor("#FF0000"));
                reponse41.setBackgroundColor(Color.parseColor("#FF0000"));
                suite.setEnabled(true);
                reponse11.setEnabled(false);
                reponse21.setEnabled(false);
                reponse31.setEnabled(false);
                reponse41.setEnabled(false);
            }
        });


    }


}
