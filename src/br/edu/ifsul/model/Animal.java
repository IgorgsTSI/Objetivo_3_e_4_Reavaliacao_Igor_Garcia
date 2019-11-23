package br.edu.ifsul.model;

public abstract class Animal {
    protected double x;
    protected double y;
    protected String nome;
    protected String tipo;

    public Animal(){

    }

    public Animal(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public abstract void mover(double x, double y);

    public abstract void desenhar();

    public abstract String getNome();

    public abstract String getTipo();
}
