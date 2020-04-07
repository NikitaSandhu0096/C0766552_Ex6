package com.example.c0766552_ex.adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.c0766552_ex.model.CanadaAttraction;
import com.example.c0766552_ex.R;
import com.example.c0766552_ex.ui.AttractionDetailsActivity;

import java.util.ArrayList;

public class AttractionListActivity  extends RecyclerView.Adapter<AttractionListActivity.CanadaViewHolder> {
    private ArrayList<CanadaAttraction> canadaAttractionsArrayList;

    public AttractionListActivity(ArrayList<CanadaAttraction> canadaAttractionsArrayList) {
        this.canadaAttractionsArrayList = canadaAttractionsArrayList;
    }

    @NonNull
    @Override
    public CanadaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.canada_places,
                parent, false);
        CanadaViewHolder mCanadaViewHolder  = new CanadaViewHolder(mView);
        return mCanadaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final CanadaViewHolder holder, final int position) {
        CanadaAttraction mCanadaAttraction = this.canadaAttractionsArrayList.get(position);
        holder.txtPlaceName.setText(mCanadaAttraction.getPlaceName());
        holder.imgPlacePhoto.setImageResource(mCanadaAttraction.getImagePlace());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CanadaAttraction caAtt = canadaAttractionsArrayList.get(position);
                Intent sint = new Intent(holder.itemView.getContext(), AttractionDetailsActivity.class);
                sint.putExtra("places", caAtt);
                holder.itemView.getContext().startActivity(sint);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.canadaAttractionsArrayList.size();
    }

    public class CanadaViewHolder extends RecyclerView.ViewHolder{
        TextView txtPlaceName;
        ImageView imgPlacePhoto;

        public CanadaViewHolder(@NonNull View itemView) {
            super(itemView);

            txtPlaceName = itemView.findViewById(R.id.txtPlaceName);
            imgPlacePhoto = itemView.findViewById(R.id.imgLocation);
        }
    }
}
