
import java.util.Scanner;

public class startbox {
	
	//This Was Devoloped At SwiftO Software Technologies 
	//This Was Made On Eclipse Java IDE
	//This Is Copyrighted 
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String name = "none";
		String time = "";
		
		Scanner MyKeyboard = new Scanner(System.in);
	    
		System.out.print("Hello World. Whats your name ?");
		
		name = MyKeyboard.next();
		
		System.out.println("Nice to meet you "+ name +". How do you feel?");
        System.out.println("What is the time?");
        
        time = MyKeyboard.next();
        
        System.out.println("Oh so it is "+ time);
       
        MyKeyboard.close();
        
        //Cool Code
        //What Do You Think
	}

	
}
