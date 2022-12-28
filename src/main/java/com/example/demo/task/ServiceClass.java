package com.example.demo.task;

import org.springframework.stereotype.Service;

@Service
public class ServiceClass {


    public int getAnswer(String number) {

        int result = 0;
        for (int i=0;i<number.length();i++){
            int current = number.charAt(i)-'0';
            if(current>result){
                result = current;
            }
        }

        return result;
    }
}
