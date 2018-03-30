package com.example.admin.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner ratings;
    Spinner genres;
    Spinner actors;
    Spinner time;
    Spinner director;
    Spinner industry;

     RecyclerView rv;
     ArrayList<Movie> movies;
     Adapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        rv = (RecyclerView)findViewById(R.id.recyclerView);
//        rv.setLayoutManager(new LinearLayoutManager(this));

//        rv.setAdapter(mAdapter);



//        Ratings
        ratings = (Spinner) findViewById(R.id.spinner_rate);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource
                (this, R.array.ratings, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ratings.setAdapter(adapter);

//        Genres
        genres = (Spinner) findViewById(R.id.spinner_genre);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource
                (this, R.array.genres, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genres.setAdapter(adapter1);

//        Language
        actors = (Spinner) findViewById(R.id.spinners_language);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource
                (this, R.array.actors, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        actors.setAdapter(adapter2);

//        Release Date
        time = (Spinner) findViewById(R.id.spinner_releaseDate);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource
                (this, R.array.time, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        time.setAdapter(adapter3);

    }



    public void search(View view) {
//        Movie currentMovie = movies.get(getAdapterPosition());
        Log.d("Clicked", "Search Pressed");

        Intent intentDetails = new Intent(MainActivity.this,SearchResults.class);

        startActivity(intentDetails);
    }
}
