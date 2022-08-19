package Exception;

public class CheckVoteage {
	public static void main(String[] args) throws AgeException {
		int age=10;
		try {
			if(age<18) {
				throw new AgeException("Not eligible");
			}
			else {
				System.out.println("eligible to vote");
			}
		}
		catch(AgeException e) {
			System.out.println(e);
		}
	}

}
