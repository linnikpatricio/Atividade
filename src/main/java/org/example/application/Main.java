package org.example.application;

import java.time.LocalDate;

import org.example.entities.*;

public class Main {

    public static void main(String args[]) {

        /*
         * Oi, pessoa! Deixei alguns comentários no main com sugestões de modificações no projeto.
         * Gostaria que vocês realizassem as modificações até a próxima aula. <3
         *
         */

        //Instância de tarefa simples utilizando a classe abstrata
        Tarefa a1 = new TarefaSimples("Tarefa 1", Tarefa.Prioridade.baixa);
        System.out.println(a1);
        a1.executar("Andrey");
        a1.setPrioridade(Tarefa.Prioridade.media);
        System.out.println(a1);
        a1.finalizar();

        System.out.println("----------------------");
        //Instância de tarefa simples utilizando a interface
        Executavel a2 = new TarefaSimples("Tarefa 2", Tarefa.Prioridade.alta);
        System.out.println(a2);
        //Por que a linha comentada abaixo gera um erro? Neste caso, o que você faria se mudar a prioridade fosse importante para seu problema?
        //a2.setPrioridade(Prioridade.media);
        a2.alterarPrioridade(Tarefa.Prioridade.media);
        a2.executar();
        System.out.println(a2);
        a2.finalizar();
        System.out.println("----------------------");

        //Instância de tarefaComPrazo
        TarefaComPrazo a3 = new TarefaComPrazo("Tarefa 3 ", Tarefa.Prioridade.media,  LocalDate.of(2024,11,11));
        System.out.println(a3);
        //Modifique o código para mostrar o prazo em casos de objetos de TarefaComprazo
        a3.executar();
        System.out.println(a3);
        //Modificar o código para mostrar se a tarefa está dentro do prazo ou atrasada
        a3.verSeTarefaEstaNoPrazo(a3);
        System.out.println();
        //Modificar o código para mostrar se a tarefa foi finazlizado no prazo ou atrasda
        a3.verSeTarefaFoiFinalizadaNoPrazo(a3);
        System.out.println("----------------------");


        Projeto p1 = new Projeto("Projeto OO", LocalDate.of(2024, 9, 10), LocalDate.of(2024,11,30));
        p1.addTarefas(a1);
        p1.addTarefas(a2);
        p1.addTarefas(a3);

        System.out.println(p1);
    }

}