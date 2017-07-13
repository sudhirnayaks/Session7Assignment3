package session7;
import java.util.Scanner;

public class Assignment3 {

    private static Scanner in;

	public static void main(String[] args) {
       in = new Scanner(System.in);
       System.out.println("Enter the main String");
       String string = in.nextLine();
       System.out.println("Enter the Sub String");
       String subString = in.nextLine();
       isSubstring(string, subString);
    	   
    }
       
    //method to check if substring is present within main String 
    public static void isSubstring(String string1, String string2) {
    	int subStringlength= string2.length();
    	int count=0;
    	for(int i=0;i<string1.length();i++){
    		if(string2.charAt(0)==string1.charAt(i)){
    			for(int j=1;j<string2.length();j++){
    				if(string2.charAt(j)==string1.charAt(i+1)){
    					i++;
    					count++;
    				}
    			}
    		}
    		
    	}
    	if(count==subStringlength-1){
    		System.out.println("Substring is found in the main string ");
    	}
    	else{
    		System.out.println("Substring not found in the main String");
    	}
    	
    }
  }
