package com.example.ecommerceapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class FavAdapter extends FirebaseRecyclerAdapter<Favmodel,FavAdapter.viewHolder> {

    public FavAdapter(@NonNull FirebaseRecyclerOptions<Favmodel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull viewHolder holder, int position, @NonNull final Favmodel model) {

        holder.name.setText(model.getName());
        holder.prices.setText(model.getPrices());

    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.favorproduct,parent,false);
        return new viewHolder(view);
    }

    public static class viewHolder extends RecyclerView.ViewHolder{

        TextView name, prices;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            name=(TextView)itemView.findViewById(R.id.product_name);
            prices=(TextView)itemView.findViewById(R.id.product_price);

        }
    }
}
