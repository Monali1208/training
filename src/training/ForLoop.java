package training;

public class ForLoop {
	
	
	public void evenoddnos (int i) {
		
		for (int j = 1; j <=i; j++) {
			if (j%2==0)
			System.out.println(j+"  it's even number");
			else
				System.out.println(j+ "  it's odd number");
			
		}
	}
	
public void evenoddnos () {
		
		for (int j = 1; j <=10; j++) {
			if (j%2==0)
			System.out.println(j+"  it's even number");
			else
				System.out.println(j+ "  it's odd number");
			
		}
	}

public void evenoddnos (int k, int i) {
	if (k>i) {
		System.out.println("starting no should be always smaller than end number");
	 return;
	}
	for (int j = k; j <=i; j++) {
		if (j%2==0)
		System.out.println(j+"  it's even number");
		else
			System.out.println(j+ "  it's odd number");
		
	}
}

}
