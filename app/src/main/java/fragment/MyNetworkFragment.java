package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.himanshu.ibilive.R;

import java.util.ArrayList;

import adapter.MyNetworkRecyclerViewAdapter;
import model.CustomerModel;

/**
 * my network fragment
 */

public class MyNetworkFragment extends Fragment {

    private ArrayList<CustomerModel> customerModellist = new ArrayList<>();
    private CustomerModel customerModel;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup viewGroup, final Bundle savedInstance) {
        View view;
        view = inflater.inflate(R.layout.fragment_mynetwork, null);
        customerModel = new CustomerModel("Evelyn", "Paris");
        customerModellist.add(customerModel);

        customerModel = new CustomerModel("Keshav", "London");
        customerModellist.add(customerModel);

        customerModel = new CustomerModel("Hitesh", "Australia");
        customerModellist.add(customerModel);

        customerModel = new CustomerModel("Aman", "India");
        customerModellist.add(customerModel);

        customerModel = new CustomerModel("Aman", "India");
        customerModellist.add(customerModel);

        customerModel = new CustomerModel("Aman", "India");
        customerModellist.add(customerModel);

        customerModel = new CustomerModel("Aman", "India");
        customerModellist.add(customerModel);

        customerModel = new CustomerModel("Aman", "India");
        customerModellist.add(customerModel);

        customerModel = new CustomerModel("Aman", "India");
        customerModellist.add(customerModel);

        MyNetworkRecyclerViewAdapter displayadapter = new MyNetworkRecyclerViewAdapter(getContext(), customerModellist);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rvLayout);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(displayadapter);
        recyclerView.setHasFixedSize(true);
        return view;
    }
}
