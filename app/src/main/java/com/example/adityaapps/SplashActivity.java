package com.example.adityaapps;
/*  Nama    : Aditya Mr
    NIM     : 10116068
    Kelas   : AKB2
    Tanggal pengerjaan  : 21 April 2019
    Updated             : 5 Mei 2019
 */
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {


    ImageView imgLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imgLogo = findViewById(R.id.splash_logo);

        //rsc animasi splash
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.fadeout);
        imgLogo.startAnimation(animation);

        //menjalankan splash activity dalam kurun waktu 3 detik(3000)
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent panggil = new Intent(SplashActivity.this, WalkthroughActivity.class);
                startActivity(panggil);
                finish();
            }
        }, 3000);
    }
}
