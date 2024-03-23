package com.salsabila.androidrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        List<item> items = new ArrayList<item>();
        items.add(new item("Aqmal Syarif Fadilah", "12250113564",R.drawable.p12250113564));
        items.add(new item("Fadlan Nur Ramadhan", "12250113820", R.drawable.p12250113820));
        items.add(new item("Farhan Fadhila", "12250113444", R.drawable.p12250113444));
        items.add(new item("Harry Finaldhi", "12250113594", R.drawable.p12250113594));
        items.add(new item("M. Farhan Aulia Pratama", "12250113521", R.drawable.p12250113521));
        items.add(new item("Muhammad Ilham Akbar", "12250113387", R.drawable.p12250113387));
        items.add(new item("Muhammad Raja Fahrezy", "12250113812", R.drawable.p12250113812));
        items.add(new item("Nur Delifah", "12250123957", R.drawable.p12250123957));
        items.add(new item("Ready malik Putra", "12250113761", R.drawable.p12250113761));
        items.add(new item("Restu Kharrisa Andini", "12250124591", R.drawable.p12250124591));
        items.add(new item("Rifki Faiz Azzurananda", "12250113451", R.drawable.p12250113451));
        items.add(new item("Salsabila Aurelia Rickardo", "12250121918", R.drawable.p12250121918));
        items.add(new item("Tasya Dwi Yanti", "12250123081", R.drawable.p12250123081));
        items.add(new item("Yuliana Mislianingsih", "12250123497", R.drawable.p12250123497));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Adapter(getApplicationContext(),items));
    }
}