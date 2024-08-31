package org.example.entities;

public interface Executavel {
    public abstract void executar();

    public abstract void finalizar();

    public void alterarPrioridade(Tarefa.Prioridade prioridade);

}
