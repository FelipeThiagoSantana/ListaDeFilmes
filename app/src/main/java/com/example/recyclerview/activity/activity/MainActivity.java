package com.example.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.R;
import com.example.recyclerview.activity.adapter.Adapter;
import com.example.recyclerview.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de filmes
        this.criarFilmes();


        //Configuração do Adapter
        Adapter adapter = new Adapter(listaFilmes);

        //Configuração Recyclerview

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter); //Onde configuramos o adaptador
    }

    public void criarFilmes(){
        Filme filme = new Filme("Olhos Famintos 4 - Renascimento", "Terror", "2023");
        this.listaFilmes.add(filme);

        filme = new Filme("Gato de Botas 2 - O Último Pedido", "Comédia", "2023");
        this.listaFilmes.add(filme);

        filme = new Filme("Creed III", "Ação", "2023");
        this.listaFilmes.add(filme);

        filme = new Filme("Pânico 6", "Terro", "2023");
        this.listaFilmes.add(filme);

        filme = new Filme("Shazam! 2 - Fúria dos Deuses", "Fantasia", "2023");
        this.listaFilmes.add(filme);

        filme = new Filme("Jhon Wick 4: Baba Yaga", "Ação", "2023");
        this.listaFilmes.add(filme);

        filme = new Filme("A Morte do Dêmonio - A Ascensão", "Suspense", "2023");
        this.listaFilmes.add(filme);

        filme = new Filme("Velozes e Furiosos 10", "Ação", "2023");
        this.listaFilmes.add(filme);

        filme = new Filme("Transformers 7: O Despertar das Feras", "Fantasia", "2023");
        this.listaFilmes.add(filme);

        filme = new Filme("Barbie", "Fantasia ", "2023");
        this.listaFilmes.add(filme);

        filme = new Filme("As Marvels", "Fantasia ", "2023");
        this.listaFilmes.add(filme);

        filme = new Filme("A Freira 2", "Terror ", "2023");
        this.listaFilmes.add(filme);

        filme = new Filme("Os Mercenários 4", "Ação", "2023");
        this.listaFilmes.add(filme);

        filme = new Filme("Jogos Vorazes - A Cantiga dos Pássaros e das Serpentes", "Ficção Científica", "2023");
        this.listaFilmes.add(filme);

    }


}