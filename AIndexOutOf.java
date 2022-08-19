package Exception;

public class AIndexOutOf {
	public static void main(String[] args) {
		int [] a= {23,89,70,56,78};
	try {
		System.out.println(a[6]);
	} 
	catch(Exception e) {
		System.out.println(e);
		
	}
	finally {
		System.out.println("Product not found");
	}
	
	}

}
