package com.example.ecommerceapp.ui.myaccount;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.ecommerceapp.R;

import static com.example.ecommerceapp.R.id.text_myaccount;

public class MyaccountFragment extends Fragment {

    private MyaccountViewModel myaccountViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        myaccountViewModel =
                ViewModelProviders.of(this).get(MyaccountViewModel.class);
        View root = inflater.inflate(R.layout.fragment_myaccount, container, false);
        final TextView textView = root.findViewById(text_myaccount);
        myaccountViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}