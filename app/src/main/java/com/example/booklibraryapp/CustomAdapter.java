package com.example.booklibraryapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Model> bookList;

    public CustomAdapter(Context context, ArrayList<Model> bookList) {
        this.context = context;
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.row, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.book_id.setText(String.valueOf(bookList.get(position).getId()));
        holder.book_author.setText(String.valueOf(bookList.get(position).getBook_author()));
        holder.book_pages.setText(String.valueOf(bookList.get(position).getBook_pages()));
        holder.book_title.setText(String.valueOf(bookList.get(position).getBook_title()));
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView book_id, book_title, book_author, book_pages;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            book_id = itemView.findViewById(R.id.book_id);
            book_title = itemView.findViewById(R.id.book_title);
            book_author = itemView.findViewById(R.id.book_author);
            book_pages = itemView.findViewById(R.id.book_page);
        }
    }
}
