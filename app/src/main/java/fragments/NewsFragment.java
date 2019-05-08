package fragments;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.joshuaharveya1.MyAdapter;
import com.example.joshuaharveya1.R;

import java.util.ArrayList;
import java.util.List;



public class NewsFragment extends Fragment {

    private RecyclerView rv;
    private static String lipsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
    private static String[] headlines={"Headline 1","Headline 2","Headline 3","Headline 4","Headline 5"};
    private static String[] descriptions={lipsum, lipsum, lipsum, lipsum, lipsum};

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
        rv.setAdapter(new MyAdapter(getActivity(),headlines, descriptions));

        return rootView;
    }

}
