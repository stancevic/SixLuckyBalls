/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luckysixjava;

import java.awt.Color;

/**
 *
 * @author WIN 10
 */
public class LuckySixJava {

    /**
     * @param args the command line arguments
     */
    static final Color NEW_RED = new Color(196, 2, 51);
    static final Color BACKGROUND_GREEN = new Color(31, 140, 83);
                                                    //31, 108, 83
    
    
    
    
    
    
    //(196, 2, 51)
    
    
    public static void main(String[] args) {
        StartWindow sw = new StartWindow();
        sw.getContentPane().setBackground(BACKGROUND_GREEN);
        sw.setLocation(300, 100);
        sw.setVisible(true);
    }
    
}
