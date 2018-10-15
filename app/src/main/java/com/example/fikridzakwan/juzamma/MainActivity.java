package com.example.fikridzakwan.juzamma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.fikridzakwan.juzamma.Adapter.RecycleSuratActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnPendek)
    Button btnPendek;
    @BindView(R.id.btnPanjang)
    Button btnPanjang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnPendek, R.id.btnPanjang})
    public void onViewClicked(View view) {

        // TODO Membuat variable global dengan tipe data Intent
        Intent pindah;
        switch (view.getId()) {
            case R.id.btnPendek:
                // TODO membuat object intent
                pindah = new Intent(this, RecycleSuratActivity.class);
                pindah.putExtra("tanda", "pendek");
                startActivity(pindah);
                break;
            case R.id.btnPanjang:
                // TODO membuat object intent
                pindah = new Intent(this, RecycleSuratActivity.class);
                pindah.putExtra("tanda", "panjang");
                startActivity(pindah);
                break;
        }
    }
}
