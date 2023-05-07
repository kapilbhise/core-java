package com.programming.class1;

 
// inheritance
class Parent{
    
    int data = 10;
    
    void show() {
        System.out.println("show - Parent Class");
    }
    
    void message() {
        System.out.println("Message - Parent class");
    }
}

 

class Child extends Parent{
    
    int data = 15;
    @Override
    void show() {
        data = 20; //inheriting the property
        System.out.println("show - Child Class");
        message(); 
    }
    
    void message() { 
        System.out.println("Message - Child Class"); 
    }
     
}

 

public class LetsSeeHowInheritanceWorks {
 
    public static void main(String[] args) {
        Parent obj = new Parent();
        System.out.println(obj.data); //10
        obj.show(); // Parent class
        
        Child obj2 = new Child();
        System.out.println(obj2.data); //15
        obj2.show(); //Child 
        System.out.println(obj2.data); //20
        obj2.message();
        
        //3rd way
    }

 

}
 