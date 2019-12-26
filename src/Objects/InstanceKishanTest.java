package Objects;

public class InstanceKishanTest {
	
	public static void main(String[] args){
		InstanceKishan k1 = new InstanceKishan("Borchardt Elementary", 5);
		InstanceKishan k2 = new InstanceKishan("Fowler MS", 6);
		InstanceKishan[] k = new InstanceKishan[3];
		
		
		
		System.out.println(k1.school + "->" + k1.grade);
		System.out.println(k2.school + "->" + k2.grade);
		for (int i = 0;i<k2.favBooks.length;i++){
			System.out.println(k1.favBooks[i]);
		}
		
		k[0] = k1;
		k[1] = k2;
		k[2] = new InstanceKishan("Lebanon Trail", 9);
		
		for (int i=0;i<k.length;i++){
			System.out.println(k[i].getName() + "<---->" + k[i].grade + "<---->" + k[i].school);
		}

	}

}
