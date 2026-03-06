/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tut_q_v2;

/**
 *
 * @author lab_services_student
 */
import javax.swing.JOptionPane;
public class DialogSalary {
    
    public static void main(String[] args) {
        // Input
        int rent = 1450;
        
        double salary = Integer.parseInt(JOptionPane.showInputDialog("Enter monthly salary"));
        
        // Process
        if (salary >= 5500.00) {
            //Allocte to each category
                double food = 0.5 * salary;
                double clothes = 0.2 * salary;
                double transport = 0.15 * salary;
                double charity = 0.05 * salary;
            //Calculate
                double netSalary = salary - (food + clothes + transport + charity + rent);
            //Output
                JOptionPane.showMessageDialog(null, "Gross salary: R" + salary + "Net salary: R" + netSalary);
        } else {
           JOptionPane.showMessageDialog(null, "R" + salary + " is invalid enter monthly salary which is never less then R5500.00!");
        }
    }
}
