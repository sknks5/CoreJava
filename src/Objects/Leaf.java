package Objects;

public class Leaf {
	
	private int i;
	
	public Leaf increment(){
		i++;
		return this;
	}
	public void print(){
		System.out.println("Number of leaves = "  + i);
	}
	
	public static void main(String[] args){
		Leaf leaf = new Leaf();
		leaf.increment().print();
	}

}
