package br.edu.ifsul.model;

public class Peixe extends Animal {
    private double z;

    public Peixe(){ super(); }
    public Peixe(double z) {
        this.z = z;
    }

    public Peixe(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void mover3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Peixe se moveu nas coordenadas: x=" + x + " y=" + y + " z=" + z);
    }

    @Override
    public void mover(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println("Peixe se moveu nas coordenadas: x=" + x + " e y=" + y);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhou um peixe");
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public String getTipo() {
        return "Peixe";
    }

    @Override
    public String toString() {
        return "\nPeixe{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
