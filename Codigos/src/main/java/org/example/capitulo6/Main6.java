package org.example.capitulo6;

import org.example.capitulo2.Usuario;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static java.util.Comparator.comparing;

/*
*
*
* CAPITULO 6:
*
* METHOD REFERENCES
*
* */
public class Main6 {

   public static void main(String[] args){
        Usuario user1 = new Usuario("Socrates",210);
        Usuario user2 = new Usuario("zAristóteles ",110);
        Usuario user3 = new Usuario("Nicolau Maquiavel",199);
        List<Usuario> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

     //   users.forEach(Usuario::moderadorMode);

    //    Consumer<Usuario> moderador = Usuario::moderadorMode;
      //  users.forEach(moderador);

   //     System.out.println("\n\n\n\n");

        //users.sort(Comparator.comparing(Usuario::getNome));
        Function<Usuario, String>  byName = Usuario::getNome;
       // users.sort(comparing(byName));
  //      users.forEach(x -> System.out.println(x.getNome()));

        System.out.println("\n\n\n\n");

      //  users.sort(Comparator.comparingInt(Usuario::getPontos));
   //     users.forEach(x -> System.out.println(x.getPontos()));

     //   Comparator<Usuario> c = Comparator.comparingInt(Usuario::getPontos).thenComparing(Usuario::getNome);

         users.sort(Comparator.nullsLast(Comparator.comparing(Usuario::getNome)));
        users.forEach(x -> System.out.println(x.getNome()));

        System.out.println("\n\n");
          users.sort(Comparator.comparing(Usuario::getPontos).reversed());
        users.forEach(x -> System.out.println(x.getPontos()));

        Usuario lenine = new Usuario("Vladimir litch ulianov",1917);
        Runnable bloco = lenine::moderadorMode;
        bloco.run();

        Usuario rodrigo = new Usuario("Rodrigo Turini", 50);
        Consumer<Usuario> consumer = Usuario::moderadorMode;
        consumer.accept(rodrigo);
        System.out.println(rodrigo.isModerador());

        //Codigos equivalentes:
        Consumer<Usuario> c1 = Usuario::moderadorMode;
        Consumer<Usuario> c2 = u -> u.moderadorMode();

        users.forEach(System.out::println);


        Supplier<Usuario> createUsers = Usuario::new;
        Usuario neo = createUsers.get();
        Function<String, Usuario> createNeoUsers = Usuario::new;
        Usuario michel = createNeoUsers.apply("Michel Foucault");
        Usuario david = createNeoUsers.apply("David Hume");

       BiFunction<String, Integer, Usuario> createUser = Usuario::new;
        Usuario foucault = createNeoUsers.apply("Michel Foucault");
        Usuario hume = createNeoUsers.apply("David Hume");

        Consumer<Integer> vale = int[]::new;


   }
}
