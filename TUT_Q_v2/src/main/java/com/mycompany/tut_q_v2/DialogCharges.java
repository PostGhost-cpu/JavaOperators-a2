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
public class DialogCharges {
    
    public static void main(String[] args) {
        // Input
        double savings = 0.15;
        
        int singleSpacing = Integer.parseInt(JOptionPane.showInputDialog("Enter number of single-spaced pages"));
        int doubleSpacing = Integer.parseInt(JOptionPane.showInputDialog("Enter number of double-spaced pages"));
        
        // Process
        double totalCharged = (singleSpacing * 6.80) + (doubleSpacing + 3.50);
        double netAmount = totalCharged - (savings * totalCharged);
        
        // Output
        JOptionPane.showMessageDialog(null, "Gross earned: R" + totalCharged + "Net earned: R" + netAmount);
    }
}
