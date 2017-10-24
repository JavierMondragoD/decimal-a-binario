package paquete;
import java.util.Scanner;
import java.util.Stack;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSE JAVIER
 */
public class Decimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack pila = new Stack();
        

        
        Scanner leer = new Scanner(System.in);
        int decimal,modulo;
        String binario ="";
        System.out.println("Ingresa el numero decimal: ");
        decimal = leer.nextInt();
        
        while (decimal > 0){
            modulo = (decimal % 2);
            binario = modulo + binario;
            decimal = decimal/2;
            
        }
        System.out.println("El codigo binario es  " +decimal +binario);
    
        pila.push("Codigo binario");
        System.out.println("El ultimo elemento de la pila es: ");
        
        while(pila.empty()==false)
        {
            System.out.println(pila.pop());
        
        }
    }
}
    


   

