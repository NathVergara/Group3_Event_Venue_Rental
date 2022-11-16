import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Var extends JFrame
{
    // frame
    JFrame frame = new JFrame();
    
    
    //panel
    JPanel panel = new JPanel();
    
    // labels
    
    JLabel fname = new JLabel();
    JLabel sname = new JLabel();
    JLabel phone = new JLabel();
    JLabel age = new JLabel();
    JLabel given = new JLabel();
    JLabel in = new JLabel();
    JLabel out = new JLabel();
    JLabel choice = new JLabel();
    
    

    
    // text fields
    JTextField fname1 = new JTextField();
    JTextField sname1 = new JTextField();
    JTextField phone1 = new JTextField();
    JTextField age1 = new JTextField();
    
    JTextField choice1 = new JTextField();
    
    
    // buttons
    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JButton b3 = new JButton();
    JButton b4 = new JButton();
    JButton b5 = new JButton();
    
    JButton done = new JButton();
    JButton clear = new JButton();
    JButton exit = new JButton();    
    
    
    // year func
    String[] years = {"2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"};
    JComboBox year1 = new JComboBox(years);
    
    // months
    String[] mos = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    JComboBox mos1 = new JComboBox(mos);
    
    String[] days = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
        "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    JComboBox day1 = new JComboBox(days);
    
   
    
    
    
    String[] years1 = {"2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"};
    JComboBox year2 = new JComboBox(years1);
    
    
    
    String[] month1 = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    JComboBox mos2 = new JComboBox(month1);
    
    
    
    String[] days1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
        "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    JComboBox d2 = new JComboBox(days1);
    
    
    
    
    
    
    
    
}
