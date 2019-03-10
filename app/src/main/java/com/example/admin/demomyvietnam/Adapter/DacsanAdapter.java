package com.example.admin.demomyvietnam.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.admin.demomyvietnam.R;
import com.example.admin.demomyvietnam.entity.dacsan;

import java.util.List;

public class DacsanAdapter extends RecyclerView.Adapter<DacsanAdapter.holder> {
    private Context context;
    private List<dacsan> dacsanList;

    public DacsanAdapter(Context context, List<dacsan> dacsanList) {
        this.context = context;
        this.dacsanList = dacsanList;
    }

    @NonNull
    @Override
    public DacsanAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(context).inflate(R.layout.item_dacsan,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DacsanAdapter.holder holder, int position) {
        dacsan ds=dacsanList.get(position);
        Glide.with(context).load(ds.getHinh()).into(holder.hinh);
        holder.ten.setText(ds.getTen());
        holder.gia.setText(ds.getGia());
    }

    @Override
    public int getItemCount() {
        if(dacsanList!=null){
        return dacsanList.size();
        }
        return 0;
    }
    public class holder extends RecyclerView.ViewHolder{
        private ImageView hinh;
        private TextView ten;
        private TextView gia;

        public holder(View itemView) {
            super(itemView);
            hinh=itemView.findViewById(R.id.hinh_mon);
            ten=itemView.findViewById(R.id.ten_mon);
            gia=itemView.findViewById(R.id.gia_mon);
        }
    }
}
