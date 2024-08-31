package org.example.entities;

import java.time.LocalDate;

public class TarefaComPrazo extends Tarefa{
        private LocalDate prazo;

        LocalDate dataAgora = LocalDate.now();

        public TarefaComPrazo(String descricao, Prioridade prioridade, LocalDate prazo) {
            super(descricao, prioridade);
            this.prazo = prazo;
        }

        public LocalDate getPrazo() {
            return prazo;
        }

        public void setPrazo(LocalDate prazo) {
            this.prazo = prazo;
        }

        @Override
        public void executar() {
            System.out.println("A tarefa com prazo "+ this.prazo + "e descrição "+ getDescricao() + " está sendo executada.");
            setStatus(Status.doing);
        }

        @Override
        public void finalizar() {
            System.out.println("A tarefa com prazo "+ this.prazo + " e descricao "+  getDescricao() + " está finalizada");
            setStatus(Status.done);

        }
        public void verSeTarefaFoiFinalizadaNoPrazo(TarefaComPrazo tarefa) {
            if(tarefa.prazo.isAfter(dataAgora)) {
                System.out.println("A tarefa com prazo "+ this.prazo + " e descricao "+  getDescricao() + " está finalizada no prazo!");
                setStatus(Status.done);
            }else {
                System.out.println("A tarefa com prazo "+ this.prazo + " e descricao "+  getDescricao() + " está finalizada fora do prazo!");
                setStatus(Status.done);
            }

        }

        @Override
        public String toString() {
            String retorno = "O projeto "+ getDescricao() + "tem prazo " +getPrazo();
            return retorno;
        }

        @Override
        public void alterarPrioridade(Prioridade prioridade) {
            this.setPrioridade(prioridade);

        }
        public void verSeTarefaEstaNoPrazo(TarefaComPrazo tarefa) {
            if(tarefa.prazo.isAfter(dataAgora)) {
                System.out.println("A Tarefa está no prazo! ");
            }else {
                System.out.println("A Tarefa não está no prazo!");
            }
        }
}
