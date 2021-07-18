package com.example.quiz;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class categoryAdapter  extends RecyclerView.Adapter<categoryAdapter.Viewholder> {

    private List<categororyModel> categororyModelList;

    public categoryAdapter(List<categororyModel> categororyModelList) {
        this.categororyModelList = categororyModelList;
    }
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item, parent, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.setData(categororyModelList.get(position).getUrl(),categororyModelList.get(position).getName(),categororyModelList.get(position).getSets());

    }

    @Override
    public int getItemCount() {
        return categororyModelList.size();
    }

    class Viewholder extends RecyclerView.ViewHolder {
        private CircleImageView imageView;
        private TextView title;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view);
            title = itemView.findViewById(R.id.title);
        }
        private void setData(String url,final String title,final int sets){

            Glide.with(itemView.getContext()).load(url).into(imageView);
            this.title.setText(title);

            itemView.setOnClickListener((v) -> {
                Intent setIntent = new Intent(itemView.getContext(),SetActivity.class);
                setIntent.putExtra("title",title);
                setIntent.putExtra("sets",sets);
                itemView.getContext().startActivity(setIntent);

            });
        }

    }

}

