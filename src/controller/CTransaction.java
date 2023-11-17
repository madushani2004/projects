/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.MTransaction;

/**
 *
 * @author STZ
 */
public class CTransaction {

    public String getEmail(String cusName) {
        MTransaction mc = new MTransaction();
        return mc.getEmail(cusName);
    }

    public void saveTransaction(int imageID, String price, String customerName) {
        double priceInDouble =  Double.parseDouble(price.substring(1, price.length()));
        MTransaction mc = new MTransaction();
        mc.saveTransaction(imageID ,priceInDouble ,customerName);
        
    }
    
}
