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
public class Automophic extends Fragment implements View.OnClickListener {


    private Button btnautomo;
    private EditText etauto;
    private TextView tvauto;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automophic, container, false);
        etauto = view.findViewById(R.id.etauto);
        tvauto = view.findViewById(R.id.tvauto);
        btnautomo = view.findViewById(R.id.btnautomo);

        btnautomo.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etauto.getText())) {
            etauto.setError("Enter Something ");
            return;
        }

        int num = Integer.parseInt(etauto.getText().toString());
        int sq_num = num * num;
        String str_num = Integer.toString(num);
        String square = Integer.toString(sq_num);
        if (square.endsWith(str_num)) {
            tvauto.setText("Is Automorphic Number.");
        } else {
            tvauto.setText("Not an Automorphic Number.");
        }
    }
}
