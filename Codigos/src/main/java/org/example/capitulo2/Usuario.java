package org.example.capitulo2;

public class Usuario {
    private String nome;
    private int pontos;
    private boolean moderador;

    public Usuario() {

    }

    public Usuario(String s) {
        this.nome =s;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public boolean isModerador() {
        return moderador;
    }

    public void setModerador(boolean moderador) {
        this.moderador = moderador;
    }

    public Usuario(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
        this.moderador = moderador;
    }

    public void moderadorMode(){
        this.setModerador(true);
    }
}
