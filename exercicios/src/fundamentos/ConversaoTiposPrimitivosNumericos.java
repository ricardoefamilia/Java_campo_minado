package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		
		double a = 1; //conversao implícita de int para double
		System.out.println(a);
		
		float b = 1.0f; 
		float c = (float) 1.123456789999; //explícita cast
		System.out.println(b);
		System.out.println(c);
		
		int i = 4;
		byte d = (byte) c; //explícita cast
		System.out.println(i);
		System.out.println(d);
		
		double e = 10.999;
		System.out.println(e);
		int f = (int) e; //explícita cast
		System.out.println(f);
		
		
	}
}
