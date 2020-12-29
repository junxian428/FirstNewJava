package Junxian;

import java.util.Random;

public class main {

	public static void main(String[] args) {
       
		Random coolNumberBro = new Random();
		int x = coolNumberBro.nextInt(6);
		
		System.out.println("You rolled a:" + x);
       
	}

}
