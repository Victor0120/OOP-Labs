package com.LABS.lab5;

class A extends X{
    protected String a;
    protected static X x = new X("X");

    public A(String a) {
        super("X");
        this.a = "A";
    }
}

class B extends A {
    protected String b;

    public B(String a) {
        super(a);
        this.b="B";
    }
}

class C extends B {
    protected String c;

    public C(String a) {
        super(a);
        this.c="C";
    }
}

class D extends C {
    protected String d;
    protected static X x = new X("123");
    public D(String a) {
        super(a);
        this.d = "D";
    }
}

class E extends D {
    protected String e;

    public E(String a) {
        super(a);
        this.e = "E";
    }
}

class F extends E {
    protected String f;

    public F(String a) {
        super(a);
        this.f = "F";
    }
}

class G extends F {
    protected String g;

    public G(String a) {
        super(a);
        this.g = "G";
    }
}

class H extends G {
    protected String h;
    protected static X x = new X("789");
    public H(String a) {
        super(a);
        this.h = "H";
    }
}

class I extends H {
    protected String i;

    public I(String a) {
        super(a);
        this.i = "I";
    }
}

class J extends I {
    protected String j;

    public J(String a) {
        super(a);
        this.j = "J";
    }
    A X = new A("456");
    protected void print(){
        System.out.println(a+b+c+d+e+f+g+h+i+j+A.x+D.x+H.x);
    }
}

class X {
    private String x;

    public X(String x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return x;
    }
}



