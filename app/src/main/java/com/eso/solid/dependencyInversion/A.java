package com.eso.solid.dependencyInversion;

/*Entities must depend on abstraction not concretion*/
public class A {
    private B b;
    private C c;

    public A(){
        b = new B();
        c = new C();
    }
}
