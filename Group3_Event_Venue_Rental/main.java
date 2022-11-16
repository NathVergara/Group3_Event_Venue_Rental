import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class main
{
   public static void main(String[]args){
        menu();

    }
    static void menu()
    {
        JFrame menu = new JFrame("home");
        menu.setLayout(null);
        menu.setVisible(true);
        menu.setSize(290,280);
        
        JLabel l1;
        JButton start,contactUs, exit,aboutUs;
        
        start = new JButton("Start");
        start.setBounds(80,60,100,20);
        menu.add(start);
        
        contactUs = new JButton("Contact Us");
        contactUs.setBounds(80,100,100,20);
        menu.add(contactUs);
        
        
        exit = new JButton("Exit");
        exit.setBounds(80,140,100,20);
        menu.add(exit);
        
        // addActionListener
        
        start.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                menu.setVisible(false);
                Validation v = new Validation();
                
            }
        }); 
        
        contactUs.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(menu,"Contact Us: 09491898200\n"+ "Email Us: 123gmail.com");
                menu.setVisible(true);
                
            }
        }); 
        
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0); 
                
            }
        }); 

        
        
        l1 = new JLabel("CNC Rentals");
        l1.setFont(new Font("Rockwell", Font.BOLD, 30));
        l1.setBounds(40,10,200,40);
        menu.add(l1);
    }
}
