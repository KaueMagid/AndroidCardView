package com.kauemagid.cardview.adapters;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kauemagid.cardview.R;
import com.kauemagid.cardview.models.Post;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.MyViewHolder> {

    private List<Post> postList;

    public PostsAdapter(List<Post> postList){
        this.postList = postList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_layout, parent, false);
        return new MyViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Post p = this.postList.get(position);
        holder.username.setText(p.getUsername());
        holder.description.setText(p.getDescription());
        holder.imageView.setImageResource(p.getImage());
    }

    @Override
    public int getItemCount() {
        return this.postList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView username;
        private TextView description;
        private ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            username = itemView.findViewById(R.id.textView_username);
            description = itemView.findViewById(R.id.textView_description);
            imageView = itemView.findViewById(R.id.imagePost);
        }
    }

}
