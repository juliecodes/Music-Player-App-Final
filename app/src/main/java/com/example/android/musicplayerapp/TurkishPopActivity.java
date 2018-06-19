package com.example.android.musicplayerapp;

/**
 * Created by julietantipolo on 6/16/18.
 */


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;




public class TurkishPopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);



        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Hoşuna mı Gidiyor", "Ece Seçkin"));
        songs.add(new Song("Seviyorsun", "Hande Yener"));
        songs.add(new Song("Zorun Ne Sevgilim", "İrem Derici"));
        songs.add(new Song("Kalbimin Tek Sahibine", "İrem Derici"));
        songs.add(new Song("Cevapsız Çınlama", "Emrah Karaduman featuring Aleyna Tilki"));

        songs.add(new Song("Hoşuna mı Gidiyor", "Ece Seçkin"));
        songs.add(new Song("Seviyorsun", "Hande Yener"));
        songs.add(new Song("Zorun Ne Sevgilim", "İrem Derici"));
        songs.add(new Song("Kalbimin Tek Sahibine", "İrem Derici"));
        songs.add(new Song("Cevapsız Çınlama", "Emrah Karaduman featuring Aleyna Tilki"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        com.example.android.musicplayerapp.SongAdapter adapter = new com.example.android.musicplayerapp.SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


    }
}
