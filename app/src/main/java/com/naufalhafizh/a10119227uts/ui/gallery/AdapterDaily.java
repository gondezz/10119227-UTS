package com.naufalhafizh.a10119227uts.ui.gallery;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.naufalhafizh.a10119227uts.R;

import java.util.ArrayList;



//Naufal Hafizh 10119227 IF5 Kamis 5 Mei 2022
public class AdapterDaily extends RecyclerView.Adapter<AdapterDaily.myviewholder> {

    ArrayList<ModelGallery> modelGallery;

    public AdapterDaily(ArrayList<ModelGallery> modelGallery) {
        this.modelGallery = modelGallery;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gallery, parent, false);
        return new AdapterDaily.myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.logoGallery.setImageResource(modelGallery.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return modelGallery.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView logoGallery;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            logoGallery = itemView.findViewById(R.id.logo_gallery);
        }
    }
}
