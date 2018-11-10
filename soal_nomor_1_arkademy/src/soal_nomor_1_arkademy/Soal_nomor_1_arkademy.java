/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_nomor_1_arkademy;

import com.google.gson.Gson;

public class Soal_nomor_1_arkademy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Gson gson = new Gson();
            
            produk pr = new produk();
            
            pr.setId("12341822");
            pr.setItemName("basic t-shirt");
            pr.setFreeShipping(true);
            pr.setPrice(70000);
            availableColorAndSize cz = new availableColorAndSize();
            cz.setColor("Red");
            cz.setSize("M");
            pr.setAvailableColorAndSize(cz);
            
            String ret = gson.toJson(pr);
            System.out.println("ret "+ret);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        

    }
    
}
