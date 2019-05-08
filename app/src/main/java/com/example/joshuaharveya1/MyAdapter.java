package com.example.joshuaharveya1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.RecyclerVH> {

    Context c;
    String[] headlines;
    String[] descriptions;
    int image;

    public MyAdapter(Context c, String[] headlines, String[] descriptions, int image) {
        this.c = c;
        this.headlines = headlines;
        this.descriptions = descriptions;
        this.image = image;
    }

    @Override
    public RecyclerVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(c).inflate(R.layout.model,parent,false);
        return new RecyclerVH(v);
    }

    @Override
    public void onBindViewHolder(RecyclerVH holder, int position) {
        holder.headline.setText(headlines[position]);
        holder.description.setText(descriptions[position]);
        holder.image.setImageResource(image);
    }

    @Override
    public int getItemCount()
    {
        return headlines.length;
    }

    /*
    VIEWHOLDER CLASS
     */
    public class RecyclerVH extends RecyclerView.ViewHolder
    {
        ImageView image;
        TextView headline;
        TextView description;

        public RecyclerVH(View itemView) {

            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.imageView);
            headline = (TextView) itemView.findViewById(R.id.headline);
            description = (TextView) itemView.findViewById(R.id.description);
        }
    }
}