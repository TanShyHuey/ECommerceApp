package com.example.ecommerceapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.ecommerceapp.ui.Model.cartAdapter;
import com.example.ecommerceapp.ui.Model.model;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class FavoriteAdapter extends FirebaseRecyclerAdapter<model,FavoriteAdapter.viewHolder>{
    public FavoriteAdapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull FavoriteAdapter.viewHolder holder, int position, @NonNull model model)
    {
        holder.productName.setText(model.getProductName());
        holder.productPrice.setText(model.getProductPrice());
        holder.quantity.setText(model.getQuantity());
    }

    @NonNull
    @Override
    public FavoriteAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.favorproduct,parent,false);
        return new FavoriteAdapter.viewHolder(view);
    }

    class viewHolder extends RecyclerView.ViewHolder
    {
        TextView productName, productPrice, quantity;

        public viewHolder(@NonNull View itemView)
        {
            super(itemView);
            productName=(TextView)itemView.findViewById(R.id.product_name);
            productPrice=(TextView)itemView.findViewById(R.id.product_price);
            quantity=(TextView)itemView.findViewById(R.id.quantity);
        }
    }

}
