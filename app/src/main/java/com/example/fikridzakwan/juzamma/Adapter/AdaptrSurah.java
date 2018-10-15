package com.example.fikridzakwan.juzamma.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import com.example.fikridzakwan.juzamma.R;

public class AdaptrSurah extends RecyclerView.Adapter<AdaptrSurah.ViewHolder> {
    // TODO Membuat variable untuk di proser adapter
    // TODO Context untuk menyimpan Activity
    Context context;
    // TODO Membuat variable String array untuk menampung nama isi surat
    String[] nama_surat,isi_surat;

    // TODO Membuat Constructor untuk dapat menerima data pada saat Adapter


    public AdaptrSurah(Context context, String[] nama_surat, String[] isi_surat) {
        this.context = context;
        this.nama_surat = nama_surat;
        this.isi_surat = isi_surat;
    }

    @NonNull
    @Override
    public AdaptrSurah.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // TODO Membuat layout item_surah menjadi object
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_surat,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptrSurah.ViewHolder viewHolder, int i) {
        // TODO untuk kita menampilkan data ke tampilan widget yang kita inginkan
        viewHolder.txtNamaSurat.setText(nama_surat[i]);
        viewHolder.txtIsiSurat.setText(isi_surat[i]);


    }

    @Override
    public int getItemCount() {
        // TODO Untuk menentukan jumlah data yang ingin ditampilkan di tampilkan
        return nama_surat.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // TODO Membuat varable global untuk menampung widget
        TextView txtNamaSurat,txtIsiSurat;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // TODO Membuat object menjadi widget
            txtNamaSurat = itemView.findViewById(R.id.txtNamaSurat);

            txtIsiSurat = itemView.findViewById(R.id.txtIsiSurat);
        }
    }
}
