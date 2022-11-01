package org.example.capitulo2;

import java.util.function.Consumer;

public class Mostrador implements Consumer<Usuario> {
    public void accept(Usuario u){
        System.out.println(u.getNome());

    }
}
