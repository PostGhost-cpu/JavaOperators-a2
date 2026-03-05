package com.mycompany.tut_q_v2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab_services_student
 */
import javax.swing.JOptionPane;
public class DialogWages {
    
    public static void main(String[] args) {
        // Input
        int hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter Total Hours Worked(Weekly)"));
        hoursWorked = input.nextInt();
        double payRate = Integer.parseInt(JOptionPane.showInputDialog("Enter Pay Rate(Per Hour)"));
        payRate = input.nextInt();
        
        // Process
        double grossSalary = hoursWorked * payRate;
        double netSalary = grossSalary - 8;
        
        // Output
        if(hoursWorked < 0 && payRate < 0) { // Check if the user entered anything or clicked Cancel/closed the dialog
            JOptionPane.showMessageDialog(null, "Total earnings: R" + grossSalary + " Take-home pay: R" + netSalary);
        } else {
            JOptionPane.showMessageDialog(null, "Input cancelled, empty or less than 0.");
        }
    }
}
