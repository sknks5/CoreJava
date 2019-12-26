package com.exercises.InterfaceImplementer;

import com.exercises.Interface.Eraser;

class PencilEraser implements Eraser{
	@Override
	public void erase() {
		System.out.println(this + " can erase what was written using pencil");
	}	
	
	public String toString(){
		return "PencilEraser";
	}
}
class CassetteEraser implements Eraser{
	@Override
	public void erase() {
		System.out.println(this + " can erase recorded video");
	}	
	public String toString(){
		return "CassetteEraser";
	}	
}


public class TestErase {
	
	public static void main(String[] args){
		
		Eraser[] erasers = {new PencilEraser(), new CassetteEraser()};
		
		for (Eraser eraser : erasers){
			useEraser(eraser);
			
		}
	}	
	public static void useEraser(Eraser eraser){
		eraser.erase();
	}

}
