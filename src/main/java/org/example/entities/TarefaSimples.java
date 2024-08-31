package org.example.entities;

public class TarefaSimples extends Tarefa {

    public TarefaSimples(String descricao, Prioridade prioridade) {
            super(descricao, prioridade);
    }

    @Override
    public void alterarPrioridade(Prioridade prioridade) {
            this.setPrioridade(prioridade);

    }

    @Override
    public void finalizar() {
            // TODO Auto-generated method stub

    }

    }

