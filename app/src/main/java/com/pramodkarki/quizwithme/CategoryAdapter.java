package com.pramodkarki.quizwithme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    Context mCtx;
    ArrayList<CategoryModel> categoryItem;

    public CategoryAdapter(Context mCtx, ArrayList<CategoryModel> categoryItem) {
        this.mCtx = mCtx;
        this.categoryItem = categoryItem;
    }


    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mCtx).inflate(R.layout.item_main_category, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.CategoryViewHolder holder, int position) {
        CategoryModel model = categoryItem.get(position);

        holder.txtView.setText(model.getCategoryName());
        /** set the image that are taken from internet sources into the recycleView*/
        Glide.with(mCtx)
                .load(model.getCategoryImage())
                .into(holder.imgView);
    }

    @Override
    public int getItemCount() {
        return categoryItem.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        TextView txtView;
        ImageView imgView;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            txtView = itemView.findViewById(R.id.category);
            imgView = itemView.findViewById(R.id.image);
        }
    }

}
