import java.util.*;


public class Main
{
    
    
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("asdawe");
		sb.append("a");
		sb.append("wertyu");
		
		System.out.println(sb);
		
		System.out.println("Length of StringBuilder : " + sb.length());
		
		System.out.println("Character at 3rd idx : " + sb.charAt(3));
		
		sb.setCharAt(3, 'z');
		System.out.println(sb);
		System.out.println("Character at 3rd idx : " + sb.charAt(3));
		String str = sb.toString();
	    System.out.println(str);	
	
		
	}
}
