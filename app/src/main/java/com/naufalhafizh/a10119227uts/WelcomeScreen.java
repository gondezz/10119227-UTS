package com.naufalhafizh.a10119227uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


//Naufal Hafizh 10119227 IF5 Jumat 29 April 2022
public class WelcomeScreen extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    private TextView[] mDots;

    private Button mFinishBtn;
    private Button mNextBtn;
    private Button mBackBtn;

    private int mCurrentPage;


    private AdapterSlide adapterSlide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        mFinishBtn = (Button) findViewById(R.id.startBtn);
        mNextBtn = (Button) findViewById(R.id.nextBtn);
        mBackBtn = (Button) findViewById(R.id.backBtn);


        mSlideViewPager = (ViewPager) findViewById(R.id.slideviewpager);
        mDotLayout = (LinearLayout) findViewById(R.id.dots);

        adapterSlide = new AdapterSlide(this);
        mSlideViewPager.setAdapter(adapterSlide);

        addDotsIndicator(0);

        mSlideViewPager.addOnPageChangeListener(viewListener);

        //OnClickListeners

        mNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSlideViewPager.setCurrentItem(mCurrentPage + 1);
            }
        });

        mBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSlideViewPager.setCurrentItem(mCurrentPage - 1);
            }
        });

        mFinishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MyIntent = new Intent(WelcomeScreen.this, HomeScreen.class);
                startActivity(MyIntent);
            }
        });



    }
    public void addDotsIndicator(int position){
        mDots = new TextView[3];
        mDotLayout.removeAllViews();
        for (int i = 0; i < mDots.length; i++){
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.white));

            mDotLayout.addView(mDots[i]);
        }
        if ((mDots.length > 0)){

            mDots[position].setTextColor(getResources().getColor(R.color.Kournikova));
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);
            mCurrentPage = i;
            if (i == 0) {

                mNextBtn.setEnabled(true);
                mBackBtn.setEnabled(false);
                mFinishBtn.setEnabled(false);
                mBackBtn.setVisibility(View.INVISIBLE);
                mFinishBtn.setVisibility(View.INVISIBLE);

                mFinishBtn.setText("");
                mBackBtn.setText("");
                mNextBtn.setText("Next");

            } else if (i == mDots.length - 1) {
                mNextBtn.setEnabled(false);
                mBackBtn.setEnabled(true);
                mFinishBtn.setEnabled(true);
                mBackBtn.setVisibility(View.VISIBLE);
                mFinishBtn.setVisibility(View.VISIBLE);

                mNextBtn.setText("");
                mBackBtn.setText("Back");
                mFinishBtn.setText("Start");

            } else {
                mFinishBtn.setEnabled(false);
                mNextBtn.setEnabled(true);
                mBackBtn.setEnabled(true);

                mBackBtn.setVisibility(View.VISIBLE);
                mFinishBtn.setVisibility(View.INVISIBLE);

                mFinishBtn.setText("");
                mBackBtn.setText("Back");
                mNextBtn.setText("Next");

            }

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}