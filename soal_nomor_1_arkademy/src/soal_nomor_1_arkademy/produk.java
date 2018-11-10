/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_nomor_1_arkademy;

public class produk {

    String id, itemName;
    int price = 0;
    boolean freeShipping;
    availableColorAndSize availableColorAndSize;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(boolean freeShipping) {
        this.freeShipping = freeShipping;
    }

    public availableColorAndSize getAvailableColorAndSize() {
        return availableColorAndSize;
    }

    public void setAvailableColorAndSize(availableColorAndSize availableColorAndSize) {
        this.availableColorAndSize = availableColorAndSize;
    }



}

class availableColorAndSize {

    String color, size;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
