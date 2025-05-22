/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Lenovo
 */
public class Splash extends JFrame implements ActionListener{
    Splash(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(80,30,1200,60);
        heading.setFont(new Font("serif",Font.PLAIN,60));
        heading.setForeground(Color.RED);
        add(heading);
        
         ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
         Image i2 = il.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(50,100,1050,500);
         add(image);
         
         JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
         clickhere.setBounds(400, 400, 300, 70);
         clickhere.setBackground(Color.BLACK);
         clickhere.setForeground(Color.WHITE);
         clickhere.addActionListener(this);
         image.add(clickhere);
         
         
        setSize(1170, 650);
        setLocation(200,50);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String args[]){
        Splash splash = new Splash();
}
}
