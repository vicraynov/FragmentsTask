package com.example.fragments_upr;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    private ArrayList<Contact> contacts;

    public ContactAdapter(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.contact_layout, parent, false);

        return new ContactViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        Contact contact = this.contacts.get(position);

        holder.setNameTextView(contact.getName());
        holder.setAddressTextView(contact.getAddress());
        holder.setContactImageView(contact.getImage());
    }

    @Override
    public int getItemCount() {
        return this.contacts.size();
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
        notifyItemChanged(this.contacts.size() - 1);
    }
}
