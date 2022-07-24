package com.example.favoritecompanyhomeworklec6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.favoritecompanyhomeworklec6.models.Drinks;

import java.util.ArrayList;

public class DrinksAdapter extends RecyclerView.Adapter<DrinksAdapter.DrinksViewHolder> {

    ArrayList<Drinks> drinksArrayList;

    public DrinksAdapter(ArrayList<Drinks> drinksArrayList) {
        this.drinksArrayList = drinksArrayList;

    }

    @NonNull
    @Override
    public DrinksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.drinks_raw, parent, false);
        return new DrinksViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DrinksViewHolder holder, int position) {
        Drinks drinks = drinksArrayList.get(position);
        holder.tvCoke.setText(drinks.getCoke());
        holder.tvPepsi.setText(drinks.getPepsi());
        holder.tvSchweppes.setText(drinks.getSchweppes());
        holder.tvDrPepper.setText(drinks.getDrPepper());

    }

    @Override
    public int getItemCount() {
        if (drinksArrayList == null) {
            return 0;
        }
        return drinksArrayList.size();
    }

    static class DrinksViewHolder extends RecyclerView.ViewHolder{

        TextView tvCoke;
        TextView tvPepsi;
        TextView tvSchweppes;
        TextView tvDrPepper;

        public DrinksViewHolder(@NonNull View itemView) {
            super(itemView);

            tvCoke = itemView.findViewById(R.id.tv_coke);
            tvPepsi = itemView.findViewById(R.id.tv_pepsi);
            tvSchweppes = itemView.findViewById(R.id.tv_schweppes);
            tvDrPepper = itemView.findViewById(R.id.tv_drPepper);
        }
    }
}
