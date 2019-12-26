package InnerClasses;

interface Games{
	void engageMind();
	void encourageCreativity();	
}

interface GameFactory{
	Games getGames();
}

class Legos implements Games {

	@Override
	public void engageMind() {
		System.out.println("Legos can keep kids busy for hours");
	}

	@Override
	public void encourageCreativity() {
		System.out.println("In addition to following instructions, kids can build anything with the blocks");		
	}
	
	public static GameFactory legoFactory = new GameFactory(){
		public Legos getGames(){
			return new Legos();
		}
	};
}

class boardGames implements Games {
	public void engageMind() {
		System.out.println("boardGames can keep kids busy for hours");
	}

	@Override
	public void encourageCreativity() {
		System.out.println("In addition to following instructions, kids can use their creativity to manipulate steps");		
	}
	
	public static GameFactory boardGameFactory = new GameFactory(){
		public boardGames getGames(){
			return new boardGames();
		}
	};	
}






public class ToysFactoryAnonymousInnerClass {
	
	
	public static void main(String[] args){
		GameFactory fact = Legos.legoFactory;
		Games game = fact.getGames();
		game.engageMind();
		game.encourageCreativity();
		
		GameFactory fact1 = boardGames.boardGameFactory;
		Games game1 = fact1.getGames();
		game1.engageMind();
		game1.encourageCreativity();
		
	}

}
