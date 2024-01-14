package com.example.quizapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.quizapp.Model.Questions;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {






    RecyclerView rv ;

    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<Questions>liste=new ArrayList<>();

    
        rv=findViewById(R.id.rc);
        /* tv6=findViewById(R.id.tv6);

        score=findViewById(R.id.score);

        tme=findViewById(R.id.timer);

        rg=findViewById(R.id.rg);

        que=findViewById(R.id.question);

        rd1=findViewById(R.id.radioButton);

        rd2=findViewById(R.id.radioButton2);

        rd3=findViewById(R.id.radioButton3);

        btn=findViewById(R.id.next);

        String nomm=que.getText().toString();

        addQuestion();
        totaleQue=liste.size();*/
        btn1=findViewById(R.id.submit);
        btn2=findViewById(R.id.quitter);

        liste.add(new Questions("who is the best rapper in morroco","toto","dizzy","madd",1));
        liste.add(new Questions("who is the best rapper in french","toto","dizzy","madd",0));
        liste.add(new Questions("who is the best rapper in America","toto","dizzy","madd",0));
        liste.add(new Questions("who is the best rapper in Germany","toto","dizzy","madd",1));
        liste.add(new Questions("who is the best rapper in spania","toto","dizzy","madd",1));

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder bld=new AlertDialog.Builder(MainActivity2.this);
                bld.setTitle("Attention");
                bld.setMessage("Tu peut Vraiment Quitter Ce Questionnaire");
                bld.setNegativeButton("Non", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                bld.setPositiveButton("Oui", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        System.exit(1);
                    }


                });
                bld.show();

            }

        });

        QuestionAdapder ad = new QuestionAdapder(liste);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(ad);









    }







}