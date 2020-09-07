package com.example.ecommerceapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class HisAdapter extends FirebaseRecyclerAdapter<Hismodel,HisAdapter.hisviewholder>  {

    public HisAdapter(@NonNull FirebaseRecyclerOptions<Hismodel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull hisviewholder holder, int position, @NonNull final Hismodel model) {
        holder.pphone.setText(model.getPphone());
        holder.pemail.setText(model.getPemail());
        holder.paddress.setText(model.getPaddress());
        holder.pname.setText(model.getPname());
    }

    @NonNull
    @Override
    public hisviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.hisproduct,parent,false);
        return new hisviewholder(view);
    }

    class hisviewholder extends RecyclerView.ViewHolder{
        TextView pname,pphone,paddress,pemail;
        public hisviewholder(@NonNull View itemView) {
            super(itemView);
            pname=(TextView)itemView.findViewById(R.id.product_hname);
            paddress=(TextView)itemView.findViewById(R.id.product_haddress);
            pemail=(TextView)itemView.findViewById(R.id.product_hemail);
            pphone=(TextView)itemView.findViewById(R.id.product_hphone);
        }
    }

}
