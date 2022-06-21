/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
/**
 *
 * @author nhokk
 */
public class DataValidator {
    public static void validateEmpty(JTextField field, StringBuilder sb, String errorMassage){
        if(field.getText().equals("")){
            sb.append(errorMassage).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
        } else {
            field.setBackground(Color.white);
        }
    }
    public static void validateEmpty(JPasswordField field, StringBuilder sb, String errorMassage){
        String password = new String(field.getPassword());
        if(password.equals("")){
            sb.append(errorMassage).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
        } else {
            field.setBackground(Color.white);
        }
    }
}
