package com.example.android.musicplayerapp;

/**
 * Created by julietantipolo on 6/16/18.
 */

public class Song {

/**
 * {@link Song} represents a song that the user wants to listen to.
 * It contains details about the song.
 */

    /**  title of the song */
    private String mSongTitle;

    /** artist of the song */
    private String mSongArtist;


    /**
     * Create a new Song object.
     *
     * @param songTitle is the song title
     * @param songArtist is the song artist
     *
     */
    public Song(String songTitle, String songArtist) {
        mSongTitle = songTitle;
        mSongArtist = songArtist;

    }

    /**
     * Get the title of the song.
     */
    public String getSongTitle() {
        return mSongTitle;
    }

    /**
     * Get the artist of the song.
     */
    public String getSongArtist() {
        return mSongArtist;
    }



}