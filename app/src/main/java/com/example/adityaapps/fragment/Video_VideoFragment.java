package com.example.adityaapps.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adityaapps.R;
import com.example.adityaapps.VideoAdapter;
import com.example.adityaapps.model.YoutubeVideos;

import java.util.Vector;
/*  Nama    : Aditya Mr
    NIM     : 10116068
    Kelas   : AKB2
    Tanggal pengerjaan  : 21 April 2019
    Updated             : 5 Mei 2019
 */
/**
 * A simple {@link Fragment} subclass.
 */
public class Video_VideoFragment extends Fragment {
        public View v;
        private RecyclerView recyclerVideo;
        Vector<YoutubeVideos> videos = new Vector<YoutubeVideos>();
        private VideoAdapter videoFavoriteAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_video__video, container, false);

        recyclerVideo= (RecyclerView) v.findViewById(R.id.recycler_view_video);
        recyclerVideo.setHasFixedSize(true);
        recyclerVideo.setLayoutManager( new LinearLayoutManager(this.getContext()));

        videos.add( new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/74gx0v5ZJzw\" frameborder=\"0\" allowfullscreen></iframe>") );
        videos.add( new YoutubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/XiX0LvvnnMI\" frameborder=\"0\" allowfullscreen></iframe>") );
        videoFavoriteAdapter = new VideoAdapter(videos);
        recyclerVideo.setAdapter(videoFavoriteAdapter);
        return v;
    }
}
