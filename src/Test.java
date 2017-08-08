
public class Test {

	public static void main(String[] args) {
		System.out.println("----MallardDuck-----");
		MallardDuck md = new MallardDuck();
		md.display();//Look like a mallard
		md.performQuack();//Quack! Quack!
		md.performFly();//I'm flying with wing
		System.out.println("----RubberDuck-----");
		
		RubberDuck rud = new RubberDuck();
		rud.display();//Look like a rubber
		rud.performQuack();//Squack! Squack!
		rud.performFly();//I'm flying with rocket

	}

}
