package com.l3.gl.view;

import javax.swing.*;
import java.awt.*;

public class Ui {

    private JFrame frame;

    private JTextField userNameField;
    private JTextField userEmailField;

    private JTextField productNameField;
    private JTextField productPriceField;

    private JButton submitButton;
    private JButton listeButton;


    public Ui() {
        frame = new JFrame("Product App");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 5, 5));

        panel.add(new JLabel("User Name:"));
        userNameField = new JTextField();
        panel.add(userNameField);

        panel.add(new JLabel("User Email:"));
        userEmailField = new JTextField();
        panel.add(userEmailField);

        panel.add(new JLabel("Product Name:"));
        productNameField = new JTextField();
        panel.add(productNameField);

        panel.add(new JLabel("Product Price:"));
        productPriceField = new JTextField();
        panel.add(productPriceField);

        submitButton = new JButton("Submit");
        panel.add(new JLabel()); // empty cell
        panel.add(submitButton);

        listeButton = new JButton("Show liste");
        panel.add(new JLabel()); // empty cell
        panel.add(listeButton);

        frame.add(panel);
    }

    public void show() {
        frame.setVisible(true);
    }

    public String getUserName() {
        return userNameField.getText();
    }

    public String getUserEmail() {
        return userEmailField.getText();
    }

    public String getProductName() {
        return productNameField.getText();
    }

    public double getProductPrice() {
        return Double.parseDouble(productPriceField.getText());
    }

    public JButton getSubmitButton() {
        return submitButton;
    }
    public JButton getlisteButton() {
        return listeButton;
    }
    public void clearFields() {
        userNameField.setText("");
        userEmailField.setText("");
        productNameField.setText("");
        productPriceField.setText("");
    }


public static void main(String[] args) {
    Ui ui = new Ui();
    new com.l3.gl.controller.Controller(ui);
    ui.show();
}}
