package com.l3.gl.controller;

import com.l3.gl.model.User;
import com.l3.gl.model.Product;
import com.l3.gl.view.Ui;

import javax.swing.*;

public class Controller {

    private Ui view;

    public Controller(Ui view) {
        this.view = view;

        view.getSubmitButton().addActionListener(e -> {
            try {
                User user = new User(
                        view.getUserName(),
                        view.getUserEmail()
                );

                Product product = new Product(
                        view.getProductName(),
                        view.getProductPrice()
                );

                JOptionPane.showMessageDialog(null,
                        "User Information:\n" +
                        "Name: " + user.getName() + "\n" +
                        "Email: " + user.getEmail() + "\n\n" +
                        "Product Information:\n" +
                        "Name: " + product.getName() + "\n" +
                        "Price: " + product.getPrice()
                );

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                        "Please enter valid data.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
