package cn.cecurio.entity;

import java.sql.Clob;
import java.util.Date;

public class SsmMessage {
    private Integer messageId;

    private String messageTitle;

    private Boolean activeStatus;

    private Date createTime;

    private Date lastModifyTime;

    private Clob messageBody;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle == null ? null : messageTitle.trim();
    }

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Clob getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(Clob messageBody) {
        this.messageBody = messageBody;
    }
}