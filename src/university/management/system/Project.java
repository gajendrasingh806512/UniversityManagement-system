/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author mohan
 */
public class Project extends JFrame implements ActionListener {
   public Project(){
    super("University Management System");
    
    
    setSize(1300,700);
    
    
    ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/third.jpg"));
    Image i3 = ic.getImage().getScaledInstance(1200,750,Image.SCALE_DEFAULT);
    ImageIcon icc3 = new ImageIcon (i3);
    JLabel l1 =new JLabel(icc3);
     add(l1);
     
    JMenuBar mb =new JMenuBar();
    JMenu master = new JMenu("Master");
    JMenuItem m1 = new JMenuItem("New Faculty");
    JMenuItem m2 = new JMenuItem("New Student Admission");
        master.setForeground(Color.BLUE);
        
        
        m1.setFont(new Font("monospaced",Font.BOLD,16));
     ImageIcon icn12 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/icon1.png"));
    Image image1 = icn12.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
    m1.setIcon(new ImageIcon(image1));
    m1.setMnemonic('A');
    m1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
    m1.setBackground(Color.WHITE);
    
    
    m2.setFont(new Font("monospaced", Font.BOLD,16));
    ImageIcon ican2 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/icon2.png"));
    Image image2 = ican2.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
    m2.setIcon(new ImageIcon(image2));
    m2.setMnemonic('B');
    m2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
    m2.setBackground(Color.WHITE);
    
    m1.addActionListener(this);
    m2.addActionListener(this);
    
    JMenu user = new JMenu ("Details");
    JMenuItem u1 = new JMenuItem("Student Detials");
    JMenuItem u2 = new JMenuItem("Teacher Details");
        user.setForeground(Color.RED);
        
   u1.setFont(new Font("monospaced",Font.BOLD,16));
   ImageIcon ican4 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/icon3.png"));
    Image image4 = ican4.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
    u1.setIcon(new ImageIcon(image4));
    u1.setMnemonic('C');
    u1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
    u1.setBackground(Color.WHITE);
    //user.add(u1);
    
    u1.addActionListener(this);
    
    u2.setFont(new Font("monospaced",Font.BOLD,16));
     ImageIcon ican5 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/icon4.jpg"));
    Image image5 = ican5.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
    u2.setIcon(new ImageIcon(image5));
    u2.setMnemonic('D');
    u2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
    u2.setBackground(Color.WHITE);
    //user.add(u2);
    
   
    u2.addActionListener(this);
        
     JMenu attendance = new JMenu ("Attenance");
    JMenuItem a1 = new JMenuItem("Student Attendance");
    JMenuItem a2 = new JMenuItem("Teacher Attendance");
       attendance.setForeground(Color.BLUE);
        
   a1.setFont(new Font("monospaced",Font.BOLD,16));
   ImageIcon ican23 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/icon14.jpg"));
    Image image24= ican23.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
    a1.setIcon(new ImageIcon(image24));
    a1.setMnemonic('M');
    a1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
    a1.setBackground(Color.WHITE);
    attendance.add(a1);
    
    
    a2.setFont(new Font("monospaced",Font.BOLD,16));
     ImageIcon ican25 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/icon15.png"));
    Image image26 = ican25.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
    a2.setIcon(new ImageIcon(image26));
    a2.setMnemonic('N');
    a2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
    a2.setBackground(Color.WHITE);
    attendance.add(a2);
    
    a1.addActionListener(this);
    a2.addActionListener(this);
    
    
   JMenu attendance_detail = new JMenu ("Attenance Detail");
    JMenuItem b1 = new JMenuItem("Student Attendance Details");
    JMenuItem b2 = new JMenuItem("Teacher Attendace Details");
       attendance_detail.setForeground(Color.BLUE);
        
   b1.setFont(new Font("monospaced",Font.BOLD,16));
   ImageIcon ican27 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/icon15.png"));
    Image image28= ican27.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
    b1.setIcon(new ImageIcon(image28));
    b1.setMnemonic('O');
    b1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
    b1.setBackground(Color.WHITE);
    attendance_detail.add(b1);
    
    
    b2.setFont(new Font("monospaced",Font.BOLD,16));
     ImageIcon ican29 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/icon14.jpg"));
    Image image30 = ican29.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
    b2.setIcon(new ImageIcon(image30));
    b2.setMnemonic('P');
    b2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
    b2.setBackground(Color.WHITE);
    attendance_detail.add(b2);
    
   b1.addActionListener(this);
    b2.addActionListener(this);
    
    
    JMenu exam = new JMenu ("Examination");
    JMenuItem c1 = new JMenuItem("Examination Details");
    JMenuItem c2 = new JMenuItem("Enter Marks");
       exam.setForeground(Color.BLUE);
        
   c1.setFont(new Font("monospaced",Font.BOLD,16));
   ImageIcon ican30 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/icon16.png"));
    Image image31= ican30.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
    c1.setIcon(new ImageIcon(image31));
    c1.setMnemonic('Q');
    c1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
    c1.setBackground(Color.WHITE);
    exam.add(c1);
    
    
    c2.setFont(new Font("monospaced",Font.BOLD,16));
     ImageIcon ican32 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/icon17.png"));
    Image image33 = ican32.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
    c2.setIcon(new ImageIcon(image33));
    c2.setMnemonic('R');
    c2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
    c2.setBackground(Color.WHITE);
    exam.add(c2);
    
   c1.addActionListener(this);
    c2.addActionListener(this);
   
    JMenu report = new JMenu ("Update Details");
    JMenuItem r1 = new JMenuItem("Update Students");
    JMenuItem r2 = new JMenuItem("Update Teachers");
       report.setForeground(Color.RED);
        
   r1.setFont(new Font("monospaced",Font.BOLD,16));
   ImageIcon ican7 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/icon5.png"));
    Image image7= ican7.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
    r1.setIcon(new ImageIcon(image7));
    r1.setMnemonic('E');
    r1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
    r1.setBackground(Color.WHITE);
   // report.add(r1);
    
    
    r2.setFont(new Font("monospaced",Font.BOLD,16));
     ImageIcon icann = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/icon6.png"));
    Image imagee = icann.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
    r2.setIcon(new ImageIcon(imagee));
    r2.setMnemonic('F');
    r2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
    r2.setBackground(Color.WHITE);
   // report.add(r2);
    
    r1.addActionListener(this);
    r2.addActionListener(this);
    
    
    JMenu fee = new JMenu ("Fee Detail");
    JMenuItem s1 = new JMenuItem("Fee Structure");
    JMenuItem s2 = new JMenuItem("Student Fee Form");
       fee.setForeground(Color.BLUE);
        
   s1.setFont(new Font("monospaced",Font.BOLD,16));
   ImageIcon ican14 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/icon7.png"));
    Image image15= ican14.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
    s1.setIcon(new ImageIcon(image15));
    s1.setMnemonic('G');
    s1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,ActionEvent.CTRL_MASK));
    s1.setBackground(Color.WHITE);
    //fee.add(s1);
    
    
    s2.setFont(new Font("monospaced",Font.BOLD,16));
     ImageIcon ican16 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/icon8.png"));
    Image image17 = ican16.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
    s2.setIcon(new ImageIcon(image17));
    s2.setMnemonic('H');
    s2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
    s2.setBackground(Color.WHITE);
  //fee.add(s2);
    
    s1.addActionListener(this);
   s2.addActionListener(this);
   
    
    JMenu utility = new JMenu ("Utility");
    //JMenuItem ut1 = new JMenuItem("Notepad");
   //JMenuItem ut2 = new JMenuItem("Calculator");
     JMenuItem ut3 = new JMenuItem("Web Browser");
       utility.setForeground(Color.RED);
  /*      
   ut1.setFont(new Font("monospaced",Font.BOLD,16));
   ImageIcon ican18 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/icon9.png"));
    Image image19= ican18.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
    ut1.setIcon(new ImageIcon(image19));
    ut1.setMnemonic('I');
    ut1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
    ut1.setBackground(Color.WHITE);
   utility.add(ut1);
   ut1.addActionListener(this);
    
    
    ut2.setFont(new Font("monospaced",Font.BOLD,16));
     ImageIcon ican20 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/icon10.png"));
    Image image21 = ican20.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
    ut2.setIcon(new ImageIcon(image21));
    ut2.setMnemonic('J');
    ut2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,ActionEvent.CTRL_MASK));
    ut2.setBackground(Color.WHITE);
    //utility.add(ut2);
    */
     ut3.setFont(new Font("monospaced",Font.BOLD,16));
     ImageIcon ican10 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/icon11.png"));
    Image image10 = ican10.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
    ut3.setIcon(new ImageIcon(image10));
    ut3.setMnemonic('K');
    ut3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
    ut3.setBackground(Color.WHITE);
    utility.add(ut3);
    
   // ut1.addActionListener(this);
   // ut2.addActionListener(this);
    ut3.addActionListener(this);
    
     JMenu about = new JMenu ("About");
    JMenuItem abouts = new JMenuItem("About Us");
   
       about.setForeground(Color.BLUE);
        
   abouts.setFont(new Font("monospaced",Font.BOLD,16));
   ImageIcon ican21 = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icans/icon13.jpg"));
    Image image22= ican21.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
    abouts.setIcon(new ImageIcon(image22));
    abouts.setMnemonic('L');
    abouts.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
    abouts.setBackground(Color.WHITE);
    about.add(abouts);
   abouts.addActionListener(this);
    
    JMenu exit = new JMenu("Exit");
    JMenuItem ex = new JMenuItem("Exit");
    exit.setForeground(Color.red);
    
    ex.setFont(new Font("monospaced",Font.BOLD,16));
    ImageIcon ican11 = new ImageIcon (ClassLoader.getSystemResource("university/management/system/icans/icon12.png"));
    Image image11 = ican11.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
    ex.setIcon(new ImageIcon(image11));
    ex.setMnemonic('Z');
    ex.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
    ex.setBackground(Color.WHITE);
     ex.addActionListener(this);
    
   master.add(m1);
    master.add(m2);
    
    user.add(u1);
    user.add(u2);
    
     
    report.add(r1);
    report.add(r2);
    
    
    fee.add(s1);
    fee.add(s2);
    /*
    
    
    utility.add(ut1);
    utility.add(ut2);
    utility.add(ut3);
    */
    exit.add(ex);
    
    mb.add(master);
    mb.add(user);   
    mb.add(attendance);
    mb.add(attendance_detail);
    mb.add(exam);
    mb.add(report);
    mb.add(fee);
   mb.add(utility);
    mb.add(about);
    mb.add(exit);
    
    
   
    setJMenuBar(mb);
    setFont(new Font("senserif",Font.BOLD,18));
    setLayout(new FlowLayout());
    setVisible(false);
    }
    
   
   
   
   
   @Override
    
   
  public void actionPerformed(ActionEvent ae){
        String msg = ae.getActionCommand();
        if(msg.equals("New Student Admission")){
            setVisible(false);
        new AddStudent().f.setVisible(true);
        
        
        
        }else if(msg.equals("New Faculty")){
         new AddTeacher().f.setVisible(true);
          setVisible(false);
        
        }
        else if(msg.equals("Student Detials")){
        new StudentDetails().setVisible(true);
        setVisible(false);
        
        }else if(msg.equals("Teacher Details")){
        new TeacherDetails().setVisible(true);
         setVisible(false);
        
        }  
        else if (msg.equals("Update Students")){
        new UpdateStudent().f.setVisible(true);
         //setVisible(false);
        
        }else if(msg.equals("Update Teachers")){
        new UpdateTeacher().f.setVisible(true);
         //setVisible(false);
        
        
        }   
        else if(msg.equals("Fee Structure")){
        new FeeStructure().setVisible(true);
        
        
        }else if(msg.equals("Student Fee Form")){
        new StudentFeeForm().setVisible(true);
        
        } /*  
        else if(msg.equals("Notpad")){
            try{
                Runtime.getRuntime().exec("notepad.exe");
                
            }catch(Exception e ){}
        }else if(msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
                
            }catch(Exception e ){}
        }else if(msg.equals("Web Browser")){
            try{
                Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application.exe");
                
            }catch(Exception e ){}
         }*/
       
        else if(msg.equals("Exit")){
               System.exit(0);
               
         }else if(msg.equals("About Us")){
         new AboutUs().setVisible(true);
       // setVisible(false);
         
         }
        else if(msg.equals("Student Attendance")){
          new StudentAttendance().setVisible(true);
         
         }else if(msg.equals("Teacher Attendance")){
         new TeacherAttendance().setVisible(true);
         
         }   
         else if(msg.equals("Student Attendance Details")){
         new StudentAttendanceDetail().setVisible(true);
         
         }else if(msg.equals("Teacher Attendace Details")){
         new TeacherAttendanceDetail().setVisible(true);
         
         }
         else if(msg.equals("Examination Details")){
         new ExaminationDetails().setVisible(true);
         
         
         }else if(msg.equals("Enter Marks")){
         new EnterMarks().setVisible(true);
       
         
         
         }
       
      
        }
    
   
    public static void main(String[] args){
        new Project().setVisible(true);
       
    }
}

   
    
    
    

    
    
    

    
   
    
    
        
    
    
    
            
            
    
    
    
    
    
    

