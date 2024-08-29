/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author user
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Employee employee = new Employee("J J Lopez", 160, 2500);

        ReciboGenerator generator = new ReciboGenerator();
        
        // Crear un proxy de acceso
        ReciboProxy proxyWithAccess = new ReciboProxy(generator, true);
        Recibo reciboWithAccess = proxyWithAccess.generateRecibo(employee);
        if (reciboWithAccess != null) {
            System.out.println(reciboWithAccess);
        }

        // Crear un proxy sin acceso
        ReciboProxy proxyWithoutAccess = new ReciboProxy(generator, false);
        Recibo reciboWithoutAccess = proxyWithoutAccess.generateRecibo(employee);
        if (reciboWithoutAccess == null) {
            System.out.println("No se pudo generar el recibo.");
        }
    }
}
