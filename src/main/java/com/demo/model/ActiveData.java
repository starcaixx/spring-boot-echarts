package com.demo.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ActiveData {

    private Date date;
    private int activeCount;

    public String getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(date);
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getActiveCount() {
        return activeCount;
    }

    public void setActiveCount(int activeCount) {
        this.activeCount = activeCount;
    }
}
