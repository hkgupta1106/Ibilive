package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.himanshu.ibilive.R;
import adapter.DiscoverPostRecyclerViewAdapter;
import adapter.RequestRecyclerViewAdapter;

public class RequestsFragment extends Fragment {

    private static final int MODE = 2;
    RequestRecyclerViewAdapter displayadapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle SavedInstance)
    {
        View view;
        view=inflater.inflate(R.layout.fragment_requests,null);

        displayadapter = new RequestRecyclerViewAdapter(getContext());

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_layout);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(displayadapter);
        recyclerView.setHasFixedSize(true);
        return view;
    }
}
