package com.welcome;

public class Hello {
    private String name;
    public String setupName(String name){
        return this.name = name;
    }

    public void welcome(){
        System.out.println("Hello, " + setupName(name));
    }

    public void byeBuy(){
        System.out.println("Bye, " + setupName(name));
    }
}
