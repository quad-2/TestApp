package com.example.quad2.testapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by quad2 on 2/12/16.
 */

public class StoresAdapter extends RecyclerView.Adapter<StoresAdapter.ViewHolder> {

    private Context context;
    private List<Business> businessList = new ArrayList<>();


    public StoresAdapter(Context context, List<Business> businessList) {
        this.context = context;
        this.businessList = businessList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_stores, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Business business;
        business = businessList.get(position);

        if (business!=null){
            if (business.getProfileImage()!= null){
                String imageLink = businessList.get(position).getProfileImage();
                Picasso.with(context)
                        .load(imageLink)
                        .resize(60, 60)
                        .centerCrop()
                        .into(holder.storeImage);
            }

            if (business.getName()!=null){
                holder.storeName.setText(business.getName());
            }else {
                holder.storeName.setText("Name Not Available!");
            }

            if (business.getAddress()!=null){
                holder.address.setText(business.getAddress().getLocality() + " - "+business.getAddress().getStreet() + ", " +
                business.getAddress().getCity());
            } else {
                holder.address.setText("Address Not Available!");
            }

        }
    }

    @Override
    public int getItemCount() {
        return businessList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        ImageView storeImage;
        TextView storeName;
        TextView address;
        TextView distance;

        public ViewHolder(View itemView) {
            super(itemView);
            storeImage = (ImageView) itemView.findViewById(R.id.store_image);
            storeName = (TextView) itemView.findViewById(R.id.store_name);
            address = (TextView) itemView.findViewById(R.id.address);
            distance = (TextView) itemView.findViewById(R.id.distance);
        }
    }
}
