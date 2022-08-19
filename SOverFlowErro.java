package Exception;

public class SOverFlowErro {
	public void funA() {
		funB();
	}
	
	public void funB() {
		funA();
	}
	
	
	public static void main(String[] args) {
		SOverFlowErro so=new SOverFlowErro();
		so.funA();
	}
}
