package com.example.karnatakatourguidapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class WordAdapter extends ArrayAdapter<Word> {


    /**
     * Resource Id for the background color fo this list of words
     */
    private int mColorResourceId;
    /**
     *  Resource
     * @param context
     * @param words
     */
    public  WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId){

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.place_name);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getPlaces());

        // Find the TextView in the list_item.xml layout with the ID version_number


        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.rattings);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        defaultTextView.setText(currentWord.getDefaultRating());

        //Find the image in the list view in the list view item

        ImageView imageView =  (ImageView) listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResourceId());
            //make image visible
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        //Set the them color for the the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource Id maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background Color of the text container view
        textContainer.setBackgroundColor(color);
        return listItemView;
    }

}
