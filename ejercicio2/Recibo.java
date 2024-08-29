/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author user
 */
public class Recibo {
     private Employee employee;
    private double salary;

    public Recibo(Employee employee, double salary) {
        this.employee = employee;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Recibo [" +
                "Empleado=" + this.employee.getName() +
                ", Salario=" + this.salary +"]";
    }
}
