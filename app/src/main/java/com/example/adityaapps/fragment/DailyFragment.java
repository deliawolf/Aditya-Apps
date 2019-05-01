package com.example.adityaapps.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adityaapps.R;
import com.example.adityaapps.adapter.RecyclerViewAdapter;
import com.example.adityaapps.model.DailyActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class DailyFragment extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<DailyActivity> lstDaily;

    public DailyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_daily, container, false);
        myrecyclerview = v.findViewById(R.id.daily_recycleview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstDaily);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstDaily = new ArrayList<>();
        lstDaily.add(new DailyActivity("Tidur", "4 jam perhari",R.drawable.ic_tidur));
        lstDaily.add(new DailyActivity("Kuliah + Tugas","15 jam perhari",R.drawable.ic_book));
        lstDaily.add(new DailyActivity("IStirahat","2 jam perhari",R.drawable.ic_istirahat));
        lstDaily.add(new DailyActivity("Games","3 jam perhari",R.drawable.ic_videogame));


    }
}
