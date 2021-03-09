package com.epam.rd.autocode.hashtableopen816;

public class ListNode {
    private Integer key;
    private Object value;
    private boolean isRemoved;

    public void markedAsRemoved() {
        isRemoved = true;
    }

    public boolean notMarkedAsRemoved() {
        return !isRemoved;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return key.toString();
    }
}