package com.kauemagid.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.kauemagid.cardview.R;
import com.kauemagid.cardview.adapters.PostsAdapter;
import com.kauemagid.cardview.models.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPosts;
    private List<Post> posts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewPosts = findViewById(R.id.recyclerViewPosts);

        //Create Posts
        this.makePosts();

        //Define layout RecycleView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerViewPosts.setLayoutManager(layoutManager);

        //Define Adapter
        PostsAdapter adapter = new PostsAdapter(this.posts);
        recyclerViewPosts.setAdapter(adapter);


    }

    public void makePosts(){
        this.posts.add(new Post("Kaue Salem","tbt viagem",R.drawable.imagem1));
        this.posts.add(new Post("Kaue Salem","nas nuvens",R.drawable.imagem2));
        this.posts.add(new Post("Kaue Salem","não sei o que dizer",R.drawable.imagem3));
        this.posts.add(new Post("Kaue Salem","não sei o que dizer",R.drawable.imagem4));
    }
}
