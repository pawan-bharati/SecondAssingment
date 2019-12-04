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
public class ReverseString extends Fragment implements View.OnClickListener {
    EditText etfirststring;
    Button btnreverses;
    TextView tvrevs;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reverse_string, container, false);
        etfirststring = view.findViewById(R.id.etfirststring);
        btnreverses = view.findViewById(R.id.btnreverses);
        tvrevs=view.findViewById(R.id.tvrevs);

       btnreverses.setOnClickListener(this);

       return view;

    }

    @Override
    public void onClick(View v) {

        if (TextUtils.isEmpty(etfirststring.getText())) {
            etfirststring.setError("Enter Something");
            return;
        }

        String str = etfirststring.getText().toString();
        StringBuilder sb = new StringBuilder(str);
        tvrevs.setText("Your reverse answer is:"+sb.reverse().toString());

        }
    }
