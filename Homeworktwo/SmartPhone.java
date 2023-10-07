package com.telran.org.Homework.Homeworktwo;

public class SmartPhone extends Phone {
    private String ownNumber;
    public String getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public void call(String number) {
        System.out.println("The number " + getPhoneName() + " try to make a call to number " + ownNumber);
        super.call(number);
    }

    @Override
    public void receiveCall(String number) {
        System.out.println("The Phone " + getPhoneName() + " try to receive a call from number " + ownNumber);
        super.receiveCall(number);
    }
}
