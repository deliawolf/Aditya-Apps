package com.example.adityaapps.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.adityaapps.R;
import com.example.adityaapps.model.GalleryModel;

import java.util.List;
/*  Nama    : Aditya Mr
    NIM     : 10116068
    Kelas   : AKB2
    Tanggal pengerjaan  : 21 April 2019
    Updated             : 5 Mei 2019
 */

public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.ViewHolder> {

    private static List<GalleryModel> pictures;
    private static OnCallbackListener listener;


    public GalleryAdapter(List<GalleryModel> pictures) {
        this.pictures = pictures;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_view_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GalleryModel picture = pictures.get(position);
        holder.imageViewPicture.setImageResource(picture.getPicture());
    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public void setOnCallbackListener(OnCallbackListener listener) {
        this.listener = listener;
    }

    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageViewPicture;
        TextView textViewPicTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            imageViewPicture = itemView.findViewById(R.id.image_view_gallery);
        }

        @Override
        public void onClick(View v) {
            if (listener != null) {
                listener.onClick(pictures.get(getAdapterPosition()));
            }
        }
    }

    public interface OnCallbackListener {

        void onClick(GalleryModel user);
    }
}