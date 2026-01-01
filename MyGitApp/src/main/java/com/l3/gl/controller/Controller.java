package com.l3.gl.controller;

import com.l3.gl.model.User;
import java.util.ArrayList;
import java.util.List;
import com.l3.gl.model.Product;
import com.l3.gl.view.Ui;

import javax.swing.*;

public class Controller {

    private Ui view;
    public Ui getView() {
        return view;
    }

    public void setView(Ui view) {
        this.view = view;
    }

    private List<Product>productliste=new ArrayList<>();
    private List<User>Userlist=new ArrayList<>();

    public Controller(Ui view) {
        this.view = view;

        view.getSubmitButton().addActionListener(e -> {
            try {
                User user = new User(
                        view.getUserName(),
                        view.getUserEmail()
                );
                Userlist.add(user);

                Product product = new Product(
                        view.getProductName(),
                        view.getProductPrice()
                );
                productliste.add(product);

                JOptionPane.showMessageDialog(null,
                        "User Information:\n" +
                        "Name: " + user.getName() + "\n" +
                        "Email: " + user.getEmail() + "\n\n" +
                        "Product Information:\n" +
                        "Name: " + product.getName() + "\n" +
                        "Price: " + product.getPrice()
                );
                view.clearFields();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,
                        "Please enter valid data.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        });
        view.getlisteButton().addActionListener(e -> {

            if (productliste.isEmpty()||Userlist.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No products available.");
                return;
            }

            StringBuilder message = new StringBuilder("Users & Products List:\n\n");

            message.append("  User     |")
                   .append("  email    |")
                   .append("  Product  |")
                   .append("  Price  ")
                   .append("\n--------------------------------------------------------\n");

            for (int i = 0; i < productliste.size(); i++) {
                User u = Userlist.get(i);
                Product p = productliste.get(i);
         message.append(" ")
                .append(u.getName())
                .append("   |  ")
                .append(u.getEmail())
                .append("   |  ")
                .append(p.getName())
                .append("   |  ")
                .append(p.getPrice())
                .append("\n\n");
     }            
            JOptionPane.showMessageDialog(null, message.toString());
        });



}}

