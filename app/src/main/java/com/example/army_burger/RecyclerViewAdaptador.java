package com.example.army_burger;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ViewHolder> {

    public List<Promociones> getPromocionlista() {
        return promocionlista;
    }

    public void setPromocionlista(List<Promociones> promocionlista) {
        this.promocionlista = promocionlista;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nombre, descripcion;
        ImageView fotopromociones;

        public ViewHolder(View itemView) {
            super(itemView);
            nombre=(TextView) itemView.findViewById(R.id.nombrepromo);
            descripcion=(TextView) itemView.findViewById(R.id.descripcion);
            fotopromociones=(ImageView) itemView.findViewById(R.id.imgpromo);
        }
    }
    public List<Promociones> promocionlista;

    public RecyclerViewAdaptador(List<Promociones> promocionLista) {
        this.setPromocionlista(promocionLista);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewtype){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cantante,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.nombre.setText(promocionlista.get(position).getNombre());
        holder.descripcion.setText(promocionlista.get(position).getDescripcion());
        holder.fotopromociones.setImageResource(promocionlista.get(position).getImgpromo());
    }
    @Override
    public int getItemCount() {
        return promocionlista.size();
    }
}
