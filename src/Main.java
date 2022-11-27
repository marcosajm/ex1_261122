import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<Automoveis> automoveisList = new ArrayList<Automoveis>();
       // ArrayList<String> listaCorres = new ArrayList<>();
        Scanner scan1 = new Scanner (System.in);
        while (true) {
            Automoveis p =new Automoveis();
            boolean ans = automoveisList.isEmpty();
            int size = automoveisList.size();
            System.out.println("Lista de automóveis");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Mostra a lista. \n2 - Inserir novo automóvel. \n3 - Apagar automóvel. \n4 - Sair." + "\n ");
            int task = scan1.nextInt();
            if (task == 4) {
                break;
            }
            switch (task) {
                case 1:
                    if (ans) {
                        System.out.println("Lista vazia! " + "\n ");
                        break;
                    }
                    var first = automoveisList.get(0);
                    var last = automoveisList.get(automoveisList.size() - 1);
                    System.out.println("List is " + automoveisList + "\n ");
                    System.out.println("Próxima carta a ser entregue: " + last + "\n ");
                    System.out.println("Quantas cartas existem na lista: " + size + "\n ");
                    break;
                case 2:
                    do {
                        System.out.println("Entre com o nome: ");
                        p.setName(scan1.next());
                        System.out.println("Inserir a marca:");
                        p.setMarca(scan1.next());
                        automoveisList.add(p);
                        System.out.println("Deseja adicionar mais clientes? (Y/N)" + "\n ");
                        if(scan1.next().equalsIgnoreCase("N")) {
                            break;
                        }
                       // listaCorres.add(scan1.next());

                    } while (true);
                    break;
                case 3:
                    if (ans) {
                        System.out.println("Lista vazia! " + "\n ");
                        break;
                    }
                    do {
                        System.out.println("Apagar automovel? (y/n) ");
                        if (scan1.next().startsWith("y")) {
                            System.out.println("Entre com a automovel: " + "\n ");
                            automoveisList.remove(scan1.next());
                        } else {
                            break;
                        }
                    } while (true);
                    break;
                default:
                    System.out.println("Invalido!" + "\n ");
                    break;
            }
        }
    }
}
        // Java Collections
        //  Exercício 1: Crie uma ArrayList de Strings que permite guardar
        //   marcas de automóveis. Crie funções que permitem:
        //  • Adicionar um carro - nomeDaArrayList.add(“nome”);
        //  • Adicionar um carro e indicar o índice – nomeDaArrayList.add(1,“nome”);
        //  • Remover elemento pelo seu nome –
        //  nomeDaArrayList.remove(“nome”);
        //  • Remover elemento pelo seu índice –
        //  nomeDaArrayList.remove(1);

     //   Collections.reverse(list);
     //   list.add(elementForTop);
    //    Collections.reverse(list);


