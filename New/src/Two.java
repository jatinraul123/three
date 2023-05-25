class K {
	int a(int a) {
		return a;
	}
	int a(int n,int d,int j){
		return n+d+j;
		
	}
}

public class Two {
	public static void main(String[] args) {
K k=new K();
System.out.println(k.a(50));
K a=new K();
System.out.println(a.a(10, 20, 30));
	}
}
