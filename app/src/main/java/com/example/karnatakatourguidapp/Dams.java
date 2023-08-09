package com.example.karnatakatourguidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Dams extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listandviews);


        String str1="The Tungabhadra Dam, also known as Pampa Sagar, is a water reservoir " +
                " constructed across the Tungabhadra River in the city of " +
                "Hosapete in Vijayanagara district, Karnataka, India. " +
                " It is a multipurpose dam serving irrigation, electricity generation, flood control, etc." +
                " for the state. It is one of the only two non-cement dams in India, " +
                " the other being the Mullaperiyar Dam in Kerala. The dam is built of surki mortar,";

        String str2="Vani Vilasa Sagara, popularly known as Mari Kanive is a dam in Hiriyur Taluk," +
                " Chitradurga District, in the Indian state of Karnataka.[1] It is located about 20 km south-westerly to Hiriyur," +
                " 32 km north-easterly to Hosadurga, 58 km south-easterly to Holalkere, 50 km northerly to Huliyar," +
                " 60 km southerly to Chitradurga, and 180 km north-westerly to Bangalore.";
        String str3="Krishna Raja Sagara, also popularly known as KRS, is a lake and the dam that creates it. " +
                " They are close to the settlement of Krishna Raja Sagara in the Indian State of Karnataka. " +
                " The gravity dam made of surki mortar is below the confluence of river Kaveri with its tributaries Hemavati" +
                "  and Lakshmana Tirtha, in the district of Mandya.";

        String str4="The Bhadra Dam or Lakkavalli Dam, which has created the Bhadra Reservoir," +
                "  is located on the Bhadra River a tributary of Tungabhadra River." +
                "  Bhadra Dam is located in the border of Bhadravathi and Tarikere," +
                "  in the western part of Karnataka in India.";

        String str5="Manchanabele dam is nearby to the place, across the river Arkavathy. " +
                "  It is a trekking location.[2] It provides water to Magadi town, Kayaking also conducted here. " +
                "  Species of Water Snakes are also visible.  Magadi road where few adventure resorts are located. " +
                "  The Dodda Alada Mara and Savanadurga are other tourist attractions in the circuit";

        String str6="The Kabini dam is built on the Kabini River in Bidarahally and Beechanahally villages " +
                "  of Heggadadevanakote Taluk in Mysore district of Karnataka, India." +
                "  The dam has a Length of 966 metres (3,169 ft) and it was built in 1974. " +
                "  The main purpose of the dam is to provide drinking water and irrigation of 22 villages " +
                "  and 14 hamlets and also generate electricity. The dam also provides water to two other " +
                "  dams which are Sagaredoddakere and Upper Nugu Dams";

        String str7="Supa Dam is built across Kalinadi (Kannada) or Kali river in state of Karnataka in India and is the highest dam in Karnataka." +
                "The 101 meters high and 332 meters long dam has 3 gates of 15x10 meters" +
                " and is situated at GaneshaGudi, which is in Joida taluk of Uttara Kannada district.";
        String str8="Markonahalli Dam is built across the river Shimsha in the Kunigal Taluk of Tumkur district." +
                "It was built by Krishnaraja Wodeyar IV, the king of Mysore under the guidance of his Diwan, " +
                "Sir M Visweswaraiah. It was built to irrigate 6,070 hectares of land and has a masonry structure of 139 m " +
                "and a pair of earth dams extending to 1,470 metres on either side.";







        // Array list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Ratting 4.5","Tungabhadra Dam",R.drawable.tungabhadra_dam,"15.300155213889166,76.3333759104059","https://en.wikipedia.org/wiki/Tungabhadra_Dam",str1));
        words.add(new Word("Ratting 4.3","Vani Vilas Sagar Dam",R.drawable.vani_vilas_sagar_dam,"13.889265602906425,76.48850087465613","https://en.wikipedia.org/wiki/Vani_Vilasa_Sagara",str1));
        words.add(new Word("Ratting 4.4","Krishnaraja Sagar Dam",R.drawable.krishnaraja_sagar_dam,"12.42611541645488,76.57243518701708","https://en.wikipedia.org/wiki/Krishna_Raja_Sagara",str1));
        words.add(new Word("Ratting 4.6","Bhadra River Project Dam",R.drawable.bhadra_river_project_dam,"13.706939094712894,75.58276988848885","https://en.wikipedia.org/wiki/Bhadra_Dam#:~:text=The%20Bhadra%20Dam%20or%20Lakkavalli,part%20of%20Karnataka%20in%20India.",str1));
        words.add(new Word("Ratting 4.8","Manchanabele Dam",R.drawable.manchanabele_dam,"12.87674516509354,77.3356750812941","https://en.wikipedia.org/wiki/Manchanabele",str1));
        words.add(new Word("Ratting 4.9","Kabini Dam",R.drawable.kabini_dam,"11.97377817809069,76.35273473731974","https://en.wikipedia.org/wiki/Kabini_dam",str1));
        words.add(new Word("Ratting 4.6","Supa Dam",R.drawable.supa_dam,"15.267862946628272,74.49128832839546","https://en.wikipedia.org/wiki/Supa_Dam#:~:text=Supa%20Dam%20is%20built%20across,taluk%20of%20Uttara%20Kannada%20district.",str1));
        words.add(new Word("Ratting 4.5","Markonahalli Dam",R.drawable.markonahalli_dam,"12.948685000662103,76.87642308002768","https://www.karnataka.com/tumkur/markonahalli-dam/",str1));






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
                Intent intent = new Intent(Dams.this,Detailsshow.class);

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