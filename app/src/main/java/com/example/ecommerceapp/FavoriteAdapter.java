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

public class FavoriteAdapter extends FirebaseRecyclerAdapter<Favorite_model,FavoriteAdapter.FavviewHolder>{
    public FavoriteAdapter(@NonNull FirebaseRecyclerOptions<Favorite_model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull FavoriteAdapter.FavviewHolder holder, int position, @NonNull Favorite_model Favorite_model)
    {
        holder.productName.setText(Favorite_model.getProductName());
        holder.productPrice.setText(Favorite_model.getProductPrice());
        holder.quantity.setText(Favorite_model.getQuantity());
    }

    @NonNull
    @Override
    public FavoriteAdapter.FavviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.favorproduct,parent,false);
        return new FavoriteAdapter.FavviewHolder(view);
    }

    class FavviewHolder extends RecyclerView.ViewHolder
    {
        TextView productName, productPrice, quantity;

        public FavviewHolder(@NonNull View itemView)
        {
            super(itemView);
            productName=(TextView)itemView.findViewById(R.id.product_name);
            productPrice=(TextView)itemView.findViewById(R.id.product_price);
            quantity=(TextView)itemView.findViewById(R.id.quantity);
        }
    }

}
