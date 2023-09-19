package br.senai.sp.jandira.model;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoo {

    Scanner teclado = new Scanner(System.in);

    Zebra objZebra = new Zebra();

    List<Zebra> listZebra = new ArrayList<>();


    public void menu() {

        boolean continuar = true;

        while (continuar) {

            System.out.println("/-/-/- Bem Vindo -/-/-/");
            System.out.println("1 - Cadastrar Zebra ");
            System.out.println("2 - Listar Zebras");
            System.out.println("3 - Sair");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/");


            int opcaoUsuario = teclado.nextInt();
            teclado.nextLine();

            switch (opcaoUsuario) {

                case 1:
                    objZebra.cadastrarZebra();
                    adicionarZebra(objZebra);
                    System.out.println(listZebra.size());

                    break;

                case 2:
                    listarZebra();


                    break;

                case 3:
                    continuar = false;
                    break;


            }

        }

    }
    public void adicionarZebra(Zebra zebra){
        listZebra.add(zebra);

    }
    public void  listarZebra(){
        for ( Zebra zebra : listZebra){
            System.out.println("Nome da Zebra" + zebra.nome);
            System.out.println("Nome da Zebra" + zebra.apelido);
            System.out.println("Nome da Zebra" + zebra.idade);

        }
    }

}
