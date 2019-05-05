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
import com.example.adityaapps.model.FriendActivity;

import java.util.ArrayList;
import java.util.List;
/*  Nama    : Aditya Mr
    NIM     : 10116068
    Kelas   : AKB2
    Tanggal pengerjaan  : 21 April 2019
    Updated             : 5 Mei 2019
 */

public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.ViewHolder> {
    private static List<FriendActivity> pictures;
    private static FriendAdapter.OnCallbackListener listener;

    public FriendAdapter(List<FriendActivity> pictures){
        this.pictures = pictures;
    }
    @NonNull
    @Override
    public FriendAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FriendAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_daily_friend, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        FriendActivity image = pictures.get(position);
        viewHolder.imageViewpictures.setImageResource(image.getImage());
        viewHolder.textViewFriend.setText(image.getTitle());
    }

    @Override
    public int getItemCount(){
        return pictures.size();
    }

    public void setOnCallbackListener(FriendAdapter.OnCallbackListener listener){
        this.listener = listener;
    }
    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView imageViewpictures;
        TextView textViewFriend;

        public ViewHolder(View itemView){
            super(itemView);
            itemView.setOnClickListener(this);

            imageViewpictures = itemView.findViewById(R.id.item_image_friend);
            textViewFriend = itemView.findViewById(R.id.item_title_friend);
        }
        @Override
        public void onClick(View v){
            if (listener != null){
                listener.onClick(pictures.get(getAdapterPosition()));
            }
        }
    }
    public interface OnCallbackListener{
        void onClick(FriendActivity user);
    }
}
