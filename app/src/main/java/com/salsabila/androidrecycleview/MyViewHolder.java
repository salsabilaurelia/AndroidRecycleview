package com.salsabila.androidrecycleview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView namaView, nimView;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.image_view);
        namaView = itemView.findViewById(R.id.nama);
        nimView = itemView.findViewById(R.id.nim);
    }
}
