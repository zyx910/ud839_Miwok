package com.example.android.miwok;

/**
 * Created by zyx on 28/03/2018.
 */

public class Word {
    private String mMiwork;
    private String mDefault;
    private int imageId;
    private int mWordMediaId;

    public static final int NO_IMAGE = -1;

    public String getmDefault() {
        return mDefault;
    }

    public String getmMiwork() {
        return mMiwork;
    }

    public int getImage(){return imageId;}

    public int getmWordMediaId(){return mWordMediaId;}

    public Word(String string1, String string2,  int image1,int wordMediaId){
        mDefault = string1;
        mMiwork  = string2;
        imageId=image1;
        mWordMediaId = wordMediaId;

    }

    public Word(String string1,String string2,int wordMediaId){
        mDefault = string1;
        mMiwork = string2;
        mWordMediaId = wordMediaId;
        imageId = NO_IMAGE;
    }
    boolean IsImage(int imageId){
        if(imageId == NO_IMAGE)
            return  false;
        else
            return true;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwork='" + mMiwork + '\'' +
                ", mDefault='" + mDefault + '\'' +
                ", imageId=" + imageId +
                ", mWordMediaId=" + mWordMediaId +
                '}';
    }
}
