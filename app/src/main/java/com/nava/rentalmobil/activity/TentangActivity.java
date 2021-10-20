package com.nava.rentalmobil.activity;
import androidx.appcompat.app.AppCompatActivity;
import com.nava.rentalmobil.R;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class TentangActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.HNama);
        adapter = ArrayAdapter.createFromResource(this, R.array.sekolah, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
    }
}
