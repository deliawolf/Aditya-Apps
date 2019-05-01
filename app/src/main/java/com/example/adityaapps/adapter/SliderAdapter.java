package com.example.adityaapps.adapter;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.adityaapps.R;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }

    public int[] img_otak = {

            R.drawable.otak,
            R.drawable.orang,
            R.drawable.suka
    };

    public String[] txt_judul_otak = {
            "ADITYA APPS",
            "LEBIH MENGENAL ADIT",
            "YANG ADIT SUKAI"
    };

    public String[] txt_desc_otak = {
            "aplikasi ini dibuat untuk mengenal lebih dekat seorang anak yang berasal dari sumedang bernama Adit dengan menggunakan media aplikasi android",
            "aplikasi ini akan memberitahumu apa saja yang sering dilakukan Adit seperti hobi kegiatn kegiatannya dan masih banyak lagi!",
            "aplikasi ini juga memberitahumu lebih banyak tentang musik dan video apa saja yang disukai Adit mulai dari lagu kesukaan hingga video yang paling disukai"
    };


    @Override
    public int getCount() {
        return txt_judul_otak.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);


        ImageView slideImageView = (ImageView) view.findViewById(R.id.img_otak);
        TextView slideHeading = (TextView) view.findViewById(R.id.txt_judul_otak);
        TextView slideDeskription = (TextView) view.findViewById(R.id.txt_desc_otak);

        slideImageView.setImageResource(img_otak[position]);
        slideHeading.setText(txt_judul_otak[position]);
        slideDeskription.setText(txt_desc_otak[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        container.removeView((RelativeLayout)object);
    }
}
