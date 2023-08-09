package com.example.karnatakatourguidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricalPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listandviews);


        String str1="Hampi is one of the world’s heritage sites as declared by UNESCO. Situated on the banks of Tungabhadra, the place is home to historical " +
                "ruins and remains of the Vijayanagar kingdom. Rocks and stone carvings are proof of " +
                "the skill and mastery of the artisans of the old era. It is the perfect tourist place for the history enthusiast.";
        String str2="Mysore Palace, also known as Amba Vilas Palace, is a historical palace " +
                "and a royal residence (house). It is located in Mysore, Karnataka, India. " +
                "It used to be the official residence of the Wadiyar dynasty and the seat " +
                "of the Kingdom of Mysore. The palace is in the centre of Mysore, " +
                "and faces the Chamundi Hills eastward.";
        String str3="Cheluvamba Mansion is located in the city of Mysore, Karnataka. It was built by Maharaja Krishnaraja Wodeyar " +
                "IV for the third princess of Mysore - Cheluvajammanni and it is similar to other mansions built by them which " +
                "are spread over a large area surrounded by gardens. " +
                "This mansion is crafted like other buildings of the Wadiyar dynasty";
        String str4="officially Mysuru is a metropolitan city in the southern Indian state of Karnataka." +
                " It is the third-most populous and third-largest city in the state, and is one of the cleanest cities in India.";
        String str5="This great monument situated in the town of Chitradurga is an archeological wonder." +
                " This fort has immense historical value as it has been in existence since the rule of Chalukyas." +
                "The landscape around this fort is adorned by towering hill with the peak giving the view of a valley.";
        String str6="Shimoga, officially known as Shivamogga, is a city and the district headquarters " +
                "of Shimoga district in the central part of the state of Karnataka, India. " +
                "The city lies on the banks of the Tunga River. " +
                "Being the gateway for the hilly region of the Western Ghats, " +
                "the city is popularly nicknamed the \"Gateway of Malnad\".";
        String str7="Badami is a town and headquarters of a taluk by the same name, in the Bagalkot district of Karnataka, India. " +
                "It was the regal capital of the Badami Chalukyas from 540 to 757. " +
                "It is famous for its rock cut monuments such as the Badami cave temples, " +
                "as well as the structural temples such as the Bhutanatha temples, Badami Shivalaya and Jambulingesvara Temple";
        String str8="Halebidu is a town located in Hassan District, " +
                "Karnataka, India. Historically known as Dwarasamudra (also Dorasamudra), " +
                "Halebidu became the regal capital of the Hoysala Empire in the 11th century CE.";







        // Array list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Ratting 4.5","Hampi",R.drawable.hampi,"15.334100319409231,76.4599872850777","https://en.wikipedia.org/wiki/Hampi",str1));
        words.add(new Word("Ratting 4.7","Mysore Palace",R.drawable.mysore_palace,"12.305939593478028,76.65497736411072","https://en.wikipedia.org/wiki/Mysore_Palace",str2));
        words.add(new Word("Ratting 4.2","Cheluvamba Mansion",R.drawable.cheluvamba_mansion,"12.316689153552204,76.6392000242256","https://en.wikipedia.org/wiki/Cheluvamba_Mansion#:~:text=Cheluvamba%20Mansion%20is%20located%20in,large%20area%20surrounded%20by%20gardens.",str3));
        words.add(new Word("Ratting 4.0","Mysore",R.drawable.mysore,"12.301209403462744,76.63291137145559","https://en.wikipedia.org/wiki/Mysore",str4));
        words.add(new Word("Ratting 4.7","Chitradurga Fort",R.drawable.chitradurga_fort,"14.216225490958134,76.39889193775363","https://en.wikipedia.org/wiki/Chitradurga_Fort",str5));
        words.add(new Word("Ratting 4.9","Shimoga",R.drawable.shimoga,"13.931375891916044,75.56969317991563","https://en.wikipedia.org/wiki/Shimoga#:~:text=The%20district%20formed%20the%20southern,Vijayanagara%20rulers%20(15th%20century).",str6));
        words.add(new Word("Ratting 4.4","Badami",R.drawable.badami,"15.919217267169277,75.67595235117474","https://en.wikipedia.org/wiki/Badami",str7));
        words.add(new Word("Ratting 4.3","Halebidu",R.drawable.halebidu,"13.209287958684088,75.99865068274578","https://en.wikipedia.org/wiki/Halebidu",str8));


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
                Intent intent = new Intent(HistoricalPlaces.this,Detailsshow.class);

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