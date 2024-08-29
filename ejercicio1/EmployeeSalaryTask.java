/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;


/**
 *
 * @author Grupo 9
 */
public class EmployeeSalaryTask extends RecursiveTask<Double> {
    
    private static final int THRESHOLD=10; // Umbral para dividir las tareas
    private Employee[] Employees;
    private int start;
    private int end;
    
    public EmployeeSalaryTask(Employee[] Employees, int start, int end){
        this.Employees = Employees;
        this.start=start;
        this.end=end;
    }

    @Override
    protected Double compute() {
        
        if(this.end - this.start <= this.THRESHOLD){
            // Calculamos los salarios si el grupo es menor o igual que el umbral
            double totalSueldos = 0;
            for (int i = start; i < end; i++){
                double sueldo = this.Employees[i].calculateSalary();
                System.out.println("Empleado: "+this.Employees[i].getName() + ", Sueldo: "+sueldo);
                totalSueldos += sueldo;
            }
            return totalSueldos;
        }else{
            //Dividir la tarea en dos subtareas
            int mid = (this.start+end) / 2;
            EmployeeSalaryTask tarea1 = new EmployeeSalaryTask(Employees, start, mid);
            EmployeeSalaryTask tarea2 = new EmployeeSalaryTask(Employees, mid, end);
            
            //Ejecutar subtareas en paralelo
            tarea1.fork();
            double tarea2Result = tarea2.compute();
            double tarea1Result = tarea1.join();
            
            return tarea1Result + tarea2Result;
        }
    }

}