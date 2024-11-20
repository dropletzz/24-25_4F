package com.scuola.liste;

public class Foo {
    private String bar;

    public Foo(String bar) {
        this.bar = bar;
    }

    public String toString() {
        return this.bar;
    }

    public boolean equals(Object o) {
        if (o == null) return false;
        if (o instanceof Foo) {
            Foo f = (Foo) o;
            return f.bar.equals(this.bar);
        }
        return false;
    }
}
