package com.org.project.coreJava;

/**
 * Created by rajender.koyyeda on 21-02-2022.
 */
public class SuperKeyWordExample {
    String color="white"; //var

    void eat(){System.out.println("eating...");}  //method

    SuperKeyWordExample(){System.out.println("SuperKeyWordExample is created");}  //constructor

}
class Dog extends SuperKeyWordExample{
    String color="black";
    void printColor(){
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }

    void eat(){System.out.println("eating bread...");} //method
    void bark(){System.out.println("barking...");}
    void work(){
        super.eat(); //method
        bark();
    }

    Dog(){
        super(); //paraent class constructor
        System.out.println("dog is created");
    }

}
class TestSuper1{
    public static void main(String args[]){
        Dog d=new Dog();
        d.printColor();

        d.work();
    }
}
