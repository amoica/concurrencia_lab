/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author grupo 9
 */
public class Employee {

    private String name;
    private double horasTrabajadas;
    private double precioHora;
    
    public Employee(String name, double horasTrabajadas, double precioHora) {
        this.name = name;
        this.horasTrabajadas = horasTrabajadas;
        this.precioHora = precioHora;
    }

    public double calculateSalary() {
        return horasTrabajadas * horasTrabajadas;
    }

    public String getName() {
        return name;
    }
    
    
}
