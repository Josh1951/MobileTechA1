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



public class OffersFragment extends Fragment {

    private RecyclerView rv;
    private static String lipsum = "Get up to 50% off with your favourite brands!";
    private static String[] headlines={"Restaurant Discounts","Tickets and Days Out","Clothes","Tech","Subscriptions"};
    private static String[] descriptions={lipsum, lipsum, lipsum, lipsum, lipsum};
    private static int image = R.drawable.ic_offers;

    public static OffersFragment newInstance()
    {
        return new OffersFragment();
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.fragment_offers,null);

        //REFERENCE
        rv= (RecyclerView) rootView.findViewById(R.id.offers_RV);

        //LAYOUT MANAGER
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));

        //ADAPTER
        rv.setAdapter(new MyAdapter(getActivity(),headlines, descriptions, image));

        return rootView;
    }

}
