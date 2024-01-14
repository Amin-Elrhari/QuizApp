package com.example.quizapp.Model;

public class Questions {
    public String qustion , option1,option2,option3;
    int correctYesorNo;

    public Questions(String qustion, String option1, String option2, String option3,int correctYesorNo) {
        this.qustion = qustion;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.correctYesorNo=correctYesorNo;
    }
}
