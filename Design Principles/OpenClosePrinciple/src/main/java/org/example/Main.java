package org.example;

public class Main {
    public static void main(String[] args) {
      AnimalFeeder animalFeeder = new AnimalFeeder();
      animalFeeder.feedAnimal(new Cat());
      animalFeeder.feedAnimal(new Dog());


    }
}