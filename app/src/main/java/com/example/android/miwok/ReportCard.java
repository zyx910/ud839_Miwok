package com.example.android.miwok;

/**
 * Created by zyx on 29/03/2018.
 */

public class ReportCard {
    String name;
    int chemistryGrade;
    int englishGrade;

    public ReportCard(String string) {
        //Initialize any variables here!
        chemistryGrade = 0;
        englishGrade = 0;
        name = string;
    }

    public int getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(int grade) {
        chemistryGrade = grade;
    }

    public int getEnglishGrade(){
        return englishGrade;
    }

    public void setEnglishGrade(int grade){
        englishGrade = grade;
    }

    @Override
    public String toString() {
        return "Name: "+ name +"; " + "chemistryGrade: " + chemistryGrade + "; "+ "englishGrade: "+ englishGrade+";";
    }
}
