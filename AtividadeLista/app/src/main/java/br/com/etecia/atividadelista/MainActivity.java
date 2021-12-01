package br.com.etecia.atividadelista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private List<Jogos> listarJogos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.id_recyclerView);

        criarJogos();


    }

    public void criarJogos() {

        Jogos jogo = new Jogos("Tomb Rider", "Lara Croft", 21);
        jogo = new Jogos("Street Fighter", "Ryu", 21);
        jogo = new Jogos("Super Mario Bros", "Bowser", 40);
    }

}
