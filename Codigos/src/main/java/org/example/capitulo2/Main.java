package org.example.capitulo2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Friederch Nietzsche",120);
        Usuario user3 = new Usuario("Michel Foucault", 190);

        List<Usuario> usuarios = Arrays.asList(user1,user2,user3);

        for(Usuario u : usuarios){
           System.out.print(u.getPontos()+" ");
        }
        //Mostrador mostrador = new Mostrador();

       /**
        * Classe Anonima
        * Consumer<Usuario> mostradr = new Consumer<Usuario>() {
            @Override
            public void accept(Usuario usuario) {
                System.out.println(usuario.getNome());
            }
        };*/


      /*
       Exemplo mais enxuto sem lambda

       usuarios.forEach(new Consumer<Usuario>(){
            public void accept(Usuario u) {
                System.out.println(u.getNome());
            }
        });*/

        //Exemplo 1 lambda
        Consumer<Usuario> mostrador = (Usuario u) -> {
            System.out.println(u.getNome());};


        //Exemplo 2 lambda
        Consumer<Usuario> mostra = u -> System.out.println(u.getNome());

        //usuarios.forEach(mostrador); Funcional
        //usuarios.forEach(mostra);  Funcional

        usuarios.forEach(u -> System.out.println(u.getNome()));

    }

}

