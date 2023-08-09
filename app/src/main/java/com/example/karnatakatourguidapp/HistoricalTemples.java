package com.example.karnatakatourguidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalTemples extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listandviews);


        String str1="Hampi is one of the world’s heritage sites as declared by UNESCO. " +
                "Situated on the banks of Tungabhadra, the place is home to historical ruins and " +
                "remains of the Vijayanagar kingdom. Rocks and stone carvings are" +
                " proof of the skill and mastery of the artisans of the old era. " +
                "It is the perfect tourist place for the history enthusiast.";
        String str2="Gokarna is a small temple town located in the Uttara Kannada district of Karnataka state in southern India," +
                " It has a population of around 20,000. Shiva the most worshipped deity in the town, " +
                "and to whom its main temple, also known as Mahabaleshwara, is dedicated.";
        String str3="The Majestic Temple Towns Belur. Belur is a town and taluk in Hassan" +
                " district in the state of Karnataka, India. The town is renowned for its Chennakeshava Temple dedicated to Vishnu," +
                " one of the finest examples of Hoysala architecture and the largest Hindu temple" +
                " complex that has survived from pre-14th-century Karnata-Dravida tradition.";
        String str4="Udupi, a town near Mangalore sandwiched between the Arabian Sea and Western Ghats is famously known for 2 things- \n" +
                "Temples and Food. The beautiful and huge Sri Krishna temple in Udupi attracts devotees from all over the world.\n" +
                " There is also a Shiva temple here which is believed to be over a 100 years old.";
        String str5="Badami is a town and headquarters of a taluk by the same name, in the Bagalkot district of Karnataka, India. \n" +
                "It was the regal capital of the Badami Chalukyas from 540 to 757. \n" +
                "It is famous for its rock cut monuments such as the Badami cave temples, \n" +
                "as well as the structural temples such as the Bhutanatha temples, Badami Shivalaya and Jambulingesvara Temple";
        String str6="Halebidu (IAST: Haḷēbīḍ, literally \"old capital, city, \n" +
                "encampment\"[1] or \"ruined city\"[2]) is a town located in Hassan District, \n" +
                "Karnataka, India. Historically known as Dwarasamudra (also Dorasamudra), \n" +
                "Halebidu became the regal capital of the Hoysala Empire in the 11th century CE.";
        String str7="Talakadu is a town on the left bank of the Kaveri river 45 km (28 miles) from Mysore \n" +
                "and 133 km (82 miles) from Bangalore in Karnataka, India. Latinizations of the towns name vary, \n" +
                "but include Talkād, Talakadu, Talakkadu, or Thalakadu. \n" +
                "It had over 30 temples, most of which now lay buried in sand. The extant group of temples, \n" +
                "where the eastward flowing Kaveri river changes course as the sand on its banks spreads over a wide area, \n" +
                "is a popular pilgrimage site for Hindus.";
        String str8="The Chennakesava Temple, also referred to as Chennakeshava Temple and Keshava Temple, \n" +
                "is a Vaishnava Hindu temple on the banks of River Kaveri at Somanathapura, Karnataka, India. \n" +
                "The temple was consecrated in 1258 CE by Somanatha Dandanayaka, a general of the Hoysala King Narasimha III. \n" +
                "It is located 38 kilometres (24 mi) east of Mysuru city.";






        // Array list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Ratting 4.5","Hampi",R.drawable.hampi,"15.334100319409231,76.4599872850777","https://en.wikipedia.org/wiki/Hampi",str1));
        words.add(new Word("Ratting 4.5","Gokarna",R.drawable.gokarna,"14.547963970030754,74.31778871204773","https://en.wikipedia.org/wiki/Gokarna,_Karnataka",str2));
        words.add(new Word("Ratting 4.5","Belur and Halebidu",R.drawable.belur_and_halebidu,"13.162106431553717,75.86721083803401","https://en.wikipedia.org/wiki/Belur,_Karnataka",str3));
        words.add(new Word("Ratting 4.5","Udupi",R.drawable.udupi,"13.343333759024778,74.74176969739992","https://en.wikipedia.org/wiki/Udupi",str4));
        words.add(new Word("Ratting 4.5","Badami",R.drawable.badami,"15.919217267169277,75.67595235117474","https://en.wikipedia.org/wiki/Badami",str5));
        words.add(new Word("Ratting 4.5","Halebidu",R.drawable.halebidu,"13.209287958684088,75.99865068274578","https://en.wikipedia.org/wiki/Halebidu",str6));
        words.add(new Word("Ratting 4.5","Talakadu",R.drawable.talakadu,"12.195030568232424,77.0308111832329","https://en.wikipedia.org/wiki/Talakadu",str7));
        words.add(new Word("Ratting 4.5","Somnathpur",R.drawable.somnathpur,"12.275965868748232,76.88214730319623","https://en.wikipedia.org/wiki/Chennakeshava_Temple,_Somanathapura",str8));


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
                Intent intent = new Intent(HistoricalTemples.this,Detailsshow.class);

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