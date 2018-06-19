package com.example.android.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // Find the View that shows the edm trance category
        TextView edmtranceMusic = (TextView) findViewById(R.id.edm_view);

        // Set a click listener on that View
        edmtranceMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent edmListIntent = new Intent(MainActivity.this, EdmActivity.class);
                startActivity(edmListIntent);
            }
        });


        // Find the View that shows the edm trance category
        TextView top40Music = (TextView) findViewById(R.id.top40_view);

        // Set a click listener on that View
        top40Music.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent top40ListIntent = new Intent(MainActivity.this, Top40Activity.class);
                startActivity(top40ListIntent);
            }
        });


        // Find the View that shows the edm trance category
        TextView jpopMusic = (TextView) findViewById(R.id.jpop_view);

        // Set a click listener on that View
        jpopMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent jpopListIntent = new Intent(MainActivity.this, JpopActivity.class);
                startActivity(jpopListIntent);
            }
        });




        // Find the View that shows the edm trance category
        TextView turkishMusic = (TextView) findViewById(R.id.turkish_pop_view);

        // Set a click listener on that View
        turkishMusic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent turkishListIntent = new Intent(MainActivity.this, TurkishPopActivity.class);
                startActivity(turkishListIntent);
            }
        });









    }


   /* public void SongDetailsPageView (View view) {
        Intent intentName = new Intent (this, SongDetailsPage.class);
        startActivity(intentName);
    } */

}
