package br.edu.ifsul.control;

import br.edu.ifsul.model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Questão A:

        Peixe pe1 = new Peixe(10,10,10);
        Peixe pe2 = new Peixe(20,20,20);
        Peixe pe3 = new Peixe(30,30,30);

        Cachorro ca1 = new Cachorro("Banzé",40,40);
        Cachorro ca2 = new Cachorro("Bob",50,50);
        Cachorro ca3 = new Cachorro("Gaudencio",60,60);

        Passaro pa1 = new Passaro("Baitaca",70,70);
        Passaro pa2 = new Passaro("Pirisca",80,80);
        Passaro pa3 = new Passaro("Leopoldo",90,90);

        //Questão B:
        System.out.println("Questão B:");
        List<Animal> animais = new ArrayList<>();
        animais.add(pe1);
        animais.add(pe2);
        animais.add(pe3);
        animais.add(ca1);
        animais.add(ca2);
        animais.add(ca3);
        animais.add(pa1);
        animais.add(pa2);
        animais.add(pa3);
        System.out.println("Lista de animais:" + animais);

        //Questão C:
        System.out.println("Questão C:");
        animais.forEach(a->{
            a.setX(5);
            a.setY(5);
            a.desenhar();
        });
        System.out.println(animais);

        //Questão D:
        System.out.println("Questão D:");
        animais.forEach(a->{
            if(a instanceof Cachorro){
                ((Cachorro) a).setTipo("Cachorro");
            }
            if(a instanceof Passaro){
                ((Passaro) a).setTipo("Pássaro");
            }
            if(a instanceof AnimalMagico){
                ((AnimalMagico) a).falar("Oi eu sou o " + a.getNome() + ", um " + a.getTipo());
            }
        });

        //Questão E:
        System.out.println("Questão E:");
        animais.forEach(a->{
            if(a instanceof Peixe){
                a.setY(8);
                a.setX(8);
                ((Peixe) a).setZ(8);
            }
        });
        System.out.println(pe1);
        System.out.println(pe2);
        System.out.println(pe3);

        //Questão F:
        System.out.println("Questão F:");
        animais.sort(Comparator.comparingDouble(Animal::getX).reversed());
        System.out.println("Animais em ordem decrescente pela coordenada X: "+ animais);
    }

}
