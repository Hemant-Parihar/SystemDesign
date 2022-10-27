package com.hemant.test;

public class Main {
    public static void main(String[] args) {
        Human human = new Male();
        human.upperBody();

//        Female female = (Female) new Human();
//        female.upperBody();
        call();

        Human.call();
    }

    public void print(){
        call();
    }
    static void call() {
        System.out.println("In call");
    }
}
