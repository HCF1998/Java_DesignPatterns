package com.javaDesignPattern.facadePattern.demo1;

public class test {
    public static void main(String[] args) {
        ClientServerFacade clientServerFacade = new ClientServerFacade("test about " +
                "facadePattern");
        clientServerFacade.doAdvertisement();
    }
}
