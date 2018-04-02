package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class beautyMM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beauty_mm);
        ReportCard huahua =   new ReportCard("huahua");
        huahua.setChemistryGrade(90);
        huahua.setEnglishGrade(80);
        TextView textView = new TextView(this);
        textView.setText(huahua.toString());
        LinearLayout rootview = findViewById(R.id.root_view);
        rootview.addView(textView);
    }
}
