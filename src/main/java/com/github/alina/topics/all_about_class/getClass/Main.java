package com.github.alina.topics.all_about_class.getClass;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        // Obținerea clasei obiectului `dog`
        Class<?> dogClass= dog.getClass();
        // Afișarea informațiilor despre clasă
        System.out.println("Class of dog object: +" + dogClass.getName());
        // Verificarea dacă obiectul `dog` este o instanță a clasei `Animal`
        boolean isAnimal = Animal.class.isAssignableFrom(dogClass);
    }
}
