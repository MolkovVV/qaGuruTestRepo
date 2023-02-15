package org.qaGuru;

public class Main {
    private String message = "Hello world!";
    public void printMessage(){
        System.out.println(message);
    }
    public static void main(String[] args) {
        new Main().printMessage();
    }
}