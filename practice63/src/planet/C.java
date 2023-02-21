//컴퓨터학과_20220740_가유빈
package planet;

public class C {
	void accessTest() {
		A aobj = new A();
		System.out.println(aobj.pub);
		System.out.println(aobj.pro);
		System.out.println(aobj.def);
		System.out.println(aobj.prv);//private변수 사용됨
		
		F fobj = new F();
		fobj.accessTest();
	}
}
