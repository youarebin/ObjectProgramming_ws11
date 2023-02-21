//컴퓨터학과_20220740_가유빈
package planet;

public class B extends A{
	public void accessTest() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		System.out.println(prv);//private라 B클래스에서 사용할수 없다.
		
		F fobj = new F();
		fobj.accessTest();
	}
}
