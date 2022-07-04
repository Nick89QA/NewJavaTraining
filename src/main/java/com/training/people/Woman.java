package com.training.people;

public class Woman extends Person {

    /**
     * конструктор задает состояние обьекту
     */

     public Woman() {
         super();
     }

    public Woman(String name) {
        super(name);
    }

//    public String getAge() {
//        return age;
//    }
//
//    public void setAge(String age) {
//        this.age = age;
//    }
//
//    public Woman(String name) {
//        this.name = name;
//    }

    @Override
    public void sayHello() {
        System.out.println("Hello I am a woman");
    }
}
