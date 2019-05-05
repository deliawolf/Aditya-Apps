package com.example.adityaapps;
/*  Nama    : Aditya Mr
    NIM     : 10116068
    Kelas   : AKB2
    Tanggal pengerjaan  : 21 April 2019
    Updated             : 5 Mei 2019
 */
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;

import com.example.adityaapps.fragment.DailyFragment;
import com.example.adityaapps.fragment.GalleryFragment;
import com.example.adityaapps.fragment.HomeFragment;
import com.example.adityaapps.fragment.MusicFragment;
import com.example.adityaapps.fragment.PProfileFragment;
import com.example.adityaapps.fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    Fragment homeFragment  = new HomeFragment();
    Fragment dailyFragment  = new DailyFragment();
    Fragment galleryFragment  = new GalleryFragment();
    Fragment musicFragment  = new MusicFragment();
    Fragment pprofileFragment  = new PProfileFragment();

    FragmentManager fragmentManager = getSupportFragmentManager();
    Fragment fragmentActive = homeFragment;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    fragmentManager.beginTransaction().hide(fragmentActive).show(homeFragment).commit();
                    fragmentActive = homeFragment;

                    return true;
                case R.id.daily:
                    fragmentManager.beginTransaction().hide(fragmentActive).show(dailyFragment).commit();
                    fragmentActive = dailyFragment;

                    return true;
                case R.id.gallery:
                    fragmentManager.beginTransaction().hide(fragmentActive).show(galleryFragment).commit();
                    fragmentActive = galleryFragment;

                    return true;
                case R.id.music:

                    fragmentManager.beginTransaction().hide(fragmentActive).show(musicFragment).commit();
                    fragmentActive = musicFragment;
                    return true;
                case R.id.profile:

                    fragmentManager.beginTransaction().hide(fragmentActive).show(pprofileFragment).commit();
                    fragmentActive = pprofileFragment;
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        fragmentManager.beginTransaction().add(R.id.frameLayout, pprofileFragment).hide(pprofileFragment).commit();
        fragmentManager.beginTransaction().add(R.id.frameLayout, musicFragment).hide(musicFragment).commit();
        fragmentManager.beginTransaction().add(R.id.frameLayout, galleryFragment).hide(galleryFragment).commit();
        fragmentManager.beginTransaction().add(R.id.frameLayout, dailyFragment).hide(dailyFragment).commit();
        fragmentManager.beginTransaction().add(R.id.frameLayout, homeFragment).commit();
    }
}
