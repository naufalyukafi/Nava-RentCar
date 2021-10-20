package com.nava.rentalmobil.activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.nava.rentalmobil.R;
import android.os.Bundle;

public class BeritaActivity extends AppCompatActivity{

    boolean isPermissionGranted;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);
    }

}
