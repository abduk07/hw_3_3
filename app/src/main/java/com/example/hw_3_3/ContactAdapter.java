package com.example.hw_3_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {
    ArrayList<Contact> arrayList;

    public ContactAdapter(ArrayList<Contact> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ContactAdapter.ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contacts, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ContactViewHolder holder, int position) {
        holder.onBind(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    static class ContactViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        TextView textViewTwo;

        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void onBind(Contact contact) {
            textView = itemView.findViewById(R.id.textView);
            textViewTwo = itemView.findViewById(R.id.textViewTwo);
            imageView = itemView.findViewById(R.id.imageView);
            textView.setText(contact.getName());
            textViewTwo.setText(contact.getSurname());
            imageView.setImageResource(contact.getImage());
        }
    }
}
