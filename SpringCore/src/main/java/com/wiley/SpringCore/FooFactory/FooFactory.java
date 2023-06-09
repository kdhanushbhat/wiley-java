package com.wiley.SpringCore.FooFactory;

public class FooFactory {

	private static final Foo INSTANCE = new Foo();
    
    public static Foo createStaticInstance() {
        return INSTANCE;
    }
    
    public Foo createInstance() {
    	return new Foo();
    }
}
