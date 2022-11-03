package org.example.capitulo3;

import java.awt.*;

public class Runa {
    public static void main(String[] args) {
   /*     Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i <=100; i++){
                    System.out.println(i);
                }
            }
        };
        new Thread(r).start();*/

        //Exemplo lambda 1
        Runnable r = () -> {
            for (int i = 0; i <= 100; i++) {
                System.out.println(i);
            }
        };
        new Thread(r).start();

        new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                System.out.println(i);
            }
        }).start();
        Button button = new Button();
        button.addActionListener((event) -> {
            System.out.println("evento de click acionado!");
        });

        button.addActionListener(
                event -> System.out.println("evento 2 acionado!"));

        //Exemplo Classe Anonima
        Validator<String> validadorCEP = new Validator<String>() {
            public boolean valida(String valor) {
                return valor.matches("[0-9]{5}-[0-9]{3}");
            }
        };

        Validator<String> validaCEP = valor -> {
            return valor.matches("[0-9]{5}-[0-9]{3}");
        };
        Validator<String> valiCEP = valor -> valor.matches("[0-9]{5}-[0-9]{3}");

        //ERRO:  incompatible types: java.lang.Object is not a functional interface
        //        Object O = () -> { System.out.println("O que sou eu? Lambda");};

        Runnable o = () -> {System.out.println("Lambda indo na sua porta junto com a PF");};

        System.out.println(o);
        System.out.println(o.getClass());

        final int num =5;
        new Thread(() -> {
            System.out.println(num);
        }).start();

        int nume=10;
        new Thread(() -> {
            System.out.println(nume);
        }).start();

       //ERRO: local variables referenced from a lambda expression must be final or effectively final
        // nume = 15;

    }


}
