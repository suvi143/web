package Exception;

public class SOutOfException {
	public static void main(String[] args) {
		String a="Vijiyalakshmi";
		try {
			System.out.println(a.charAt(14));
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Not yet");
		}
	}
}
