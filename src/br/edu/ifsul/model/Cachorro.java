package br.edu.ifsul.model;

public class Cachorro extends Animal implements AnimalMagico{
    private String frase;
    private String nome;

    public Cachorro() {
    }

    public Cachorro(String nome, double x, double y) {
        super(x, y);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println("Cachorro se moveu nas coordenadas: x=" + x + " e y=" + y);

    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou um cachorro");
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

    @Override
    public String toString() {
        return "\nCachorro{" +
                "nome='" + nome + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
