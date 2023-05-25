class L {
	int a(int a) {
		return a;
	}
int a(int z,int b){
	return z+b;
	
}
	
}
class F extends L{
	@Override
	int a(int a) {
		// TODO Auto-generated method stub
		return super.a(a);
	}@Override
	int a(int z, int b) {
		// TODO Auto-generated method stub
		return super.a(10, 50);
	}
}
public class One {
	public static void main(String[] args) {
      L l=new L();
      System.out.println(l.a(20));
      L a=new L();
		System.out.println(a.a(20, 20));
		F f=new F();
		System.out.println(f.a(20, 30));
	}
}