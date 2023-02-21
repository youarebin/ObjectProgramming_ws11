//컴퓨터학과_20220740_가유빈
package fruit;

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
	//생성자
	public Food() {
		calory = 0;
		price = 0;
		weight = 0;
	}
	//접근자
	public void setCalory(int calory) {this.calory = calory;}
	public void setPrice(int price) {this.price = price;}
	public void setWeight(double weight) {this.weight = weight;}
	
	public int getCalory() {return calory;}
	public int getPrice() {return price;}
	public double getWeight() {return weight;}
}
