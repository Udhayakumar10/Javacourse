package org.Task;
public class TaskString {
	public static void main(String[] args) {
		
		String name = "papa";
		//method
		//Length
		int length = name.length();
		System.out.println(length);
		
		//ChartAt
		char c = name.charAt(6);
		System.out.println(c);
		
		//indexOf
		int indexOf = name.indexOf('a');
		System.out.println(indexOf);
		
		//lastIndex
		int b=name.lastIndexOf('a');
		System.out.println(b);
		
		//startendWith
		boolean e = name.startsWith("papa");
		System.out.println(e);
		
		//endWith
		boolean end = name.endsWith("ap");
		System.out.println(end);
		
		 //equal
		String p = "PAPA";
		String q = "papa";
		
		boolean equals = p.equals(q);
		System.out.println(equals);
		
		//equalIgnoreCase
		boolean equalsIgnoreCase = p.equalsIgnoreCase(q);
		System.out.println(equalsIgnoreCase);
		
		String replace = p.replace("Papa", "Anna");
		System.out.println( replace);
		
		String replaceAll =p.replaceAll("Papa","Anna");
		System.out.println(replaceAll);
		
		//String
		String substring = name.substring(3);
		System.out.println(substring);
		
		//
		
		String substring2 = name.substring(3,3);
		System.out.println(substring2);
		
		int compareTo = p.compareTo(q);
		System.out.println(compareTo);
		
				
		
		
	}


}
