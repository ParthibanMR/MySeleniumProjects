
class Singleton {
	private static Singleton s;
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	public static Singleton getInstance() {
		if(s== null) {
			s=new Singleton();
		}
		System.out.println(System.identityHashCode(s));
		return s;
		
	}
	public void empId() {
		System.out.println("12322");
	}
	public static void main(String[] args) {
		Singleton s=getInstance();
		s.empId();
	}
}

	