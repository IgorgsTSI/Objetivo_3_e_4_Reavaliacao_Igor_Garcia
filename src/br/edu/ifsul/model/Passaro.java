package br.edu.ifsul.model;

public class Passaro extends Animal implements AnimalMagico {
    private String frase;


    public Passaro() {
    }

    public Passaro(String nome, double x, double y) {
        super(x, y);
        this.nome = nome;
    }

    @Override
    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println("Passaro se moveu nas coordenadas: x=" + x + " e y=" + y);

    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou um passaro");
    }


    @Override
    public void falar(String frase) {
        this.frase = frase;
        System.out.println(this.frase);
    }

    @Override
    public String getFrase() {
        return this.frase;
    }

    public void setFrase(String frase){
        this.frase = frase;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }



    @Override
    public String toString() {
        return "\nPassaro{" +

                "nome='" + nome + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
