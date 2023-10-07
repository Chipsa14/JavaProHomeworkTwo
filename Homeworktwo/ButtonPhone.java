package com.telran.org.Homework.Homeworktwo;

public class ButtonPhone extends Phone {
    private String ownNumber;
    public String getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    @Override
    public void call(String number) {
        System.out.println("The number " + getPhoneName() + " " + ownNumber);
        super.call(number);
    }
    @Override
    public void receiveCall(String number) {
        System.out.println("The Phone " + getPhoneName() + " " + ownNumber);
        super.receiveCall(number);
    }
}
