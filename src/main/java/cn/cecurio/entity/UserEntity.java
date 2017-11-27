package cn.cecurio.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Cecurio
 * @create: 2017-11-20 21:06
 **/
public class UserEntity {
    private Integer userId;
    private String username;

    @JsonIgnore
    private String passwd;

    @JsonFormat(pattern = "yyyy年MM月dd日 HH时mm分ss秒",timezone = "Asia/Shanghai")
    private Date createTime;

    @JsonProperty("isActive")
    private Boolean activeStatus;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @NotNull(message = "用户名不能为空")
    @Size(min = 4,max = 30,message = "用户名应该在4到30位之间")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NotNull(message = "密码不能为空")
    @Size(min = 4,max = 30,message = "密码应该在4到30位之间")
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
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
