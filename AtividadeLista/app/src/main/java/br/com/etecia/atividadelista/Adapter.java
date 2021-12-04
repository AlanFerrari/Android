package br.com.etecia.atividadelista;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    //Variável global do tipo Lista que irá receber os jogos adicionados;
    private List<Jogos> listaJogos;

    //Construtor que recebe por parâmetro os filmes adiconados;
    public  Adapter(List<Jogos> lista) {
        this.listaJogos = lista;
    }

    //Criando a visualização com base no xml
    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Criando o layout e inserindo o modelo.
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.modelo_layout, parent, false);
        //Retornando o layout inserido para o método construtor
        return new Adapter.MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {

        //Instanciando o objeto Jogos
        Jogos jogo = listaJogos.get(position);
        //Escrevendo nos itens da RecyclerView com os valores
        holder.nomeJogo.setText(jogo.getNomeJogo());
        holder.nome.setText(jogo.getNome());
        holder.idade.setText(jogo.getIdade());
    }

    @Override
    public int getItemCount() {
        return listaJogos.size();
    }

    //Esta Classe irá montar o layout com os objetos

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nomeJogo, nome, idade;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nomeJogo = itemView.findViewById(R.id.txtNomeJogo);
            nome = itemView.findViewById(R.id.txtNome);
            idade = itemView.findViewById(R.id.intIdade);
        }
    }
}
