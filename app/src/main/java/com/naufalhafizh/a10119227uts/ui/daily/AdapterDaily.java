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
public class AdapterDaily extends RecyclerView.Adapter<AdapterDaily.myviewholder> {

    ArrayList<ModelDaily> modelDaily;

    public AdapterDaily(ArrayList<ModelDaily> modelDaily) {
        this.modelDaily = modelDaily;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_daily, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.logoDaily.setImageResource(modelDaily.get(position).getImage());
        holder.titleDaily.setText(modelDaily.get(position).getTitle());
        holder.descDaily.setText(modelDaily.get(position).getDesc());
    }

    @Override
    public int getItemCount() {
        return modelDaily.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView logoDaily;
        TextView titleDaily, descDaily;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            logoDaily = itemView.findViewById(R.id.logo_daily);
            titleDaily = itemView.findViewById(R.id.title_daily);
            descDaily = itemView.findViewById(R.id.desc_daily);
        }
    }
}