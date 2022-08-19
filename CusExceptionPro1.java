package Exception;

public class CusExceptionPro1 {
	public static void main(String[] args)throws priceNotFound {
		int price=2000;
		try {
			if(price<=20000) {
				throw new priceNotFound("This is exception");
			}
			else {
				System.out.println("Product not found");
			}
		}
		catch (priceNotFound e) {
			e.printStackTrace();
			//System.out.println(e);
		}
		//finally {
			//System.out.println("oops");
		//}
	}

}
