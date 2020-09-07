package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class HistoryPayment extends AppCompatActivity {
    RecyclerView hisrecview;
    HisAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_payment);

        hisrecview=(RecyclerView)findViewById(R.id.historyp);
        hisrecview.setHasFixedSize(false);
        hisrecview.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<Hismodel>options=
            new FirebaseRecyclerOptions.Builder<Hismodel>()
            .setQuery(FirebaseDatabase.getInstance().getReference().child("Payment Detail"),Hismodel.class)
                .build();

        adapter=new HisAdapter(options);
        hisrecview.setAdapter(adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}
