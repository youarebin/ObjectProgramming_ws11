//컴퓨터학과_20220740_가유빈
public class Melon extends Food{
	String farmInfo;
	
	public String toString() {
		String rslt = "";
		
		rslt += "\n칼로리: " + calory;
		rslt += "\n가격: " + price;
		rslt += "\n무게: " + weight;
		rslt += "\n재배농장: " + farmInfo + "\n";
		
		return rslt;
	}
}
