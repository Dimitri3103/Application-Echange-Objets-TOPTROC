package com.example.toptroc.Adaptaters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.toptroc.Models.ObjectModel;
import com.example.toptroc.R;

import java.util.List;

public class ObjectAdaptater extends RecyclerView.Adapter<ObjectAdaptater.ObjectViewHolder> {
    private List<ObjectModel> objectModelList;
    private Context context;

    public ObjectAdaptater(List<ObjectModel> objectModelList, Context context) {
        this.objectModelList = objectModelList;
        this.context = context;
    }

    @NonNull
    @Override
    public ObjectViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_objet,viewGroup,false);
        return new ObjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ObjectViewHolder holder, int position) {

        ObjectModel objectModel = objectModelList.get(position);
        Glide.with(context).load(objectModel.getObject_img()).into(holder.objectImg);
    }

    @Override
    public int getItemCount() {
        return objectModelList.size();
    }

    public class ObjectViewHolder extends RecyclerView.ViewHolder {

        private ImageView objectImg;
        public ObjectViewHolder(@NonNull View itemView) {
            super(itemView);
            objectImg = (ImageView) itemView.findViewById(R.id.imageViewObjets);
        }
    }
}
