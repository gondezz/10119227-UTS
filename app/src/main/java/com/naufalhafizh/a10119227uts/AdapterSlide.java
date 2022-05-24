package com.naufalhafizh.a10119227uts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

//Naufal Hafizh 10119227 IF5 Jumat 29 April 2022
public class AdapterSlide extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public AdapterSlide(Context context){
        this.context = context;
    }

    //array
    public int[] slide_image = {
            R.drawable.ic_logo1,
            R.drawable.ic_logo2,
            R.drawable.ic_logo3
    };

    public String[] slide_title = {
            "HELLO",
            "ABOUT",
            "LET'S BEGIN!"
    };

    public String[] slide_desc = {
            "Welcome to Gonn Gonn",
            "This application contains the personal data of a Naufal Hafizh",
            "Click Start button to enter Gonn Gonn"
    };


    @Override
    public int getCount() {
        return slide_title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout) object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.welcome_page, container, false);

        ImageView slideLogo = (ImageView) view.findViewById(R.id.logo);
        TextView slidetitle = (TextView) view.findViewById(R.id.title);
        TextView slidedesc = (TextView) view.findViewById(R.id.desc);

        slideLogo.setImageResource(slide_image[position]);
        slidetitle.setText(slide_title[position]);
        slidedesc.setText(slide_desc[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
