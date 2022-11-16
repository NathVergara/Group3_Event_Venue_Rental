import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Form extends Var{
    public Form(){
        setTitle("Rental Information");
        setSize(700,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        panel.setBounds(0,0,700,400);
        panel.setLayout(null);
        add(panel);
        
        // firstname
        
        fname.setText("First Name");
        fname.setBounds(20,40,200,30);
        panel.add(fname);
        
        fname1.setText("");
        fname1.setBounds(100,40,200,25);
        panel.add(fname1);
        
        // surname
        sname.setText("Last Name");
        sname.setBounds(20,80,200,30);
        panel.add(sname);
        
        sname1.setText("");
        sname1.setBounds(100,80,200,25);
        panel.add(sname1);
        
        // age 
        age.setText("Age ");
        age.setBounds(20,120,200,30);
        panel.add(age);
        
        age1.setText("");
        age1.setBounds(100,120,200,25);
        panel.add(age1);

        
        // phone 
        phone.setText("Contact No.");
        phone.setBounds(20,160,200,30);
        panel.add(phone);
        
        phone1.setText("");
        phone1.setBounds(100,160,200,25);
        panel.add(phone1);
        
        choice.setText("Enter Selected Venue:");
        choice.setBounds(500,200,200,25);
        panel.add(choice);
        
        choice1.setText("");
        choice1.setBounds(500,225,100,25);
        panel.add(choice1);
        
        
        //check in
        in.setText("Check-in (mm/dd/yyyy)");
        in.setBounds(20,200,200,30);
        panel.add(in);
        
        //check out
        out.setText("Check-out (mm/dd/yyyy)");
        out.setBounds(20,240,200,30);
        panel.add(out);
        
        //combo box column 1
        year1.setBounds(400,200,80,30);
        panel.add(year1);
        
        day1.setBounds(300,200,80,30);
        panel.add(day1);
        
        mos1.setBounds(200,200,80,30);
        panel.add(mos1);
        
        
        // combo box column 2
        year2.setBounds(400,240,80,30);
        panel.add(year2);
        
        d2.setBounds(300,240,80,30);
        panel.add(d2);
        
        mos2.setBounds(200,240,80,30);
        panel.add(mos2);
        
        
        // rental
        
        given.setText("Given: ");
        given.setBounds(400,10,200,30);
        panel.add(given);
        
        
        // venue buttons 
        
        b1.setText("Venue 1");
        b1.setBounds(400,50,100,35);
        panel.add(b1);
        
        b2.setText("Venue 2");
        b2.setBounds(400,100,100,30);
        panel.add(b2);
        
        b3.setText("Venue 3");
        b3.setBounds(400,150,100,30);
        panel.add(b3);
        
        b4.setText("Venue 4");
        b4.setBounds(550,70,100,30);
        panel.add(b4);
        
        b5.setText("Venue 5");
        b5.setBounds(550,120,100,30);
        panel.add(b5);
        
        done.setText("DONE");
        done.setBounds(50,300,100,30);
        panel.add(done);
        
        clear.setText("CLEAR");
        clear.setBounds(250,300,100,30);
        panel.add(clear);
        
        exit.setText("EXIT");
        exit.setBounds(450,300,100,30);
        panel.add(exit);
        
        done.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (fname1.getText().equals("")||sname1.getText().equals("")||age1.getText().equals("")||phone1.getText().equals("")||choice1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(frame,"Fill up the missing details.");
                }
                doneActionPerformed(e);
            }
        }); 
        
        clear.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                fname1.setText("");
                sname1.setText("");
                phone1.setText("");
                age1.setText("");
                choice1.setText("");
                
            }
        }); 
        
        exit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        }); 
        
                
        b1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                b1ActionPerformed(e);    
            }
        }); 
        
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                b2ActionPerformed(e);    
            }
        }); 
        
        b3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                b3ActionPerformed(e);    
            }
        }); 
        
        b4.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                b4ActionPerformed(e);    
            }
        }); 
        
        b5.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                b5ActionPerformed(e);    
            }
        }); 
       
        
    }
    
    ///// action performed ///
    
    private void b1ActionPerformed(ActionEvent e)
    {
        ImageIcon b1 = new ImageIcon("one.png");
        
            JOptionPane.showMessageDialog(null,"Capacity : 50-150 pax"  +  
            "\nType : Function Hall with Swimming Pool" +  
            "\nServices: Basic Sound System, Unlimited hours of air conditioning system , food catering" + 
            "\nRental rate: 110,000 per night " + 
            "\n" +
            "\n Enter 'V1' if you want to rent this place.","Venue Information",
            JOptionPane.INFORMATION_MESSAGE,b1);
        
        
        
        
    }
    
    private void b2ActionPerformed(ActionEvent e)
    {
        ImageIcon b2 = new ImageIcon("two.png");
        
            JOptionPane.showMessageDialog(null,"Capacity : 50-100 pax"  +  
            "\nType : Function Hall " +  
            "\nServices: Food Catering, Lights and Sound System, Fully Air Conditioned" + 
            "\nRental rate: 50,000 per night " + 
            "\n" +
            "\n Enter 'V2' if you want to rent this place.","Venue Information",
            JOptionPane.INFORMATION_MESSAGE,b2);
        
        
        
        
    }
    
    private void b3ActionPerformed(ActionEvent e)
    {
        ImageIcon b3 = new ImageIcon("three.png");
        
            JOptionPane.showMessageDialog(null,"Capacity : 40-60 pax"  +  
            "\nType : Function Hall " +  
            "\nServices: Basic Sound System, Unlimited hours of air conditioning system" + 
            "\nRental rate: 40,000 per night " + 
            "\n" +
            "\n Enter 'V3' if you want to rent this place.","Venue Information",
            JOptionPane.INFORMATION_MESSAGE,b3);
        
        
        
        
    }
    
    private void b4ActionPerformed(ActionEvent e)
    {
        ImageIcon b4 = new ImageIcon("four.png");
        
            JOptionPane.showMessageDialog(null,"Capacity : 100-150 pax"  +  
            "\nType : Function Hall with Swimming Pool" +  
            "\nServices: Basic Sound System, Fully air conditioned, and Food Catering" + 
            "\nRental rate: 220,000 per night " + 
            "\n" +
            "\n Enter 'V4' if you want to rent this place.","Venue Information",
            JOptionPane.INFORMATION_MESSAGE,b4);
        
        
        
        
    }
    
    private void b5ActionPerformed(ActionEvent e)
    {
        ImageIcon b5 = new ImageIcon("five.png");
        
            JOptionPane.showMessageDialog(null,"Capacity : 200 pax"  +  
            "\nType : Function Hall with Swimming Pool" +  
            "\nServices: Solid Sound System, Unlimited hours of air conditioning system" + 
            "\nRental rate: 400,000 per night " + 
            "\n" +
            "\n Enter 'V5' if you want to rent this place.","Venue Information",
            JOptionPane.INFORMATION_MESSAGE,b5);
        
        
        
        
    }
    
    private void doneActionPerformed(ActionEvent e)
    {
        
        String y1 = (String)year1.getSelectedItem();
        String y2 = (String)year2.getSelectedItem();
        
        String m1 = (String)mos1.getSelectedItem();
        String m2 = (String)mos2.getSelectedItem();
        
        String d1 = (String)day1.getSelectedItem();
        String d22 = (String)d2.getSelectedItem();
        
        //"Check-in date: "+ m1 + " " + d1 + ", " + y1 
        //"Check-in date: "+ m2 + " " + d22 + ", " + y2 
        
        if(choice1.getText().equals ("V1"))
        {
            ImageIcon b1 = new ImageIcon("one.png");
            int a = 110000;
            JOptionPane.showMessageDialog(frame,"Customer's Information"  + "\nName : " + fname1.getText() 
               +" "+ sname1.getText() + "\nAge : " + age1.getText() + 
                "\nPhone Number : " + phone1.getText() + "\nCapacity: 50 - 150 person" + "\nServices: "+ "\nRate per night: "+ a +"\nCheck-in date: "+ m1 + " " + d1 + ", " + y1 +"\nCheck-out date: "+ m2 + " " + d22 + ", " + y2  ,"Receipt:",
            JOptionPane.INFORMATION_MESSAGE,b1);
            
            
        }
        
        if(choice1.getText().equals ("V2"))
        {
            ImageIcon b2 = new ImageIcon("two.png");
            int a = 50000;
            JOptionPane.showMessageDialog(frame,"Customer's Information"  + "\nName : " + fname1.getText() 
               +" "+ sname1.getText() + "\nAge : " + age1.getText() + 
                "\nPhone Number : " + phone1.getText() + "\nCapacity: 50 - 150 person" + "\nServices: "+ "\nRate per night: "+ a  ,"Receipt:"
            +"\nCheck-in date: "+ m1 + " " + d1 + ", " + y1 +"\nCheck-out date: "+ m2 + " " + d22 + ", " + y2 ,
            JOptionPane.INFORMATION_MESSAGE,b2);
            
            
        }
        
        if(choice1.getText().equals ("V3"))
        {
            ImageIcon b3 = new ImageIcon("three.png");
            int a = 40000;
            JOptionPane.showMessageDialog(frame,"Customer's Information"  + "\nName : " + fname1.getText() 
               +" "+ sname1.getText() + "\nAge : " + age1.getText() + 
                "\nPhone Number : " + phone1.getText() + "\nCapacity: 50 - 150 person" + "\nServices: Basic Sound System, Unlimited hours of air conditioning system "+ "\nRate per night: "+ a 
                +"\nCheck-in date: "+ m1 + " " + d1 + ", " + y1 +"\nCheck-out date: "+ m2 + " " + d22 + ", " + y2 ,"Receipt:",
            JOptionPane.INFORMATION_MESSAGE,b3);
            
            
        }
        
        if(choice1.getText().equals ("V4"))
        {
            ImageIcon b4 = new ImageIcon("three.png");
            int a = 220000;
            JOptionPane.showMessageDialog(frame,"Customer's Information"  + "\nName : " + fname1.getText() 
               +" "+ sname1.getText() + "\nAge : " + age1.getText() + 
                "\nPhone Number : " + phone1.getText() + "\nCapacity: 50 - 150 person" + "\nServices: Basic Sound System, Unlimited hours of air conditioning system "+ "\nRate per night: "+ a 
                +"\nCheck-in date: "+ m1 + " " + d1 + ", " + y1 +"\nCheck-out date: "+ m2 + " " + d22 + ", " + y2 ,"Receipt:",
            JOptionPane.INFORMATION_MESSAGE,b4);
            
            
        }
        
        if(choice1.getText().equals ("V5"))
        {
            ImageIcon b5 = new ImageIcon("three.png");
            int a = 400000;
            JOptionPane.showMessageDialog(frame,"Customer's Information"  + "\nName : " + fname1.getText() 
               +" "+ sname1.getText() + "\nAge : " + age1.getText() + 
                "\nPhone Number : " + phone1.getText() + "\nCapacity: 50 - 150 person" + "\nServices: Basic Sound System, Unlimited hours of air conditioning system "+ "\nRate per night: "+ a 
                +"\nCheck-in date: "+ m1 + " " + d1 + ", " + y1 +"\nCheck-out date: "+ m2 + " " + d22 + ", " + y2 ,"Receipt:",
            JOptionPane.INFORMATION_MESSAGE,b5);
            
            
        }
        
        
    }
    
    
    
    
    public static void main(String[]args){
        Form f = new Form();
        f.setVisible(true);
    }
}
