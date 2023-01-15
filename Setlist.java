import java.util.Scanner; // import Scanner class
import java.util.concurrent.TimeUnit;


public class Setlist{

    static Scanner scnr = new Scanner(System.in);
/*
    public static void wolfjob() {
        Scanner fileIn = new Scanner(new File("wolfjob.txt"));
        System.out.println(fileIn.nextLine());
    }
    */
    public static void printMenu2 () {
        System.out.println("Which songs would you like to see?");
        System.out.println("-----------Albums-------------");
        System.out.println("1. Wasted Time");
        System.out.println("2. Disaster Averted");
        System.out.println("-----------EP's-------------");
        System.out.println("3. Open Up");
        System.out.println("4. Got Time");
        System.out.println("-----------Singles-------------");
        System.out.println("5. Singles");
        System.out.println("-----------Covers-------------");
        System.out.println("6. Covers");
        System.out.println("q - Return to Main Menu");
        System.out.print("Choose an option: ");
    }

    /*
    public static viewAllSongs(String wastedTime[], String openUp[], String disasterAverted[], String gotTime[], String singles[], String covers[]) {
        String menuOption;
        do {
        printMenu2();
        menuOption = scnr.nextLine();
            while (!menuOption.equals("1") && !menuOption.equals("2") && !menuOption.equals("3") && !menuOption.equals("4") && !menuOption.equals("5") && !menuOption.equals("6") !menuOption.equals("q")) {
                System.out.println("Invalid option. Please enter a valid option.");
                menuOption = scnr.nextLine();
            }
        }

        switch (menuOption) {
            case "1":
                System.out.println(wastedTime[]);
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
        }

    }
*/

    public static void printMenu() {
        System.out.println("Supreme Remedy Setlist Generator");
        System.out.println("1 - Build a setlist");
        System.out.println("2 - View all songs");
        System.out.println("q - Quit");
        System.out.print("Choose an option: ");
    }


    public static String buildSetlist(String wastedTime[], long wastedTimes[], String openUp[], String disasterAverted[], String gotTime[], String singles[], String covers[]) {
        String set;
        System.out.print("Enter set time:");
        long timeAllowed = scnr.nextLong();
        String menuOption;

        long minutes = 45;
        long seconds = TimeUnit.MINUTES.toSeconds(minutes);
        System.out.println(seconds + " seconds");
        
        do {
            printMenu2();
            menuOption = scnr.nextLine();
            while (!menuOption.equals("1") && !menuOption.equals("2") && !menuOption.equals("3") && !menuOption.equals("4") && !menuOption.equals("5") && !menuOption.equals("6") && !menuOption.equals("q")) {
                System.out.println("Invalid option. Idiot.");
                menuOption = scnr.nextLine();
            }
            switch(menuOption) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "q":
                    break;
            }
        } while (!menuOption.equals("q"));
            return set;
    }

    public static void main(String[] args) {
        String[] wastedTime = new String[]{"Journeyman", "Hyperdrive", "Now I See", "Ignition", "Interlude", "This Won't Be As Hard", "Right Now", "One Step At A Time", "Faux Sho'", "Faded Memories","When It Ends"};
        long[] wastedTimes = new long[]{266, 247, 166, 255, 106, 194, 142, 322, 202, 351, 316};
        String[] openUp = new String[4];
        long[] openTimes = new long[]{357, 299, 266, 502};
        String[] disasterAverted = new String[12];
        long[] disaterTimes = new long[]{322, 197, 275, 250, 202, 261, 221, 351, 353, 386, 298, 263};
        String[] gotTime = new String[5];
        String[] singles = new String[1];
        String[] covers = new String[4];
        String menuOption;

        printMenu();
        menuOption = scnr.nextLine();
        while (!menuOption.equals("1") && !menuOption.equals("2") && !menuOption.equals("q")) {
            System.out.println("Invalid option. Idiot.");
            menuOption = scnr.nextLine();
        switch(menuOption) {
            case "1": // build setlist
               // String results = buildSetlist(wastedTime, wastedTimes, openUp, disasterAverted, gotTime, singles, covers);
              //  System.out.println(results);
            case "2": // view the songs
                //viewAllSongs(wastedTime, openUp, disasterAverted, gotTime, singles, covers);
                break;
            case "q": // quit
            case "w":
              //  wolfjob();
                break;
        }



        }
    }
}