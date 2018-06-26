class StringOperations
{
	public static  void main(String args[])
	{
		String str1 = new String("Hello DS Jodhpur");
		String str4 = new String("     hello ds jodhpur    ");
		String str2 = "Hello World";
		String str3;
		String str5 = "hello World";
		char poschar;
		int pos = 4;
		int length;
		int sindex = 7;
		int lindex = 14;
		
		System.out.println("My String is : " +str1);
		
		poschar = str1.charAt(pos);
		System.out.println(pos+"th charachter is :(Using charAt) - "+poschar);
		
		length = str1.length();
		System.out.println("String length is (using length(), method):- "+length);
		
		System.out.println("value of method(return int into string) : "+String.valueOf(pos));
		
		str3=str1.intern();
		System.out.println("Str 3 is : "+str3);//here str1 canonical copy(string constent pool)is assign to str3.
		
		
		System.out.println("String from "+sindex+"is : "+str1.substring(sindex));
		System.out.println("String from "+sindex+" to "+lindex+ "is : "+str1.substring(sindex,lindex));
		
		System.out.println("My string is : " +str4+" , After trim ->>>" +str4.trim());////trim is remove space from first and last of given string.
		
		System.out.println("(startsWith method) my string start with (hello) :"+str1.startsWith("hello")+", my string start with(Hello) :"+str1.startsWith("Hello"));
		
		System.out.println("(endsWith method) my string end with (jodhpur) :"+str1.endsWith("jodhpur")+", my string end with(Jodhpur) :"+str1.endsWith("Jodhpur"));
		
		System.out.println("(replace method)My String is :"+str2+", after replace l with o:"+str2.replace('l','o'));
		
		System.out.println("(replace All method)My String is :"+str4+", after replace ' ' with i:"+str4.replaceAll("\\s","i"));
		
		System.out.println("("+str2+") equals to ("+str5+"),->>"+str2.equals(str5));
		
		System.out.println("(ignor case)-->("+str2+") equals to ("+str5+"),->>"+str2.equalsIgnoreCase(str5));
		
		System.out.println("String is contain hello ->>"+str2.contains("hello"));
		System.out.println("String is contain Hello ->>"+str2.contains("Hello"));
		
		int n=10;
		float x=10.0f;
		char ch='A';
		String frt;
		frt = String.format("(Print Using Format Method) : n=%d x=%f ch=%c",n,x,ch);
		System.out.println(frt);
		
		String[] spt= frt.split(" ");
		System.out.println("Using Split method : "+spt[0]);
		System.out.println("Using Split method : "+spt[1]);
		System.out.println("Using Split method : "+spt[2]);
		System.out.println("Using Split method : "+spt[3]);
		System.out.println("Using Split method : "+spt[4]);
		System.out.println("Using Split method : "+spt[5]);
		System.out.println("Using Split method : "+spt[6]);
		System.out.println("Using Split method : "+spt[7]);
		
		byte[] bt = frt.getBytes();
		System.out.println("Result of GEt byte method: "+bt[0]);
		System.out.println("Result of GEt byte method: "+bt[1]);
		System.out.println("Result of GEt byte method: "+bt[2]);	
		
		String s1 ="Hello my name is Bhuvi";
		String s2 ="Hello my name is bhuvi";
		String s3 ="Hello my name is bhuvi";
		
		System.out.println("S1 is :"+s1);
		System.out.println("S2 is :"+s2);
		System.out.println("S3 is :"+s3);
		System.out.println("S1 and S2 Compare :"+ s1.compareTo(s2));
		System.out.println("S2 and S3 Compare :"+ s2.compareTo(s3));
		System.out.println("S3 and S1 Compare :"+ s3.compareTo(s1));
		
		System.out.println("index of S1 is(my) :"+s1.indexOf("my"));
		System.out.println("index of S1 is(e) :"+s1.indexOf('e'));
		
		
		
		
	}
}