//컴퓨터학과_20220740_가유빈
public class Potato extends Food{
	public int getUnitPrice() {
		return price/(int)weight;
	}
	public String toString() {
		String rslt = "";
		
		rslt += "\n칼로리: " + calory;
		rslt += "\n가격: " + price;
		rslt += "\n무게: " + weight;
		rslt += "\n단위가격: " + getUnitPrice() + "\n";
		
		return rslt;
	}
}
