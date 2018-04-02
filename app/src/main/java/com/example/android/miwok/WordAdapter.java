package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zyx on 28/03/2018.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mResourceColor;
    MediaPlayer mediaPlayer;
    public WordAdapter(Activity context, ArrayList<Word> word,int resourceColor){
        super(context,0,word );
        mResourceColor = resourceColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentWord = getItem(position);
        TextView textView = listItemView.findViewById(R.id.Miwork_text_view);
        textView.setText(currentWord.getmMiwork());
        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getmDefault());
        ImageView imageView = listItemView.findViewById(R.id.image_view);
        if(currentWord.IsImage(currentWord.getImage())) {
            imageView.setImageResource(currentWord.getImage());
        }
        else
            imageView.setVisibility(View.GONE);
        View textContainer = listItemView.findViewById(R.id.text_contain);
        int color = ContextCompat.getColor(getContext(),mResourceColor);
        textContainer.setBackgroundColor(color);



        return listItemView;
    }
}
