package org.example;

public class PetCat implements ILivingCat {

    @Override
    public void drinkMilk() {
        System.out.println("drinking more milk");
    }

    @Override
    public void makeSound() {
        System.out.println("makes meow sound");
    }
}
