package InnerClasses;


public class Student {		
		
	interface Sharpener{
		Pencil Sharpen(Pencil myPencil);
	}

	private Pencil myPencil;
	private String name;
	
	public Student(String name){
		this.name = name;
	}

	public Pencil getMyPencil() {
		return myPencil;
	}

	public void setMyPencil(Pencil myPencil) {
		this.myPencil = myPencil;
	}
	
	class Pencil {
		private int length;
		private static final int MIN_LENGTH = 4;
		private static final int MAX_LENGTH = 12;
		
		Pencil(){
			this.length = MAX_LENGTH;
		}
	}
	
	class PencilSharpener implements Sharpener {
		@Override
		public Pencil Sharpen(Pencil myPencil) {
			if (myPencil.length > myPencil.MIN_LENGTH)
				myPencil.length--;
			return myPencil;			
		}		
	}
	
	public static void main(String[] args){
		Student kishan = new Student("Kishan");
		Student.Pencil kishansPencil = kishan.new Pencil();
		
		Student.PencilSharpener kishansPencilSharpener = kishan.new PencilSharpener();
		kishansPencilSharpener.Sharpen(kishansPencil);
		System.out.println(kishansPencil.length);
		
	}
}
