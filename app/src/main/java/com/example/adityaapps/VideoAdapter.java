package com.example.adityaapps;
/*  Nama    : Aditya Mr
    NIM     : 10116068
    Kelas   : AKB2
    Tanggal pengerjaan  : 21 April 2019
    Updated             : 5 Mei 2019
 */
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.adityaapps.model.YoutubeVideos;
import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.ViewHolder> {

    List<YoutubeVideos> youtubeVideosList;

    public VideoAdapter(List<YoutubeVideos> youtubeVideosList){
        this.youtubeVideosList = youtubeVideosList;
    }
    public VideoAdapter() {
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.video_view, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder ViewHolder, int i) {
        ViewHolder.videoView.loadData(youtubeVideosList.get(i).getVideoUrl(),"text/html","utf-8");
    }



    @Override
    public int getItemCount() {
        return youtubeVideosList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        WebView videoView;

        @SuppressLint("SetJavaScriptEnabled")
        public ViewHolder(View itemView){
            super(itemView);

            videoView = (WebView) itemView.findViewById(R.id.video_web_view);

            videoView.getSettings().setJavaScriptEnabled(true);
            videoView.setBackgroundColor(Color.TRANSPARENT);
            videoView.setWebViewClient(new WebViewClient());
            videoView.setWebChromeClient(new WebChromeClient(){
            });
        }
    }
}