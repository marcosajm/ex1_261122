import java.util.*;
import java.lang.*;
import java.io.*;
class Vehicle
{
    int rollno;
    String name, marca;

    // Constructor
    public Vehicle(int rollno, String name,
                   String marca)
    {
        this.rollno = rollno;
        this.name = name;
        this.marca = marca;
    }
    // Used to print student details in main()
    public String toString()
    {
        return this.rollno + " " + this.name +
                " " + this.marca;
    }
}
class Sortbyroll implements Comparator<Vehicle>
{
    // Used for sorting in ascending order of
    // roll number
    public int compare(Vehicle a, Vehicle b)
    {
        return a.rollno - b.rollno;
    }
}
public class Main {
    public static void main(String[] args) {
        List<Automoveis> automoveisList = new ArrayList<Automoveis>();
        ArrayList<Vehicle> ar = new ArrayList<Vehicle>();
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
                    System.out.println("Unsorted");
                    for (int i=0; i<ar.size(); i++)
                        System.out.println(ar.get(i));
                    Collections.sort(ar, new Sortbyroll());
                    System.out.println("\nSorted by rollno");
                    for (int i=0; i<ar.size(); i++)
                        System.out.println(ar.get(i));
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
                        System.out.println("Inserir 2 type array:");
                      //  ar.add(new Vehicle(scan1.next());
                        ar.add(new Vehicle(131, "aaaa", "nyc"));
                        ar.add(new Vehicle(121, "cccc", "jaipur"));
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
                        Collections.sort(automoveisList);
                        System.out.println("error Entre com o nome do automóvel: " + "\n ");
                        automoveisList.remove(String.valueOf(sc.next()));
                        System.out.println("error Deseja apagar mais automóveis? (Y/N)");
                        if (sc.next().equalsIgnoreCase("N")) {
                            break;
                        }
                    }
                    while (true);
                    break;
                default:
                    System.out.println("Número invalido!" + "\n ");
                    break;
            }
        }
    }
}
// Java Collections

//  Exercício 1: Crie uma ArrayList de Strings que permite guardar
        //   marcas de automóveis. Crie funções que permitem:
        //  Adicionar um carro - nomeDaArrayList.add(“nome”);
        //  Adicionar um carro e indicar o índice – nomeDaArrayList.add(1,“nome”);
        //  Remover elemento pelo seu nome –
        //  nomeDaArrayList.remove(“nome”);
        //  Remover elemento pelo seu índice –
        //  nomeDaArrayList.remove(1);

     //   Collections.reverse(list);
     //   list.add(elementForTop);
    //    Collections.reverse(list);
