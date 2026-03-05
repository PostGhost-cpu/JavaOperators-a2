/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tut_q_v2;

/**
 *
 * @author lab_services_student
 */
import javax.swing.JOptionPane;
public class DialogMeasure {

    public static void main(String[] args) {
        //Input
        // Show the input dialog and store the result in an integer variable
        int width = Integer.parseInt(JOptionPane.showInputDialog("Enter Width"));
        int length = Integer.parseInt(JOptionPane.showInputDialog("Enter Length"));
        
        //Process
        int area = length * width;
        int perimeter = (2 * length) + (2 * width);
        
        //Output
        if(width < 0 && length < 0) { // Check if the user entered anything or clicked Cancel/closed the dialog
            JOptionPane.showMessageDialog(null, "Area: " + area + "m^2" + " & Perimeter: " + perimeter + "m");
        } else {
            JOptionPane.showMessageDialog(null, "Input cancelled, empty or less than 0.");
        }
    }
}
