import javax.swing.*;
public class NumerosMultiplos {

   //Función para comprobar si uno de dos números es múltiplo del otro
    public static String calculararMultiplos(int num1, int num2) {
   // Paso 1: Verificar si el primer número puede dividirse sin residuo por el segundo
        if (num2 != 0 && num1 % num2 == 0) {
            return num1 + " es múltiplo de " + num2;
        } 
   // Paso 2: Si no es así, verificar si el segundo número puede dividirse sin residuo por el primero
        else if (num1 != 0 && num2 % num1 == 0) {
            return num2 + " es múltiplo de " + num1;
        } 
   // Paso 3: Informar si ninguno de los dos números es múltiplo del otro
        else {
            return "Ninguno de los dos es múltiplo del otro.";
        }
    }
}
