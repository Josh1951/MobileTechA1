package fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.joshuaharveya1.MyAdapter;
import com.example.joshuaharveya1.R;


public class JobsFragment extends Fragment {

    private RecyclerView rv;
    private static String lipsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
    private static String[] headlines={"Part time jobs","Full time jobs","Apprenticeships","Summer Jobs","More..."};
    private static String[] descriptions={lipsum, lipsum, lipsum, lipsum, lipsum};
    private static int image = R.drawable.ic_jobs;

    public static JobsFragment newInstance()
    {
        return new JobsFragment();
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.fragment_jobs,null);

        //REFERENCE
        rv= (RecyclerView) rootView.findViewById(R.id.jobs_RV);

        //LAYOUT MANAGER
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));

        //ADAPTER
        rv.setAdapter(new MyAdapter(getActivity(),headlines, descriptions, image));

        return rootView;
    }

}
