package com.example.android.lesson6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       String[] data = getResources().getStringArray(R.array. items );
        RecyclerView recyclerView = findViewById(R.id. recycler_view );
        recyclerView.setHasFixedSize( true );
        LinearLayoutManager layoutManager = new LinearLayoutManager( this );
        recyclerView.setLayoutManager(layoutManager);
        // Установим адаптер
        SocnetAdapter adapter = new SocnetAdapter(data);
        recyclerView.setAdapter(adapter);
        //initRecyclerView(data);

        String[] data2 = getResources().getStringArray(R.array.items2 );
       RecyclerView recyclerView2 = findViewById(R.id.recycler_view_gorizont );
        recyclerView2.setHasFixedSize( true );
        LinearLayoutManager layoutManager2 = new LinearLayoutManager( this ,LinearLayoutManager.HORIZONTAL,true);
        recyclerView2.setLayoutManager(layoutManager2);
        // Установим адаптер
        SocnetAdapter adapter2 = new SocnetAdapter(data2);
        recyclerView2.setAdapter(adapter2);

       // initRecyclerView(data2);

    }


    /* private void initRecyclerView(String[] data){
        RecyclerView recyclerView = findViewById(R.id. recycler_view );
        // Эта установка служит для повышения производительности системы
        recyclerView.setHasFixedSize( true );
        // Будем работать со встроенным менеджером
        LinearLayoutManager layoutManager = new LinearLayoutManager( this );
        recyclerView.setLayoutManager(layoutManager);
        // Установим адаптер
        SocnetAdapter adapter = new SocnetAdapter(data);
        recyclerView.setAdapter(adapter);
    }   */



}