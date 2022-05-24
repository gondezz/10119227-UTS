package com.naufalhafizh.a10119227uts.ui.daily;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.naufalhafizh.a10119227uts.R;

import java.util.ArrayList;

//Naufal Hafizh 10119227 IF5 Rabu 4 Mei 2022
public class FragmentDaily extends Fragment {

    RecyclerView recyclerViewDaily;
    ArrayList<ModelDaily> modelDaily;
    RecyclerView recyclerViewFriendlist;
    ArrayList<ModelFriendlist> modelFriendlist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_daily, container, false);

        recyclerViewDaily = root.findViewById(R.id.view_daily);
        recyclerViewDaily.setLayoutManager(new LinearLayoutManager(getContext()));

        modelDaily = new ArrayList<>();

        ModelDaily daily1 = new ModelDaily(R.drawable.ic_wakeup, "Wake up", "05.30 a.m");
        modelDaily.add(daily1);
        ModelDaily daily2 = new ModelDaily(R.drawable.ic_workout, "Workout", "05.45 a.m - 06.30 a.m");
        modelDaily.add(daily2);
        ModelDaily daily3 = new ModelDaily(R.drawable.ic_college, "College", "07.00 a.m - 02.00 p.m ");
        modelDaily.add(daily3);
        ModelDaily daily4 = new ModelDaily(R.drawable.ic_rest, "Rest", "02.30 p.m - 03.30 p.m");
        modelDaily.add(daily4);
        ModelDaily daily5 = new ModelDaily(R.drawable.ic_jogging, "Jogging & workout", "04.00 p.m - 05.30 p.m");
        modelDaily.add(daily5);
        ModelDaily daily6 = new ModelDaily(R.drawable.ic_games, "Gaming", "07.00 pm / 11.00 p.m");
        modelDaily.add(daily6);
        ModelDaily daily7 = new ModelDaily(R.drawable.ic_sleep, "Sleep", "07.00 pm / 11.00 p.m");
        modelDaily.add(daily7);

        recyclerViewDaily.setAdapter(new AdapterDaily(modelDaily));

        recyclerViewFriendlist = root.findViewById(R.id.view_friendlist);
        recyclerViewFriendlist.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        modelFriendlist = new ArrayList<>();

        ModelFriendlist friendlist1 = new ModelFriendlist(R.drawable.foto_dasep, "Dasep");
        modelFriendlist.add(friendlist1);
        ModelFriendlist friendlist2 = new ModelFriendlist(R.drawable.foto_damai, "Damai");
        modelFriendlist.add(friendlist2);
        ModelFriendlist friendlist3 = new ModelFriendlist(R.drawable.foto_dhifo, "Dhifo");
        modelFriendlist.add(friendlist3);
        ModelFriendlist friendlist4 = new ModelFriendlist(R.drawable.foto_angga, "Angga");
        modelFriendlist.add(friendlist4);
        ModelFriendlist friendlist5 = new ModelFriendlist(R.drawable.foto_fajar, "Fajar");
        modelFriendlist.add(friendlist5);

        recyclerViewFriendlist.setAdapter(new AdapterFriendlist(modelFriendlist));

        return root;
    }
}