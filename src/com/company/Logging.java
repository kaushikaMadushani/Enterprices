package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Logging implements ActionListener {

    private static JLabel userLabel;
    private static JLabel paswrdLabel;
    private static JTextField userTxt;
    private static JPasswordField paswrdTxt;
    private static JButton logButton;
    private static JLabel logLabel;
    private static JLabel welcomeLb;
    private static JLabel positionLb;


    public void log(){
        JFrame frame=new JFrame();
        JPanel panl=new JPanel();

        userLabel=new JLabel("User Name");
        paswrdLabel =new JLabel("Password");
        logLabel=new JLabel("");

        userTxt=new JTextField();
        paswrdTxt=new JPasswordField();

        logButton=new JButton("Login");
        logButton.addActionListener(new Logging());

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panl);

        panl.setLayout(null);

        userLabel.setBounds(10,20,80,25);
        paswrdLabel.setBounds(10,50,80,25);
        logLabel.setBounds(10,140,250,25);

        userTxt.setBounds(100,20,165,25);
        paswrdTxt.setBounds(100,50,165,25);

        logButton.setBounds(110,100,80,25);

        panl.add(userLabel);
        panl.add(paswrdLabel);
        panl.add(logLabel);

        panl.add(userTxt);
        panl.add(paswrdTxt);

        panl.add(logButton);


    }
    public void authentication(){
        JFrame frame=new JFrame();
        JPanel panl=new JPanel();

        welcomeLb=new JLabel("Welcome to the Sasanga Enterprices");
        positionLb=new JLabel("Choose your position");

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panl);

        panl.setLayout(null);

        welcomeLb.setBounds(30,20,200,50);
        positionLb.setBounds(10,40,100,25);

        panl.add(welcomeLb);
        panl.add(positionLb);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user=userTxt.getText();
        String paswrd=paswrdTxt.getText();

            if(user.equals("kaushi") && paswrd.equals("1234")){
                logLabel.setText("Logging Successfully");//should be linked with sql
                    }
           else if (user.equals("kaushi") && !paswrd.equals("1234")){
               logLabel.setText("Your password is incorrect");
               paswrdTxt.setText(null);
            }
            else{
                logLabel.setText("Please enter your details again");
                paswrdTxt.setText(null);
                userTxt.setText(null);
           }
    }
}
