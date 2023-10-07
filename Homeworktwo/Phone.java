package com.telran.org.Homework.Homeworktwo;
public class Phone {
    String phoneName;
    public String getPhoneName() {
        return phoneName;
    }
    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void call(String number) {
        System.out.println(" try to make a call to number " + number);
    }

    public void receiveCall(String number) {
        System.out.println(" try to receive a call from number " + number);
    }
}
