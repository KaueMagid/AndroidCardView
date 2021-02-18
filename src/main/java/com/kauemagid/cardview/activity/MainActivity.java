package com.kauemagid.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.kauemagid.cardview.R;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPosts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewPosts = findViewById(R.id.recyclerViewPosts);

        //Define layout RecycleView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerViewPosts.setLayoutManager(layoutManager);

        //Define Adapter
    }
}
