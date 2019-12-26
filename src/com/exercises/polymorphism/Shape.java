package com.exercises.polymorphism;

import java.util.Random;

public class Shape {
	
	private static ShapesFactory shapesFactory = new ShapesFactory();
	
	public void draw(){
		System.out.println("Draw any shape");
	}
	public void erase(){
		System.out.println("Erase any shape");
	}
	public void genericMethod(){
		System.out.println("A generic method for all shapes and only in Shape");
	}
	
	public static void main(String[] args){
		Random rand = new Random(47);
		Shape[] shapes = new Shape[9];
		for (int i=0;i<shapes.length;i++){
			shapes[i] = shapesFactory.getShape(rand.nextInt(5));			
		}
		
		for (Shape s : shapes){
			s.draw();
			s.erase();
			s.genericMethod();
		}
	}
}

class Circle extends Shape{
	@Override
	public void draw(){
		System.out.println("Draw a Circle");
	}
	@Override
	public void erase(){
		System.out.println("Erase a circle");
	} 
}
class Triangle extends Shape {
	public void draw(){
		System.out.println("Draw a Triangle");
	}
	public void erase(){
		System.out.println("Erase a Triangle");
	} 
}
class Square extends Shape {
	public void draw(){
		System.out.println("Draw a Square");
	}
	public void erase(){
		System.out.println("Erase a Square");
	} 
	@Override
	public void genericMethod(){
		System.out.println("Not so generic. Now in Square class");		
	}
}
class Pentagon extends Shape {
	public void draw(){
		System.out.println("Draw a Pentagon");
	}
	public void erase(){
		System.out.println("Erase a Pentagon");
	} 
	@Override
	public void genericMethod(){
		System.out.println("Not so generic. Now in Pentagon class");		
	}
}



class ShapesFactory{
	public Shape getShape(int i){
		switch (i){
			case 0: return new Circle();
			case 1: return new Triangle();
			case 2: return new Square();
			case 3: return new Pentagon();
			default: return new Circle();
		}
	}
}
