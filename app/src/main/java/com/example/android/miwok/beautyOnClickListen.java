package com.example.android.miwok;

import android.view.View;
import android.widget.Toast;

/**
 * Created by zyx on 23/03/2018.
 */



public class beautyOnClickListen implements View.OnClickListener  {
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(),"I love you",Toast.LENGTH_SHORT).show();
    }
}
