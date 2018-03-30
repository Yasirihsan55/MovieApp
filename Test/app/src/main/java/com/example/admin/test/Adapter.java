package com.example.admin.test;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 19-Mar-18.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.MovieViewHolder> {


    public static ArrayList<Movie> movies;
    private static Context mContext;

    Adapter(Context context, ArrayList<Movie> movies) {
        this.movies = movies;
        this.mContext = context;

}



    public static class MovieViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        CardView cv;


        private static TextView movieName;




        public MovieViewHolder(View itemView) {
            super(itemView);



            cv = (CardView)itemView.findViewById(R.id.cv);
            movieName = (TextView)itemView.findViewById(R.id.tv_title);
            itemView.setOnClickListener(this);
        }

        void bindTo(Movie currentMovie){
            //Populate the textviews with dataTextView movieName;
            movieName.setText(currentMovie.getOriginalTitle());
//            movieOverview.setText(Movie.getOverview());


        }


        @Override
        public void onClick(View v) {
            Movie currentMovie = movies.get(getAdapterPosition());

            Intent intentDetails = new Intent(mContext,MovieResults.class);
            intentDetails.putExtra("title", currentMovie.getOriginalTitle());

//            Intent intentDetails1 = new Intent(mContext,MovieDetails.class);
//            intentDetails1.putExtra("overview",currentMovie.getOverview());


            mContext.startActivity(intentDetails);
        }
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(mContext).inflate(R.layout.movie_item, parent, false);
        MovieViewHolder mvh = new MovieViewHolder(v);
        return mvh;
    }



    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {

//        MovieViewHolder.movieName.setText(movies.get(position).name);
        Movie currentMovie = movies.get(position);
        holder.bindTo(currentMovie);

    }

    @Override
    public int getItemCount() {
        return movies.size();
    }


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}

