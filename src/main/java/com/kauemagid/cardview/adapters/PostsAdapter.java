package com.kauemagid.cardview.adapters;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kauemagid.cardview.R;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.MyViewHolder> {


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_layout, parent, false);
        return new MyViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.username.setText("Kaue Salem");
        holder.description.setText("Muito bom o pavê");
        holder.imageView.setImageResource(R.drawable.imagem2);
    }

    @Override
    public int getItemCount() {
        return 6;
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
