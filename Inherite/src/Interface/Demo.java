package Interface;

public class Demo {

	public static void main(String[] args) {
		
		IPlay child = new Child();
		IPlay actor = new Actor();
		
		child.play();
		actor.play();

	}

}
