package com.example.android.miwok;

/**
 * Created by zyx on 28/03/2018.
 */

public class Word {
    private String mMiwork;
    private String mDefault;

    public String getmDefault() {
        return mDefault;
    }

    public String getmMiwork() {
        return mMiwork;
    }



    public Word(String string1, String string2){
        mDefault = string1;
        mMiwork  = string2;

    }

}
