package Exception;

public class CkeckRetairementAge {
	public static void main(String[] args)throws AgeException {
		int age=34;
		try {
			if(age<60) {
				throw new AgeException("working");
			}
			else {
				System.out.println("Retairement");
			}
		}
			catch(AgeException e) {
				e.printStackTrace();
		}
		}
	}

