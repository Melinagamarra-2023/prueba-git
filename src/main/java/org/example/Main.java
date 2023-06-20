package org.example;


import model.EliminarNumero;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer>listnum = new ArrayList<>();

        listnum.add(1);
        listnum.add(2);
        listnum.add(3);
        listnum.add(4);
        listnum.add(5);
        listnum.add(6);
        listnum.add(7);


        System.out.println("la lista actual es: "+listnum);

       EliminarNumero.EliminarNumeros(listnum);



        System.out.println("la lista es: "+listnum);

    }
}