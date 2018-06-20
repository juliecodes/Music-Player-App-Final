package com.example.android.musicplayerapp;

/**
 * Created by julietantipolo on 6/16/18.
 */


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;


public class JpopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Ultimate Girls", "Foxxi MisQ"));
        songs.add(new Song("Whatever (System F Remix)", "浜崎あゆみ"));
        songs.add(new Song("M", "浜崎あゆみ"));
        songs.add(new Song("傀儡謡_陽炎は黄泉に待たむと", "攻殻機動隊 イノセンス"));
        songs.add(new Song("Girl U Love", "Crystal Kay"));
        songs.add(new Song("二時間だけのバカンス", "宇多田ヒカル featuring 椎名林檎"));
        songs.add(new Song("Simple and Clean", "宇多田ヒカル"));
        songs.add(new Song("Try Me ~私を信じて~", "安室奈美恵"));
        songs.add(new Song("Destiny", "Double"));
        songs.add(new Song("Hard to Say", "Crystal Kay"));

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
