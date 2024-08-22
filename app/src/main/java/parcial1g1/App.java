
package parcial1g1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        int cantidadVehiculos = 0;
        int metros = 0;
        float gasolinaTotal = 0f;
        float gasolina = 0f;
        int kilometros = 0;

        System.out.println("¿Cuántos vehiculos participaron?");
        cantidadVehiculos = sc.nextInt();
        sc.nextLine();
        
        if (cantidadVehiculos > 0) {

            for(int i = 1; i <= cantidadVehiculos; i ++){
            System.out.println("Ingrese los metros recorridos por el vehiculo " +i);
            metros = sc.nextInt(); 
            sc.nextLine();

            if (metros > 0) {
            kilometros = metros / 1000;
            gasolina = calcularConsumoGasolina(kilometros);
            gasolinaTotal += gasolina;
            System.out.println("Vehiculo: " + kilometros + "km -> " + gasolina + " litros de gasolina");
            }
        }
        }
        System.out.println("Total de gasolina consumida por los " + cantidadVehiculos + " vehiculos: " +gasolinaTotal + " litros");
    }


    /*  Implemente una funcion llamada calcularConsumoGasolina que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Un float representando los km recorridos
        * Retorna:
            - Un float representando los litros de gasolina consumidos
    */
    //------------------------------------------------------------------
    //Implemente la funcion en este espacio
    public static float calcularConsumoGasolina(float kmRecorrido){
        try {
           if (kmRecorrido > 0) {
            
           } 
        } catch (Exception e) {
            return -1;
        }
        return ((kmRecorrido * 55) / 750);
    }
    //------------------------------------------------------------------

}
