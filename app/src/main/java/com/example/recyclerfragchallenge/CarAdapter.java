package com.example.recyclerfragchallenge;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.myViewHolder> {

    ArrayList<Car> cars;
    ItemClicked activity;


    public interface ItemClicked{

        void onItemClicked(int index);
    }

    public CarAdapter(Context context, ArrayList<Car> cars){
        this.cars = cars;
        activity = (ItemClicked)context;
    }





    public class myViewHolder extends RecyclerView.ViewHolder {

        ImageView ivCarMake;
        TextView tvCarModel, tvOwnerName;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);

            ivCarMake = itemView.findViewById(R.id.ivCarMake);
            tvCarModel = itemView.findViewById(R.id.tvCarModel);
            tvOwnerName = itemView.findViewById(R.id.tvOwnerName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    activity.onItemClicked(cars.indexOf(v.getTag()));

                }
            });
        }
    }


    @NonNull
    @Override
    public CarAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_list, parent, false);

        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CarAdapter.myViewHolder holder, int position) {

        holder.itemView.setTag(cars.get(position));
        holder.tvCarModel.setText(cars.get(position).getCarModel());
        holder.tvOwnerName.setText(cars.get(position).getCarOwner());

        if(cars.get(position).getCarMake().equals("Nissan")){
            holder.ivCarMake.setImageResource(R.drawable.nissan);
        }
        else if(cars.get(position).getCarMake().equals("Mercedes")){
            holder.ivCarMake.setImageResource(R.drawable.mercedes);
        }
        else if(cars.get(position).getCarMake().equals("Volkswagen")){
            holder.ivCarMake.setImageResource(R.drawable.volkswagen);
        }
}

    @Override
    public int getItemCount() {
        return cars.size();
    }
}

