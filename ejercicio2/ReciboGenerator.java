/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author user
 */
public class ReciboGenerator implements ReciboTask {
    
    @Override
    public Recibo generateRecibo(Employee employee) {
        double salary = employee.calculateSalary();
        return new Recibo(employee, salary);
    }
}
