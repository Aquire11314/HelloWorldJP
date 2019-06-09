package bean;

import org.springframework.stereotype.Component;

/**
 * @description
 * @author: yanghz
 * @create: 2019-06-09 15:06
 **/
public class User {
    private Long user_id;
    private String username;

    public User() {
    }

    public User(Long user_id, String username) {
        this.user_id = user_id;
        this.username = username;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
