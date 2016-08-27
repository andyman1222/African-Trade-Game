//@author AndyMan1222

import java.io.PrintStream;
import java.util.EventListener;
class AfricanTradeGameinTerminal{
//AfricanTradeGameinTerminal() { }
	public static void main(String args[]) {
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n            __      _                   _______            _         _____                      \n     /\\    / _|    (_)                 |__   __|          | |       / ____|                     \n    /  \\  | |_ _ __ _  ___ __ _ _ __      | |_ __ __ _  __| | ___  | |  __  __ _ _ __ ___   ___ \n   / /\\ \\ |  _| '__| |/ __/ _` | '_ \\     | | '__/ _` |/ _` |/ _ \\ | | |_ |/ _` | '_ ` _ \\ / _ \\\n  / ____ \\| | | |  | | (_| (_| | | | |    | | | | (_| | (_| |  __/ | |__| | (_| | | | | | |  __/\n /_/    \\_\\_| |_|  |_|\\___\\__,_|_| |_|    |_|_|  \\__,_|\\__,_|\\___|  \\_____|\\__,_|_| |_| |_|\\___|\n Created by AndyMan1222.\n\nGo to full screen! Press enter to continue.");
		asker = scanner.nextLine();
		System.out.println(" \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \nAround the years 1000 AD, an African empire called the Ghana Empire gained power. They were in the middle of a trade route.\n The emperor of the empire decided to put tax on all trade items that come in and out.\n Back then, salt was important to travelling in the desert, and gold, mined in Africa, was used as coins.\n\n Your job as a salt seller is to travel through the Sahara, pay 1 gold coin for every two salt slabs you have to pass through Ghana,\n and use the \"silent barter\" System to get the best amount of gold for the amount of salt you offer.\n You and the gold trader can find the best offer for as long as you want.\n When you like the offer, pay the same amount as entering to leave, get more salt from your slave, and do it all over.\nYou lose if you don't have enough coins to pass through Ghana. \n \n The controls are:\n \n While trading:\n Type the amount, in numbers, of salt you want to offer. Type \"accept\" to take the coins and leave. Type \"leave\" to take your salt and leave without gaining coins.\n \n While in town: \n Type \"trade\" to find another trader. Type \"leave\"to go back to your home. \n \n Coming soon:\n \"trade gold\" to trade your gold (isn't in-game)\n \n press enter to start\n\nStarting parameters:\n gold:4\n salt:0\n\nAt any point where you have to type something, type \"exit\" to close the game safely\n \n press enter to start");
		asker = scanner.nextLine(); System.out.println("\n\n  _         _   _       _                _       _ \n | |    ___| |_( )___  | |__   ___  __ _(_)_ __ | |\n | |   / _ \\ __|// __| | '_ \\ / _ \\/ _` | | '_ \\| |\n | |__|  __/ |_  \\__ \\ | |_) |  __/ (_| | | | | |_|\n |_____\\___|\\__| |___/ |_.__/ \\___|\\__, |_|_| |_(_)\n                                   |___/           \n\n");
		try { Thread.sleep(1000); }
		catch(Exception e) { }
		do { 
		giveSalt = Math.abs(Math.round(Math.random() * (double)Math.round(gold) + (double)(gold / 2))); 
		SaltGave = (int)giveSalt; 
		salt = SaltGave + salt; System.out.println((new StringBuilder()).append("Your slave salt miner has given you ").append(SaltGave).append(" salt slabs. You now have ").append(salt).append(" salt slabs.").toString()); 
		try { Thread.sleep(1000); }
		catch(Exception Exception1) { }
		System.out.print("You are travelling across the Sahara."); 
		try { Thread.sleep(1000); } 
		catch(Exception Exception2) { } 
		System.out.print("."); 
		try { Thread.sleep(1000); } 
		catch(Exception Exception3) { } 
		System.out.print("."); 
		try { Thread.sleep(2000); } 
		catch(Exception Exception4) { } 
		System.out.println("\n"); 
		payGold = Math.round(salt / 2); 
		System.out.println((new StringBuilder()).append("\nYou meet some border guards. They say that you have to pay ").append(Math.round(salt / 2)).append(" gold to pass.").toString()); 
		if(payGold > gold) { 
			System.out.println(" \nYou do not have enough gold to pass. You lose."); 
			pass = 0; 
			break; 
		} System.out.println((new StringBuilder()).append(" \nYou give the guards ").append(payGold).append(" gold because you have enough gold.").toString()); 
		gold = Math.abs(payGold - gold); 
		System.out.print((new StringBuilder()).append(" Now you have ").append(gold).append(" gold. Press enter.").toString());
		pass = 1; 
		asker = scanner.nextLine(); 
		for(asker = "trade"; pass == 1 && asker.equals("trade"); asker = scanner.nextLine()) { 
			System.out.println("\n\nYou reach Ghana and meet up with a stranger at a trading station. He claims he has a great offer."); 
			trade(); 
			System.out.println("\nYou left that trading area. Now what would you like to do? trade, leave"); }   
			System.out.println("You return home safely.\n"); 
			} 
		while(true); }   
	static void trade() { 
		payment = -1; 
		System.out.println((new StringBuilder()).append("How much salt would you like to place down? You have ").append(salt).append(" salt.").toString()); 
		do { 
			if(payment <= salt && payment >= 0) 
			break; 
			asker = scanner.nextLine(); 
			try { 
				payment = Integer.parseInt(asker); 
				if(payment > salt) 
					payment = Integer.parseInt(error); 
				} 
				catch(Exception Exception) { 
					System.out.println((new StringBuilder()).append("Please use numbers less than or equal to ").append(salt).append(" only!").toString()); 
				} 
			} while(true); 
			CPUgold = (int)Math.round((double)payment * ((double)gold * 0.25)); 
			System.out.println((new StringBuilder()).append("\nYou leave the salt on a plate and shop around (shopping coming soon). You come back and see ").append(CPUgold).append(" gold on your plate. accept, leave, or change? choose one.").toString()); 
			asker = scanner.nextLine(); 
			if(asker.equals("accept")) { 
			gold = CPUgold + gold; 
			salt -= payment; 
			System.out.println((new StringBuilder()).append("You took the gold and left the salt. You now have ").append(gold).append(" gold and ").append(salt).append(" salt.").toString()); 
			} 
		else if(asker.equals("change")) 
			trade(); 
		else 
			System.out.println((new StringBuilder()).append("You left without taking anything. You have ").append(gold).append(" gold and ").append(salt).append(" salt.").toString()); 
			}   
		static String error = "1.1"; 
		static int salt = 0; 
		static int gold = 4; 
		static int payment = -1; 
		static int CPUgold = 0; 
		static double giveSalt = 0.0; 
		static int SaltGave = 0; 
		static int payGold; 
		static int pass = 0; 
		static String asker; 
		static typer scanner=new typer();
}