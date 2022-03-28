package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.ItemViewHolder>{

    private Context mContext;
    private List<CitiesModel> mItemPizzaList;


    public CitiesAdapter(Context context, List<CitiesModel> item1) {
        mContext = context;
        mItemPizzaList = item1;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cities,parent,false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder( ItemViewHolder holder, int position) {

        CitiesModel cities = mItemPizzaList.get(position);
        if(cities == null){
            return;
        }
        holder.itemImage.setImageResource(cities.getImage());
        holder.itemName.setText(cities.getName());

    }


    @Override
    public int getItemCount() {

        return mItemPizzaList.size();
    }


    public class ItemViewHolder extends RecyclerView.ViewHolder {
        public ImageView itemImage;
        public TextView itemName;

        public ItemViewHolder( View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.img_cities);
            itemName = itemView.findViewById(R.id.tv_title);
        }
    }

}
