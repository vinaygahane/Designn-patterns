package org.example;

public class ToyCat implements Icat {

    @Override
    public void drinkMilk() {
        throw new RuntimeException("Cannot drinkMilk");
    }

    @Override
    public void makeSound() {
        System.out.println("makes mechanical meow sound");
    }
}
