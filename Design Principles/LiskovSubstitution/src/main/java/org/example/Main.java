package org.example;

public class Main {
    public static void main(String[] args) {
         //This works as expected
    Icat cat = new PetCat();
 cat.drinkMilk();
 cat.makeSound();

 //This violates Liskov principle
 Icat cat2 = new ToyCat();
// cat2.drinkMilk();
 cat2.makeSound();

    }
}