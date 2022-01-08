import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class registration implements ActionListener {
    JFrame frame;
    String[] gender={"Male","Female"};
    JLabel nameLabel=new JLabel("NAME");
    JLabel genderLabel=new JLabel("GENDER");
    JLabel phonenumberLabel=new JLabel("PHONE NUMBER");
    JLabel passwordLabel=new JLabel("PASSWORD");
    JLabel confirmPasswordLabel=new JLabel("CONFIRM PASSWORD");
    JLabel cityLabel=new JLabel("CITY");
    JLabel emailLabel=new JLabel("EMAIL");
    JTextField nameTextField=new JTextField();
    JComboBox<String> genderComboBox=new JComboBox(gender);
    JTextField phoneTextField=new JTextField();
    JPasswordField passwordField=new JPasswordField();
    JPasswordField confirmPasswordField=new JPasswordField();
    JTextField cityTextField=new JTextField();
    JTextField emailTextField=new JTextField();
    JButton registerButton=new JButton("REGISTER");
    JButton resetButton=new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");


    registration()
    {
        createWindow();
        setLocationAndSize();
        addComponentsToFrame();
        actionEvent();
    }
    public void createWindow()
    {
        frame=new JFrame();
        frame.setTitle("Registration Form");
        frame.setBounds(40,40,380,600);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.getContentPane().setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
    }
    public void setLocationAndSize()
    {
        nameLabel.setBounds(20,20,40,70);
        genderLabel.setBounds(20,70,80,70);
        phonenumberLabel.setBounds(20,120,100,70);
        passwordLabel.setBounds(20,170,100,70);
        confirmPasswordLabel.setBounds(20,220,140,70);
        cityLabel.setBounds(20,288,100,70);
        emailLabel.setBounds(20,330,100,70);
        nameTextField.setBounds(180,43,165,23);
        genderComboBox.setBounds(180,93,165,23);
        phoneTextField.setBounds(180,143,165,23);
        passwordField.setBounds(180,193,165,23);
        showPassword.setBounds(180, 223, 165, 23);
        confirmPasswordField.setBounds(180,243,165,23);
        showPassword.setBounds(180, 273, 165, 23);
        cityTextField.setBounds(180,315,165,23);
        emailTextField.setBounds(180,353,165,23);
        registerButton.setBounds(70,400,100,35);
        resetButton.setBounds(220,400,100,35);
    }
    public void addComponentsToFrame()
    {
        frame.add(nameLabel);
        frame.add(genderLabel);
        frame.add(phonenumberLabel);
        frame.add(passwordLabel);
        frame.add(showPassword);
        frame.add(confirmPasswordLabel);
        frame.add(showPassword);
        frame.add(cityLabel);
        frame.add(emailLabel);
        frame.add(nameTextField);
        frame.add(genderComboBox);
        frame.add(phoneTextField);
        frame.add(passwordField);
        frame.add(confirmPasswordField);
        frame.add(cityTextField);
        frame.add(emailTextField);
        frame.add(registerButton);
        frame.add(resetButton);
    }
    public void actionEvent()
    {
       //Adding Action Listener to buttons
        registerButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	 //Coding Part of RESET button
        if (e.getSource() == resetButton) {
        	nameTextField.setText("");
        	phoneTextField.setText("");
            passwordField.setText("");
            confirmPasswordField.setText("");
            cityTextField.setText("");
            emailTextField.setText("");
        }
        
        //Coding Part of showPassword JCheckBox
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
                confirmPasswordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
                confirmPasswordField.setEchoChar('*');
            }


        }
    }
    
        public static void main(String[] args)
        {
            new registration();
        }
}