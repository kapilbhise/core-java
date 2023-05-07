package com.programming.class2;


public class TryWithResourceExample {

 

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
 

        try {
            tryWithResource();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            tryWithoutResource();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

 

    static void tryWithResource() throws Exception {
        try(MyResource mr = new MyResource()){
            System.out.println("Try with Resource Method");
            if(true) {
                throw new Exception("Exception - try with resource method");
            }
        }
    }

 

    static void tryWithoutResource() throws Exception {
        MyResource mr = null;
        try {
            mr = new MyResource();
            System.out.println("Try WITHOUT Resource Method");
            if(true) {
                throw new Exception("Exception - try WITHOUT resource method");
            }
        }finally {
            if(mr != null) {
                mr.close();
            }
        }
    }
    
    static class MyResource implements AutoCloseable{

 

        @Override
        public void close() throws Exception {
            System.out.println("Close - called - nullify the instance of MyResource");
        }
        
    }
}
 