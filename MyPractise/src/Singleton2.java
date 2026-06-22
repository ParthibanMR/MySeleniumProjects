
class Singleton2 {
	
	public static void main(String[] args) {
		Singleton s=Singleton.getInstance();
		s.empId();
		System.out.println(System.identityHashCode(s));
	}
}
