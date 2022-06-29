package com.training.people;

public class Woman extends Person {

    /**
     * конструктор задает состояние обьекту
     */
    private String name;

    public Woman(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello I am a woman");
    }
}
