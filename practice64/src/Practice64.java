//컴퓨터학과_20220740_가유빈
public class Practice64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		int count = 1;
		while(true) {
		dice1.roll();
		System.out.print(count + "차: 첫번째 주사위 = " + dice1.getValue());
		dice2.roll();
		System.out.println(", 두번째 주사위 = " + dice2.toString());
		count++;
		
		if(dice1.getValue() == dice2.getValue())
			break;
		}
		System.out.print("\n게임이 종료되었습니다.");
	}

}
