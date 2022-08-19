package Exception;

public class NullException {
	public static void main(String[] args) {
		try {
			String f=null;
			System.out.println(f.length());
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Not readable");
		}
	}

}
