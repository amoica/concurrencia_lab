/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Grupo 9
 */
public class Employee {
    private String name;
    private double horasTrabajadas;
    private double precioHora;
    
    public Employee(String name, double horasTrabajadas, double precioHora){
        this.name = name;
        this.horasTrabajadas = horasTrabajadas;
        this.precioHora = precioHora;
    }
    
    public double getHorasTrabajadas(){
        return this.horasTrabajadas;
    }
    
    public double getPrecioHora(){
        return this.precioHora;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double calculateSalary(){
        return this.horasTrabajadas * this.precioHora;
    }
}
