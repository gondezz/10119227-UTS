package com.naufalhafizh.a10119227uts.ui.favorite;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.naufalhafizh.a10119227uts.R;

import java.util.ArrayList;


public class FragmentFavorite extends Fragment {

    // views music
    RecyclerView recyclerViewMusic;
    ArrayList<ModelFavorite> modelFavorite;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_favorite, container, false);

        // music
        recyclerViewMusic = root.findViewById(R.id.recview_music);
        recyclerViewMusic.setLayoutManager(new LinearLayoutManager(getContext()));

        modelFavorite = new ArrayList<>();

        ModelFavorite music1 = new ModelFavorite(R.drawable.medot_janji, "Kartonyono Medot Janji", "Deni Caknan");
        modelFavorite.add(music1);
        ModelFavorite music2 = new ModelFavorite(R.drawable.satru, "Satru", "Deni Caknan ft. Happy Asmara");
        modelFavorite.add(music2);
        ModelFavorite music3 = new ModelFavorite(R.drawable.lemah_teles, "Lemah Teles", "Happy Asmara");
        modelFavorite.add(music3);
        ModelFavorite music4 = new ModelFavorite(R.drawable.los_dol, "Los Dol", "Vita Alvia");
        modelFavorite.add(music4);
        ModelFavorite music5 = new ModelFavorite(R.drawable.sewu_kuto, "Sewu Kuto", "Deni Caknan");
        modelFavorite.add(music5);

        recyclerViewMusic.setAdapter(new AdapterFriendlist(modelFavorite));


        VideoView vvVideo = root.findViewById(R.id.vv_video);
        String videoPath = "android.resource://" + getContext().getPackageName() + "/" + R.raw.videopreview;
        Uri uri = Uri.parse(videoPath);
        vvVideo.setVideoURI(uri);

        MediaController mediaController = new MediaController(getContext());
        vvVideo.setMediaController(mediaController);
        mediaController.setAnchorView(vvVideo);


            return root;
    }
}