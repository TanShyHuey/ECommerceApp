package com.example.ecommerceapp.ui.Model;

import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerceapp.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class cartAdapter extends FirebaseRecyclerAdapter<model,cartAdapter.viewHolder>
{
    public cartAdapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull viewHolder holder, int position, @NonNull final model model)
    {
        holder.productName.setText(model.getProductName());
        holder.productPrice.setText(model.getProductPrice());
        holder.quantity.setText(model.getQuantity());

    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.addcartlayout,parent,false);
        return new viewHolder(view);
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
