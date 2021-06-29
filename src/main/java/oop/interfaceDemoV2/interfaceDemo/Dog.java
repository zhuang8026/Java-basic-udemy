package oop.interfaceDemoV2.interfaceDemo;

import java.io.Serializable;

public abstract class Dog implements Animal, Person, Serializable {
    @Override
    public void makeSound() {
        System.out.println("汪汪123");
    }

    @Override
    public void speak() {
        System.out.println("汪汪旺財會講話");
    }

    public void test(){
        System.out.println("Dog（abstract）itself mrthods");
    }
}
