//컴퓨터학과_20220740_가유빈
package casino;

public class Practice65B {//완전한 이름을 명시하는 방식
	public static void main(String[] args) {
		game.Dice dice1 = new game.Dice();
		game.Dice dice2 = new game.Dice();
		
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
