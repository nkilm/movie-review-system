package com.dsi.spring.model;

import org.springframework.stereotype.Component;

@Component
public class TotalUsersCount {

    private static TotalUsersCount t;
    private int count = 0;

    private TotalUsersCount(){

    }

    public static TotalUsersCount getInstance() {
        return t == null ?
                t = new TotalUsersCount() :
                t;
    }
    public void increment(){
        count++;
//        print();

    }
    public void decrement(){
        count--;
//        print();

    }
    public int showCount(){

        return count;
    }
}
