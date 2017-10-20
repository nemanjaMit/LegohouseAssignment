package FunctionLayer;

import java.time.LocalDate;

public class Order {

    private int id;
    private int userId;
    private int length;
    private int width;
    private int height;
    private LocalDate receivedDate;
    
    private House house;

    public Order(int id, int userId, int length, int width, int height, LocalDate receivedDate) {
        this.id = id;
        this.userId = userId;
        this.length = length;
        this.width = width;
        this.height = height;
        this.receivedDate = receivedDate;
    }
    
    public Order(int userId, int length, int width, int height) { 
        this.userId = userId;
        this.length = length;
        this.width = width;
        this.height = height;
        this.receivedDate = LocalDate.now(); 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public LocalDate getReceivedDate() {
        return receivedDate;
    }

    public void setReceivedDate(LocalDate receivedDate) {
        this.receivedDate = receivedDate;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
    
}