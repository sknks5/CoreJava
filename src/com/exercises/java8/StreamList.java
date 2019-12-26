package com.exercises.java8;

import java.util.List;
import java.util.stream.*;

public class StreamList {
	
	public static void main(String[] args){
		
		List<String> list = (List<String>) Stream.of("Kishan", "Sanju", "Nirmala", "keerthi").filter(s->s.startsWith("k")).sorted().map(String::toUpperCase);
		System.out.println(list);
	}

}
