package jpjpkj;

public class methodoverloading {

	public static void main(String[] args) {
		methodoverloading obj=new methodoverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 20);
		
	

	}
	public void sum() {
		System.out.println("sum methos zero--zero param ");
	}
	public void sum(int i) {//  1 input param
		System.out.println("Sum Method--1 parameter");
		System.out.println(i);
		
	}
	public void sum(int k,int i) {
		System.out.println("Sum method-2 parameter");
		System.out.println(k+i);
		
	}

}
