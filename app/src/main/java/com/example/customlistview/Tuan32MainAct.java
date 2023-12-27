package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Tuan32MainAct extends AppCompatActivity {
    ListView lv;
    T32Adapter adapter;
    ArrayList<T32Contact> ls=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan32_main);
        lv=findViewById(R.id.tuan32Lv);
        //tao nguon du lieu
        ls.add(new T32Contact("Nguyen Van A","18",R.drawable.android));
        ls.add(new T32Contact("Nguyen Van B","18",R.drawable.apple));
        ls.add(new T32Contact("Nguyen Van C","16",R.drawable.blogger));
        ls.add(new T32Contact("Nguyen Van D","18",R.drawable.facebook));
        ls.add(new T32Contact("Nguyen Van E","18",R.drawable.firefox));
        ls.add(new T32Contact("Nguyen Van F","18",R.drawable.chrome));
        ls.add(new T32Contact("Nguyen Van G","18",R.drawable.hancock));
        ls.add(new T32Contact("Nguyen Van H","18", R.drawable.hp));
        ls.add(new T32Contact("Nguyen Van I","18",R.drawable.dell));
        //tao adapter
        adapter=new T32Adapter(ls, this);
        lv.setAdapter(adapter);
    }
}



















