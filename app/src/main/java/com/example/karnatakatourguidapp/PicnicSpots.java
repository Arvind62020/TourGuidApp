package com.example.karnatakatourguidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PicnicSpots extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listandviews);


        String str1="Shivanasamudra Falls is a cluster of waterfalls on the borders of Malavalli, Mandya and Kollegala, " +
                "Chamarajanagara, in Karnataka, India, situated along the river Kaveri. " +
                "The falls form the contour between the districts of Chamarajanagara and Mandya.";
        String str2="Jog Falls is a waterfall on the Sharavati river located in the Western Ghats in Shimoga district of Karnataka, India. " +
                "It is the third highest plunge waterfall in India. " +
                "It is a segmented waterfall which depends on rain and season to become a plunge waterfall.";
        String str3="Dandeli is a town in the western Indian state of Karnataka. The Dandeli Wildlife Sanctuary, " +
                "with its trails and dense forests, is home to animals including black panthers, monkeys and elephants, as well as many bird species. " +
                "A temple stands at the entrance to the limestone Kavala Caves, known for their stalagmite formations.";
        String str4="Sri Chamarajendra Zoological Gardens, popularly known as ‘Mysuru Zoo’, is one of the oldest zoos of the country established in 1892, " +
                "by His Highness, the erstwhile Ruler of Mysuru Sri Chamarajendra Wadiyar Bahadur. Mysuru Zoo holds an important place in Karnataka. " +
                "In 1909 the Palace Zoo was named as Sri Chamarajendra Zoological Gardens to commemorate the illustrious founder and since then it bears the nomenclature. " +
                "Mysuru Zoo has gradually grown into tourist centre, imparting wildlife values.";
        String str5="Mullayyanagiri is the highest peak in Karnataka, India." +
                " Mullayyanagiri is located in the Chandra Dhrona Hill Ranges of the Western Ghats of Chikkamagaluru Taluk. " +
                " With a height of 1,925 metres (6,316 ft), it is the highest peak in Karnataka and also the 23rd highest peak in Western Ghats." +
                " The summit of Mullayanagiri has a small temple and houses a police radio relay station. " +
                " Seethalayyanagiri is a prominent peak which is adjacent to this place.";
        String str6="Kemmannugundi (Red Soil Pit) is a hill station in Tarikere taluk of Chikkamagaluru district " +
                " in the state of Karnataka, India. It is at the elevation of 1434m above sea level, with its peak at 1863m. " +
                " This was the summer retreat of Krishnaraja Wodeyar IV, and as a mark of respect to the king, " +
                " it is also known as Sri Krishnarajendra Hill Station. The station is ringed by the Baba Budan Giri Range,";
        String str7="The name Pandavapura means \"Town of Pandavas\".  states that the Pandavas during " +
                "their period of exile stayed here for some time, and Kunti, mother of the Pandavas, " +
                "liked the hillock so much that it became one of her favorite haunts. " +
                "The town is also named after the Pandavas because of their brief stay in this region. " +
                "The name \"French Rock\" dates back to India's Pre-Independence days";
        String str8="Koodlu Theertha Falls is a mesmerizing waterfall located near Hebri on Udupi-Agumbe Road in Karnataka." +
                " Nestled amidst the dense forest of the Western Ghats and adjacent to the Agumbe ranges " +
                " the waterfall is the first fall of the River Sita. " +
                " It is also known as Sita Falls.";







        // Array list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Ratting 4.5","Shivanasamudra Falls",R.drawable.shivanasamudra_falls,"12.300399686160347,77.17608470925117","https://en.wikipedia.org/wiki/Shivanasamudra_Falls",str1));
        words.add(new Word("Ratting 4.6","Jog Falls",R.drawable.jog_falls,"14.204984212126554,74.79076130802429","https://en.wikipedia.org/wiki/Jog_Falls",str2));
        words.add(new Word("Ratting 4.7","Dandeli",R.drawable.dandeli,"15.241750364760913,74.61659525426903","https://en.wikipedia.org/wiki/Dandeli",str3));
        words.add(new Word("Ratting 4.5","Mysuru Zoo",R.drawable.mysuru_zoo,"12.30279503504061,76.66382980651473","https://en.wikipedia.org/wiki/Mysore_Zoo",str4));
        words.add(new Word("Ratting 4.9","Mullayyana Giri",R.drawable.mullayyana_giri,"13.390384057796071,75.71888325242712","https://en.wikipedia.org/wiki/Mullayyana_Giri",str5));
        words.add(new Word("Ratting 4.4","Kemmangundi",R.drawable.kemmangundi,"13.5509591163018,75.74999992043003","https://en.wikipedia.org/wiki/Kemmangundi",str6));
        words.add(new Word("Ratting 4.6","Kunti Betta",R.drawable.kunti_betta,"12.508532297142654,76.69809851034604","https://en.wikipedia.org/wiki/Pandavapura",str7));
        words.add(new Word("Ratting 4.5","Kudlu Falls",R.drawable.kudlu_falls,"13.41324045534376,75.12113599540967","https://www.karnataka.com/agumbe/koodlu-theertha-falls/",str8));


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
                Intent intent = new Intent(PicnicSpots.this,Detailsshow.class);

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