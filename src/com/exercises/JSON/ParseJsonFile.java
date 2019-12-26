package com.exercises.JSON;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ParseJsonFile {
	
	public static void main (String[] args){
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\siva\\aws\\DynamoDB\\moviedata\\moviedata.json"));
			JsonFactory factory = new JsonFactory();
			JsonParser parser = factory.createParser(reader);
			
			JsonNode rootNode = new ObjectMapper().readTree(parser);
			Iterator<JsonNode> iter = rootNode.iterator();
			
			while (iter.hasNext()){
                JsonNode currentNode = iter.next();
                Iterator<String> fieldNames = currentNode.fieldNames();
                while (fieldNames.hasNext()){
                	System.out.println("Field Name --->" + fieldNames.next());
                }
                System.out.println(currentNode.path("title"));
                System.out.println(currentNode.path("year"));
                System.out.println(currentNode.path("info"));
				
			}
/*
			while (!parser.isClosed())
			{
				JsonToken token = parser.nextToken();
				if (token.equals(JsonToken.FIELD_NAME))
					System.out.println(parser.getValueAsString());				
			}*/
  			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
