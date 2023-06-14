package org.example;

public class Main {
    public static void main(String[] args) {
       MovieMaker moviemaker = new MovieMaker();
       moviemaker.startMovieHiring(new Actor());
        moviemaker.startMovieHiring(new Actress());
        moviemaker.startMovieHiring(new Producer());
        moviemaker.startMovieHiring(new Director());

    }
}