import java.util.Scanner;
class typer{
	static Scanner scanner=new Scanner(System.in);
	static String asker;
	public static String nextLine(){
		asker=scanner.nextLine();
		if(asker.equals("exit")){
			System.out.println("Are you sure you want to quit? y/n");
			asker=scanner.nextLine();
			if(asker.equals("y")){
					System.out.println("You can now close the window or application.");
					System.exit(0);
			}
			else{
				System.out.println("Then carry on with what was before this. Do what it says to do a few lines above.");
				asker=scanner.nextLine();
			}
		}
		return asker;}

	}