package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.himanshu.ibilive.R;

/**
 * request recycler view adapter
 */

public class RequestRecyclerViewAdapter extends android.support.v7.widget.RecyclerView.Adapter<RequestRecyclerViewAdapter.ViewHolder> {

    private static final int NUM = 10;
    private Context context;

    /**
     *
     * @param context context
     */
    public RequestRecyclerViewAdapter(final Context context) {
        this.context = context;
    }

    @Override
    public RequestRecyclerViewAdapter.ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {

        View convertView = LayoutInflater.from(context).inflate(R.layout.viewholder_request_layout, parent, false);
        ViewHolder viewHolder = new RequestRecyclerViewAdapter.ViewHolder(convertView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final RequestRecyclerViewAdapter.ViewHolder holder, final int position) {

    }

    /**
     * view holder
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        /**
         * @param itemView itemm view
         */
        public ViewHolder(final View itemView) {
            super(itemView);


        }
    }

    @Override
    public int getItemCount() {
        return NUM;
    }
}
