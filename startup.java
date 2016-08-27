import java.io.*;
class startup {
	private static String OS = System.getProperty("os.name").toLowerCase();

	public static boolean isWindows() {
        return (OS.indexOf("win") >= 0);
    }

    public static boolean isMac() {
        return (OS.indexOf("mac") >= 0);
    }

    public static boolean isUnix() {
        return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
    }

    public static boolean isSolaris() {
        return (OS.indexOf("sunos") >= 0);
    }
    public static String getOS(){
        if (isWindows()) {
            return "win";
        } else if (isMac()) {
            return "osx";
        } else if (isUnix()) {
            return "uni";
        } else if (isSolaris()) {
            return "sol";
        } else {
            return "err";
        }
    }
	static String line;
	public static void main(String args[]) { 
		System.out.println(OS);
		try {
			if (isWindows()) {
            	Process process = Runtime.getRuntime().exec("cmd.exe /c cd \""+ System.getProperty("user.dir") +"\" & start cmd.exe /k \"java -cp AfricanTradeGame.jar;. AfricanTradeGameinTerminal\"");
				process = Runtime.getRuntime().exec("cmd exit");
        	} else if (isMac()) {
            	System.out.println("This is Mac. Even though this was first developed on mac, it may not work.");
				Process process = Runtime.getRuntime().exec("directory.command"); 
				BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(process.getInputStream())); 
				try { process.waitFor(); } 
				catch(InterruptedException interruptedexception) { System.out.println(interruptedexception.getMessage()); } 
				for(; bufferedreader.ready(); System.out.println(bufferedreader.readLine()));
        	} else if (isUnix()) {
            	System.out.println("This is Unix or Linux.\nYour OS is currently not supported.\nPlease see Github documentation if you would like to make it compatible.");
        	} else if (isSolaris()) {
            	System.out.println("This is Solaris.\nYour OS is currently not supported.\nPlease see Github documentation if you would like to make it compatible.");
        	} else {
            	System.out.println("Your OS is unknown.\nYour OS is currently not supported.\nPlease see Github documentation if you would like to make it compatible.");
        	}
				
		}
		catch(IOException ioexception) { System.out.println(ioexception.getMessage()); } 
	}
}