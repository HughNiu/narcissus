package com.red.domain;

/**
 * Created by Niu Qianghong on 2017-09-06 0006.
 */
public class ExpenseInfo {
    private Long expenseId;
    private Integer userId; // 消费用户id
    private Integer amount; // 消费金额, 以分为单位
    private Integer type; // 消费类型
    private String content; // 消费具体内容
    private Integer shameLevel; // 腐败程度
    private Long createTime; // 消费产生时间

    public Long getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Long expenseId) {
        this.expenseId = expenseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getShameLevel() {
        return shameLevel;
    }

    public void setShameLevel(Integer shameLevel) {
        this.shameLevel = shameLevel;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ExpenseInfo{" +
                "expenseId=" + expenseId +
                ", userId=" + userId +
                ", amount=" + amount +
                ", type=" + type +
                ", content='" + content + '\'' +
                ", shameLevel=" + shameLevel +
                ", createTime=" + createTime +
                '}';
    }
}
