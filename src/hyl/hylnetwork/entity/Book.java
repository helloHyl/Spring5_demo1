package hyl.hylnetwork.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Book {
//        @Value(value = "james")
    private String username;
//        @Value(value = "1")
    private  String userId;
//        @Value(value = "work")
    private  String ustatus;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "username='" + username + '\'' +
                ", userId='" + userId + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }
}
