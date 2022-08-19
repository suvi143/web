package Exception;

public class MultipleCatch {
	public static void main(String[] args) {
		int [] a= {23,89,70,56,78};
	try {
		System.out.println(a[6]);
	} 
	catch (ArrayIndexOutOfBoundsException b) {
		System.out.println(b);
	}
	catch (IndexOutOfBoundsException c) {
		System.out.println(c);
	}
	catch(Exception e) {
		System.out.println(e);
		
	}
	
	//finally {
		//System.out.println("Product not found");
	//}
	
	}

}
