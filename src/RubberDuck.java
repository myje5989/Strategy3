
public class RubberDuck extends Duck {
	 RubberDuck(){
		quackbehavior = new Squack();
		flybehavior = new FlyWithRock();
	}
	
	@Override
	void display() {
		System.out.println("Look like a rubber");

	}

}
