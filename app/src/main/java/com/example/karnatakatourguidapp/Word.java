package com.example.karnatakatourguidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Word {
    /** Default translation for the word */
    private String mDefaultRating;

    /** Miwok translation for the word */
    private String mPlaces;

    /** Miwok translation for the Image */
    private int mImageResourceId = NO_IMAGE_PROVIDE;

    private  static final int NO_IMAGE_PROVIDE = -1;


    /** Audio resource id for the word;
     *
     */
    private int mAudioResourceId;
    private String mLink;
    private String mLocation;
    private  String mText;

    /**
     * Create a new Word object.
     *
     * @param defaultrating is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param places is the word in the Miwok language
     *
     * @param places is the word for the image resourceId Miwok language
     */
    public Word(String defaultrating, String places, int imageResourceId) {
        mDefaultRating = defaultrating;
        mPlaces = places;
        mImageResourceId = imageResourceId;
    }

    public Word(String defaultrating, String places, int imageResourceId, int audioResourceId) {
        mDefaultRating = defaultrating;
        mPlaces = places;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }


    public Word(String defaultrating, String places, int imageResourceId, String location, String link, String text) {
        mDefaultRating = defaultrating;
        mPlaces = places;
        mImageResourceId = imageResourceId;
        mLocation = location;
        mLink=link;

        mText = text;

    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultRating() {
        return mDefaultRating;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getPlaces() {
        return mPlaces;
    }

    /**
     * Get the Miwok Image Resource Id.
     */
    public int getImageResourceId(){return mImageResourceId;}

    /**
     * return weather or not image for words.
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDE;
    }

    public int getmAudioResourceId(){return mAudioResourceId;}
    public String getDefaultLocation() {
        return mLocation;
    }
    public String getDefaultLink() {
        return mLink;
    }
    public String getDefaultText() {
        return mText;
    }
}