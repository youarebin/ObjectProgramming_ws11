//컴퓨터학과_20220740_가유빈
package casino;

import game.Dice;

public class Practice65C {//패키지 멤버를 import하는 방식
	public static void main(String[] args) {
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