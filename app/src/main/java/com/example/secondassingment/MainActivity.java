package com.example.secondassingment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.secondassingment.Second.AreaOfCircle;
import com.example.secondassingment.Second.Automophic;
import com.example.secondassingment.Second.Palindrome;
import com.example.secondassingment.Second.Reverse;
import com.example.secondassingment.Second.ReverseString;
import com.example.secondassingment.Second.Sum;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button btnadd,btnarea,btnreverseno,btnpalendrom,btnauto,btnreversestring;
private Boolean status =true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnadd=findViewById(R.id.btnadd);
        btnarea=findViewById(R.id.btnarea);
        btnreverseno=findViewById(R.id.btnreverseno);
        btnpalendrom=findViewById(R.id.btnpalendrom);
        btnauto=findViewById(R.id.btnauto);
        btnreversestring=findViewById(R.id.btnreversestring);
        btnadd.setOnClickListener(this);
        btnreversestring.setOnClickListener(this);
        btnreversestring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ReverseString reverseString = new ReverseString();
                fragmentTransaction.replace(R.id.fragmentContainer, reverseString);
                fragmentTransaction.commit();

                status = false;
            }
        });
        btnauto.setOnClickListener(this);
        btnauto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Automophic automophic = new Automophic();
                fragmentTransaction.replace(R.id.fragmentContainer, automophic);
                fragmentTransaction.commit();

                status = false;
            }
        });
        btnpalendrom.setOnClickListener(this);
        btnpalendrom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Palindrome palindrome = new Palindrome();
                fragmentTransaction.replace(R.id.fragmentContainer, palindrome);
                fragmentTransaction.commit();

                status = false;
            }
        });
        btnreverseno.setOnClickListener(this);
        btnreverseno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Reverse reverse = new Reverse();
                fragmentTransaction.replace(R.id.fragmentContainer, reverse);
                fragmentTransaction.commit();

                status = false;
            }
        });

        btnarea.setOnClickListener(this);
        btnarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                AreaOfCircle areaOfCircle = new AreaOfCircle();
                fragmentTransaction.replace(R.id.fragmentContainer, areaOfCircle);
                fragmentTransaction.commit();

                status = false;
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Sum sum = new Sum();
                fragmentTransaction.replace(R.id.fragmentContainer, sum);
                fragmentTransaction.commit();

                status = false;
            }
        });
    }


    @Override
    public void onClick(View v) {
    }
}

