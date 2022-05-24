/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Calculator;

import Frame.FrameCal;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author Nguyen V Toan
 */

public class Calculator {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
//        ArrayList<student> list= new ArrayList<>();
//        int i=0;
//        while(i<10){
//            String name= "nguyen van "+ i;
//            int age= i*10+i;
//            student stu= new student(name, age);
//            list.add(stu);
//            i++;
//        }
//        
//        for(student index : list){
//            System.out.println(index.toString());
//        }
        FrameCal frame= new FrameCal();
        frame.setVisible(true);
        
    }
    
}
