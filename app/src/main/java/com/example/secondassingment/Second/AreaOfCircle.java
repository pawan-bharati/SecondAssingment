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
public class AreaOfCircle extends Fragment implements View.OnClickListener {
    private Button btnarea;
    private EditText etradius;
    private TextView tvarea;

       @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
           View view= inflater.inflate(R.layout.fragment_area_of_circle, container, false);
           etradius = view.findViewById(R.id.etradius);
           btnarea = view.findViewById(R.id.btnarea);
tvarea=view.findViewById(R.id.tvarea);
           btnarea.setOnClickListener(this);

           return view;
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(etradius.getText())) {
            etradius.setError("Enter Number ");

            return;
        }
        int radius = Integer.parseInt(etradius.getText().toString());
        int result = radius * radius * (22 / 7);

        tvarea.setText("Area Of A Circle is :" + result);
    }
}
