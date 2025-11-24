package com.java.concurency;

public class adfd {
    protected Object object = null;

    public synchronized void setObject(Object object) {
        this.object = object;
    }

    public synchronized Object getObject() {
        return this.object;
    }

    public void setObj(Object o) {
        synchronized (this) {
            this.object = o;
        }
    }

    public Object getObj() {
        synchronized (this) {
            return this.object;
        }
    }
}
