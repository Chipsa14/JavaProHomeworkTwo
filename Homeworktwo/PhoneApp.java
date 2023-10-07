package com.telran.org.Homework.Homeworktwo;

public class PhoneApp {
    public static void main(String[] args) {
        ButtonPhone buttonPhone = new ButtonPhone();
        buttonPhone.setPhoneName("ButtonPhone ");
        buttonPhone.setOwnNumber("3809499443");
//        buttonPhone.call("0966785784");
//        buttonPhone.receiveCall("0966785784");

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setPhoneName("SmartPhone");
        smartPhone.setOwnNumber("4958674932");

        RadioPhone radioPhone = new RadioPhone();
        radioPhone.setPhoneName("RadioPhone");
        radioPhone.setPhoneName("48029348584");

        makeCall(buttonPhone, "1122233344");
        receiveCall(buttonPhone, "3334567889");
        makeCall(smartPhone,"32425667897");
        receiveCall(smartPhone,"4568364585");
        makeCall(radioPhone,"86749202345");
        receiveCall(radioPhone,"4958694759");
    }

    public static void makeCall(Phone phone, String number) {
        phone.call(number);
    }

    public static void receiveCall(Phone phone, String number) {
        phone.receiveCall(number);
    }
}
