package ch07_practice_04;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller controller = new Controller();
		
		controller.setService(new MemberService());
		controller.service.login();
		
		controller.setService(new AService());
		controller.service.login();
	}

}
