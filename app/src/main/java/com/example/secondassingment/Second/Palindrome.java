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
public class Palindrome extends Fragment implements View.OnClickListener{

    private Button btnpali;
    private EditText etpalin;
    private TextView tvpal;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_palindrome, container, false);
        etpalin=view.findViewById(R.id.etpalin);
        btnpali=view.findViewById(R.id.btnpali);
        tvpal=view.findViewById(R.id.tvpal);

        btnpali.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etpalin.getText())) {
            etpalin.setError("Enter Number");

            return;
        }

        int p, sum = 0, temp;
        int q = Integer.parseInt(etpalin.getText().toString());

        temp = q;
        while (q > 0) {
            p = q % 10;  //getting remainder
            sum = (sum * 10) + p;
            q = q / 10;
            if (temp == sum)
                tvpal.setText("It is palindrome Number");
            else
                tvpal.setText("It is Not a palindrome Number");

        }
    }
}