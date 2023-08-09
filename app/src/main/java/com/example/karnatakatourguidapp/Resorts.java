package com.example.karnatakatourguidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Resorts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listandviews);



        String str1="Royal Orchid & Regenta Hotels is one of India's fastest-growing hospitality brands, " +
                "managing a portfolio of over 90+ properties across the country. " +
                "Founded in 2001 by industry veteran Mr. Chander K Baljee, " +
                "Royal Orchid & Regenta Hotels is a renowned and trusted brand " +
                "with a growth plan to reach 100 hotels by 2023.";
        String str2="If a tranquil getaway, without the stress and hassles of city life is what you’re looking for, " +
                "Palm Meadows Resort is here to assist you in doing just that. " +
                "The sprawling Resort offers the ultimate relaxation with surprises in every part of " +
                "the property that are nothing short of utmost luxury.";
        String str3="Paul John Resorts & Hotels is delighted to announce the launch of its 4th luxury offering – " +
                "Coorg Wilderness Resort. Just 3 kms from Madikeri, " +
                "the main town of Coorg, Coorg Wilderness Resort is set on 40 acres of " +
                "lush wilderness, within an estate of over 60 acres.";
        String str4="At the heart of Club Mahindra lies a simple philosophy, of making every moment magical. " +
                "For our members, our colleagues, our partners, and for every life we touch." +
                " How do we do this? By dealing in the currency of laughter and smiles. " +
                "And in making the most of the moments that are given to us, and the moments we create for each other.";
        String str5="Wind Tunnel Road, Galibeedu, Madikeri Taluk 560017 India";
        String str6="The road to Coorg Cliffs Resort meanders through stretches of paddy fields and anonymous hamlets, past banana, " +
                "cardamom and wild black pepper, areca nut and coffee plantations. " +
                "A mild chill permeates the fragrant air as the road begins to climb the eastern slopes of the Western Ghats, embraced by dense, ";
        String str7="Windflower Prakruthi, Bangalore";
        String str8="Nestled in 4 acres of Lush Greenery, Holiday Village is the perfect venue for a wedding, " +
                "corporate event or a day out with friends & family! The resort has 16 well appointed rooms and 2 Food " +
                "and beverage outlets, ensuring lip-smacking food throughout " +
                "your stay with us! Conveniently located 6 km from Banashankri temple, " +
                "find your tranquil escape just a 20 minute drive from the city";







        // Array list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Ratting 4.5","Royal Orchid Resort",R.drawable.royal_orchid_resort,"13.577916195777338,77.5250243828831","https://www.royalorchidhotels.com/about",str1));
        words.add(new Word("Ratting 4.6","Palm Meadows Resort",R.drawable.palm_peadows_resort,"12.964536317624418,77.73991945268294","https://palmmeadowsresort.com/about/",str2));
        words.add(new Word("Ratting 4.2","Coorg Wilderness Resort",R.drawable.coorg_wilderness_resort,"12.402395014090578,75.7483449238359","https://www.coorgwildernessresort.in/",str3));
        words.add(new Word("Ratting 4.5","Club Mahindra Madikeri",R.drawable.club_mahindra_madikeri,"12.44089467993964,75.71655268004841","https://www.clubmahindra.com",str4));
        words.add(new Word("Ratting 4.5","Heritage Resort Coorg",R.drawable.heritage_resort_coorg,"12.460440534174346,75.69610772383702","https://www.makemytrip.com/hotels/",str5));
        words.add(new Word("Ratting 4.8","Coorg Cliffs Resort",R.drawable.coorg_cliffs_resort,"12.246267236226297,75.88407438150497","https://www.coorgcliffsresort.com",str6));
        words.add(new Word("Ratting 4.5","Windflower Prakruthi",R.drawable.windflower_prakruthi,"13.203808074105613,77.61025992332503","https://www.thewindflower.com/bangalore/",str7));
        words.add(new Word("Ratting 4.9","Holiday Village",R.drawable.holiday_village,"12.867423391748693,77.54305619500896","http://www.holidayvillage.in/",str8));






        /*words.add(new Word("two","otiiko",R.drawable.number_two, R.raw.number_two));

        words.add(new Word("ten","na'aacha",R.drawable.number_ten, R.raw.number_ten));*/

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_numbers);


        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Word word = words.get(position);
                Intent intent = new Intent(Resorts.this,Detailsshow.class);

                // now by putExtra method put the value in key, value pair key is
                // message_key by this key we will receive the value, and put the string
                intent.putExtra("message_key_location", word.getDefaultLocation());
                intent.putExtra("message_key_text",word.getDefaultText());
                intent.putExtra("message_key_link", word.getDefaultLink());
                intent.putExtra("message_key_image", word.getImageResourceId());
                // start the Intent
                startActivity(intent);
                //mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getmAudioResourceId());
                //mMediaPlayer.start();
            }
        });



    }
}