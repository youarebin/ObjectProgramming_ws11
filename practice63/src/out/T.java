//컴퓨터학과_20220740_가유빈
package out;

import planet.*;
import universe.*;

public class T {//외부 패키지&일반 클래스
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B bobj = new B();
		bobj.accessTest();
		
		E eobj = new E();
		eobj.accessTest();//protected매소드
		
		F fobj = new F();
	}
}
