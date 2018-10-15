package com.example.fikridzakwan.juzamma.Adapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.fikridzakwan.juzamma.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleSuratActivity extends AppCompatActivity {

    @BindView(R.id.MyRecycle)
    RecyclerView MyRecycle;
    // TODO Membuat variable data nama dan isi surat
    String[] nama_surat_pendek,nama_surat_panjang,isi_surat_pendek,isi_surat_panjang;

    // TODO Membuat variable global AdapterSurat
    AdaptrSurah adaptrSurah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_surat);
        ButterKnife.bind(this);

        // TODO Mengisi variable degan data yang ada pada String
        nama_surat_pendek = getResources().getStringArray(R.array.nama_surat_pendek);
        nama_surat_panjang = getResources().getStringArray(R.array.nama_surat_panjang);
        isi_surat_pendek = getResources().getStringArray(R.array.isi_surat_pendek);
        isi_surat_panjang = getResources().getStringArray(R.array.isi_surat_panjang);

        // TODO Menangkap data dari Intent
        String tanda = getIntent().getStringExtra("tanda");

        // TODO kita cek isi dara dari activity sebelunya
        if (tanda.equals("pendek")){
            // TODO apabila dia surat pendek maka kita buat object adapter degan data surat pendek
            adaptrSurah = new AdaptrSurah(RecycleSuratActivity.this,nama_surat_pendek,isi_surat_pendek);
        } else {
            // TODO apabila dia surat pendek maka kita buat object adapter dengan data surah pendek
            adaptrSurah = new AdaptrSurah(RecycleSuratActivity.this,nama_surat_panjang,isi_surat_panjang);

        }

        // TODO Mensetting recycleview dan mengeset recycle denga Adaptersurat
        MyRecycle.setHasFixedSize(true);
        // TODO Mengeset layoutmanager recycleview
        MyRecycle.setLayoutManager(new LinearLayoutManager(RecycleSuratActivity.this));
        // TODO Menset adapter recycleview
        MyRecycle.setAdapter(adaptrSurah);


    }
}
