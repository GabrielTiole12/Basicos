package Fundamentos;

public class ConversaoTipoPrimitivoNumericos {
	
	public static void main(String[] args) {
		
		double a = 1; // impl�cita 
		System.out.println(a);
		
		float b = (float) 1.23456788888; // expl�cita (CAST)
		System.out.println(b);
		
		int c = 340; 
		byte d = (byte) c; // expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e; 
		System.out.println(f);
			
	}

}