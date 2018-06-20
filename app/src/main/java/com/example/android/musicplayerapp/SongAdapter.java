package com.example.android.musicplayerapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by julietantipolo on 6/16/18.
 */


public class SongAdapter extends ArrayAdapter<Song> {

    // private static final Word LOG_TAG = WordAdapter.class.getSimpleName();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context  The current context. Used to inflate the layout file.
     * @param songList A List of songs to display in a list
     */
    public SongAdapter(Activity context, ArrayList<Song> songList) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songList);
    }


    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        final Song currentSong = getItem(position);

        // Find the TextView in the song_item.xml layout with the ID version_name
        TextView songTitleTextView = (TextView) listItemView.findViewById(R.id.song_title_view);
        // Get the version name from the current Song object and
        // set this text on the name TextView
        songTitleTextView.setText(currentSong.getSongTitle());


        // Find the TextView in the song_item.xml layout with the ID version_number
        TextView songArtistTextView = (TextView) listItemView.findViewById(R.id.song_artist_view);
        // Get the version number from the current Song object and
        // set this text on the number TextView
        songArtistTextView.setText(currentSong.getSongArtist());

        // Find the ImageView in the song_item.xml layout with the ID song_image_icon
        ImageView songImageView = (ImageView) listItemView.findViewById(R.id.song_image_icon);
        // Get the image resource ID from the drawable folder and
        // set the image to songImageView
        songImageView.setImageResource(R.drawable.playbutton_single);

        // Set a click listener on that image
        songImageView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the playButton is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongDetailsPage}
                // Need to pass in the values to the activity and start it
                // the activity and start it
                Context onClickContext = getContext();
                Intent playIntent = new Intent(new Intent(onClickContext, SongDetailsPage.class));

                playIntent.putExtra("mySongTitle", currentSong.getSongTitle());
                playIntent.putExtra("mySongArtist", currentSong.getSongArtist());

                onClickContext.startActivity(playIntent);
            }
        });

// Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;


    }


}