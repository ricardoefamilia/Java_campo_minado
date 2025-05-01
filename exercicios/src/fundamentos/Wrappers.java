package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		
		//byte,short,integer,long
		Byte b = 100;
		Short s = 1000;
		
		System.out.print("Digite um valor: ");
		Integer i = 10000; //int
		Long l = 1000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(i / 3);
		
		Float f = 123.98F;
		System.out.println(f);
		
		Double d = 123.5879;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c.toString());
	}

}
