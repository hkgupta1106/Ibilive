package fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.himanshu.ibilive.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

/**
 * Map Fragment extends fragments
 */
public class MapFragment extends Fragment implements OnMapReadyCallback {

    EditText etSearch;
    ImageView ivInfoButton;
    @Override
    public void onMapReady(final GoogleMap googleMap1) {


    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_map, container, false);
        etSearch = (EditText) view.findViewById(R.id.et_search);
        ivInfoButton = (ImageView) view.findViewById(R.id.iv_info_button);
        etSearch.setHint("Location");
        ivInfoButton.setVisibility(View.GONE);
        etSearch.setCompoundDrawablesWithIntrinsicBounds(R.drawable.location_icon_small,0,0,0);
        return view;
    }

    @Override
    public void onActivityCreated(final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        SupportMapFragment supportMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        supportMapFragment.getMapAsync(this);

    }

}