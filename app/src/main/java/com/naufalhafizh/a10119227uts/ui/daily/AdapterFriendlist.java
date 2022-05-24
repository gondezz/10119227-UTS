package com.naufalhafizh.a10119227uts.ui.daily;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.naufalhafizh.a10119227uts.R;

import java.util.ArrayList;


//Naufal Hafizh 10119227 IF5 Rabu 4 Mei 2022
public class AdapterFriendlist extends RecyclerView.Adapter<AdapterFriendlist.myviewholder> {

    ArrayList<ModelFriendlist> modelFriendlist;

    public AdapterFriendlist(ArrayList<ModelFriendlist> modelFriendlist) {
        this.modelFriendlist = modelFriendlist;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_friendlist, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.ivFriendlist.setImageResource(modelFriendlist.get(position).getImage());
        holder.tvNama.setText(modelFriendlist.get(position).getNama());
    }

    @Override
    public int getItemCount() {
        return modelFriendlist.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView ivFriendlist;
        TextView tvNama;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            ivFriendlist = itemView.findViewById(R.id.iv_friendlist);
            tvNama = itemView.findViewById(R.id.tv_nama);
        }
    }
}
