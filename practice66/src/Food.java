//컴퓨터학과_20220740_가유빈
public class Food {
	int calory;
	protected int price;
	protected double weight;
	
	public String toString() {
		String rslt = "";
		
		rslt += "\n칼로리: " + calory;
		rslt += "\n가격: " + price;
		rslt += "\n무게: " + weight + "\n";
		
		return rslt;
	}
}
