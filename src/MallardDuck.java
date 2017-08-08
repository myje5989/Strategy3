
public class MallardDuck extends Duck {
	 MallardDuck(){
	quackbehavior = new Quack();
	flybehavior = new FlyWithWing();
	}
	@Override
	void display() {
			System.out.println("Look like a mallard");
	}
}
