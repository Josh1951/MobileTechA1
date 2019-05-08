package fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.joshuaharveya1.MyAdapter;
import com.example.joshuaharveya1.R;

public class EventsFragment extends Fragment {

    private RecyclerView rv;
    private static String lipsum = "Hat Trick Hero... George Boyd for Peterborough United against Accrington Stanley on the 15th January 2008. Michael Owen for England against Germany on the 1st September 2001. ";
    private static String[] headlines={"Event 1","Event 2","Event 3","Event 4","Event 5"};
    private static String[] descriptions={lipsum, lipsum, lipsum, lipsum, lipsum};

    public static EventsFragment newInstance()
    {
        return new EventsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_events,null);

        //REFERENCE
        rv= (RecyclerView) rootView.findViewById(R.id.events_RV);

        //LAYOUT MANAGER
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));

        //ADAPTER
        rv.setAdapter(new MyAdapter(getActivity(),headlines, descriptions));

        return rootView;
    }
}
