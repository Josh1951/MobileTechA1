package com.example.joshuaharveya1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class NewsFragment extends Fragment {

    private RecyclerView rv;
    private static String[] headlines={"Headline 1","Headline 2","Headline 3","Headline 4","Headline 5"};

    public static NewsFragment newInstance()
    {
        return new NewsFragment();
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.fragment_news,null);

        //REFERENCE
        rv= (RecyclerView) rootView.findViewById(R.id.news_RV);

        //LAYOUT MANAGER
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));

        //ADAPTER
        rv.setAdapter(new MyAdapter(getActivity(),headlines));

        return rootView;
    }

    @Override
    public String toString() {
        return "InterGalactic";
    }
}
