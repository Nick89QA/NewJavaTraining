package com.training;

import com.training.people.Man;
import com.training.people.Woman;

public class JavaApp {

    public static void main(String[] args) {
        Man ivan = new Man("Ivan");
        Man igor = new Man("Igor");
        Woman woman = new Woman ("Masha");

        igor.sayHello();
        igor.setName("Igor2");

        ivan.sayHello();
        woman.sayHello();

    }

}
