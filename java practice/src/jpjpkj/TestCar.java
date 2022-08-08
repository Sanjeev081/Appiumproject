package jpjpkj;

public class TestCar {

	public static void main(String[] args) {
		//static polimorphism---compiletime polimorphism
		Bmw b=new Bmw();
		b.start();
		b.stop();
		b.Refuel();
		b.Theftsafety();
		System.out.println("------------------");
		
		
		Car c=new Car();
		c.start();
		c.stop();
		c.Refuel();
		System.out.println("------------------");
		
		Car c1=new Bmw();//child class object can be refferd by parent class Refrence refrence variable---dynamic polimorphism---run time polimorphism
		
          c1.start();
          c1.stop();
          c1.Refuel();
	}

}
