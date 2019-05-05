package com.example.adityaapps.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.adityaapps.R;
import com.example.adityaapps.adapter.SubMenuPagerAdapter;
/*  Nama    : Aditya Mr
    NIM     : 10116068
    Kelas   : AKB2
    Tanggal pengerjaan  : 21 April 2019
    Updated             : 5 Mei 2019
 */

/**
 * A simple {@link Fragment} subclass.
 */
public class MusicFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private SubMenuPagerAdapter adapter;

    public MusicFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_music, container, false);

        viewPager = v.findViewById(R.id.daily_view_pager);
        setupViewPager(viewPager);

        tabLayout = v.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        return v;
    }
    private void setupViewPager(ViewPager viewPager) {
        adapter = new SubMenuPagerAdapter(getChildFragmentManager());
        ((SubMenuPagerAdapter) adapter).addFragment(new Music_MusicFragment(), "Music");
        ((SubMenuPagerAdapter) adapter).addFragment(new Video_VideoFragment(), "Video");
        viewPager.setAdapter((PagerAdapter) adapter);
    }
}
