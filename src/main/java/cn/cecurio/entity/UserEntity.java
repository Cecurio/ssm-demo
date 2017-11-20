package cn.cecurio.entity;

/**
 * @author: Cecurio
 * @create: 2017-11-20 21:06
 **/
public class UserEntity {
    private Integer userId;
    private String username;
    private String passwd;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
            "userId=" + userId +
            ", username='" + username + '\'' +
            ", passwd='" + passwd + '\'' +
            '}';
    }
}
