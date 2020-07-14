package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ticket = "";
		
	Random ran = new Random();
		for (int i=0; i<6; i++) {		
		int	number = ran.nextInt(100);
		ticket += number;
		ticket += " ";
		}
        System.out.println(ticket);
	}

}
