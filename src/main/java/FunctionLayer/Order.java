
package FunctionLayer;

import java.time.LocalDate;


public class Order {
    
    private int userid;
    private int length;
    private int width;
    private int height;
    private LocalDate recievedDate;
    private LocalDate shippedDate;
    
    private House house;

    public Order(int userid, int length, int width, int height) {
        this.userid = userid;
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public House getHouse() {
        return house;
    }
    public void setHouse(House house) {
        this.house = house;
    }   

    public LocalDate getRecievedDate() {
        return recievedDate;
    }

    public void setRecievedDate(LocalDate recievedDate) {
        this.recievedDate = recievedDate;
    }

    public LocalDate getShippedDate() {
        return shippedDate;
    }

    public void setShippedDate(LocalDate shippedDate) {
        this.shippedDate = shippedDate;
    }
    
    
}
