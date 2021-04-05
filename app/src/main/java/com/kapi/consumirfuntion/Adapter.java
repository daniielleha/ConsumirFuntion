package com.kapi.consumirfuntion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    LayoutInflater inflater;
    List<Name> names;

    public Adapter (Context ctx, List<Name> names){
        this.inflater=LayoutInflater.from(ctx);
        this.names=names;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //binding the data;
        holder.nameCountry.setText(names.get(position).getNombre());
        holder.capiCountry.setText(names.get(position).getCapi());
        Picasso.get().load(names.get(position).getImage()).into(holder.flag);
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nameCountry,capiCountry;
        ImageView flag;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameCountry=itemView.findViewById(R.id.paisName);
            capiCountry=itemView.findViewById(R.id.paisCapi);
            flag=itemView.findViewById(R.id.flagImage);

        }
    }
}
