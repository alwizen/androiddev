package com.croxzz.alwizen.dinperpa.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.croxzz.alwizen.dinperpa.R;
import com.croxzz.alwizen.dinperpa.model.Berita;

import java.util.ArrayList;


public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<Berita> berita;

    public DataAdapter(ArrayList<Berita> beritas) {
        this.berita = beritas;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.id_berita.setText(berita.get(i).getId_berita());
        viewHolder.judul_berita.setText(berita.get(i).getNama_kategori());
        viewHolder.gambar_berita.setText(berita.get(i).getGambar_berita());
        viewHolder.nama_kategori.setText(berita.get(i).getNama_kategori());
        viewHolder.nama_user.setText(berita.get(i).getNama_user());
        viewHolder.timestamp_berita.setText(berita.get(i).getTimestamp_berita());
    }

    @Override
    public int getItemCount() {
        return berita.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView id_berita,judul_berita,gambar_berita, nama_kategori, nama_user, timestamp_berita;
        public ViewHolder(View view) {
            super(view);

            id_berita           = (TextView)view.findViewById(R.id.id_berita);
            judul_berita        = (TextView)view.findViewById(R.id.judul_berita);
            gambar_berita       = (TextView)view.findViewById(R.id.gambar_berita);
            nama_kategori       = (TextView)view.findViewById(R.id.nama_kategori);
            nama_user           = (TextView)view.findViewById(R.id.nama_user);
            timestamp_berita    = (TextView)view.findViewById(R.id.timestamp_berita);

        }
    }

}
