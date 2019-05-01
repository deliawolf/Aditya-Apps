package com.example.adityaapps.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.adityaapps.R;
import com.example.adityaapps.model.DailyActivity;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{
    Context mContext;
    List<DailyActivity> mData;

    public RecyclerViewAdapter(Context mContext, List<DailyActivity> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_daily_activity,viewGroup, false);
        return new MyViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.tv_name.setText(mData.get(i).getName());
        myViewHolder.tv_kegiatan.setText(mData.get(i).getKegiatan());
        myViewHolder.img_daily.setImageResource(mData.get(i).getPhoto());
    }
    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tv_name;
        private TextView tv_kegiatan;
        private ImageView img_daily;


        public MyViewHolder(View itemView){
            super(itemView);

            tv_name = itemView.findViewById(R.id.nama_daily);
            tv_kegiatan = itemView.findViewById(R.id.dsc_daily);
            img_daily = itemView.findViewById(R.id.img_daily);
        }
    }
}
