import java.util.Scanner; // import Scanner class
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;


public class Setlist{
    final static int MAX = 20;

    static Scanner scnr = new Scanner(System.in);
/*
    public static void wolfjob() {
        Scanner fileIn = new Scanner(new File("wolfjob.txt"));
        System.out.println(fileIn.nextLine());
    }
    */
    public static void printMenu2 (String wastedTime[], long wastedTimes[], String openUp[], long openTimes[], String disasterAverted[], long[] disasterTimes, String gotTime[], long[] gotTimes, String singles[], long[] singleTimes, String covers[], long[] coverTimes) {
        while (true) {
            System.out.printf("%n-----------Albums-------------%n%n");
            System.out.println("1. Wasted Time");
            System.out.println("2. Disaster Averted");
            System.out.printf("%n-----------EP's-------------%n%n");
            System.out.println("3. Open Up");
            System.out.println("4. Got Time");
            System.out.printf("%n-----------Singles-------------%n%n");
            System.out.println("5. Singles");
            System.out.printf("%n-----------Covers-------------%n%n");
            System.out.println("6. Covers");
            System.out.printf("%nm - Return to Main Menu%n%n");
            System.out.print("Choose an option: ");
            String choice = scnr.next();

            while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4") && !choice.equals("5") && !choice.equals("6") && !choice.equals("m")) {
                System.out.println("Invalid option. Please enter a valid option.");
                System.out.print("Choose an option: ");
                choice = scnr.next();
            }
            switch (choice) {
                case "1":
                    printWastedTime(wastedTime, wastedTimes, openUp, openTimes, disasterAverted, disasterTimes, gotTime, gotTimes, singles, singleTimes, covers, coverTimes);
                    break;
                case "2":
                    //printDisasterAverted(wastedTime, wastedTimes, disasterAverted, disasterTimes, openUp, openTimes, wastedTime, wastedTimes, gotTime, gotTimes, singles, singleTimes, covers,
                    //coverTimes);
                    break;
                case "m":
                    return;
            }
        }
    }

    public static void printWastedTime2(String wastedTime[], long wastedTimes[], String openUp[], long openTimes[], String disasterAverted[], long[] disasterTimes, String gotTime[], long[] gotTimes, String singles[], long[] singleTimes, String covers[], long[] coverTimes) {
        int counter = 1;
        System.out.printf("%n|-----------------Wasted Time-----------------|%n%n");
        for (int i = 0; i < wastedTime.length; i++) {
            long minutes = (int) TimeUnit.SECONDS.toMinutes(wastedTimes[i]);
            long seconds = (int) wastedTimes[i] - (TimeUnit.MINUTES.toSeconds(minutes));

            if (counter < 10) {
                System.out.printf("%d. %-40s %2d:%02d\n", counter++, wastedTime[i], minutes, seconds);
            }
            else {
                System.out.printf("%d. %-39s %2d:%02d\n", counter++, wastedTime[i], minutes, seconds);
            }
        }
        System.out.println();
    }
    
    public static void printDisasterAverted2(String disasterAverted[], long[] disasterTimes) {
        int counter = 1;
        System.out.printf("%n|---------------Disaster Averted---------------|%n%n");
        for (int i = 0; i < disasterAverted.length; i++) {
            long minutes = (int) TimeUnit.SECONDS.toMinutes(disasterTimes[i]);
            long seconds = (int) disasterTimes[i] - (TimeUnit.MINUTES.toSeconds(minutes));

            if (counter < 10) {
                System.out.printf("%d. %-40s %2d:%02d\n", counter++, disasterTimes[i], minutes, seconds);
            }
            else {
                System.out.printf("%d. %-39s %2d:%02d\n", counter++, disasterTimes[i], minutes, seconds);
            }
        }
        System.out.println();
    }

    public static void printWastedTime(String wastedTime[], long wastedTimes[], String openUp[], long openTimes[], String disasterAverted[], long[] disasterTimes, String gotTime[], long[] gotTimes, String singles[], long[] singleTimes, String covers[], long[] coverTimes) {
        int counter = 1;
        String choice;
        System.out.printf("%n|-----------------Wasted Time-----------------|%n%n");
        for (int i = 0; i < wastedTime.length; i++) {
            long minutes = (int) TimeUnit.SECONDS.toMinutes(wastedTimes[i]);
            long seconds = (int) wastedTimes[i] - (TimeUnit.MINUTES.toSeconds(minutes));

            if (counter < 10) {
                System.out.printf("%d. %-40s %2d:%02d\n", counter++, wastedTime[i], minutes, seconds);
            }
            else {
                System.out.printf("%d. %-39s %2d:%02d\n", counter++, wastedTime[i], minutes, seconds);
            }
        }
        System.out.printf("%nb - Return to Previous Menu%nm - Return to Main Menu%nEnter Choice: ");
        choice = scnr.next();
        while (!choice.equals("b") && !choice.equals("m")) {
            System.out.println("Invalid option. Please enter a valid option.");
            System.out.print("Enter 'b' to go back, or 'm' to go back to the main menu: ");
            choice = scnr.next();
            if (choice.equals("b")) {
                printMenu2(wastedTime , wastedTimes, openUp, openTimes, disasterAverted, disasterTimes, gotTime, gotTimes, singles, singleTimes, covers, coverTimes);
                return;
            }
            else {
                printMenu();
                return;
            }
        }
    }
/*
    public static void printDisasterAverted(String disasterAverted[], long disasterTimes[]) {
        int counter = 1;
        System.out.println();
        for (int i = 0; i < disasterAverted.length; i++) {
            long minutes = (int) TimeUnit.SECONDS.toMinutes(disasterTimes[i]);
            long seconds = (int) disasterTimes[i] - (TimeUnit.MINUTES.toSeconds(minutes));
            if (counter < 10) {
            System.out.printf("%d. %-40s %2d:%02d\n", counter++, disasterAverted[i], minutes, seconds);
            }
            else {
                System.out.printf("%d. %-39s %2d:%02d\n", counter++, disasterAverted[i], minutes, seconds);
            }
        }
    }
*/
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
        System.out.printf("%n SUPREME REMEDY SETLIST GENERATOR%n%n");
        System.out.printf("-------------MAIN MENU------------%n%n");
        System.out.println("1 - Build a setlist");
        System.out.println("2 - View all songs");
        System.out.printf("q - Quit%n%n");
        System.out.printf("----------------------------------%n%n");
        System.out.print("Choose an option: ");
    }

    
    public static void buildSetlist(String[] wastedTime, long[] wastedTimes, String[] openUp, long[] openTimes, String[] disasterAverted, long[] disasterTimes, String[] gotTime, long[] gotTimes, String[] singles, long[] singleTimes, String[] covers, long[] coverTimes) {
        System.out.print("How long is the setlist? (in minutes): ");
        int setlistLength = scnr.nextInt();
        int seconds = setlistLength * 60;
        int numOfSongs = 0;
        ArrayList<String> setlist = new ArrayList<String>();
        ArrayList<Long> duration = new ArrayList<Long>();
        System.out.printf("%n------------ OPTIONS --------------%n%n");
        System.out.printf("1. Add a song from Wasted Time%n2. Add a song from Disaster Averted%n3. Add a song from Open Up%n4. Add a song from Got Time%n5. Add a song from Singles%n6. Add a song from Covers%n7 to delete a song%n0 to quit%nEnter Choice: ");
        int songChoice = scnr.nextInt();
        while (songChoice != 1 && songChoice != 2 && songChoice != 3 && songChoice != 4 && songChoice != 5 && songChoice != 6) {
            System.out.println("Invalid option. Please enter a valid option.");
            System.out.printf("1. Add a song from Wasted Time%n2. Add a song from Disaster Averted%n3. Add a song from Open Up%n4. Add a song from Got Time%n5. Add a song from Singles%n6. Add a song from Covers%n7 to delete a song%n0 to quit%nEnter Choice: ");
            songChoice = scnr.nextInt();
        }
        while (seconds > 0) {
            switch (songChoice) {
                case 1:
                    printWastedTime2(wastedTime, wastedTimes, openUp, openTimes, disasterAverted, disasterTimes, gotTime, gotTimes, singles, singleTimes, covers, coverTimes);
                    System.out.print("Enter the number of the song you would like to add, or enter 0 to go back: ");
                    int songNum = scnr.nextInt();
                    if (songNum == 0) {
                        break;
                    }
                    while (songNum >= 1 && songNum > wastedTime.length) {
                        System.out.println("Invalid option. Please enter a valid option.");
                        System.out.println("Enter the number of the song you would like to add: ");
                        songNum = scnr.nextInt();
                    }
                    if (seconds - wastedTimes[songNum - 1] < 0) {
                        System.out.println("That song is too long for the setlist. Please enter a valid option.");
                        System.out.println("Enter the number of the song you would like to add: ");
                        songNum = scnr.nextInt();
                    }
                    else {
                        if (setlist.contains(wastedTime[songNum - 1])) {
                            System.out.println("That song is already in the setlist. Please enter a valid option.");
                            System.out.println("Enter the number of the song you would like to add: ");
                            songNum = scnr.nextInt();
                        }
                        else {
                        setlist.add(wastedTime[songNum - 1]);
                        System.out.println("Added song: " + wastedTime[songNum - 1]);
                        duration.add(wastedTimes[songNum -1]);
                        seconds -= wastedTimes[songNum - 1];
                        numOfSongs++;
                        }
                    }
                    break;
                case 2:
                printDisasterAverted2(disasterAverted, disasterTimes);
                    System.out.println("Enter the number of the song you would like to add: ");
                    songNum = scnr.nextInt();
                    while (songNum >=1 && songNum > openUp.length) {
                        System.out.println("Invalid option. Please enter a valid option.");
                        System.out.println("Enter the number of the song you would like to add: ");
                        songNum = scnr.nextInt();
                    }
                    if (seconds - openTimes[songNum - 1] < 0) {
                        System.out.println("That song is too long for the setlist. Please enter a valid option.");
                        System.out.println("Enter the number of the song you would like to add: ");
                        songNum = scnr.nextInt();
                    }
                    else {
                        seconds -= openTimes[songNum - 1];
                        numOfSongs++;
                    }
                    break;
                case 3:
                    System.out.println("Enter the number of the song you would like to add: ");
                    songNum = scnr.nextInt();
                    while (songNum >=1 && songNum > disasterAverted.length) {
                        System.out.println("Invalid option. Please enter a valid option.");
                        System.out.println("Enter the number of the song you would like to add: ");
                        songNum = scnr.nextInt();
                    }
                    if (seconds - disasterTimes[songNum - 1] < 0) {
                        System.out.println("That song is too long for the setlist. Please enter a valid option.");
                        System.out.println("Enter the number of the song you would like to add: ");
                        songNum = scnr.nextInt();
                    }
                    else {
                        seconds -= disasterTimes[songNum - 1];
                        numOfSongs++;
                    }
                    break;
                case 4:
                    System.out.println("Enter the number of the song you would like to add: ");
                    songNum = scnr.nextInt();
                    while (songNum >=1 && songNum > gotTime.length) {
                        System.out.println("Invalid option. Please enter a valid option.");
                        System.out.println("Enter the number of the song you would like to add: ");
                        songNum = scnr.nextInt();
                    }
                    if (seconds - gotTimes[songNum - 1] < 0) {
                        System.out.println("That song is too long for the setlist. Please enter a valid option.");
                        System.out.println("Enter the number of the song you would like to add: ");
                        songNum = scnr.nextInt();
                    }
                    else {
                        seconds -= gotTimes[songNum - 1];
                        numOfSongs++;
                    }
                    break;
                case 5:
                    System.out.println("Enter the number of the song you would like to add: ");
                    songNum = scnr.nextInt();
                    while (songNum >=1 && songNum > singles.length) {
                        System.out.println("Invalid option. Please enter a valid option.");
                        System.out.println("Enter the number of the song you would like to add: ");
                        songNum = scnr.nextInt();
                    }
                    if (seconds - singleTimes[songNum - 1] < 0) {
                        System.out.println("That song is too long for the setlist. Please enter a valid option.");
                        System.out.println("Enter the number of the song you would like to add: ");
                        songNum = scnr.nextInt();
                    }
                    else {
                        seconds -= singleTimes[songNum - 1];
                        numOfSongs++;
                    }
                    break;
                case 6:
                    System.out.println("Enter the number of the song you would like to add: ");
                    songNum = scnr.nextInt();
                    while (songNum >= 1 && songNum > covers.length) {
                        System.out.println("Invalid option. Please enter a valid option.");
                        System.out.println("Enter the number of the song you would like to add: ");
                        songNum = scnr.nextInt();
                    }
                    if (seconds - coverTimes[songNum - 1] < 0) {
                        System.out.println("That song is too long for the setlist. Please enter a valid option.");
                        System.out.println("Enter the number of the song you would like to add: ");
                        songNum = scnr.nextInt();
                    }
                    else {
                        seconds -= coverTimes[songNum - 1];
                        numOfSongs++;
                    }
                    break;
                case 7:
                    System.out.println("Enter the number of the song you would like to remove: ");
                    songNum = scnr.nextInt();
                    while (songNum >= 1 && songNum > setlist.size()) {
                        System.out.println("Invalid option. Please enter a valid option.");
                        System.out.println("Enter the number of the song you would like to remove: ");
                        songNum = scnr.nextInt();
                    }
                    seconds += duration.get(songNum -1);
                    System.out.println("Removed song: " + setlist.get(songNum - 1));
                    setlist.remove(songNum - 1);
                    duration.remove(songNum -1);
                    numOfSongs--;
                    break;
                }
                System.out.printf("%nSetlist so far: %n");
                int setCounter = 1;
                for (String song: setlist) {
                    System.out.println(setCounter++ + ". " + song);
                }
                System.out.println(numOfSongs + " songs");
                System.out.println((seconds / 60) + ":" + (seconds % 60) + " remaining");
                System.out.println();
                System.out.printf("1. Add a song from Wasted Time%n2. Add a song from Disaster Averted%n3. Add a song from Open Up%n4. Add a song from Got Time%n5. Add a song from Singles%n6. Add a song from Covers%n7 to delete a song%n0 to quit%nEnter Choice: ");
                songChoice = scnr.nextInt();
            }
    }

    public static void main(String[] args) {
        String[] wastedTime = new String[]{"Journeyman", "Hyperdrive", "Now I See", "Ignition", "Interlude", "This Won't Be As Hard", "Right Now", "One Step At A Time", "Faux Sho'", "Faded Memories","When It Ends"};
        long[] wastedTimes = new long[]{266, 247, 166, 240, 106, 194, 142, 322, 202, 351, 316};
        String[] openUp = new String[]{"Wasted Time", "Over Me", "Empathy", "The Bad End"};
        long[] openTimes = new long[]{357, 299, 266, 502};
        String[] disasterAverted = new String[]{"Smoked Out", "Cowl & Cape", "The Great Uniter", "Open Up", "Me, Myself, And I", "Men of Myth", "Sight for Sore Eyes", "Another Unsolved Mystery", "Up In The Air", "The Wasteland Pt 1: The Fall", "The Wasteland Pt 2: The Escape", "The Wasteland Pt 3: Survivors Guilt"};
        long[] disasterTimes = new long[]{252, 197, 275, 250, 202, 261, 221, 351, 353, 386, 298, 263};
        String[] gotTime = new String[]{"Then", "Disaster Averted", "Arrested Development", "Procrastination Blues", "Eternal Beings"};
        long[] gotTimes = new long[]{177, 221, 231, 236, 348};
        String[] singles = new String[]{"Craving The Hunter"};
        long[] singleTimes = new long[]{193};
        String[] covers = new String[]{"R U Mine?", "Make It Wit Chu", "Moonage Daydream", "Woman"};
        long[] coverTimes = new long[]{201, 290, 279, 180};
        String menuOption;

        boolean continueProgram = true;
        while (continueProgram){
            printMenu();
            menuOption = scnr.next();
            while (!menuOption.equals("1") && !menuOption.equals("2") && !menuOption.equals("q")) {
                System.out.println("Invalid option. Idiot.");
                printMenu();
                menuOption = scnr.next();
            }
        switch(menuOption) {
            case "1": // build setlist
                buildSetlist(wastedTime, wastedTimes, openUp, openTimes, disasterAverted, disasterTimes, gotTime, gotTimes, singles, singleTimes, covers, coverTimes);
              break;
            case "2": // view the songs
                printMenu2(wastedTime, wastedTimes, openUp, openTimes, disasterAverted, disasterTimes, gotTime, gotTimes, singles, singleTimes, covers, coverTimes);

                break;
            case "q": // quit
                continueProgram = false;
                break;
        }
    }
        }
    }