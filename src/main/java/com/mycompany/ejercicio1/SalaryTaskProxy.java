/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author user
 */
public class SalaryTaskProxy implements SalaryTask {
    private SalaryTask realTask;
    private boolean hasAccess;
    
    public SalaryTaskProxy(SalaryTask realTask, boolean hasAccess){
        this.realTask = realTask;
        this.hasAccess = hasAccess;
    }

    @Override
    public double computeSalary() {

        if(this.hasAccess){
            System.out.println("Acceso concedido. Calculando salarios...");
            return realTask.computeSalary();
        }else {
            System.out.println("Acceso denegado.");
            return 0;
        }
    }

    /**
     * @param args the command line arguments
     */
 
    
}
