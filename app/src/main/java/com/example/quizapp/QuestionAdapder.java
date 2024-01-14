package com.example.quizapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quizapp.Model.Questions;

import java.util.ArrayList;

public class QuestionAdapder extends RecyclerView.Adapter<QuestionAdapder.Myholder>{
 ArrayList<Questions>liste;



    public QuestionAdapder(ArrayList<Questions> liste) {
        this.liste = liste;
    }

    @NonNull
    @Override
    public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View v= inflater.inflate(R.layout.layout1,parent,false);
        Myholder mvh=new Myholder(v);
        return mvh;
    }



    @Override
    public void onBindViewHolder(@NonNull Myholder holder, int position) {
        Questions q=liste.get(position);
        holder.question.setText(q.qustion);
        holder.rd1.setText(q.option1);
        holder.rd2.setText(q.option2);
        holder.rd3.setText(q.option3);

    }

    @Override
    public int getItemCount() {
        return liste.size();
    }

    class Myholder extends RecyclerView.ViewHolder {
        TextView question;
        RadioGroup rg ;
        RadioButton rd1,rd2,rd3;

        public Myholder(@NonNull View itemView) {
            super(itemView);

            question = itemView.findViewById(R.id.question);
            rg=itemView.findViewById(R.id.rg);
            rd1=itemView.findViewById(R.id.radioButton);
            rd2=itemView.findViewById(R.id.radioButton2);
            rd3=itemView.findViewById(R.id.radioButton3);




        }
    }
}
