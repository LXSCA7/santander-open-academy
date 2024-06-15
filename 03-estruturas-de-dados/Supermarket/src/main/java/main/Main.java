package main;

import implementation.Supermarket;
import implementation.SupermarketArray;

import java.util.Scanner;

public class Main {

    private static int SIZE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supermarket supermarket = new SupermarketArray(SIZE);
        int opcao;
        do {
            System.out.println("\n lista de compras");
            System.out.println("1 - inserir");
            System.out.println("2 - listar");
            System.out.println("3 - remover");
            System.out.println("4 - sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("digite o item a ser inserio: ");
                    String item = scanner.next();
                    supermarket.add(item);
                    break;
                case 2:
                    supermarket.print();
                    break;
                case 3:
                    int index = scanner.nextInt();
                    supermarket.delete(index);
                    break;
                case 4:
                    System.out.println("saindo do programa...");
                    break;
                default:
                    System.out.println("opcao invalida.");
                    break;
            }
        } while (opcao != 4);
    }
}
