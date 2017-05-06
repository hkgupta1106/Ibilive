package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.himanshu.ibilive.R;

import java.util.ArrayList;

import model.CustomerModel;

/**
 * my network recycler view adapter
 */

public class MyNetworkRecyclerViewAdapter extends android.support.v7.widget.RecyclerView.Adapter<MyNetworkRecyclerViewAdapter.ViewHolder> {

    private Context context;
    private ArrayList<CustomerModel> customerModellist = new ArrayList<>();
    private CustomerModel customerModel;

    /**
     * @param context           context
     * @param customerModellist customer arraylist
     */
    public MyNetworkRecyclerViewAdapter(final Context context, final ArrayList<CustomerModel> customerModellist) {
        this.context = context;
        this.customerModellist = customerModellist;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        customerModel = customerModellist.get(position);

        holder.tvName.setText(customerModel.getName());
        holder.tvCity.setText(customerModel.getCity());

    }

    @Override
    public int getItemCount() {
        return customerModellist.size();
    }


    @Override
    public MyNetworkRecyclerViewAdapter.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {


        View convertView = LayoutInflater.from(context).inflate(R.layout.viewolder_network_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(convertView);
        /**
         * return view holder
         */
        return viewHolder;
    }


    /**
     * view holder
     */
    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName, tvCity;

        /**
         * @param itemView itemm view
         */
        public ViewHolder(final View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tv_evelyn);
            tvCity = (TextView) itemView.findViewById(R.id.tv_paris);
        }
    }
}