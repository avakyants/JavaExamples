package ru.avakyants.java.edu.apple.quiz;

public class GemsAndPirates {
	
	/*
	 * Seven pirates attacked the ship and looted some rare gems from them. 
	 * They decided to rest for some time and then divide the gems later. 
	 * While everyone was resting, two pirates wake up and planned to divide gems equally between the two. 
	 * When they divided gems equally, one gem was left. 
	 * So, they decided to wake up the third pirate and divide among three, but alas again one gem was left.
	 * They decide to wake up the fourth pirate to divide the gems and again one gem was left. 
	 * The same happened again with the fifth and sixth. 
	 * Finally, they woke up the 7th pirate and this time the gems were divided equally.
	 * How many minimum gems did they stole in total ?
	 * */

	public static void main(String[] args) {
		
		int cntGems = 0;
		
		for(int gems=1;gems<Integer.MAX_VALUE;gems++) {
			if(gems%2==1 && gems%3==1 && gems%4==1 && gems%5==1 && gems%6==1 && gems%7==0) {
				cntGems = gems;
				break;
			}
		}
		
		System.out.println(cntGems);
	}

}
