package com.example.karnatakatourguidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NaturePlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listandviews);


        String str1="Bandipur National Park is a national park covering 868.63 km2 (335.38 sq mi) " +
                "in Chamarajnagar district in the Indian state of Karnataka. " +
                "It was established as a tiger reserve under Project Tiger in 1973." +
                "It is part of the Nilgiri Biosphere Reserve since 1986";
        String str2="Shivanasamudra Falls is a cluster of waterfalls on the borders of Malavalli, " +
                "Mandya and Kollegala, Chamarajanagara, in Karnataka, India, situated along the river Kaveri. The " +
                "falls form the contour between the districts of Chamarajanagara and Mandya.";
        String str3="Gokarna is a small temple town located in the Uttara Kannada " +
                "district of Karnataka state in southern India,[1] It has a population of around 20,000. " +
                "Shiva the most worshipped deity in the town, " +
                "and to whom its main temple, also known as Mahabaleshwara, is dedicated.";
        String str4="Jog Falls is a waterfall on the Sharavati river located in the Western Ghats in Shimoga district of Karnataka, India. " +
                "It is the third highest plunge waterfall in India.[8] It is a segmented waterfall " +
                "which depends on rain and season to become a plunge waterfall.";
        String str5="Dandeli is a town in the western Indian state of Karnataka. The Dandeli Wildlife Sanctuary, with its trails and dense forests, " +
                "is home to animals including black panthers, monkeys and elephants, as well as many bird species. A temple stands at " +
                "the entrance to the limestone Kavala Caves, known for their stalagmite formations.";
        String str6="Sri Chamarajendra Zoological Gardens, popularly known as ‘Mysuru Zoo’, is one of the oldest zoos of the country " +
                "established in 1892, by His Highness, the erstwhile Ruler of Mysuru Sri Chamarajendra Wadiyar Bahadur. " +
                "Mysuru Zoo holds an important place in Karnataka. In 1909 the Palace Zoo was named as Sri Chamarajendra Zoological Gardens " +
                "to commemorate the illustrious founder and since then it bears the nomenclature. " +
                "Mysuru Zoo has gradually grown into tourist centre, imparting wildlife values.";
        String str7="Mullayyanagiri is the highest peak in Karnataka, India." +
                " Mullayyanagiri is located in the Chandra Dhrona Hill Ranges of the Western Ghats of Chikkamagaluru Taluk. " +
                " With a height of 1,925 metres (6,316 ft), it is the highest peak in Karnataka and also the 23rd highest peak in Western Ghats." +
                " The summit of Mullayanagiri has a small temple and houses a police radio relay station. " +
                " Seethalayyanagiri is a prominent peak which is adjacent to this place.";
        String str8="Bhadra Wildlife Sanctuary is a protected area and tiger reserve as part of the Project Tiger, " +
                "situated in Chikkamagaluru district, 23 km (14 mi) south of Bhadravathi city, 38 km (24 mi) 20 km from Tarikere town, " +
                "northwest of Chikkamagaluru and 283 km from Bengaluru city in Karnataka state, India." +
                "Bhadra sanctuary has a wide range of flora and fauna and is a popular place for day outings. The 1,875 m (6,152 ft) " +
                "above MSL Hebbe Giri is the highest peak in the sanctuary.";







        // Array list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Ratting 4.4","Bandipur National Park",R.drawable.bandipur_national_park,"11.792480082710975,76.46453467043283","https://en.wikipedia.org/wiki/Bandipur_National_Park#:~:text=Bandipur%20National%20Park%20is%20a,Nilgiri%20Biosphere%20Reserve%20since%201986.",str1));
        words.add(new Word("Ratting 4.3","Shivanasamudra Falls",R.drawable.shivanasamudra_falls,"12.300399686160347,77.17608470925117","https://en.wikipedia.org/wiki/Shivanasamudra_Falls",str2));
        words.add(new Word("Ratting 4.5","Gokarna",R.drawable.gokarna,"14.547963970030754,74.31778871204773","https://en.wikipedia.org/wiki/Gokarna,_Karnataka",str3));
        words.add(new Word("Ratting 4.7","Jog Falls",R.drawable.jog_falls,"14.204984212126554,74.79076130802429","https://en.wikipedia.org/wiki/Jog_Falls",str4));
        words.add(new Word("Ratting 4.4","Dandeli",R.drawable.dandeli,"15.241750364760913,74.61659525426903","https://en.wikipedia.org/wiki/Dandeli",str5));
        words.add(new Word("Ratting 4.9","Mysuru Zoo",R.drawable.mysuru_zoo,"12.30279503504061,76.66382980651473","https://en.wikipedia.org/wiki/Mysore_Zoo",str6));
        words.add(new Word("Ratting 4.6","Mullayyana Giri",R.drawable.mullayyana_giri,"13.390384057796071,75.71888325242712","https://en.wikipedia.org/wiki/Mullayyana_Giri",str7));
        words.add(new Word("Ratting 4.5","Bhadra Wildlife Sanctuary",R.drawable.bhadra_wildlife_sanctuary,"13.376724309383246,75.65272069975477","https://en.wikipedia.org/wiki/Bhadra_Wildlife_Sanctuary",str8));

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
                Intent intent = new Intent(NaturePlaces.this,Detailsshow.class);

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