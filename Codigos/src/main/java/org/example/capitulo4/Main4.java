package org.example.capitulo4;

import org.example.capitulo2.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main4 {
    public static void main(String[] args){
          Usuario user1 = new Usuario("Socrates",150);
          Usuario user2 = new Usuario("Aristóteles ",170);
          Usuario user3 = new Usuario("Nicolau Maquiavel",199);

          List<Usuario> users = Arrays.asList(user1,user2,user3); //Lista imutavel

        Consumer<Usuario> mostraMensagem = u -> System.out.println("antes de imprimir os nomes");

        Consumer<Usuario> imprimeNome = u -> System.out.println(u.getNome());

      //  users.forEach(mostraMensagem.andThen(imprimeNome));
    //    users.forEach(imprimeNome);

        Predicate<Usuario> predicado = new Predicate<Usuario>() {
            @Override
            public boolean test(Usuario u) {
                return u.getPontos() > 160;
            }
        };

        List<Usuario> usersi = new ArrayList<>();
        usersi.add(user1);
        usersi.add(user1);
        usersi.add(user1);

       // usersi.removeIf(predicado);

        usersi.removeIf(u -> u.getPontos() > 160);
        usersi.forEach(u -> System.out.println(u));
    }
}
