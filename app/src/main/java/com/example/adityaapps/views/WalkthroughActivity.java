package com.example.adityaapps.views;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.adityaapps.MainActivity;
import com.example.adityaapps.R;
import com.example.adityaapps.adapter.SliderAdapter;

public class WalkthroughActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private LinearLayout dotlinearLayout;
    private TextView[] mDots;
    private SliderAdapter sliderAdapter;
    private Button mNextBtn;
    private Button mBackBtn;

    private int mCurrentBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        //untuk viewpager 3 slide
        viewPager = findViewById(R.id.pager);
        dotlinearLayout = findViewById(R.id.dots);

        mNextBtn = findViewById(R.id.next);
        mBackBtn = findViewById(R.id.back);


        sliderAdapter = new SliderAdapter(this);

        viewPager.setAdapter(sliderAdapter);

        addDotsIndicator(0);

        viewPager.addOnPageChangeListener(viewLintener);

        //klik untuk viepager
        mNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if (mNextBtn.getText().toString().equals("Finish")){

                    Intent n = new Intent(WalkthroughActivity.this, MainActivity.class);
                    startActivity(n);
                }
                viewPager.setCurrentItem(mCurrentBtn + 1);
            }
        });
        mBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewPager.setCurrentItem(mCurrentBtn - 1);
            }
        });
    }

    //untuk viewpager yang 3 dot
    public void addDotsIndicator(int position){

        mDots = new  TextView[3];
        dotlinearLayout.removeAllViews();

        for(int i = 0; i <mDots.length; i++){

            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.transpaarantwhite));

            dotlinearLayout.addView(mDots[i]);
        }

        if(mDots.length > 0){
            mDots[position].setTextColor(getResources().getColor(R.color.color_white));
        }
    }

    ViewPager.OnPageChangeListener viewLintener = new ViewPager.OnPageChangeListener(){
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

            addDotsIndicator(i);

            mCurrentBtn = 1;

            if(i == 0){
                mCurrentBtn=0;
                mNextBtn.setEnabled(true);
                mBackBtn.setEnabled(false);
                mBackBtn.setVisibility(View.INVISIBLE);
                mNextBtn.setText("Next");
                mBackBtn.setText("");

            } else if (i == mDots.length - 1){
                mCurrentBtn=2;
                mNextBtn.setEnabled(true);
                mBackBtn.setEnabled(true);
                mBackBtn.setVisibility(View.VISIBLE);
                mNextBtn.setText("Finish");
                mBackBtn.setText("Back");
            } else if (i == 1){

                mNextBtn.setEnabled(true);
                mBackBtn.setEnabled(true);
                mBackBtn.setVisibility(View.VISIBLE);
                mNextBtn.setText("Next");
                mBackBtn.setText("Back");
            }

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}
