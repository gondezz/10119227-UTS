package com.naufalhafizh.a10119227uts.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.naufalhafizh.a10119227uts.R;
import com.naufalhafizh.a10119227uts.databinding.FragmentHomeBinding;


//Naufal Hafizh 10119227 IF5 Sabtu 30 April 2022
public class FragmentHome extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }

}