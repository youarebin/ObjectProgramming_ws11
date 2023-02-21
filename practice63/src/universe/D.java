//컴퓨터학과_20220740_가유빈
package universe;

import planet.A;

public class D extends A{//외부패키지& 자식패키지 
	void accessTest() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);//default변수 접근 불가
		System.out.println(prv);//private변수
		
		A aobj = new A();
		System.out.println(aobj.pro);//A클래스 객체를 만들어 protected변수에 접근 불가
		
		F fobj = new F();//외부 패키지 멤버인 F클래스는 사용 불가(선언 해야함)
		fobj.accessTest();
	}
}
