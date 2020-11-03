package br.edu.ifpb.MenuFacade;

import java.util.Scanner;

public abstract class MenuAbstract {

    private Scanner sc = new Scanner(System.in);

    protected String obterString(String mensagem){
        String line = null;

        while (line == null){
            System.out.print(mensagem);
            line = sc.next();
        }
        return line;
    }


    protected Integer obterInteger(String mensagem){
        String numero;
        Integer numeroo = null;

        while (numeroo == null){
            try {
                System.out.print(mensagem);
                numero = sc.next();
                numeroo = Integer.parseInt(numero);
            }catch (NumberFormatException e){
                System.out.println("Valor inválido");
            }
        }
        return numeroo;
    }
}
