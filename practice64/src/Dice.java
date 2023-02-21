//컴퓨터학과_20220740_가유빈
import java.util.Random;

public class Dice {
	private int value;
	private Random rg = new Random();
	//생성자
	public Dice() {
		value = 0;
	}
	//매소드
	public void roll()
	{
		value = rg.nextInt(5) + 1;
	}
	public int getValue() {return value;}
	private void setValue(int value) {this.value = value;}
	public String toString() {
		//roll();
		return "주사위 = " + getValue();
	}
}