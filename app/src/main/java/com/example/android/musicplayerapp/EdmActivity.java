package com.example.android.musicplayerapp;

/**
 * Created by julietantipolo on 6/16/18.
 */


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class EdmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Ayla (Ben Nicky & Luke Bond Remix)", "Ayla"));
        songs.add(new Song("Be Together (Vanic Remix)", "Major Lazer featuring Wild Belle"));
        songs.add(new Song("Bullet Train", "Stephen Swartz featuring Joni Fatora"));
        songs.add(new Song("Electric Glow", "Tritonal"));
        songs.add(new Song("I Need You Now", "Bryan Kearney featuring Plumb"));
        songs.add(new Song("In and Out of Love", "Armin Van Buuren featuring Sharon den Adel"));
        songs.add(new Song("One", "Swedish House Mafia"));
        songs.add(new Song("Sun and Moon", "Above and Beyond"));
        songs.add(new Song("Sweet Escape", "Alesso featuring Sirena"));
        songs.add(new Song("The Tribe", "Vini Vici"));
        songs.add(new Song("Worlds Apart", "Seven Lions featuring Kerli"));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        com.example.android.musicplayerapp.SongAdapter adapter = new com.example.android.musicplayerapp.SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);

    }
}
