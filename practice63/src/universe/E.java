
package universe;

import planet .A;

public class E {//외부 패키지&일반 클래스
	void accessTest() {
		A aobj = new A();
		System.out.println(aobj.pub);
		System.out.println(aobj.pro);//protected변수
		System.out.println(aobj.def);//default변수
		System.out.println(aobj.prv);//private변수
		
		F fobj = new F();//외부 패키지인 F클래스 사용불가(선언 필수)
		fobj.accessTest();
	}
}
