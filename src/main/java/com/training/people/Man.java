package com.training.people;

public class Man extends Person{
    /**
     *геттер возвращает
     * сеттер перезаписывает
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Реализовали абстрактный метод класса Person
     */

    private String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello I am a " + name);
    }
}