package com.touchkiss.dy.base;

/**
 * Created on 2020/11/28 15:36
 *
 * @author Touchkiss
 */
public class ClassTest {
    public static class A{
        public void printClass(){
            System.out.println(getClass());
        }
    }
    public static class B extends A{
//        @Override
//        public void printClass() {
//            System.out.println(getClass());
//        }
    }

    public static void main(String[] args) {
        A b = new B();
        b.printClass();
    }
}
