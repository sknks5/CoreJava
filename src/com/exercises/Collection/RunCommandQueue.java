package com.exercises.Collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class Command{
	
	private String action;
	public Command(){		
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String operation(){
		return action;
	}
}

class CommandQueue{
	private Queue<Command> commandQ = new ArrayDeque<>();

	public Queue<Command> getCommandQ() {
		return commandQ;
	}
	
	public void addCommand(Command command){
		commandQ.offer(command);
	}
	public Command getCommand(){
		Command c = new Command();
		if (commandQ.peek() != null){
			c = commandQ.poll();
		}
		return c;
	}
}

public class RunCommandQueue {
	
	public static void main (String[] args){
		
		List<String> commands = new ArrayList<>();
		commands.add("Copy");
		commands.add("Move");
		commands.add("List");
		commands.add("Delete");
		commands.add("Purge");
		
		CommandQueue commandQ = new CommandQueue();
		for (String command : commands){
			Command c = new Command();
			c.setAction(command);			
			commandQ.addCommand(c);			
		}
		
		Command c;
		//Now getQ and run operation()
		do
		{
			c = commandQ.getCommand();
			System.out.println(c.operation());
		} while (c.operation() != null);
		
		
	}

}
