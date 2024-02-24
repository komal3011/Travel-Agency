
import java.util.*;
/**
 * <h1>Travel_Agency</h1>
 Travel_Agency software system allows travel agencies to maintain their travel packages itinerary and passengers.
 @ author komal bhagure
 */


public class Travel_Agency {
    public static void main(String[] args) {
        System.out.println("Welcome to Explore World Pvt Lmd!");
        Travel_Package obj = new Travel_Package();
        obj.Display_Packages();
    }
}

//Print itinerary of the travel package
class Travel_Package{
    String Travel_Package1 = "1. Fun with Tourism", Travel_Package2 = "2. Tours and Travels", Travel_Package3 = "3. Travel Unlimited";
    //    capacities of each travel packages
    final int Cap_pckg1 = 7, Cap_pckg2 = 10, Cap_pckg3 = 5;

    public void Display_Packages() {
        System.out.println("List of travel packages offered by our travel agency: \n" + Travel_Package1 + " \n" + Travel_Package2 + " \n" + Travel_Package3 + " \n");
        Display_Destinations();
    }

    //   display destinations cover by each travel package
    public void Display_Destinations() {
        List<String> InnerList1 = new LinkedList<>(), InnerList2 = new LinkedList<>(), InnerList3 = new LinkedList<>();

        InnerList1.add("Saputara, Gujarat");
        InnerList1.add("Nashik, Maharashtra");
        InnerList1.add("Ajintha, Maharashtra");
        InnerList2.add("Jaipur, Rajasthan");
        InnerList2.add("Agra, Uttar Pradesh");
        InnerList2.add("Shimla, Himachal Pradesh");
        InnerList2.add("Kashmir, Jammu and Kashmir");
        InnerList3.add("Panaji, Goa");
        InnerList3.add("Lonavala, Maharashtra");
        InnerList3.add("Khandala, Maharashtra");
        InnerList3.add("Bhandardara, Maharashtra");

        int x;
        do {
            System.out.println("Enter number of the travel package of your choice to see itinerary: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("List of destinations available at travel package " + Travel_Package1 + " are: ");
                    for (int i = 0; i < InnerList1.size(); i++) {
                        System.out.println((i + 1) + ". " + InnerList1.get(i));
                    }
                    System.out.println();
                    displayActivities(num);
                    break;
                case 2:
                    System.out.println("List of destinations available at travel package " + Travel_Package2 + " are: ");
                    for (int i = 0; i < InnerList2.size(); i++) {
                        System.out.println((i + 1) + ". " + InnerList2.get(i));
                    }
                    System.out.println();
                    displayActivities(num);
                    break;
                case 3:
                    System.out.println("List of destinations available at travel package " + Travel_Package3 + " are: ");
                    for (int i = 0; i < InnerList3.size(); i++) {
                        System.out.println((i + 1) + ". " + InnerList3.get(i));
                    }
                    System.out.println();
                    displayActivities(num);
                    break;
                case 4:
                default:
                    System.out.println("Invalid choice. Please enter a valid number!");
                    System.exit(0);
            }
            System.out.println("Enter 1 if you want to see other travel package itinerary. If not enter any other random number");
            x = sc.nextInt();
        } while (x == 1);
    }


    //   display activities available at each destination. Each activity is available at one destination only.
    public void displayActivities(int num) {
        List<List<String>> MainList1 = new LinkedList<>(); //all activities of package 1
        List<String> InnerList1 = new LinkedList<>(), InnerList2 = new LinkedList<>(), InnerList3 = new LinkedList<>();
//        activities available at each destination in each package
//        package 1 activities
        InnerList1.add("Sunset point visit"); //1 for 1st destination
        InnerList1.add("Hill Station visit"); //list of activities available at Saputara, Gujarat of package 1
        InnerList2.add("Wine Yard visit"); //2 for 2nd destination
        InnerList2.add("Panchvati visit");
        InnerList2.add("Grapes farm visit");
        InnerList3.add("Caves Explore");//3 for 3rd destination
        InnerList3.add("Seek blessings in temple");

        MainList1.add(InnerList1);
        MainList1.add(InnerList2);
        MainList1.add(InnerList3);

//        2DList for storing cost per head of each activity res. of each destination of package 1
        List<List<Float>> MainCost = new LinkedList<>();
        List<Float> Cost1 = new LinkedList<>(), Cost2 = new LinkedList<>(), Cost3 = new LinkedList<>();
        Cost1.add(100F);
        Cost1.add(300F); //cost of each activity at 1st destination of package 1.
        Cost2.add(250F);
        Cost2.add(200F);
        Cost2.add(100F); //cost of each activity at 2nd destination of package 1.
        Cost3.add(250F);
        Cost3.add(150F);

        MainCost.add(Cost1);
        MainCost.add(Cost2);
        MainCost.add(Cost3);

//        2D list to store description of each activity of each destination of package 1
        List<List<String>> MainDescription = new LinkedList<>();
        List<String> Description1 = new LinkedList<>(), Description2 = new LinkedList<>(), Description3 = new LinkedList<>();
        Description1.add("We'll take you at high altitude place in Saputara! You'll see fuller look of Sun! ");
        Description1.add("You'll see mesmerizing view of clouds, green and fresh fields at hill station!");
        Description2.add("See how's the real wine made? Take sip of red wine and participate in wine making by traditional way! ");
        Description2.add("Visit holy old city of nashik and seek blessings from temples situated at holy Godavari bank!");
        Description2.add("Visit grapes farm and taste delicious fresh grapes directly from farm!");
        Description3.add("Explore mysterious 5000 years old caves!");
        Description3.add("Seek blessings from 5000 years old Holy Kailash Temple of Lord Mahadeva!");

        MainDescription.add(Description1);
        MainDescription.add(Description2);
        MainDescription.add(Description3);

        //        2D list to store capacity of each activity of each destination of package 1
        List<List<Integer>> MainCapacity = new LinkedList<>();
        List<Integer> Capacity1 = new LinkedList<>(), Capacity2 = new LinkedList<>(), Capacity3 = new LinkedList<>();
        Capacity1.add(4);
        Capacity1.add(5);
        Capacity2.add(3);
        Capacity2.add(4);
        Capacity2.add(3);
        Capacity3.add(3);
        Capacity3.add(2);

        MainCapacity.add(Capacity1);
        MainCapacity.add(Capacity2);
        MainCapacity.add(Capacity3);

//        now we'll store activities for package 2
        List<List<String>> MainList2 = new LinkedList<>(); //all activities of package 2
        List<String> List1 = new LinkedList<>(), List2 = new LinkedList<>(), List3 = new LinkedList<>(), List4 = new LinkedList<>();
        List1.add("Camel Riding");
        List1.add("Desert Visit");
        List2.add("Tajmahal Visit");
        List3.add("Paragliding");
        List3.add("Camping");
        List4.add("Go Trekking");
        List4.add("Visit Vaishno Devi Temple");
        List4.add("Snowboarding");
        MainList2.add(List1);
        MainList2.add(List2);
        MainList2.add(List3);
        MainList2.add(List4);

//        2DList for storing cost per head of each activity of each destination of package 2
        List<List<Float>> MainCost2 = new LinkedList<>();
        List<Float> cost1_Pckg2 = new LinkedList<>(), cost2_Pckg2 = new LinkedList<>(), cost3_Pckg2 = new LinkedList<>(), cost4_Pckg2 = new LinkedList<>();
        cost1_Pckg2.add(150F);
        cost1_Pckg2.add(100F);
        cost2_Pckg2.add(100F);
        cost3_Pckg2.add(5000F);
        cost3_Pckg2.add(3000F);
        cost4_Pckg2.add(500F);
        cost4_Pckg2.add(150F);
        cost4_Pckg2.add(1000F);
        MainCost2.add(cost1_Pckg2);
        MainCost2.add(cost2_Pckg2);
        MainCost2.add(cost3_Pckg2);
        MainCost2.add(cost4_Pckg2);

        //        2D list to store description of each activity of each destination of package 2
        List<List<String>> MainDescription2 = new LinkedList<>();
        List<String> Descr1_pckg2 = new LinkedList<>(), Descr2_pckg2 = new LinkedList<>(), Descr3_pckg2 = new LinkedList<>(), Descr4_pckg2 = new LinkedList<>();
        Descr1_pckg2.add("Camel ride up-to straight 2 km");
        Descr1_pckg2.add("Enjoy the golden sand of desert");
        Descr2_pckg2.add("Visit one of the 8th wonder of world!");
        Descr3_pckg2.add("Roam in the mountains of Shimla & enjoy cold breeze!");
        Descr3_pckg2.add("Enjoy the cool wind of Shimla at night by staying in camps!");
        Descr4_pckg2.add("Join the adventure & go trekking and achieve peak of mountain!");
        Descr4_pckg2.add("Seek blessings of Mata Vaishno Devi");
        Descr4_pckg2.add("Play in the white snow!");
        MainDescription2.add(Descr1_pckg2);
        MainDescription2.add(Descr2_pckg2);
        MainDescription2.add(Descr3_pckg2);
        MainDescription2.add(Descr4_pckg2);

        //        2D list to store capacity of each activity of each destination of package 2
        List<List<Integer>> MainCapacity2 = new LinkedList<>();
        List<Integer> capa1_pckg2 = new LinkedList<>(), capa2_pckg2 = new LinkedList<>(), capa3_pckg2 = new LinkedList<>(), capa4_pckg2 = new LinkedList<>();
        capa1_pckg2.add(2);
        capa1_pckg2.add(1);
        capa2_pckg2.add(5);
        capa3_pckg2.add(1);
        capa3_pckg2.add(2);
        capa4_pckg2.add(4);
        capa4_pckg2.add(3);
        capa4_pckg2.add(3);
        MainCapacity2.add(capa1_pckg2);
        MainCapacity2.add(capa2_pckg2);
        MainCapacity2.add(capa3_pckg2);
        MainCapacity2.add(capa4_pckg2);

//        now we'll store activities for package 3
        List<List<String>> MainList3 = new LinkedList<>(); //all activities of package 3
        List<String> list1 = new LinkedList<>(), list2 = new LinkedList<>(), list3 = new LinkedList<>(), list4 = new LinkedList<>();
        list1.add("Visit beach");
        list1.add("Try seafood & watersports");
        list2.add("Visit Fort");
        list3.add("Roaming in nature");
        list3.add("Try shooting");
        list4.add("Wet N Joy");
        list4.add("Boating");
        MainList3.add(list1);
        MainList3.add(list2);
        MainList3.add(list3);
        MainList3.add(list4);

        //        2DList for storing cost per head of each activity of each destination of package 3
        List<List<Float>> MainCost3 = new LinkedList<>();
        List<Float> cost1_Pckg3 = new LinkedList<>(), cost2_Pckg3 = new LinkedList<>(), cost3_Pckg3 = new LinkedList<>(), cost4_Pckg3 = new LinkedList<>();
        cost1_Pckg3.add(500F);
        cost1_Pckg3.add(1500F);
        cost2_Pckg3.add(100F);
        cost3_Pckg3.add(300F);
        cost3_Pckg3.add(350F);
        cost4_Pckg3.add(500F);
        cost4_Pckg3.add(400F);
        MainCost3.add(cost1_Pckg3);
        MainCost3.add(cost2_Pckg3);
        MainCost3.add(cost3_Pckg3);
        MainCost3.add(cost4_Pckg3);

        //        2D list to store description of each activity of each destination of package 3
        List<List<String>> MainDescription3 = new LinkedList<>();
        List<String> Descr1_pckg3 = new LinkedList<>(), Descr2_pckg3 = new LinkedList<>(), Descr3_pckg3 = new LinkedList<>(), Descr4_pckg3 = new LinkedList<>();
        Descr1_pckg3.add("Take sunbath. Have beach party. Forget all stress and just groove");
        Descr1_pckg3.add("Try watersports like scubadiving, have taste of seafood.");
        Descr2_pckg3.add("Climb up the majestic Lohagad Fort");
        Descr3_pckg3.add("Get enrich experience & refresh at Tamhini Ghat.");
        Descr3_pckg3.add("Go shooting point");
        Descr4_pckg3.add("Wet in popular tourists attraction Randha waterfalls with cool monsoons breeze");
        Descr4_pckg3.add("Try boating and fishing at famous Arthur lake");
        MainDescription3.add(Descr1_pckg3);
        MainDescription3.add(Descr2_pckg3);
        MainDescription3.add(Descr3_pckg3);
        MainDescription3.add(Descr4_pckg3);

        //        2D list to store capacity of each activity of each destination of package 3
        List<List<Integer>> MainCapacity3 = new LinkedList<>();
        List<Integer> capa1_pckg3 = new LinkedList<>(), capa2_pckg3 = new LinkedList<>(), capa3_pckg3 = new LinkedList<>(), capa4_pckg3 = new LinkedList<>();
        capa1_pckg3.add(4);
        capa1_pckg3.add(5);
        capa2_pckg3.add(3);
        capa3_pckg3.add(2);
        capa3_pckg3.add(2);
        capa4_pckg3.add(1);
        capa4_pckg3.add(5);
        MainCapacity3.add(capa1_pckg3);
        MainCapacity3.add(capa2_pckg3);
        MainCapacity3.add(capa3_pckg3);
        MainCapacity3.add(capa4_pckg3);

        switch (num) {
            case 1:
                for (int i = 0; i < MainList1.size(); i++) {
                    System.out.println();
                    System.out.println("*Activities available at destination " + (i + 1) + " of Travel_Package1 are: ");
                    for (int j = 0; j < MainList1.get(i).size(); j++) {
                        System.out.println((j + 1) + ". " + MainList1.get(i).get(j));
                        System.out.println("Description: " + MainDescription.get(i).get(j)); //description of each activity
                        System.out.println("Cost of " + MainList1.get(i).get(j) + " activity is Rs. " + MainCost.get(i).get(j) + " per head."); //print cost of each activity
                        System.out.println("Capacity of " + MainList1.get(i).get(j) + " activity is " + MainCapacity.get(i).get(j) + " people.");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i < MainList2.size(); i++) {
                    System.out.println();
                    System.out.println("*Activities available at destination " + (i + 1) + " of Travel_Package2 are: ");
                    for (int j = 0; j < MainList2.get(i).size(); j++) {
                        System.out.println((j + 1) + ". " + MainList2.get(i).get(j));
                        System.out.println("Description: " + MainDescription2.get(i).get(j)); //description of each activity
                        System.out.println("Cost of " + MainList2.get(i).get(j) + " activity is Rs. " + MainCost2.get(i).get(j) + " per head."); //print cost of each activity
                        System.out.println("Capacity of " + MainList2.get(i).get(j) + " activity is " + MainCapacity2.get(i).get(j) + " people.");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 0; i < MainList3.size(); i++) {
                    System.out.println();
                    System.out.println("*Activities available at destination " + (i + 1) + " of Travel_Package3 are: ");
                    for (int j = 0; j < MainList3.get(i).size(); j++) {
                        System.out.println((j + 1) + ". " + MainList3.get(i).get(j));
                        System.out.println("Description: " + MainDescription3.get(i).get(j)); //description of each activity
                        System.out.println("Cost of " + MainList3.get(i).get(j) + " activity is Rs. " + MainCost3.get(i).get(j) + " per head."); //print cost of each activity
                        System.out.println("Capacity of " + MainList3.get(i).get(j) + " activity is " + MainCapacity3.get(i).get(j) + " people.");
                    }
                    System.out.println();
                }
                break;
        }
        Passenger_List P = new Passenger_List();
        P.printPassengerList(num);

        List<Float> balanceList = new LinkedList<>();
        //    balance of each passenger resp.
        balanceList.add(500f);
        balanceList.add(200f);
        balanceList.add(650f);
        balanceList.add(400f);
        balanceList.add(6500f);
        balanceList.add(3500f);
        balanceList.add(500f);
        balanceList.add(2500f);
        balanceList.add(1000f);
        balanceList.add(350f);
        balanceList.add(2300f);
        balanceList.add(1800f);

//        inner class
        class SignUp {
            //            to track capacity of activities
//           capacities of activities of package 1
            int TrckC_A1P1 = 0, TrckC_A2P1 = 0, TrckC_A3P1 = 0, TrckC_A4P1 = 0, TrckC_A5P1 = 0, TrckC_A6P1 = 0, TrckC_A7P1 = 0;

            //            for package 2
            int TrckC_A1P2 = 0, TrckC_A2P2 = 0, TrckC_A3P2 = 0, TrckC_A4P2 = 0, TrckC_A5P2 = 0, TrckC_A6P2 = 0, TrckC_A7P2 = 0, TrckC_A8P2 = 0;

            //           for package 3
            int TrckC_A1P3 = 0, TrckC_A2P3 = 0, TrckC_A3P3 = 0, TrckC_A4P3 = 0, TrckC_A5P3 = 0, TrckC_A6P3 = 0, TrckC_A7P3 = 0;

            List<String> activitySignup = new LinkedList<>();
            List<Integer> num = new LinkedList<>();

//          to signup for activities
            public void ActivitySignUp() throws NullPointerException {
                int y;
                do {
                    System.out.println("\nEnter name of the activity from your enrolled package for which you want to sign up/-");
                    Scanner sc = new Scanner(System.in);
                    String str = sc.nextLine();
                    System.out.println("Enter your passenger number");
                    int n = sc.nextInt();
                    if (n <= 4 && n > 0) { //only 1-4 passengers can access package 1 activities
                        switch (str) {
                            case "Sunset point visit":
                                if (TrckC_A1P1 >= Capacity1.get(0)) {
                                    System.out.println("This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 1: // standard
                                        if (balanceList.get(0) >= Cost1.get(0)) {
                                            balanceList.set(0, (balanceList.get(0) - Cost1.get(0)));
                                            TrckC_A1P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("Can't SignUp. You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 2: // standard
                                        if (balanceList.get(1) >= Cost1.get(0)) {
                                            balanceList.set(1, (balanceList.get(1) - Cost1.get(0)));
                                            TrckC_A1P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 3: //gold
                                        if (balanceList.get(2) >= Cost1.get(0)) {
                                            balanceList.set(2, (balanceList.get(2) - ((10f / 100f) * Cost1.get(0))));
                                            TrckC_A1P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 4: //premium
                                        TrckC_A1P1++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                }
                                break;
                            case "Hill Station visit":
                                if (TrckC_A2P1 >= Capacity1.get(1)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 1: // standard
                                        if (balanceList.get(0) >= Cost1.get(1)) {
                                            balanceList.set(0, (balanceList.get(0) - Cost1.get(1)));
                                            TrckC_A2P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 2: // standard
                                        if (balanceList.get(1) >= Cost1.get(1)) {
                                            balanceList.set(1, (balanceList.get(1) - Cost1.get(1)));
                                            TrckC_A2P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 3: //gold
                                        if (balanceList.get(2) >= Cost1.get(1)) {
                                            balanceList.set(2, (balanceList.get(2) - ((10f / 100f) * Cost1.get(1))));
                                            TrckC_A2P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 4: //premium
                                        TrckC_A2P1++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                }
                                break;
                            case "Wine Yard visit":
                                if (TrckC_A3P1 >= Capacity2.get(0)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 1: // standard
                                        if (balanceList.get(0) >= Cost2.get(0)) {
                                            balanceList.set(0, (balanceList.get(0) - Cost2.get(0)));
                                            TrckC_A3P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 2: // standard
                                        if (balanceList.get(1) >= Cost2.get(0)) {
                                            balanceList.set(1, (balanceList.get(1) - Cost2.get(0)));
                                            TrckC_A3P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 3: //gold
                                        if (balanceList.get(2) >= Cost2.get(0)) {
                                            balanceList.set(2, (balanceList.get(2) - ((10f / 100f) * Cost2.get(0))));
                                            TrckC_A3P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 4: //premium
                                        TrckC_A3P1++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                }
                                break;
                            case "Panchvati visit":
                                if (TrckC_A4P1 >= Capacity2.get(1)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 1: // standard
                                        if (balanceList.get(0) >= Cost2.get(1)) {
                                            balanceList.set(0, (balanceList.get(0) - Cost2.get(1)));
                                            TrckC_A4P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 2: // standard
                                        if (balanceList.get(1) >= Cost2.get(1)) {
                                            balanceList.set(1, (balanceList.get(1) - Cost2.get(1)));
                                            TrckC_A4P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 3: //gold
                                        if (balanceList.get(2) >= Cost2.get(1)) {
                                            balanceList.set(2, (balanceList.get(2) - ((10f / 100f) * Cost2.get(1))));
                                            TrckC_A4P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 4: //premium
                                        TrckC_A4P1++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                }
                                break;
                            case "Grapes farm visit":
                                if (TrckC_A5P1 >= Capacity2.get(2)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 1: // standard
                                        if (balanceList.get(0) >= Cost2.get(2)) {
                                            balanceList.set(0, (balanceList.get(0) - Cost2.get(2)));
                                            TrckC_A5P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 2: // standard
                                        if (balanceList.get(1) >= Cost2.get(2)) {
                                            balanceList.set(1, (balanceList.get(1) - Cost2.get(2)));
                                            TrckC_A5P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 3: //gold
                                        if (balanceList.get(2) >= Cost2.get(2)) {
                                            balanceList.set(2, (balanceList.get(2) - ((10f / 100f) * Cost2.get(2))));
                                            TrckC_A5P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 4: //premium
                                        TrckC_A5P1++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                }
                                break;
                            case "Caves Explore":
                                if (TrckC_A6P1 >= Capacity3.get(0)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 1: // standard
                                        if (balanceList.get(0) >= Cost3.get(0)) {
                                            balanceList.set(0, (balanceList.get(0) - Cost3.get(0)));
                                            TrckC_A6P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 2: // standard
                                        if (balanceList.get(1) >= Cost3.get(0)) {
                                            balanceList.set(1, (balanceList.get(1) - Cost3.get(0)));
                                            TrckC_A6P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 3: //gold
                                        if (balanceList.get(2) >= Cost3.get(0)) {
                                            balanceList.set(2, (balanceList.get(2) - ((10f / 100f) * Cost3.get(0))));
                                            TrckC_A6P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 4: //premium
                                        TrckC_A6P1++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                }
                                break;
                            case "Seek blessings in temple":
                                if (TrckC_A7P1 >= Capacity3.get(1)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 1: // standard
                                        if (balanceList.get(0) >= Cost3.get(1)) {
                                            balanceList.set(0, (balanceList.get(0) - Cost3.get(1)));
                                            TrckC_A7P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 2: // standard
                                        if (balanceList.get(1) >= Cost3.get(1)) {
                                            balanceList.set(1, (balanceList.get(1) - Cost3.get(1)));
                                            TrckC_A7P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 3: //gold
                                        if (balanceList.get(2) >= Cost3.get(1)) {
                                            balanceList.set(2, (balanceList.get(2) - ((10f / 100f) * Cost3.get(1))));
                                            TrckC_A7P1++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 4: //premium
                                        TrckC_A7P1++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                }
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a valid choice!");
                        }
                    }

                    if (n >= 5 && n <= 10) { //only 5-10 passengers can access package 2 activities
                        switch (str) {
                            case "Camel Riding":
                                if (TrckC_A1P2 >= capa1_pckg2.get(0)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 5: // premium
                                        TrckC_A1P2++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                    case 6: // standard
                                        if (balanceList.get(5) >= cost1_Pckg2.get(0)) {
                                            balanceList.set(5, (balanceList.get(5) - cost1_Pckg2.get(0)));
                                            TrckC_A1P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 7: //gold
                                        if (balanceList.get(6) >= cost1_Pckg2.get(0)) {
                                            balanceList.set(6, (balanceList.get(6) - ((10f / 100f) * cost1_Pckg2.get(0))));
                                            TrckC_A1P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 8: //gold
                                        if (balanceList.get(7) >= cost1_Pckg2.get(0)) {
                                            balanceList.set(7, (balanceList.get(7) - ((10f / 100f) * cost1_Pckg2.get(0))));
                                            TrckC_A1P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 9: //premium
                                    case 10: //premium
                                        TrckC_A1P2++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                }
                                break;
                            case "Desert Visit":
                                if (TrckC_A2P2 >= capa1_pckg2.get(1)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 5: // premium
                                        TrckC_A2P2++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                    case 6: // standard
                                        if (balanceList.get(5) >= cost1_Pckg2.get(1)) {
                                            balanceList.set(5, (balanceList.get(5) - cost1_Pckg2.get(1)));
                                            TrckC_A2P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 7: //gold
                                        if (balanceList.get(6) >= cost1_Pckg2.get(1)) {
                                            balanceList.set(6, (balanceList.get(6) - ((10f / 100f) * cost1_Pckg2.get(1))));
                                            TrckC_A2P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 8: //gold
                                        if (balanceList.get(7) >= cost1_Pckg2.get(1)) {
                                            balanceList.set(7, (balanceList.get(7) - ((10f / 100f) * cost1_Pckg2.get(1))));
                                            TrckC_A2P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 9: //premium
                                    case 10: //premium
                                        TrckC_A2P2++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                }
                                break;
                            case "Tajmahal Visit":
                                if (TrckC_A3P2 >= capa2_pckg2.get(0)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 5: // premium
                                        TrckC_A3P2++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                    case 6: // standard
                                        if (balanceList.get(5) >= cost2_Pckg2.get(0)) {
                                            balanceList.set(5, (balanceList.get(5) - cost2_Pckg2.get(0)));
                                            TrckC_A3P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 7: //gold
                                        if (balanceList.get(6) >= cost2_Pckg2.get(0)) {
                                            balanceList.set(6, (balanceList.get(6) - ((10f / 100f) * cost2_Pckg2.get(0))));
                                            TrckC_A3P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 8: //gold
                                        if (balanceList.get(7) >= cost2_Pckg2.get(0)) {
                                            balanceList.set(7, (balanceList.get(7) - ((10f / 100f) * cost2_Pckg2.get(0))));
                                            TrckC_A3P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                    case 9://premium
                                    case 10://premium
                                        TrckC_A3P2++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                }
                                break;
                            case "Paragliding":
                                if (TrckC_A4P2 >= capa3_pckg2.get(0)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 5: //premium
                                        TrckC_A4P2++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                    case 6: // standard
                                        if (balanceList.get(5) >= cost3_Pckg2.get(0)) {
                                            balanceList.set(5, (balanceList.get(5) - cost3_Pckg2.get(0)));
                                            TrckC_A4P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 7: //gold
                                        if (balanceList.get(6) >= cost3_Pckg2.get(0)) {
                                            balanceList.set(6, (balanceList.get(6) - ((10f / 100f) * cost3_Pckg2.get(0))));
                                            TrckC_A4P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 8: //gold
                                        if (balanceList.get(7) >= cost3_Pckg2.get(0)) {
                                            balanceList.set(7, (balanceList.get(7) - ((10f / 100f) * cost3_Pckg2.get(0))));
                                            TrckC_A4P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 9: //premium
                                    case 10: //premium
                                        TrckC_A4P2++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                }
                                break;
                            case "Camping":
                                if (TrckC_A5P2 >= capa3_pckg2.get(1)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 5: // premium
                                        TrckC_A5P2++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                    case 6: // standard
                                        if (balanceList.get(5) >= cost3_Pckg2.get(1)) {
                                            balanceList.set(5, (balanceList.get(5) - cost3_Pckg2.get(1)));
                                            TrckC_A5P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 7: //gold
                                        if (balanceList.get(6) >= cost3_Pckg2.get(1)) {
                                            balanceList.set(6, (balanceList.get(6) - ((10f / 100f) * cost3_Pckg2.get(1))));
                                            TrckC_A5P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 8: //gold
                                        if (balanceList.get(7) >= cost3_Pckg2.get(1)) {
                                            balanceList.set(7, (balanceList.get(7) - ((10f / 100f) * cost3_Pckg2.get(1))));
                                            TrckC_A5P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 9: //premium
                                    case 10: //premium
                                        TrckC_A5P2++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                }
                                break;
                            case "Go Trekking":
                                if (TrckC_A6P2 >= capa4_pckg2.get(0)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 5: // premium
                                        TrckC_A6P2++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                    case 6: // standard
                                        if (balanceList.get(5) >= cost4_Pckg2.get(0)) {
                                            balanceList.set(5, (balanceList.get(5) - cost4_Pckg2.get(0)));
                                            TrckC_A6P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 7: //gold
                                        if (balanceList.get(6) >= cost4_Pckg2.get(0)) {
                                            balanceList.set(6, (balanceList.get(6) - ((10f / 100f) * cost4_Pckg2.get(0))));
                                            TrckC_A6P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 8: //gold
                                        if (balanceList.get(7) >= cost4_Pckg2.get(0)) {
                                            balanceList.set(7, (balanceList.get(7) - ((10f / 100f) * cost4_Pckg2.get(0))));
                                            TrckC_A6P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 9: //premium
                                    case 10: //premium
                                        TrckC_A6P2++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                }
                                break;
                            case "Visit Vaishno Devi Temple":
                                if (TrckC_A7P2 >= capa4_pckg2.get(1)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 5: // premium
                                        TrckC_A7P2++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                    case 6: // standard
                                        if (balanceList.get(5) >= cost4_Pckg2.get(1)) {
                                            balanceList.set(5, (balanceList.get(5) - cost4_Pckg2.get(1)));
                                            TrckC_A7P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 7: //gold
                                        if (balanceList.get(6) >= cost4_Pckg2.get(1)) {
                                            balanceList.set(6, (balanceList.get(6) - ((10f / 100f) * cost4_Pckg2.get(1))));
                                            TrckC_A7P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 8: //gold
                                        if (balanceList.get(7) >= cost4_Pckg2.get(1)) {
                                            balanceList.set(7, (balanceList.get(7) - ((10f / 100f) * cost4_Pckg2.get(1))));
                                            TrckC_A7P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 9: //premium
                                    case 10: //premium
                                        TrckC_A7P2++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                }
                                break;
                            case "Snowboarding":
                                if (TrckC_A8P2 >= capa4_pckg2.get(2)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 5: // premium
                                        TrckC_A8P2++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                    case 6: // standard
                                        if (balanceList.get(5) >= cost4_Pckg2.get(2)) {
                                            balanceList.set(5, (balanceList.get(5) - cost4_Pckg2.get(2)));
                                            TrckC_A8P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 7: //gold
                                        if (balanceList.get(6) >= cost4_Pckg2.get(2)) {
                                            balanceList.set(6, (balanceList.get(6) - ((10f / 100f) * cost4_Pckg2.get(2))));
                                            TrckC_A8P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 8: //gold
                                        if (balanceList.get(7) >= cost4_Pckg2.get(2)) {
                                            balanceList.set(7, (balanceList.get(7) - ((10f / 100f) * cost4_Pckg2.get(2))));
                                            TrckC_A8P2++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 9: // premium
                                    case 10: // premium
                                        TrckC_A8P2++;
                                        activitySignup.add(str);
                                        num.add(n);
                                        System.out.println("Congrats! You've successfully sign up for this activity");
                                        break;
                                }
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a valid choice!");
                        }
                    }

                    if (n >= 11 && n <= 12) { //only 11-12 passengers can access package 3 activities
                        switch (str) {
                            case "Visit beach":
                                if (TrckC_A1P3 >= capa1_pckg3.get(0)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 11: // gold
                                        if (balanceList.get(10) >= cost1_Pckg3.get(0)) {
                                            balanceList.set(10, (balanceList.get(10) - ((10f / 100f) * cost1_Pckg3.get(0))));
                                            TrckC_A1P3++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 12: // standard
                                        if (balanceList.get(11) >= cost1_Pckg3.get(0)) {
                                            balanceList.set(11, (balanceList.get(11) - cost1_Pckg3.get(0)));
                                            TrckC_A1P3++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                }
                                break;
                            case "Try seafood & watersports":
                                if (TrckC_A2P3 >= capa1_pckg3.get(1)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 11: // gold
                                        if (balanceList.get(10) >= cost1_Pckg3.get(1)) {
                                            balanceList.set(10, (balanceList.get(10) - ((10f / 100f) * cost1_Pckg3.get(1))));
                                            TrckC_A2P3++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 12: // standard
                                        if (balanceList.get(11) >= cost1_Pckg3.get(1)) {
                                            balanceList.set(11, (balanceList.get(11) - cost1_Pckg3.get(1)));
                                            TrckC_A2P3++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                }
                                break;
                            case "Visit Fort":
                                if (TrckC_A3P3 >= capa2_pckg3.get(0)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 11: // gold
                                        if (balanceList.get(10) >= cost2_Pckg3.get(0)) {
                                            balanceList.set(10, (balanceList.get(10) - ((10f / 100f) * cost2_Pckg3.get(0))));
                                            TrckC_A3P3++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 12: // standard
                                        if (balanceList.get(11) >= cost2_Pckg3.get(0)) {
                                            balanceList.set(11, (balanceList.get(11) - cost2_Pckg3.get(0)));
                                            TrckC_A3P3++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                }
                                break;
                            case "Roaming in nature":
                                if (TrckC_A4P3 >= capa3_pckg3.get(0)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 11: // gold
                                        if (balanceList.get(10) >= cost3_Pckg3.get(0)) {
                                            balanceList.set(10, (balanceList.get(10) - ((10f / 100f) * cost3_Pckg3.get(0))));
                                            TrckC_A4P3++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 12: // standard
                                        if (balanceList.get(11) >= cost3_Pckg3.get(0)) {
                                            balanceList.set(11, (balanceList.get(11) - cost3_Pckg3.get(0)));
                                            TrckC_A4P3++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                }
                                break;
                            case "Try shooting":
                                if (TrckC_A5P3 >= capa3_pckg3.get(1)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 11: // gold
                                        if (balanceList.get(10) >= cost3_Pckg3.get(1)) {
                                            balanceList.set(10, (balanceList.get(10) - ((10f / 100f) * cost3_Pckg3.get(1))));
                                            TrckC_A5P3++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 12: // standard
                                        if (balanceList.get(11) >= cost3_Pckg3.get(1)) {
                                            balanceList.set(11, (balanceList.get(11) - cost3_Pckg3.get(1)));
                                            TrckC_A5P3++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                }
                                break;
                            case "Wet N Joy":
                                if (TrckC_A6P3 >= capa4_pckg3.get(0)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 11: // standard
                                        if (balanceList.get(10) >= cost4_Pckg3.get(0)) {
                                            balanceList.set(10, (balanceList.get(10) - ((10f / 100f) * cost4_Pckg3.get(0))));
                                            TrckC_A6P3++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 12: // standard
                                        if (balanceList.get(11) >= cost4_Pckg3.get(0)) {
                                            balanceList.set(11, (balanceList.get(11) - cost4_Pckg3.get(0)));
                                            TrckC_A6P3++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                }
                                break;
                            case "Boating":
                                if (TrckC_A7P3 >= capa4_pckg3.get(1)) {
                                    System.out.println("Can't SignUp. This activity has reached it's capacity & no more passengers can sign up for it.");
                                    break;
                                }
                                switch (n) {
                                    case 11: // gold
                                        if (balanceList.get(10) >= cost4_Pckg3.get(1)) {
                                            balanceList.set(10, (balanceList.get(10) - ((10f / 100f) * cost4_Pckg3.get(1))));
                                            TrckC_A7P3++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                    case 12: // standard
                                        if (balanceList.get(11) >= cost4_Pckg3.get(1)) {
                                            balanceList.set(11, (balanceList.get(11) - cost4_Pckg3.get(1)));
                                            TrckC_A7P3++;
                                            activitySignup.add(str);
                                            num.add(n);
                                            System.out.println("Congrats! You've successfully sign up for this activity");
                                        } else {
                                            System.out.println("You cannot sign up for this activity because you do not have sufficient balance.");
                                        }
                                        break;
                                }
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a valid choice!");
                        }
                    }
                    System.out.println("Enter 1 if you want to signup for other activities. If not enter any other random number");
                    y = sc.nextInt();
                } while (y == 1);

            }

            public void individualPassengerDetails() throws IndexOutOfBoundsException {
                Map<Integer, String> PassengerInfo = new HashMap<>();
                PassengerInfo.put(1, "komal"); //standard
                PassengerInfo.put(2, "tejas"); //standard
                PassengerInfo.put(3, "chetan"); //gold
                PassengerInfo.put(4, "isha"); //premium
                PassengerInfo.put(5, "chinmay"); //premium
                PassengerInfo.put(6, "ashwini"); //standard
                PassengerInfo.put(7, "ishwari"); //gold
                PassengerInfo.put(8, "sam"); //gold
                PassengerInfo.put(9, "tanu"); //premium
                PassengerInfo.put(10, "ayush"); //premium
                PassengerInfo.put(11, "harshali"); //gold
                PassengerInfo.put(12, "prasad"); //standard

                List<String> destntnList = new LinkedList<>();
                destntnList.add("Saputara, Gujarat");
                destntnList.add("Nashik, Maharashtra");
                destntnList.add("Ajintha, Maharashtra");
                destntnList.add("Jaipur, Rajasthan");
                destntnList.add("Agra, Uttar Pradesh");
                destntnList.add("Shimla, Himachal Pradesh");
                destntnList.add("Kashmir, Jammu and Kashmir");
                destntnList.add("Panaji, Goa");
                destntnList.add("Lonavala, Maharashtra");
                destntnList.add("Khandala, Maharashtra");
                destntnList.add("Bhandardara, Maharashtra");

//                list of passengers who signed up for activities
                for (Map.Entry<Integer, String> e : PassengerInfo.entrySet()) {
                    for (int j = 0; j < num.size(); j++) {
//                        try {
                        if (e.getKey().equals(num.get(j))) {
                            System.out.println("name: " + PassengerInfo.get(num.get(j)) + " passenger number: " + num.get(j));
                            System.out.println("balance " + balanceList.get(num.get(j) - 1));
                            System.out.print("passenger signed up for activity " + activitySignup.get(j));
                            if (InnerList1.contains(activitySignup.get(j))) {
                                System.out.println(" at destination " + destntnList.get(0));
                                if (num.get(j) == 3){
                                    System.out.println("price the passenger paid for the activity is Rs. " + ((10f / 100f) * Cost1.get(InnerList1.indexOf(activitySignup.get(j)))));
                                } else if (num.get(j) == 4) {
                                    System.out.println("Passenger did not pay any price for the activity as passenger is premium passenger.");
                                }else {
                                    System.out.println("price the passenger paid for the activity is Rs. " + Cost1.get(InnerList1.indexOf(activitySignup.get(j))));
                                }
                                } else if (InnerList2.contains(activitySignup.get(j))) {
                                System.out.println(" at destination " + destntnList.get(1));
                                if (num.get(j) == 3) {
                                    System.out.println("price the passenger paid for the activity is Rs. " + ((10f / 100f) * Cost2.get(InnerList2.indexOf(activitySignup.get(j)))));
                                } else if (num.get(j) == 4) {
                                    System.out.println("Passenger did not pay any price for the activity as passenger is premium passenger.");
                                } else{
                                    System.out.println("price the passenger paid for the activity is Rs. " + Cost2.get(InnerList2.indexOf(activitySignup.get(j))));
                                }
                            } else if (InnerList3.contains(activitySignup.get(j))) {
                                System.out.println(" at destination " + destntnList.get(2));
                                if (num.get(j) == 3) {
                                    System.out.println("price the passenger paid for the activity is Rs. " + ((10f / 100f) * Cost3.get(InnerList3.indexOf(activitySignup.get(j)))));
                                } else if (num.get(j) == 4) {
                                    System.out.println("Passenger did not pay any price for the activity as passenger is premium passenger.");
                                }else {
                                    System.out.println("price the passenger paid for the activity is Rs. " + Cost3.get(InnerList3.indexOf(activitySignup.get(j))));
                                }
                                } else if (List1.contains(activitySignup.get(j))) {
                                System.out.println(" at destination " + destntnList.get(3));
                                if (num.get(j) == 7 || num.get(j) == 8) {
                                    System.out.println("price the passenger paid for the activity is Rs. " + ((10f / 100f) * cost1_Pckg2.get(List1.indexOf(activitySignup.get(j)))));
                                } else if (num.get(j) == 5 || num.get(j) == 9 || num.get(j) == 10) {
                                    System.out.println("Passenger did not pay any price for the activity as passenger is premium passenger.");
                                }else {
                                    System.out.println("price the passenger paid for the activity is Rs. " + cost1_Pckg2.get(List1.indexOf(activitySignup.get(j))));
                                }
                                } else if (List2.contains(activitySignup.get(j))) {
                                System.out.println(" at destination " + destntnList.get(4));
                                if (num.get(j) == 7 || num.get(j) == 8) {
                                    System.out.println("price the passenger paid for the activity is Rs. " + ((10f / 100f) * cost2_Pckg2.get(List2.indexOf(activitySignup.get(j)))));
                                } else if (num.get(j) == 5 || num.get(j) == 9 || num.get(j) == 10) {
                                    System.out.println("Passenger did not pay any price for the activity as passenger is premium passenger.");
                                }else {
                                    System.out.println("price the passenger paid for the activity is Rs. " + cost2_Pckg2.get(List2.indexOf(activitySignup.get(j))));
                                }
                                } else if (List3.contains(activitySignup.get(j))) {
                                System.out.println(" at destination " + destntnList.get(5));
                                if (num.get(j) == 7 || num.get(j) == 8) {
                                    System.out.println("price the passenger paid for the activity is Rs. " + ((10f / 100f) * cost3_Pckg2.get(List3.indexOf(activitySignup.get(j)))));
                                } else if (num.get(j) == 5 || num.get(j) == 9 || num.get(j) == 10) {
                                    System.out.println("Passenger did not pay any price for the activity as passenger is premium passenger.");
                                }else {
                                    System.out.println("price the passenger paid for the activity is Rs. " + cost3_Pckg2.get(List3.indexOf(activitySignup.get(j))));
                                }
                                } else if (List4.contains(activitySignup.get(j))) {
                                System.out.println(" at destination " + destntnList.get(6));
                                if (num.get(j) == 7 || num.get(j) == 8) {
                                    System.out.println("price the passenger paid for the activity is Rs. " + ((10f / 100f) * cost4_Pckg2.get(List4.indexOf(activitySignup.get(j)))));
                                } else if (num.get(j) == 5 || num.get(j) == 9 || num.get(j) == 10) {
                                    System.out.println("Passenger did not pay any price for the activity as passenger is premium passenger.");
                                }else {
                                    System.out.println("price the passenger paid for the activity is Rs. " + cost4_Pckg2.get(List4.indexOf(activitySignup.get(j))));
                                }
                                } else if (list1.contains(activitySignup.get(j))) {
                                System.out.println(" at destination " + destntnList.get(7));
                                if (num.get(j) == 11) {
                                    System.out.println("price the passenger paid for the activity is Rs. " + ((10f / 100f) * cost1_Pckg3.get(list1.indexOf(activitySignup.get(j)))));
                                }else {
                                    System.out.println("price the passenger paid for the activity is Rs. " + cost1_Pckg3.get(list1.indexOf(activitySignup.get(j))));
                                }
                                } else if (list2.contains(activitySignup.get(j))) {
                                System.out.println(" at destination " + destntnList.get(8));
                                if (num.get(j) == 11) {
                                    System.out.println("price the passenger paid for the activity is Rs. " + ((10f / 100f) * cost2_Pckg3.get(list2.indexOf(activitySignup.get(j)))));
                                }else {
                                    System.out.println("price the passenger paid for the activity is Rs. " + cost2_Pckg3.get(list2.indexOf(activitySignup.get(j))));
                                }
                            } else if (list3.contains(activitySignup.get(j))) {
                                System.out.println(" at destination " + destntnList.get(9));
                                if (num.get(j) == 11) {
                                    System.out.println("price the passenger paid for the activity is Rs. " + ((10f / 100f) * cost3_Pckg3.get(list3.indexOf(activitySignup.get(j)))));
                                }else {
                                    System.out.println("price the passenger paid for the activity is Rs. " + cost3_Pckg3.get(list3.indexOf(activitySignup.get(j))));
                                }
                            } else if (list4.contains(activitySignup.get(j))) {
                                System.out.println(" at destination " + destntnList.get(10));
                                if (num.get(j) == 11) {
                                    System.out.println("price the passenger paid for the activity is Rs. " + ((10f / 100f) * cost4_Pckg3.get(list4.indexOf(activitySignup.get(j)))));
                                }else {
                                    System.out.println("price the passenger paid for the activity is Rs. " + cost4_Pckg3.get(list4.indexOf(activitySignup.get(j))));
                                }
                            } else {
                                System.out.println("invalid choice");
                            }
                        }
                    }
                }

//                list of passengers who didn't sign up for activities
                Set<Integer> keys = PassengerInfo.keySet(); keys.removeAll(num);
                for (Map.Entry<Integer, String> e : PassengerInfo.entrySet()) {
                    for (int i = 0; i < keys.size(); i++) {
                        Object[] arr = keys.stream().toArray();
                        if (arr[i] == e.getKey())
                            System.out.println("name: "+e.getValue()+" passenger number: "+e.getKey());
                    }
                    System.out.println("Passenger did not sign up for any activity");
                }
            }

//            Print the details of all the activities that still have spaces available
            public void ActivityDetails() {
                System.out.println("Details of all activities that still have spaces available");
                if (TrckC_A1P1 >= 0){
                    System.out.println(InnerList1.get(0));
                    System.out.println("spaces available: "+(Capacity1.get(0) - TrckC_A1P1));
                }
                if (TrckC_A2P1 >= 0){
                    System.out.println(InnerList1.get(1));
                    System.out.println("spaces available: "+(Capacity1.get(1) - TrckC_A2P1));
                }
                if (TrckC_A3P1 >= 0){
                    System.out.println(InnerList2.get(0));
                    System.out.println("spaces available: "+(Capacity2.get(0) - TrckC_A3P1));
                }
                if (TrckC_A4P1 >= 0){
                    System.out.println(InnerList2.get(1));
                    System.out.println("spaces available: "+(Capacity2.get(1) - TrckC_A4P1));
                }
                if (TrckC_A5P1 >= 0){
                    System.out.println(InnerList2.get(2));
                    System.out.println("spaces available: "+(Capacity2.get(2) - TrckC_A5P1));
                }
                if (TrckC_A6P1 >= 0){
                    System.out.println(InnerList3.get(0));
                    System.out.println("spaces available: "+(Capacity3.get(0) - TrckC_A6P1));
                }
                if (TrckC_A7P1 >= 0){
                    System.out.println(InnerList3.get(1));
                    System.out.println("spaces available: "+(Capacity3.get(1) - TrckC_A7P1));
                }
                if (TrckC_A1P2 >= 0){
                    System.out.println(List1.get(0));
                    System.out.println("spaces available: "+(capa1_pckg2.get(0) - TrckC_A1P2));
                }
                if (TrckC_A2P2 >= 0){
                    System.out.println(List1.get(1));
                    System.out.println("spaces available: "+(capa1_pckg2.get(1) - TrckC_A2P2));
                }
                if (TrckC_A3P2 >= 0){
                    System.out.println(List2.get(0));
                    System.out.println("spaces available: "+(capa2_pckg2.get(0) - TrckC_A3P2));
                }
                if (TrckC_A4P2 >= 0){
                    System.out.println(List3.get(0));
                    System.out.println("spaces available: "+(capa3_pckg2.get(0) -TrckC_A4P2));
                }
                if (TrckC_A5P2 >= 0){
                    System.out.println(List3.get(1));
                    System.out.println("spaces available: "+(capa3_pckg2.get(1) - TrckC_A5P2));
                }
                if (TrckC_A6P2 >= 0){
                    System.out.println(List4.get(0));
                    System.out.println("spaces available: "+(capa4_pckg2.get(0) - TrckC_A6P2));
                }
                if (TrckC_A7P2 >= 0){
                    System.out.println(List4.get(1));
                    System.out.println("spaces available: "+(capa4_pckg2.get(1) - TrckC_A7P2));
                }
                if (TrckC_A8P2 >= 0){
                    System.out.println(List4.get(2));
                    System.out.println("spaces available: "+(capa4_pckg2.get(2) - TrckC_A8P2));
                }
                if (TrckC_A1P3 >= 0){
                    System.out.println(list1.get(0));
                    System.out.println("spaces available: "+(capa1_pckg3.get(0) - TrckC_A1P3));
                }
                if (TrckC_A2P3 >= 0){
                    System.out.println(list1.get(1));
                    System.out.println("spaces available: "+(capa1_pckg3.get(1) - TrckC_A2P3));
                }
                if (TrckC_A3P3 >= 0){
                    System.out.println(list2.get(0));
                    System.out.println("spaces available: "+(capa2_pckg3.get(0) - TrckC_A3P3));
                }
                if (TrckC_A4P3 >= 0){
                    System.out.println(list3.get(0));
                    System.out.println("spaces available: "+(capa3_pckg3.get(0) - TrckC_A4P3));
                }
                if (TrckC_A5P3 >= 0){
                    System.out.println(list3.get(1));
                    System.out.println("spaces available: "+(capa3_pckg3.get(1) - TrckC_A5P3));
                }
                if (TrckC_A6P3 >= 0){
                    System.out.println(list4.get(0));
                    System.out.println("spaces available: "+(capa4_pckg3.get(0) - TrckC_A6P3));
                }
                if (TrckC_A7P3 >= 0){
                    System.out.println(list4.get(1));
                    System.out.println("spaces available: "+(capa4_pckg3.get(1) - TrckC_A7P3));
                }
            }
        }
            SignUp obj = new SignUp();
        obj.ActivitySignUp(); obj.individualPassengerDetails(); obj.ActivityDetails();

    }
}

//Passenger list of the travel package
class Passenger_List {
    int CurrEnrol_P1 = 4, CurrEnrol_P2 = 6, CurrEnrol_P3 = 2; //this enrollment is for package only not it's activities
    public void printPassengerList(int num) {
        Map<Integer, String> PassengerInfo = new HashMap<>();
        PassengerInfo.put(1, "komal"); //standard
        PassengerInfo.put(2, "tejas"); //standard
        PassengerInfo.put(3, "chetan"); //gold
        PassengerInfo.put(4, "isha"); //premium
        PassengerInfo.put(5, "chinmay"); //premium
        PassengerInfo.put(6, "ashwini"); //standard
        PassengerInfo.put(7, "ishwari"); //gold
        PassengerInfo.put(8, "sam"); //gold
        PassengerInfo.put(9, "tanu"); //premium
        PassengerInfo.put(10, "ayush"); //premium
        PassengerInfo.put(11, "harshali"); //gold
        PassengerInfo.put(12, "prasad"); //standard
        Travel_Package T = new Travel_Package();

        switch (num) {
            case 1:
            //       pckg1 enrolled passenger list
            System.out.println("Passenger list of the travel package " + T.Travel_Package1); //pckg1
            System.out.println("Passenger capacity of " + T.Travel_Package1 + " is " + T.Cap_pckg1);
            System.out.println("Number of passengers currently enrolled in " + T.Travel_Package1 + " are " + CurrEnrol_P1);
            System.out.println("Name and number of each passenger:");
            for (int i = 1; i <= 4; i++) {
                System.out.println("Name: " + PassengerInfo.get(i) + "; number: " + i);
            }
            break;

            case 2:
            //       pckg2 enrolled passenger list
            System.out.println("Passenger list of the travel package " + T.Travel_Package2);
            System.out.println("Passenger capacity of " + T.Travel_Package2 + " is " + T.Cap_pckg2);
            System.out.println("Number of passengers currently enrolled in " + T.Travel_Package2 + " are " + CurrEnrol_P2);
            System.out.println("Name and number of each passenger:");
            for (int i = 5; i <= 10; i++) {
                System.out.println("Name: " + PassengerInfo.get(i) + "; number: " + i);
            }
            break;

            case 3:
            //       pckg3 enrolled passenger list
            System.out.println("Passenger list of the travel package " + T.Travel_Package3);
            System.out.println("Passenger capacity of " + T.Travel_Package3 + " is " + T.Cap_pckg3);
            System.out.println("Number of passengers currently enrolled in " + T.Travel_Package3 + " are " + CurrEnrol_P3);
            System.out.println("Name and number of each passenger:");
            for (int i = 11; i <= 12; i++) {
                System.out.println("Name: " + PassengerInfo.get(i) + "; number: " + i);
            }
            break;
        }
    }
}

