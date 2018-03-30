package com.example.admin.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MovieResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_results);


        TextView movieTitle = (TextView) findViewById(R.id.tv_title_detailed);
        movieTitle.setText(getIntent().getStringExtra("title"));
    }
}
