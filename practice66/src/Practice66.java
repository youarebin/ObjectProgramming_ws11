//컴퓨터학과_20220740_가유빈
public class Practice66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food f0 = new Food();
		Melon f1 = new Melon();
		Potato f2 = new Potato();
		
		System.out.print("음식의 정보입니다.");
		f0.calory = 100;
		f0.price = 100;
		f0.weight = 12.3;
		System.out.println(f0.toString());
		
		System.out.print("멜론의 정보입니다.");
		f1.calory = 200;
		f1.price = 200;
		f1.weight = 5.5;
		f1.farmInfo = "좋은 이웃들";
		System.out.println(f1.toString());
		
		System.out.print("감자의 정보입니다.");
		f2.calory = 300;
		f2.price = 200;
		f2.weight = 50.0;
		System.out.println(f2.toString());
		
		System.out.println("감자의 단위가격은 " + f2.getUnitPrice() + "입니다.");
	}

}
