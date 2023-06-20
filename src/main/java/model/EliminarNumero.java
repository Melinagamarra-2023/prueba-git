package model;

import java.util.List;

public class EliminarNumero {


    public static Integer EliminarNumeros(List<Integer> listnum) {

        if(!listnum.isEmpty()){
           listnum.remove(listnum.get(0));

            System.out.println(listnum);
           return EliminarNumeros(listnum) ;

        }else {
            System.out.println("la lista se encuentra vacia");



        }


        return 0;
    }



}