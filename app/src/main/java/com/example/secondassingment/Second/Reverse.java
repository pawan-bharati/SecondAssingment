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


import com.example.secondassingment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Reverse extends Fragment implements View.OnClickListener {

    private Button btnrev;
    private EditText etfirstno;
    private TextView tvrev;
    public Reverse() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_reverse, container, false);
        etfirstno=view.findViewById(R.id.etfirstno);
        tvrev=view.findViewById(R.id.tvrev);

        btnrev=view.findViewById(R.id.btnrev);

        btnrev.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etfirstno.getText())) {
            etfirstno.setError("Enter Something");;
            return;
        }

        int num =Integer.parseInt(etfirstno.getText().toString());
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        tvrev.setText("Reversed Value is :"+reversed);
        }
    }

