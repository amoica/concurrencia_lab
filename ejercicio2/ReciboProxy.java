/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author user
 */
public class ReciboProxy implements ReciboTask {

    private ReciboGenerator generator;
    private boolean hasAccess;

    public ReciboProxy(ReciboGenerator generator, boolean hasAccess) {
        this.generator = generator;
        this.hasAccess = hasAccess;
    }

    @Override
    public Recibo generateRecibo(Employee employee) {
        if (hasAccess) {
            System.out.println("Acceso concedido. Generando recibo para " + employee.getName());
            Recibo recibo =  this.generator.generateRecibo(employee);
            System.out.println("Recibo generado: " + recibo.toString());
            return recibo;
        } else {
            System.out.println("Acceso denegado.");
            return null;
        }
    }
}
