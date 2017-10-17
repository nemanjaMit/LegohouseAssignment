/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

import java.util.HashMap;


public class User {
    
    private int id;
    private String email;
    private String password;
    private String role;
    private final HashMap<String, Order> orderMap;

    public User(String email, String password, String role) {
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

    public Order getOrderFromMap(int id) {
        String key = Integer.toString(id);
        return this.orderMap.get(key);
    }
    
    public void putOrderInMap(Order order) {
        String key = Integer.toString(id);
        this.orderMap.put(key, order);
    }
    
    
    
    
    
}
