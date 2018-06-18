package com.milagro.databindingExample.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.milagro.databindingExample.R;
import com.milagro.databindingExample.databinding.ItemviewBinding;
import com.milagro.databindingExample.model.User;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    private List<User> usersList;
    private LayoutInflater layoutInflater;

    public RecyclerViewAdapter(List<User> usersList) {
        this.usersList = usersList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        ItemviewBinding binding =
                DataBindingUtil.inflate(layoutInflater, R.layout.itemview, parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
     //   User user= new User();
   //     user.setName("harpz"+ position);
        holder.binding.setUser(usersList.get(position));
    }

    @Override
    public int getItemCount() {
        return usersList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private final ItemviewBinding binding;

        public MyViewHolder(final ItemviewBinding itemBinding) {
            super(itemBinding.getRoot());
            this.binding = itemBinding;
        }
    }
}
