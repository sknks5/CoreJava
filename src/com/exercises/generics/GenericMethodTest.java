package com.exercises.generics;


class GenericMethodClass {
	
	public <T> void GenericMethod(T t){
		System.out.println(t.getClass().getName());
		System.out.println(t.getClass().getSimpleName());
		System.out.println("****************************************************");
	}
	
	public <T, U, V> void GenericMethod(T t, U u, V v){
		System.out.println(t.getClass().getName() + "," + u.getClass().getName() + "," + v.getClass().getName());
		System.out.println("****************************************************");
		
	}
}

public class GenericMethodTest {
	
	public static void main(String[] args){
		GenericMethodClass gmClass = new GenericMethodClass();
		gmClass.GenericMethod("Kishan");
		gmClass.GenericMethod(178942); //Autoboxing converts primitive int to Integer Object
		gmClass.GenericMethod(89.0);//Autoboxing converts primitive double to Double Object
		gmClass.GenericMethod(true); //Autoboxing. primitive "true" autoboxed 
		gmClass.GenericMethod(Boolean.TRUE); //No autoboxing 
		gmClass.GenericMethod(gmClass.getClass().getClassLoader());
		gmClass.GenericMethod(gmClass);

		gmClass.GenericMethod("Kishan", 178942, 89.0);
		gmClass.GenericMethod("Kishan", 178942, 89.0);
	}

}
