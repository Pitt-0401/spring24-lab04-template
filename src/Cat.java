/*
 * Created 2024-02-04
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

public class Cat {
    private String name;
    private int age;
    private boolean isHungry = true;

    // TODO: refactor your code
    private String funnyStory;
    private String owner;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Cat(String name, int age, String owner, String funnyStory) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.funnyStory = funnyStory;
    }

    // Getters & setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public String getFunnyStory() {
        return funnyStory;
    }

    public void printMeow(String meow) {
        System.out.println(meow);
    }

    // Main behavior
    public void feed() {
        this.isHungry = false;
    }

    // TODO: implement a method that lets an owner adopt a cat

}
