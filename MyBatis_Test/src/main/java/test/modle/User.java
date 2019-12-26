package main.java.test.modle;

import java.util.List;

public class User {
    private Integer user_id;
    private String user_name;
    private String user_password;
    private List<Order> orders;

    public User(){
        super();
    }
    public User(Integer user_id, String user_name, String user_password, List<Order> orders) {
        super();
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
        this.orders = orders;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", orders=" + orders +
                '}';
    }
}
