package com.example.karnatakatourguidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HillStation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listandviews);
        String str1="Chikmagalur is a hill station in Karnataka, a state in southwest India. To the north is Baba Budangiri, " +
                "a mountain range in the Western Ghats, with 3 large caves said to be holy. Trails through forests and grasslands lead up to " +
                "Mullayanagiri Peak. The cascading Hebbe Falls lie in an area of coffee plantations. The forested Bhadra Wildlife Sanctuary, " +
                "northwest of Chikmagalur, is home to elephants, tigers and leopards.";
        String str2="Savandurga is a hill 60 km west of Bengaluru (Karnataka, India)," +
                "off the Magadi road in India. It is one of the largest monolith hills " +
                "in India.The hill rises to 1226 m above mean sea level and forms a part of the Deccan plateau." +
                " It consists of peninsular gneiss, granites, basic dykes, and laterites.";
        String str3="Nandi Hills (Anglicised forms include Nandidurg and Nandydoorg) is an ancient hill station" +
                "built by Ganga Dynasty in the Chikkaballapur district of Karnataka state. " +
                "It is 10 km from Chickballapur town and approximately 60 km from Bengaluru." +
                "The hills are near the town Nandi. ";
        String str4="The town lies in the Malnad region on the hills of the biodiversity hotspot, the Western Ghats." +
                "It has a temperate climate surrounded with lofty green hills full of coffee, " +
                "cardamom, pepper and areca plantations. " +
                "These crops which contribute mainly to the economy of the taluk are grown in the surrounding villages" +
                "and the entire taluk are brought to Sakleshpur city for sale.";
        String str5="Kudremukha is the name of a mountain range and an individual mountain peak located " +
                "in Chikkmagaluru district, in Karnataka, India. It is also the name of a small hill station " +
                "and iron ore-mining town situated near the mountain, about 20 kilometres from Kalasa in Kalasa Taluk. " +
                "The name Kuduremukha literally means \"horse-faced\" in Kannada and refers to a particular picturesque " +
                "view of a side of the mountain that resembles a horse's face. It was also referred to as 'Samseparvata', " +
                "historically since it was approached from Samse village.";
        String str6="Antara Gange (also known as Anthargange) is a mountain situated in the Shathashrunga mountain range " +
                "in the southeastern portion of the Indian state of Karnataka, Kolar district. " +
                "Antara Gange literally means \"Ganges from deep\" in Kannada. " +
                "It is about two miles from the town of Kolar and seventy kilometers from Bangalore. " +
                "Antara Gange is famous for Sri Kashi Vishweshwara temple, also known as Kashi of South";

        String str7="The Biligirirangana Hills or Biligirirangan Hills (as referred to in biology and geology[2]) is a hill range " +
                "situated in south-western Karnataka, at its border with Tamil Nadu (Erode District) in South India." +
                "The area is called Biligiri Ranganatha Swamy Temple Wildlife Sanctuary or simply BRT Wildlife Sanctuary.";

        String str8="Kemmannugundi (Red Soil Pit) is a hill station in Tarikere taluk of Chikkamagaluru " +
                "district in the state of Karnataka, India. It is at the elevation of 1434m " +
                "above sea level, with its peak at 1863m. This was the summer retreat of Krishnaraja " +
                "Wodeyar IV, and as a mark of respect to the king, it is also known as Sri Krishnarajendra Hill Station.";

        String str9="The history of Madikeri is related to the history of Kodagu. " +
                "From the 2nd to the 6th century AD, the northern part of Kodagu was ruled by Kadambas. " +
                "The southern part of Kodagu was ruled by Gangas from the 4th to the 11th century. " +
                "After defeating the Gangas in the 11th century, Cholas became the rulers of Kodagu.";

        String str10="Male Mahadeshwara Betta is a pilgrim town located in the Hanur taluk of Chamarajanagar " +
                "district of southern Karnataka. It is situated at about 150 km from Mysuru and about 210 km " +
                "from Bengaluru. The ancient and sacred temple of Sri Male Mahadeshwara is a pilgrim centre ";

        String str11="Agumbe is a village situated in the Thirthahalli taluka of Shivamogga district, Karnataka, India." +
                "It is nestled in the thickly forested Malenadu region of the Western Ghats mountain range." +
                "Owing to its high rainfall, it has received the epithet of \"The Cherrapunji of South India\", " +
                "after Cherrapunji, one of the rainiest places in India.";
        String str12="Kodachadri is a mountain peak with dense forests (elevation - 1,343 metres above sea level)" +
                "in the Western Ghats in South India (Shivamogga District, Karnataka), 78 km from Shimoga." +
                "It is declared as natural heritage site by the Karnataka Government." +
                " and it is 13th highest peak of Karnataka.";







        // Array list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Ratting 4.5","Chikmagalur",R.drawable.chikmagalur,"13.317286049194141,75.77313407696708","https://en.wikipedia.org/wiki/Chikmagalur_district",str1));
        words.add(new Word("Ratting 4.3","Savandurga",R.drawable.savandurga,"12.924080551934223,77.29449544052893","https://en.wikipedia.org/wiki/Savandurga",str2));
        words.add(new Word("Ratting 4.7","Nandi Hills",R.drawable.nandi_hills,"13.371867753378432,77.682148945126","https://en.wikipedia.org/wiki/Nandi_Hills,_India",str3));
        words.add(new Word("Ratting 4.1","Sakleshpur",R.drawable.sakleshpur,"12.944734292485794,75.78566538321289","https://en.wikipedia.org/wiki/Sakleshpur",str4));
        words.add(new Word("Ratting 4.5","Kudremukh",R.drawable.kudremukh,"13.143551045091415,75.25312874626371","https://en.wikipedia.org/wiki/Kudremukha",str5));
        words.add(new Word("Ratting 4.9","Anthargange",R.drawable.anthargange,"13.143051413710563,78.10060384227823","https://en.wikipedia.org/wiki/Antara_Gange",str6));
        words.add(new Word("Ratting 4.4","BR Hills",R.drawable.br_hills,"11.999950173904903,77.13983109999998","https://en.wikipedia.org/wiki/Biligiriranga_Hills",str7));
        words.add(new Word("Ratting 4.1","Kemmanagundi",R.drawable.kemmanagundi,"13.550708792198156,75.7501715878099","https://en.wikipedia.org/wiki/Kemmangundi",str8));
        words.add(new Word("Ratting 4.7","Coorg (Madikeri)",R.drawable.coorg_madikeri,"12.425093340542373,75.73283170254712","https://en.wikipedia.org/wiki/Madikeri",str9));
        words.add(new Word("Ratting 4.4","Male Mahadeshwara Betta",R.drawable.male_mahadeshwara_betta,"12.03337714349455,77.59098357214108","https://en.wikipedia.org/wiki/Male_Mahadeshwara_Hills",str10));
        words.add(new Word("Ratting 4.8","Agumbe",R.drawable.agumbe,"13.503398440337937,75.08936383915471","https://en.wikipedia.org/wiki/Agumbe",str11));
        words.add(new Word("Ratting 4.6","Kodachadri Hill",R.drawable.kodachadri_hill,"13.859855160205777,74.86617140510873","https://en.wikipedia.org/wiki/Kodachadri",str12));



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
                Intent intent = new Intent(HillStation.this,Detailsshow.class);

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