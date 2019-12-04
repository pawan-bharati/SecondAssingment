package com.example.secondassingment.Second;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.secondassingment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Sum extends Fragment implements View.OnClickListener {


    private Button btnsum;
    private EditText etfirstsum,etsecondsum;
    private TextView tvsum;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sum, container, false);
        etfirstsum = view.findViewById(R.id.etfirstsum);
        etsecondsum = view.findViewById(R.id.etsecondsum);
        tvsum=view.findViewById(R.id.tvsum);
        btnsum = view.findViewById(R.id.btnsum);

        btnsum.setOnClickListener(this);

        return view;
    }
    @Override
            public void onClick(View v) {
        if (TextUtils.isEmpty(etfirstsum.getText())) {
            etfirstsum.setError("Enter First Number");
            return;
        }
        if (TextUtils.isEmpty(etsecondsum.getText())) {
            etsecondsum.setError("Enter Second Number");
            return;
        }
        int first= Integer.parseInt(etfirstsum.getText().toString());
        int second= Integer.parseInt(etsecondsum.getText().toString());
        int result=first+second;
        tvsum.setText("The Sum Of Two Numbers is :"+result);
            }
        }
