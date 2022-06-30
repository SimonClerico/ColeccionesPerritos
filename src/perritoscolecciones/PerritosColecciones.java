/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perritoscolecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PerritosColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        ArrayList<String> raza = new ArrayList();
        String posicion;
        Integer resultado;
       

            System.out.println("Ingrese raza de perro ");
            posicion = leer.next();
            raza.add(posicion);

            do {
                switch (resultado) {
                    case 1:
                        System.out.println("Ingrese raza de perro ");
                        posicion = leer.next();
                        raza.add(posicion);
                        break;
                    case 2:
                        System.out.println("Las razas son ");
                        System.out.println(raza);
                        break;

                }

            } while (resultado == 2);

       

        System.out.println(raza);

        System.out.println("Elija la opcion");
        System.out.println("1- Agregar otra raza ");
        System.out.println("2- Salir y mostrar razas");
        resultado = leer.nextInt();

    }

}
