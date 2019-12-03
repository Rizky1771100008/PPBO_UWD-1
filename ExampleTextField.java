/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplejframe;
import java.awt.*;
import javax.swing.*;
public class ExampleTextField extends JFrame{
private JTextField txt1;
private JPasswordField pss1;
private JTextArea txtA1;
public ExampleTextField(){
    Container b = getContentPane();
    setLayout(new FlowLayout());
    //penggunaan password Field
    txt1 = new JTextField(10);
    b.add(txt1);
    pss1 = new JPasswordField(10);
    b.add(pss1);
    //penggunaan Text Area
    txtA1 = new JTextArea(5,20);
    b.add(txtA1);
    setSize(300,160);
    show();
}
public static void main(String[] args) {
    ExampleTextField a = new ExampleTextField();
}
}
