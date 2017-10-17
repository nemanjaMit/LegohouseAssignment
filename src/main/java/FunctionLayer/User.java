package FunctionLayer;

import java.util.HashMap;

public class User {
    
    private int id;
    private String email;
    private String password;
    private String role;    
    private final HashMap<String, Order> orderMap; 
    
    public User(int id, String email, String password, String role) { // When creating user Object when listing all users.
        this.id = id;
        this.email = email;
        this.password = password;
        this.role = role;
        this.orderMap = new HashMap<>();
    }

    public User(String email, String password, String role) { // When creating user as they register/login.
        this.email = email;
        this.password = password;
        this.role = role;
        this.orderMap = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public HashMap<String, Order> getOrderMap() {
        return orderMap;
    }

    public void putOrderIntoMap(Order order) {
        String key = Integer.toString(order.getId());                   
        this.orderMap.put(key, order);
    }

    public Order getOrderFromMap(int id) {
        String key = Integer.toString(id);    
        return this.orderMap.get(key);
    }
}