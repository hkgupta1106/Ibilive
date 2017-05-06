package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.himanshu.ibilive.R;

import adapter.RequestRecyclerViewAdapter;

/**
 * request fragment
 */
public class RequestsFragment extends Fragment {

    private RequestRecyclerViewAdapter displayAdapter;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup viewGroup, final Bundle savedInstance) {
        View view;
        view = inflater.inflate(R.layout.fragment_requests, null);

        displayAdapter = new RequestRecyclerViewAdapter(getContext());

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_layout);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(displayAdapter);
        recyclerView.setHasFixedSize(true);
        return view;
    }
}
