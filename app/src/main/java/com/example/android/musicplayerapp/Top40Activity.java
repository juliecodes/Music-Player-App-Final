package com.example.android.musicplayerapp;

/**
 * Created by julietantipolo on 6/16/18.
 */


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;


public class Top40Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Attention", "Charlie Puth"));
        songs.add(new Song("Clarity", "Zedd featuring Foxes"));
        songs.add(new Song("Havana", "Camila Cabello"));
        songs.add(new Song("Heavy", "Linkin Park featuring Kiiara"));
        songs.add(new Song("Lean On", "Major Lazer & DJ Snake featuring MØ"));
        songs.add(new Song("Love Wants What it Wants", "Selena Gomez"));
        songs.add(new Song("Rockabye", "Clean Bandit featuring Sean Paul and Anne-Marie"));
        songs.add(new Song("Stay the Night", "Zedd featuring Hayley Williams"));
        songs.add(new Song("We Don't Talk Anymore", "Charlie Puth featuring Selena Gomez"));
        songs.add(new Song("What I've Done", "Linkin Park"));


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
