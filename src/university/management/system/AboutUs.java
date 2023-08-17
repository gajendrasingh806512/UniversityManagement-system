/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author mohan
 */
public class AboutUs extends JFrame{
    
    
    private JPanel contentPane;
    
    public static void main(String[] args){
    new AboutUs().setVisible(true);
    
    }
    
  public AboutUs(){
        
        super("AboutUs- ACN Collage of Engg. and Management Studies,Aligarh");
        setBackground(new Color(173,216,230));
        setBounds(300,50,800,600);
     
        
        
        contentPane= new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        
        JLabel l1 = new JLabel("New Label");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/logo.jpg"));
        Image i2 =i1.getImage().getScaledInstance(250,100,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        l1= new JLabel(i3);
        
        l1.setBounds(400,40,350,200);
        
        contentPane.add(l1);
        
        
        JLabel l3 = new JLabel("University");
        l3.setForeground(new Color(0,250,154));
        l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        l3.setBounds(140,40,200,55);
        contentPane.add(l3);
        
        JLabel l4 = new JLabel("Management System");
        l4.setForeground(new Color(0,250,154));
        l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
        l4.setBounds(70,90,405,40);
        contentPane.add(l4);
        
        
        JLabel l5 = new JLabel("v5.1");
        l5.setForeground(new Color(30,144,255));
        l5.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
        l5.setBounds(185,140,100,25);
        contentPane.add(l5);
        
        JLabel l6 = new JLabel("Developed By : Mr.Gajendra Singh");
        //l6.setForeground(new Color(0,250,154));
        l6.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 35));
        l6.setBounds(170,198,600,35);
        contentPane.add(l6);
        
        JLabel l8 = new JLabel("Roll Number -2003390109001");
      // l8.setForeground(new Color(0,250,154));
        l8.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
        l8.setBounds(70,260,600,34);
        contentPane.add(l8);
       
        
        JLabel l9 = new JLabel("Education- B.tech(Computer Science and Engg.)");
      // l8.setForeground(new Color(0,250,154));
        l9.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
        l9.setBounds(70,320,600,34);
        contentPane.add(l9);
        
        contentPane.setBackground(Color.WHITE);
        
        
     }
    
}
