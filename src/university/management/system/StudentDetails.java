/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;
 

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author mohan
 */
public class StudentDetails extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTable t1;
    JButton b1,b2,b3;
    JTextField t2;
    String x[] = {"Name","Father's Name","Age","Date of Birth","Address", "Phone","Email","ClassX(%)", "ClassXII(%)","Aadhar No", "Roll No","Course","Branch"};
    String y[][]= new String[20][13];
    int i=0, j=0;
    
    StudentDetails(){
        super("Student Details");
        setSize(1260,650);
        setLocation(50,20);
        setLayout(null);
        
        l1 = new JLabel("Enter Roll Number to delete Student :");
        l1.setBounds(50,360,400,30);
        l1.setFont(new Font("serif",Font.BOLD,20));
        add(l1);
        
        t2 = new JTextField();
        t2.setBounds(400,360,200,30);
        add(t2);
        
        
        b1 = new JButton("Delete");
        b1.setBounds(620,360,100,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);
        
        l2= new JLabel("Add New Student");
        l2.setBounds(50,450,400,30);
        l2.setFont(new Font("serif",Font.BOLD,20));
        add(l2);
        
        b2 = new JButton("Add Student");
        b2.setBounds(300,450,150,30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);
        
        
        l3= new JLabel("Update Student Detials");
        l3.setBounds(50,490,400,30);
        l3.setFont(new Font("serif",Font.BOLD,20));
        add(l3);
        
        b3 = new JButton("Update Student");
        b3.setBounds(300,490,150,30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        add(b3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        
        try{
        
        conn c1= new conn();
        String s1 = "select * from student";
        ResultSet rs = c1.s.executeQuery(s1);
        while(rs.next()){
        
        y[i][j++]= rs.getString("name");
         y[i][j++]= rs.getString("fathers_name");
         y[i][j++]= rs.getString("age");
         y[i][j++]= rs.getString("dob");
         y[i][j++]= rs.getString("address");
         y[i][j++]= rs.getString("phone");
         y[i][j++]= rs.getString("email");
         y[i][j++]= rs.getString("class_x");
         y[i][j++]= rs.getString("class_xii");
         y[i][j++]= rs.getString("aadhar");
         y[i][j++]= rs.getString("rollno");
         y[i][j++]= rs.getString("course");
         y[i][j++]= rs.getString("branch");
         
         i++;
         j=0;
         
        } 
         t1=new JTable(y,x);
        // add(t1);
        
        
        }catch(Exception e){
        
        e.printStackTrace();
        }
        
        
        JScrollPane sp = new JScrollPane(t1);
        sp.setBounds(20,20,1200,330);
        add(sp);
        
        getContentPane().setBackground(Color.WHITE);
        
        
        
        
           
    }
     public void actionPerformed(ActionEvent ae){
     
         conn cc1 = new conn();
         if(ae.getSource()==b1){
         try{
             String a = t2.getText();
             String q = "delete from student where rollno = '"+a+"'";
             ResultSet rs =cc1.s.executeQuery(q);
             JOptionPane.showMessageDialog(null,"succesful deleted.");
             this.setVisible(false);
             new StudentDetails().setVisible(true);
          
         }catch(Exception e){}
         }else if(ae.getSource()==b2){
                new AddStudent().f.setVisible(true);
                this.setVisible(false);
                
           }else if(ae.getSource()==b3){
              new UpdateStudent().f.setVisible(true);
               this.setVisible(false);
           
           }
         
     }
     
     public static void main(String[] args){
     
     new StudentDetails().setVisible(true);
     
             
     }
}


