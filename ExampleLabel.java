/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplejframe;
import java.awt.*;
import javax.swing.*;
public class ExampleLabel extends JFrame{
    JLabel label1;
    FlowLayout f1;
    public ExampleLabel(){
        Container b = getContentPane();
        //penggunaan Label
        label1 = new JLabel("praktikum GUI");
        b.add(label1);
        setLayout(new FlowLayout());
        setSize(300,100);
        show();
    }
    public static void main(String[] args) {
        ExampleLabel a = new ExampleLabel();
    }
    }
    

