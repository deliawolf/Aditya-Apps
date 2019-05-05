package com.example.adityaapps.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;
import com.example.adityaapps.R;
import com.example.adityaapps.adapter.FriendAdapter;
import com.example.adityaapps.adapter.RecyclerViewAdapter;
import com.example.adityaapps.model.DailyActivity;
import com.example.adityaapps.presenter.FriendPresenter;

import java.util.ArrayList;
import java.util.List;
/*  Nama    : Aditya Mr
    NIM     : 10116068
    Kelas   : AKB2
    Tanggal pengerjaan  : 21 April 2019
    Updated             : 5 Mei 2019
 */

/**
 * A simple {@link Fragment} subclass.
 */
public class Daily_ActivityFragment extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<DailyActivity> lstDaily;
    TabHost tabHost;


    public Daily_ActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_daily__activity, container, false);
        myrecyclerview = v.findViewById(R.id.daily_recycleview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstDaily);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return v;

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstDaily = new ArrayList<>();
        lstDaily.add(new DailyActivity("Tidur", "22:00 - 04:00",R.drawable.ic_tidur));
        lstDaily.add(new DailyActivity("Makan","04:00 - 04:15",R.drawable.ic_makan));
        lstDaily.add(new DailyActivity("Mandi","04:15 - 04:30",R.drawable.ic_mandi));
        lstDaily.add(new DailyActivity("Perjalanan","05:00 - 06:30",R.drawable.ic_berangkat));
        lstDaily.add(new DailyActivity("Kuliah","07:00 - 17:00",R.drawable.ic_book));
        lstDaily.add(new DailyActivity("Perjalanan","17:00 - 19:00",R.drawable.ic_berangkat));
        lstDaily.add(new DailyActivity("istirahat","19:00 - 19:30",R.drawable.ic_istirahat));
        lstDaily.add(new DailyActivity("Makan malam","19:30 - 19:45",R.drawable.ic_makan));
        lstDaily.add(new DailyActivity("Mandi","19:45 - 20:00",R.drawable.ic_mandi));
        lstDaily.add(new DailyActivity("Games","20:00 - 22:00",R.drawable.ic_videogame));
    }

}
