package com.croxzz.alwizen.testv;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import static android.support.v7.widget.RecyclerView.*;

public class BeritaAdapter extends RecyclerView.Adapter<BeritaAdapter.ViewHolder> {

    private Context context;
    private List<Berita> list;

    public BeritaAdapter(Context context, List<Berita> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.single_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Berita berita = list.get(position);

        holder.id_berita.setText(berita.getId_berita());
        holder.judul_berita.setText(berita.getJudul_berita());
        holder.gambar_berita.setText(berita.getGambar_berita());
        holder.nama_kategori.setText(berita.getNama_kategori());
        holder.user.setText(berita.getNama_user());
        holder.time.setText(berita.getTimestamp_berita());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView id_berita, judul_berita, gambar_berita,nama_kategori, user, time;

        public ViewHolder(View itemView) {
            super(itemView);

            id_berita = itemView.findViewById(R.id.tv_idBerita);
            judul_berita = itemView.findViewById(R.id.tv_judul);
            gambar_berita = itemView.findViewById(R.id.tv_gambar);
            nama_kategori = itemView.findViewById(R.id.tv_kategori);
            user = itemView.findViewById(R.id.tv_user);
            time = itemView.findViewById(R.id.tv_time);
        }
    }

}