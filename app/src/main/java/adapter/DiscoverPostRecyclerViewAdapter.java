package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;

import com.example.himanshu.ibilive.R;

import java.util.ArrayList;

import model.CityModel;

/**
 * discover post recycler view adapter
 */

public class DiscoverPostRecyclerViewAdapter extends android.support.v7.widget.RecyclerView.Adapter<DiscoverPostRecyclerViewAdapter.ViewHolder> {

    private Context context;
    private ArrayList<CityModel> cityModellist = new ArrayList<>();
    private CityModel cityModel;
    private int mode;
    private ViewHolder viewHolder;

    /**
     * @param context       context
     * @param cityModellist city arraylist
     *  @param mode mode
     */
    public DiscoverPostRecyclerViewAdapter(final Context context, final ArrayList<CityModel> cityModellist, final int mode) {
        this.context = context;
        this.cityModellist = cityModellist;
        this.mode = mode;
    }

    /**
     *
     * @param context context
     * @param mode mode
     */
    public DiscoverPostRecyclerViewAdapter(final Context context, final int mode) {
        this.context = context;
        this.mode = mode;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        cityModel = cityModellist.get(position);
    }

    @Override
    public int getItemCount() {
        return cityModellist.size();
    }


    @Override
    public DiscoverPostRecyclerViewAdapter.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {

        View convertView = LayoutInflater.from(context).inflate(R.layout.viewholder_discover_and_post_layout, parent, false);
        viewHolder = new ViewHolder(convertView);
        /**
         * return view holder
         */
        return viewHolder;
    }


    /**
     * view holder
     */
    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvSendRequest, tvParis;
        private Switch mswitch;
        private ImageView ivDelete;
        private RelativeLayout relativeLayout;

        /**
         * @param itemView itemm view
         */
        public ViewHolder(final View itemView) {
            super(itemView);

            mswitch = (Switch) itemView.findViewById(R.id.s_switch);
            tvParis = (TextView) itemView.findViewById(R.id.tv_paris);
            tvSendRequest = (TextView) itemView.findViewById(R.id.tv_send_request);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.rl_layout1);
            ivDelete = (ImageView) itemView.findViewById(R.id.iv_delete);

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(RecyclerView.LayoutParams.WRAP_CONTENT,
                    RecyclerView.LayoutParams.WRAP_CONTENT);

            if (mode == 0) {
                ivDelete.setImageResource(R.drawable.location_icon);
                tvParis.setText("Paris");
                tvParis.setBackgroundResource(0);

                relativeLayout.setVisibility(View.VISIBLE);
                tvSendRequest.setVisibility(View.VISIBLE);
                mswitch.setVisibility(View.GONE);
            } else if (mode == 1) {
                params.setMargins(0, 0, 0, 0);
                tvParis.setLayoutParams(params);
                ivDelete.setLayoutParams(params);
                tvParis.setBackgroundResource(R.drawable.delete_icon);
                ivDelete.setImageResource(R.drawable.post_edit_icon);
                tvParis.setText("");
                relativeLayout.setVisibility(View.INVISIBLE);
                tvSendRequest.setVisibility(View.GONE);
                mswitch.setVisibility(View.VISIBLE);
            }
        }
    }
}