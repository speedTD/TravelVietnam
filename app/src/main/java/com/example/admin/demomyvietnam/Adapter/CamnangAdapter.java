package com.example.admin.demomyvietnam.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.demomyvietnam.CamnangActivity;
import com.example.admin.demomyvietnam.Constans;
import com.example.admin.demomyvietnam.R;
import com.example.admin.demomyvietnam.entity.camnang;

import java.util.List;

public class CamnangAdapter extends RecyclerView.Adapter<CamnangAdapter.holder> {
    private Context context;
    private List<camnang>  camnangList;

    public CamnangAdapter(Context context, List<camnang> camnangList) {
        this.context = context;
        this.camnangList = camnangList;
    }

    @NonNull
    @Override
    public CamnangAdapter.holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.item_camnang,parent,false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CamnangAdapter.holder holder, int position) {
        final camnang cn=camnangList.get(position);
        holder.ten.setText(cn.getTen());
        holder.demo.setText(cn.getNoidung());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "đang xem "+cn.getTen(), Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(context, CamnangActivity.class);
                intent.putExtra(Constans.TEN_CAMNANG,cn.getId());
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        if(camnangList!=null){
            return camnangList.size();
        }
        return 0;
    }
    public class holder extends RecyclerView.ViewHolder{
        TextView ten;
        TextView demo;

        public holder(View itemView) {
            super(itemView);
            ten=itemView.findViewById(R.id.id_item_camnang_ten);
            demo=itemView.findViewById(R.id.id_item_camnang_demo);

        }
    }
}
