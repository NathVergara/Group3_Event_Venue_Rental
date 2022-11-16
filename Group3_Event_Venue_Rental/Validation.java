import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Validation extends Form
{
    public Validation(){
        JFrame f = new JFrame("Validation");
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(300,300);
        
        JLabel label;
        JButton yes, no;
        
        label = new JLabel("Do you wish to continue?");
        label.setBounds(60,50,200,20);
        
        yes = new JButton("YES");
        yes.setBounds(50,100,80,30);
        
        
        yes.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Form a = new Form();
                f.setVisible(false);
                a.show();
            } 
        });
        
        
        no = new JButton("NO");
        no.setBounds(150,100,80,30);
        
        no.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                System.exit(0); 
                
            } 
        });
        
        
        
        
        f.add(label);
        f.add(yes);
        f.add(no);
    }
}