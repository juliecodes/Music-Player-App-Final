package com.example.android.musicplayerapp;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by julietantipolo on 6/16/18.
 */

public class SongDetailsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_details_page);

         String mySongTitle = getIntent().getExtras().getString("mySongTitle");
        TextView songDetailsTitle = (TextView) findViewById(R.id.song_detail_song_title_view);
        songDetailsTitle.setText(mySongTitle);

        String mySongArtist = getIntent().getExtras().getString("mySongArtist");
        TextView songDetailsArtist = (TextView) findViewById(R.id.song_detail_song_artist_view);
        songDetailsArtist.setText(mySongArtist);




    }
}


