package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.himanshu.ibilive.R;
import java.util.ArrayList;
import adapter.DiscoverPostRecyclerViewAdapter;
import model.CityModel;

public class DiscoverAndMyPostFragment extends Fragment {

    private int mode;
    DiscoverPostRecyclerViewAdapter displayadapter;
    private ImageView ivInfoButton;
    private EditText etSearch;

    public DiscoverAndMyPostFragment(final int mode) {
        this.mode = mode;
    }

    ArrayList<CityModel> cityModellist = new ArrayList<>();
    CityModel cityModel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle SavedInstance)
    {
        View view;
        view=inflater.inflate(R.layout.fragment_discover_and_myposts,null);
        cityModel = new CityModel();
        cityModellist.add(cityModel);

        cityModel = new CityModel();
        cityModellist.add(cityModel);

        cityModel = new CityModel();
        cityModellist.add(cityModel);

        cityModel = new CityModel();
        cityModellist.add(cityModel);

        cityModel = new CityModel();
        cityModellist.add(cityModel);

        ivInfoButton = (ImageView) view.findViewById(R.id.iv_info_button);
        etSearch = (EditText) view.findViewById(R.id.et_search);
        if(mode == 0) {
            etSearch.setHint("Where would you like to connect?");
            ivInfoButton.setVisibility(View.VISIBLE);
            displayadapter = new DiscoverPostRecyclerViewAdapter(getContext(), cityModellist,mode);
        }
        else
        {
            ivInfoButton.setVisibility(View.GONE);
            etSearch.setHint("Search");
            displayadapter = new DiscoverPostRecyclerViewAdapter(getContext(), cityModellist,mode);
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rvLayout);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(displayadapter);
        recyclerView.setHasFixedSize(true);
        return view;
    }
}
