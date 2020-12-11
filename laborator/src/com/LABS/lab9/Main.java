package com.LABS.lab9;

import javax.swing.*;
import java.awt.*;


public class Main {

    private static JTextField numeratorField;
    private static JTextField denominatorField;
    private static JLabel result;
    private static JLabel errorMessage;

    public static boolean corectParsing(JTextField txt){
        try{
            float temp= Float.parseFloat(txt.getText());
            return false;
        }catch(NumberFormatException nfe){
            return true;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Division Calculator");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setResizable(true);
        frame.getContentPane().setBackground(Color.white);

        JLabel text = new JLabel("Division Calculator");
        text.setFont(new Font("Arial Black",Font.CENTER_BASELINE,15));
        text.setBounds(150,80,250,30);
        text.setForeground(Color.BLACK);
        frame.getContentPane().add(text);

        numeratorField = new JTextField();
        numeratorField.setBounds(240,135,150,20);
        frame.getContentPane().add(numeratorField);

        denominatorField = new JTextField();
        denominatorField.setBounds(240,185,150,20);
        frame.getContentPane().add(denominatorField);

        JLabel numeratorText = new JLabel("Numerator:");
        numeratorText.setBounds(70,140,120,20);
        numeratorText.setFont(new Font("Arial Black",Font.PLAIN,12));
        numeratorText.setForeground(Color.BLACK);
        frame.getContentPane().add(numeratorText);

        JLabel denominatorText = new JLabel("Denominator:");
        denominatorText.setBounds(70,190,120,20);
        denominatorText.setFont(new Font("Arial Black",Font.PLAIN,12));
        denominatorText.setForeground(Color.BLACK);
        frame.getContentPane().add(denominatorText);

        result = new JLabel("Result:");
        result.setBounds(70,240,200,20);
        result.setFont(new Font("Arial Black",Font.PLAIN,12));
        result.setForeground(Color.BLACK);
        frame.getContentPane().add(result);

        errorMessage = new JLabel();
        errorMessage.setBounds(70,265,480,20);
        errorMessage.setFont(new Font("Arial Black",Font.PLAIN,12));
        errorMessage.setForeground(Color.black);
        frame.getContentPane().add(errorMessage);

        JButton btnresult = new JButton("Division");
        btnresult.setBounds(240,290,100,30);
        btnresult.addActionListener(e -> {
            try {
                errorMessage.setText("");

                float nr1 =  Float.parseFloat(numeratorField.getText());
                float nr2 = Float.parseFloat(denominatorField.getText());

                if (nr2 == 13) {
                    throw new UnluckyException();
                }
                if (nr2 == 0){
                    throw new ArithmeticException();
                }
                float res = nr1 / nr2;
                result.setText(String.format("Result: %.9f", res));


            } catch(NullPointerException npe) {
                errorMessage.setText("\nInsert the values");

            } catch (NumberFormatException nfe) {
                if(corectParsing(numeratorField)) {
                    errorMessage.setText("\nIncorrect value for numerator");
                }
                if(corectParsing(denominatorField)) {
                    errorMessage.setText("\nIncorrect value for denominator");
                }
                if(corectParsing(numeratorField) && corectParsing(denominatorField)){
                    errorMessage.setText("\nIncorrect values for both fields");
                }


            } catch (ArithmeticException ae) {
                errorMessage.setText("\nCan't divide by 0");

            } catch (UnluckyException ue) {
                errorMessage.setText("\nDon't divide by 13, it's unlucky");
            }


        });

        frame.getContentPane().add(btnresult);
        frame.setVisible(true);

    }
}