package org.example.capitulo5;

import org.example.capitulo2.Usuario;

import java.util.*;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import static java.util.Comparator.comparing;

public class Main5 {

    public static void main(String[] args){
        Usuario user1 = new Usuario("Socrates",210);
        Usuario user2 = new Usuario("zAristóteles ",170);
        Usuario user3 = new Usuario("Nicolau Maquiavel",199);

        //  List<Usuario> users = Arrays.asList(user1,user2,user3); //Lista imutavel


        List<Usuario> lovelove = new ArrayList<>();
        lovelove.add(user1);
        lovelove.add(user2);
        lovelove.add(user3);
        // Comparator<Usuario> comparator = new Comparator<Usuario>() {
        //     @Override
        //     public int compare(Usuario o1, Usuario o2) {
        //         return o1.getNome().compareTo(o2.getNome());

        //     }
        // };
        //Collections.sort(users, comparator);
        Comparator<Usuario> comparator = (u1, u2) -> u1.getNome().compareTo(u2.getNome());

     //   Collections.sort(lovelove, comparator);
      //  Collections.sort(lovelove, (u1,u2) -> u1.getNome().compareTo(u2.getNome()));

   //     lovelove.sort((u1,u2) -> u1.getNome().compareTo(u2.getNome()));

        Comparator<Usuario> comparador = comparing(u ->u.getNome());
   //     lovelove.sort(comparador);
//        lovelove.sort(Comparator.comparing(u -> u.getNome()));

   //     lovelove.sort(comparing(u -> u.getNome()));
      //  lovelove.forEach(x -> System.out.println(x.getNome()));

        List<String> palavras =  Arrays.asList("zEstetica", "Aparencia", "Feel Special");

     //   Collections.sort(palavras);
        palavras.sort(Comparator.naturalOrder());
        palavras.forEach(x -> System.out.println(x));
        System.out.println("\n\n\n\n");

        palavras.sort(Comparator.reverseOrder( ));
        palavras.forEach(x -> System.out.println(x));

        System.out.println("\n\n\n\n");
        Function<Usuario, String> extraiNome = u -> u.getNome();
        Comparator<Usuario> comparado = Comparator.comparing(extraiNome);
        ToIntFunction<Usuario> extraiPontos = u -> u.getPontos();
        Comparator<Usuario> comps = Comparator.comparingInt(extraiPontos);

        lovelove.sort(comparado);
        lovelove.sort(comps);
         lovelove.forEach(x -> System.out.println(x.getNome()));
        lovelove.forEach(x -> System.out.println(x.getPontos()));
    }
}
