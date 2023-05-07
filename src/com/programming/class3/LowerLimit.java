package com.programming.class3;

 

import java.util.ArrayList;
import java.util.List;
class Dis{}
class Animal extends Dis{}
class Dog extends Animal{}
class Buldog extends Dog{}
class Camel extends Animal{}

 

public class LowerLimit {

 

	//for lower bound
    static void addAnimal(List<? super Animal> list) {
        list.add(new Dog());
        list.add(new Buldog());
        list.add(new Camel());
        list.add(new Animal());
        
        for(Object obj: list) {
            System.out.println(obj + " "); //fetch the data - 
        }
    	System.out.println("addAnimal function");

    }
    
    // for upper bound  -  Upper Bounded Wild Card - add - not working for child class
    static void addAnimalUBW(List<? extends Animal> list) {
        //list.add(new Dog());
        //list.add(new Buldog());
        //list.add(new Camel());
        //list.add(new Animal());
    		
    	System.out.println("addAnimalUBW function");
    }
    /*
     * static void addAnimal2(List<? extends Animal> list) { list.add(new Dog());
     * list.add(new Buldog()); list.add(new Camel()); list.add(new Animal()); }
     */
    
    public static void main(String[] args) {
    List<Animal> animalList = new ArrayList<>();
    List<Dog> dogList = new ArrayList<>();
    List<Buldog> buldogList = new ArrayList<>();
    List<Camel> camelList = new ArrayList<>();
    List<Dis> disList = new ArrayList<>();
    
    animalList.add(new Animal());
    dogList.add(new Dog());
    buldogList.add(new Buldog());
    camelList.add(new Camel());
    disList.add(new Dis());
    
    addAnimal(animalList); //Works
    addAnimal(disList); //Works
    
    addAnimalUBW(dogList);
    addAnimalUBW(buldogList);
    addAnimalUBW(camelList);
//    addAnimalUBW(disList);
    addAnimalUBW(animalList);
    
    //addAnimal(dogList);
    //addAnimal(buldogList);
    //addAnimal(camelList);
    //addAnimal(animalList);
    //addAnimal(dogList);
    //addAnimal(buldogList);
    
    
    }
}