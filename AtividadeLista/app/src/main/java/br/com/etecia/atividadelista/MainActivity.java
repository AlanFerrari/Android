package br.com.etecia.atividadelista;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //Declarando o RecyclerView
    private RecyclerView recyclerView;
    //Declarando a variável do tipo ArrayList para carregar os jogos
    private List<Jogos> listarJogos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declarando o xml para o java
        recyclerView = findViewById(R.id.id_recyclerView);
        //Chamando a instância dos Jogos que foram criados.
        criarJogos();

        //Criando uma instância do adaptador para colocar os jogos na lista do RecyclerView
        Adapter adapter = new Adapter(listarJogos);

        //Gerenciador de layout - Linear

        //Utilizando o LinearLayoutManager - Lista na horizontal ou vertical
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        //Aplicando o layout instanciado.
        recyclerView.setLayoutManager(layoutManager);
        //Para melhorarar o fluxo das informações na lista de criar setHasFixedSize
        recyclerView.setHasFixedSize(true);
        //Criando uma linha de divisão horizontal em cada item da lista
        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));

        //Adicionando os itens da lista no modelo (adaptador)
        recyclerView.setAdapter(adapter);

    }

    public void criarJogos() {

        //Criando a instância do objeto Jogos
        Jogos jogo = new Jogos("Tomb Rider", "Lara Croft", 21);
        //Adicionando os valores no Array de
        this.listarJogos.add(jogo);
        jogo = new Jogos("Street Fighter", "Ryu", 21);
        this.listarJogos.add(jogo);
        jogo = new Jogos("Super Mario Bros", "Bowser", 31);
        this.listarJogos.add(jogo);
    }

}
