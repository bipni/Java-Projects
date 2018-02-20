package PM;

public class PasswordManager {

	public static void main(String args[]) {
		
		DataBaseConnect db = new DataBaseConnect();
		
		View view = new View();
		view.setVisible(true);
		View2 view2 = new View2();
		View3 view3 = new View3();
		View4 view4 = new View4();
		View5 view5 = new View5();
		Model4 model4 = new Model4();
		
		Controller controller = new Controller(view, view2);
		Controller2 controller2 = new Controller2(view, view2, view3, view4, view5);
		Controller3 controller3 = new Controller3(view2, view3);
		Controller4 controller4 = new Controller4(view2, view4);
		Controller5 controller5 = new Controller5(view2, view5);
	}
}
