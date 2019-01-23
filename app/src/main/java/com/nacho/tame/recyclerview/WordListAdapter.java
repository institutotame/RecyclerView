package com.nacho.tame.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {

    private List<Receta> mRecetaList;
    private LayoutInflater mInflater;
    private Context context;

    // TODO Terminar onClick en cada Item. Por ahora no funciona

    public WordListAdapter(Context context, List<Receta> recetaList) {
        mInflater = LayoutInflater.from(context);
        this.mRecetaList = recetaList;
        this.context = context;
    }

    class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final LinearLayout linearLayout;
        public final TextView txtTitle;
        public final TextView txtDescription;
        final WordListAdapter mAdapter;

        public WordViewHolder(View itemView, WordListAdapter adapter) {
            super(itemView);
            linearLayout = itemView.findViewById(R.id.linearLayout);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtDescription = itemView.findViewById(R.id.txtDescription);
            this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            // Get the position of the item that was clicked.
            int mPosition = getLayoutPosition();
            // Use that to access the affected item in mWordList.
            Receta element = mRecetaList.get(mPosition);
            Intent intent = new Intent(context, Main2Activity.class);
            intent.putExtra("title", element.getTitulo());
            intent.putExtra("imageUrl", element.getImageUrl());
            intent.putExtra("recipe", element.getRecipe());
            context.startActivity(intent);
        }
    }

    @NonNull
    @Override
    public WordListAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int position) {
        View mItemView = mInflater
                    .inflate(R.layout.wordlist_item, parent, false);
        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {
        Receta mCurrent = mRecetaList.get(position);
        holder.txtTitle.setText(mCurrent.getTitulo());
        holder.txtDescription.setText(mCurrent.getDescripcion());
    }

    @Override
    public int getItemCount() {
        return mRecetaList.size();
    }
}
