import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<Automoveis> automoveisList = new ArrayList<Automoveis>();
        Scanner scan1 = new Scanner(System.in);
        Collections.sort(automoveisList);
        while (true) {
            Automoveis p = new Automoveis();
            boolean ans = automoveisList.isEmpty();
            int size = automoveisList.size();
            System.out.println("Lista de automóveis");
            System.out.println("Escolha uma opção (1 - 4):");
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
                    var last = automoveisList.get(size - 1);
                    var lastP = automoveisList.get(p.getIndex());
                    System.out.println( lastP + "List is " + automoveisList + "\n ");
                    System.out.println("Last automóvel : " + last + "\n " + "first automóvel : " + first + "\n ");
                    System.out.println("Quantos automóveis existem na lista: " + size + "\n ");
                    System.out.println("Nome do automóvel no início da lista é: " + automoveisList.get(0).getName() + "\n marca: " + automoveisList.get(0).getMarca() + "\n número index: " + automoveisList.get(0).getIndex() +"\n" );
                    System.out.println("Nome do automóvel no final da lista é: " + automoveisList.get(size - 1).getName() + "\n marca: " + automoveisList.get(size - 1).getMarca() + "\n número index: " + automoveisList.get(size - 1).getIndex() +"\n" );
                    break;
                case 2:
                    do {
                        System.out.println("Entre com o número index do automóvel: ");
                        p.setIndex(scan1.nextInt());
                        System.out.println("Entre com o nome: ");
                        p.setName(scan1.next());
                        System.out.println("Inserir a marca:");
                        p.setMarca(scan1.next());
                        automoveisList.add(p);
                        System.out.println("Deseja adicionar mais automóveis? (Y/N)");
                        if (scan1.next().equalsIgnoreCase("N")) {
                            break;
                        }
                    }
                    while (true);
                    break;
                case 3:
                    if (ans) {
                        System.out.println("Lista vazia! " + "\n ");
                        break;
                    }
                    do {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Entre com o nome do automóvel: " + "\n ");
                            automoveisList.remove(sc.next());
                        System.out.println("Deseja apagar mais automóveis? (Y/N)");
                        if (sc.next().equalsIgnoreCase("N")) {
                            break;
                        }
                    }
                    while (true);
                    break;
                default:
                    System.out.println("Invalido!" + "\n ");
                    break;
            }
        }
    }
}
// Collections.sort(automoveisList);
     //   System.out.println("Nome do automóveis no início da lista é: " + automoveisList.get(0).getName() + "\n número de telefone: " + automoveisList.get(0).getMarca());
       // Java Collections
        //  Exercício 1: Crie uma ArrayList de Strings que permite guardar
        //   marcas de automóveis. Crie funções que permitem:
        //   Adicionar um carro - nomeDaArrayList.add(“nome”);
        //   Adicionar um carro e indicar o índice – nomeDaArrayList.add(1,“nome”);
        //   Remover elemento pelo seu nome –
        //  nomeDaArrayList.remove(“nome”);
        //   Remover elemento pelo seu índice –
        //  nomeDaArrayList.remove(1);

     //   Collections.reverse(list);
     //   list.add(elementForTop);
    //    Collections.reverse(list);
