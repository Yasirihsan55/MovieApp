package com.example.admin.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SearchResults extends AppCompatActivity {

    ArrayList<Movie> movies;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        RecyclerView rv = (RecyclerView) findViewById(R.id.recyclerView);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);

        initializeData();

        Adapter adptr = new Adapter(this,movies);
        rv.setAdapter(adptr);







    }
    private void initializeData(){
        movies = new ArrayList<Movie>();
        movies.add(new Movie("Thor"));
        movies.add(new Movie("The Shape Of Water"));
        movies.add(new Movie("Black Panther"));
    }

}
