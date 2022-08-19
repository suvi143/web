package Exception;

public class CheckMailException {
	public static void main(String[] args) throws MailException {
		String a="vijayalakshmi@gmail.com";
		try {
			if(a.contains("@gmail.com")) {
				throw new MailException("Mail is correct");
			}
		}
		catch(MailException e) {
			e.printStackTrace();
		}
	}
}
