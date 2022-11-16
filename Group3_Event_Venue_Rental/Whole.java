import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Whole
{
    public static void main(String[]args){
        menu();
    }
    static void menu()
    {
        JFrame menu = new JFrame("Main");
        menu.setLayout(null);
        menu.setVisible(true);
        menu.setSize(300,300);
        
        JLabel l1;
        JButton start,contactUs, exit,aboutUs;
        
        start = new JButton("Start");
        start.setBounds(80,60,100,20);
        menu.add(start);
        
        contactUs = new JButton("Contact Us");
        contactUs.setBounds(80,100,100,20);
        menu.add(contactUs);
        
        
        exit = new JButton("Exit");
        exit.setBounds(80,180,100,20);
        menu.add(exit);
        
        // addActionListener
        
        start.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                menu.setVisible(false);
                Form();
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
                menu.setVisible(false);
                
            }
        }); 

        
        
        l1 = new JLabel("Simple rental");
        l1.setFont(new Font("Rockwell", Font.BOLD, 30));
        l1.setBounds(20,10,200,40);
        menu.add(l1);
    }
    
    static void Form(){
        JFrame f1 = new JFrame("Form");
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setSize(900,500);
        
        JLabel LfstName,LsurName,Laddress,Lpostcode,Ltown,Lnumber;
        JTextField TcusID,TfstName,TsurName,Taddress,Tpostcode,Ttown,Tnumber;
        JButton ok , clear , exit;
        
        // Labels
        
        
        
        LfstName = new JLabel("First Name");
        LfstName.setBounds(20,40,200,30);
        
        LsurName = new JLabel("Surname  ");
        LsurName.setBounds(20,70,200,30);
        
        Laddress = new JLabel("Address  ");
        Laddress.setBounds(20,100,200,30);
        
        Lnumber= new JLabel("Cellphone #");
        Lnumber.setBounds(20,130,200,30);
        
        Lpostcode= new JLabel("Postal Code");
        Lpostcode.setBounds(20,160,200,30);
        
        
        
        // Text Fields
        

        TfstName = new JTextField("");
        TfstName.setBounds(100,45,100,20);
        
        TsurName = new JTextField("");
        TsurName.setBounds(100,75,100,20);        

        Taddress = new JTextField("");
        Taddress.setBounds(100,105,100,20);  
        
        Tnumber= new JTextField("");
        Tnumber.setBounds(100,135,100,20);
        
        Tpostcode= new JTextField("");
        Tpostcode.setBounds(100,165,100,20);
        
        // Buttons
        
        ok = new JButton("OK");
        ok.setBounds(10,220,60,20);
        
        clear= new JButton("Clear");
        clear.setBounds(100,220,70,20);
        
        exit= new JButton("Exit");
        exit.setBounds(200,220,60,20);
        

        // added in JFrame f1
        f1.add(LfstName);   f1.add(TfstName);
        f1.add(LsurName);   f1.add(TsurName);
        f1.add(Laddress);   f1.add(Taddress);
        f1.add(Lnumber);    f1.add(Tnumber);
        f1.add(Lpostcode);  f1.add(Tpostcode);
        
        f1.add(ok);
        f1.add(clear);
        f1.add(exit);
        
        
        ok.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if (TfstName.getText().equals("")||TsurName.getText().equals("")||Taddress.getText().equals("")||Tnumber.getText().equals("")||Tpostcode.getText().equals("")){
                    JOptionPane.showMessageDialog(f1,"Fill up the missing details.");
                }
                else{
                f1.setVisible(false);
                
            }
            }
        });
        
        clear.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                
                
                f1.setVisible(true);
                
            }
        }); 
        
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                f1.setVisible(false);
                
            }
        }); 
        
        
        
    }
    
    static void receipt(){
        JFrame rec = new JFrame("receipt");
        rec.setLayout(null);
        rec.setVisible(true);
        rec.setSize(300,300);
        
        JLabel Lrec;
        
        JTextField t1;
        
        Lrec = new JLabel("receipt:");
        Lrec.setBounds(10,20,100,30);
        rec.add(Lrec);
        
        t1 = new JTextField("customer ID: \n"+"First Name\n");
        t1.setBounds(10,50,150,150);
        rec.add(t1);
        
        
    }
    
}
    
// JLabel = label
//JLabel: setBounds(int x, int y, int width, int height) 

// JComboBox 
// JTextField

// JButton name = new JButton("name");