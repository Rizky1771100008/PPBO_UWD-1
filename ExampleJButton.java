/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplejframe;
import java.awt.*;
import javax.swing.*;
public class ExampleJButton extends JFrame{
    private JButton btn1, btn2;
    public ExampleJButton(){
        Container b = getContentPane();
        //contoh penggunaan button
        btn1 = new JButton("oke");
        btn2 = new JButton("cancel");
        b.add(btn1);b.add(btn2);
        setLayout(new FlowLayout());
        setSize(300,100);
        show();
    }
    public static void main(String[] args) {
        ExampleJButton a = new ExampleJButton();
    }
}
        
    }
}