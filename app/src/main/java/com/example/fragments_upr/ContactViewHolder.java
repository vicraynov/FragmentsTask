package com.example.fragments_upr;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class ContactViewHolder extends RecyclerView.ViewHolder {
    private ImageView contactImageView;
    private TextView nameTextView;
    private TextView addressTextView;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        this.contactImageView = itemView.findViewById(R.id.contactImageView);
        this.nameTextView = itemView.findViewById(R.id.nameTextView);
        this.addressTextView = itemView.findViewById(R.id.addressTextView);
    }

    public void setContactImageView(String imageUrl) {
        Picasso.get()
                .load(imageUrl)
                .placeholder(R.mipmap.ic_launcher)
                .resize(150,150)
                .into(this.contactImageView);
    }

    public void setNameTextView(String name) {
        this.nameTextView.setText(name);
    }

    public void setAddressTextView(String address) {
        this.addressTextView.setText(address);
    }
}
