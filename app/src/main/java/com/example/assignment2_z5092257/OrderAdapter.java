package com.example.assignment2_z5092257;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.UserViewHolder> {
    private ArrayList<Food> orderList;


    // Provide a suitable constructor (depends on the kind of dataset)
    //public void setData(ArrayList<Food> food) {
       // this.foodList = food;
   // }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView orderFoodname;
        public TextView costs;
        public TextView orderQuantity;
        public TextView subTotal;



        public UserViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            orderFoodname = itemView.findViewById(R.id.order_foodName);
            costs = itemView.findViewById(R.id.order_itemCosts);
            orderQuantity = itemView.findViewById(R.id.order_quantity);
            subTotal=itemView.findViewById(R.id.order_subTotal);
        }
    }

    // Create new views (invoked by the layout manager)
    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.order_item, parent, false);
        UserViewHolder userViewHolder = new OrderAdapter.UserViewHolder(view);

        return userViewHolder;
    }

    @Override
    public void onBindViewHolder(final UserViewHolder holder, final int position) {
        holder.orderFoodname.setText("Name");
        holder.costs.setText("$");
        holder.orderQuantity.setText("17.99");
        holder.subTotal.setText("17.99");
    }

    public int getItemCount(){
        return 0;

    }




}

