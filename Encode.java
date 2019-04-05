package sample1;

public class Encode {

	public static void main(String[] args) {
		 String a = "AAABBCCBBBC";
		 a+="#";
		 String[] array = a.split("");
		 int i = 0;
		 int j = 0;
		 String result = "";
		 while(i<array.length)
		 {
			 int counter = 1;
			 for(j = i+1; j<array.length; j++)
			 {
				 if(array[i].equals(array[j]))
				 {
					 counter++;
				 }
				 else {
					 result+=counter+array[i];
					 i+=counter;
					 break;
				 }
			 }
			 if(i==array.length-1) {
				 break;
			 }
		 }
		 System.out.println(result);

	}

}
