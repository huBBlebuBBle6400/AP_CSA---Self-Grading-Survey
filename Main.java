/*
INSTRUCTIONS:
1. import scanner class
2. create your categories
   you need a minimum of four
3. add a survey title, description, and artwork
4. Ask the player to enter their name
5. Create at least 8 questions. 
   Each question should have an answer corresponding to a category.
   The categories should be in mixed order, not always A,B,C,D
6. Calculate which category got the most points
   In the case of a tie, determine which category wins
   Display a message telling the player which category they are in and what it means
7. record the results in a text file
   read the text file back to see all survey response
   (STEP 7 HAS BEEN DONE FOR YOU)
*/

//1. import Scanner
/* code here */

import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    

    //3. survey title and description
    
    final String SURVEY_TITLE = "What will be your net worth in 20 years?";
    final String SURVEY_DESCRIPTION_COLOR = TextColor.GREEN_BOLD_BRIGHT + """

                                                       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~        
                        ~~~~~~~~~~~~~~~~~~~~~~         |                          |
      ~~~~~~~~~         |                    |         |                          |
      |  $$$  |         |       $$$$$$       |         |      $$$$$$$$$$$$$$$     |
      ~~~~~~~~~         |                    |         |                          |
                        ~~~~~~~~~~~~~~~~~~~~~~         |                          |
                                                       ~~~~~~~~~~~~~~~~~~~~~~~~~~~~


      
      """;
    
    System.out.println(SURVEY_TITLE);
    System.out.println(SURVEY_DESCRIPTION_COLOR);
    Util.pauseConsole();
    

    Scanner scan = new Scanner(System.in);
    final String NAME_PROMPT = "Name: ";
    System.out.print(NAME_PROMPT);
    String name = scan.nextLine();

    Scanner scanYear = new Scanner(System.in);
    final String GRAD_YEAR_PROMPT = "Graduation Year: ";
    System.out.print(GRAD_YEAR_PROMPT);
    String gradYear = scan.nextLine();

    Scanner scanHeight = new Scanner(System.in);
    final String HEIGHT = "Height (in inches): ";
    System.out.print(HEIGHT);
    String height = scan.nextLine();


    int countOneMilDollars = 0; 
    int countHundredThousandDollars = 0;
    int countFiveHundredDollars = 0;
    int countZeroDollars = 0;
    int countFiftyThousandDollars = 0;
    int countFiftyDollars = 0;
    int countOneDollars = 0;
    int countEighteenDollars = 0;
    int countThreeThousandDollars = 0;
    int countSixtyDollars = 0;
    int countOneMilDollarsDebt = 0;
    int countSixtyDollarsDebt = 0;
    int countHundredThousandDollarsDebt = 0;
    int countIncalculableDebt = 0;
    int countUnknownAmountDollars = 0;
    
    int option;


    //4. Ask the user their name
    //Create a scanner object for user input
    /* code here */

    
   //5. Create a list of at least 8 questions
    Util.clearConsole();
    final String QUESTION_1_TEXT = """
      Question 1
      What's the first thing you do when you wake up?
      1. Doomscroll
      2. Open a window
      3. Go back to sleep
      4. Make your bed
      5. Look at stock market prices
      """;
    System.out.println(QUESTION_1_TEXT);
    option = Util.enterInt(1,5);
    if (option == 1)
    {
      countIncalculableDebt++;
      countSixtyDollars++;
      countFiveHundredDollars--;
    }
    if (option == 2)
    {
      countThreeThousandDollars++;
      countFiftyThousandDollars--;
      countUnknownAmountDollars++;
    }
    if (option == 3)
    {
      countOneMilDollarsDebt++;
      countOneMilDollars--;
      countFiftyDollars++;
    }
    if (option == 4)
    {
      countSixtyDollarsDebt++;
      countZeroDollars++;
      countOneDollars--;
    }
    if (option == 5)
    {
      countHundredThousandDollarsDebt--;
      countHundredThousandDollars++;
      countEighteenDollars--;
    }

    Util.clearConsole();
    final String QUESTION_2_TEXT = """
      Question 2
      What color is your toothbrush?
      1. Pink
      2. Red
      3. Blue
      4. Gold
      5. Orange
      """;
    System.out.println(QUESTION_2_TEXT);
    option = Util.enterInt(1,5);
    if (option == 1)
    {
      countZeroDollars--;
      countHundredThousandDollars++;
      countSixtyDollars--;
    }
    if (option == 2)
    {
      countFiftyDollars++;
      countHundredThousandDollarsDebt--;
      countFiftyThousandDollars--;
    }
    if (option == 3)
    {
      countOneMilDollars++;
      countThreeThousandDollars--;
      countUnknownAmountDollars++;
    }
    if (option == 4)
    {
      countEighteenDollars--;
      countOneDollars++;
      countFiveHundredDollars--;
    }
    if (option == 5)
    {
      countOneMilDollarsDebt++;
      countIncalculableDebt--;
      countSixtyDollarsDebt++;
    }

    
    Util.clearConsole();
    final String QUESTION_3_TEXT = """
      Question 3
      What's your choice of beverage alongside your breakfast?
      1. Orange juice (or any type of juice for that matter)
      2. Water
      3. Wine
      4. Milk
      5. Nothing
      """;
    System.out.println(QUESTION_3_TEXT);
    option = Util.enterInt(1,5);
    if (option == 1)
    {
      countSixtyDollarsDebt++;
      countFiftyDollars--;
      countThreeThousandDollars--;
    }
    if (option == 2)
    {
      countUnknownAmountDollars++;
      countOneMilDollars++;
      countIncalculableDebt--;
    }
    if (option == 3)
    {
      countFiveHundredDollars++;
      countOneDollars--;
      countHundredThousandDollarsDebt++;
    }
    if (option == 4)
    {
      countSixtyDollars--;
      countHundredThousandDollars++;
      countOneMilDollarsDebt--;
    }
    if (option == 5)
    {
      countEighteenDollars--;
      countFiftyThousandDollars++;
      countZeroDollars++;
    }

    
    Util.clearConsole();
    final String QUESTION_4_TEXT = """
      Question 4
      Which of the following would be your preferred mode of transportation for everday life?
      1. Public transport
      2. Cybertruck
      3. Walking
      4. Biking
      5. Hitchhiking
      """;
    System.out.println(QUESTION_4_TEXT);
    option = Util.enterInt(1,5);
    if (option == 1)
    {
      countHundredThousandDollars++;
      countSixtyDollarsDebt--;
      countZeroDollars--;
    }
    if (option == 2)
    {
      countIncalculableDebt++;
      countFiftyDollars--;
      countSixtyDollars++;
    }
    if (option == 3)
    {
      countOneMilDollars++;
      countEighteenDollars++;
      countThreeThousandDollars--;
    }
    if (option == 4)
    {
      countFiftyThousandDollars++;
      countHundredThousandDollarsDebt--;
      countFiveHundredDollars--;
    }
    if (option == 5)
    {
      countUnknownAmountDollars++;
      countOneDollars--;
      countOneMilDollarsDebt++;
    }

    
    Util.clearConsole();
    final String QUESTION_5_TEXT = """
      Question 5
      What do you do immediately after getting home
      1. Change and go to the gym
      2. Scroll on social media
      3. Take a short nap
      4. Get some work done
      5. Go bother whoever else is at home
      """;
    System.out.println(QUESTION_5_TEXT);
    option = Util.enterInt(1,5);
    if (option == 1)
    {
      countOneMilDollars++;
      countZeroDollars--;
      countEighteenDollars++;
    }
    if (option == 2)
    {
      countIncalculableDebt++;
      countSixtyDollarsDebt--;
      countFiftyDollars++;
    }
    if (option == 3)
    {
      countFiftyThousandDollars++;
      countSixtyDollars++;
      countHundredThousandDollars--;
    }
    if (option == 4)
    {
      countHundredThousandDollarsDebt--;
      countThreeThousandDollars++;
      countOneMilDollarsDebt--;
    }
    if (option == 5)
    {
      countUnknownAmountDollars++;
      countFiveHundredDollars--;
      countOneDollars++;
    }


    Util.clearConsole();
    final String QUESTION_6_TEXT = """
      Question 6
      In what order do you complete your tasks?
      1. Hardest first and easiest last
      2. Easiest first and hardest last
      3. Random/whatever. I really don't care
      4. I start with what sounds good and go from there
      5. I spin a wheel
      """;
    System.out.println(QUESTION_6_TEXT);
    option = Util.enterInt(1,5);
    if (option == 1)
    {
      countFiftyThousandDollars++;
      countFiftyDollars--;
      countHundredThousandDollarsDebt++;
    }
    if (option == 2)
    {
      countOneMilDollarsDebt++;
      countFiveHundredDollars++;
      countFiveHundredDollars--;
    }
    if (option == 3)
    {
      countHundredThousandDollars++;
      countZeroDollars--;
      countUnknownAmountDollars++;
    }
    if (option == 4)
    {
      countIncalculableDebt++;
      countThreeThousandDollars--;
      countOneDollars++;
    }
    if (option == 5)
    {
      countOneMilDollars--;
      countEighteenDollars++;
      countSixtyDollars++;
    }


    Util.clearConsole();
    final String QUESTION_7_TEXT = """
      Question 7
      What do you do to take a break from work?
      1. Doomscroll
      2. Go outside for fresh air
      3. Get a snack
      4. Call a friend
      5. Bother whoever else is nearby
      """;
    System.out.println(QUESTION_7_TEXT);
    option = Util.enterInt(1,5);
    if (option == 1)
    {
      countFiftyThousandDollars--;
      countSixtyDollars++;
      countSixtyDollarsDebt--;
    }
    if (option == 2)
    {
      countThreeThousandDollars++;
      countEighteenDollars--;
      countZeroDollars--;
    }
    if (option == 3)
    {
      countOneMilDollarsDebt++;
      countFiftyDollars++;
      countFiveHundredDollars--;
    }
    if (option == 4)
    {
      countHundredThousandDollarsDebt++;
      countIncalculableDebt--;
      countOneMilDollars++;
    }
    if (option == 5)
    {
      countHundredThousandDollars--;
      countUnknownAmountDollars++;
      countOneDollars--;
    }

    Util.clearConsole();
    final String QUESTION_8_TEXT = """
      Question 8
      If given the choice, which of these sports would you want to start learning?
      1. Brazilian Jiu Jitsu
      2. Pole Vault
      3. Gymnastics
      4. Boxing
      5. Pickleball
      """;
    System.out.println(QUESTION_8_TEXT);
    option = Util.enterInt(1,5);
    if (option == 1)
    {
      countFiftyThousandDollars++;
      countEighteenDollars--;
      countIncalculableDebt--;
    }
    if (option == 2)
    {
      countSixtyDollarsDebt++;
      countThreeThousandDollars++;
      countSixtyDollars--;
    }
    if (option == 3)
    {
      countHundredThousandDollarsDebt++;
      countUnknownAmountDollars++;
      countFiftyDollars++;
    }
    if (option == 4)
    {
      countOneMilDollars++;
      countZeroDollars++;
      countEighteenDollars--;
    }
    if (option == 5)
    {
      countOneMilDollarsDebt++;
      countFiveHundredDollars++;
      countHundredThousandDollars--;
    }

    Util.clearConsole();
    final String QUESTION_9_TEXT = """
      Question 9
      What's your choice for dinner tonight?
      1. Pizza
      2. Instant Ramen
      3. Steak
      4. Chicken and Rice
      5. Nothing, I'm too broke
      """;
    System.out.println(QUESTION_9_TEXT);
    option = Util.enterInt(1,5);
    if (option == 1)
    {
      countFiveHundredDollars++;
      countHundredThousandDollarsDebt++;
      countEighteenDollars--;
    }
    if (option == 2)
    {
      countFiftyThousandDollars++;
      countUnknownAmountDollars--;
      countSixtyDollarsDebt--;
    }
    if (option == 3)
    {
      countThreeThousandDollars++;
      countFiftyDollars--;
      countZeroDollars++;
    }
    if (option == 4)
    {
      countOneDollars--;
      countHundredThousandDollars++;
      countOneMilDollarsDebt++;
    }
    if (option == 5)
    {
      countIncalculableDebt--;
      countHundredThousandDollars++;
      countOneMilDollars++;
    }

    Util.clearConsole();
    final String QUESTION_10_TEXT = """
      Question 10
      How do you relax before going to bed?
      1. Watch television
      2. Scroll on my phone
      3. Play a board game with whoever's around
      4. Play video games
      5. I go straight to bed; it's already too late
      """;
    System.out.println(QUESTION_10_TEXT);
    option = Util.enterInt(1,5);
    if (option == 1)
    {
      countFiveHundredDollars++;
      countHundredThousandDollarsDebt--;
      countZeroDollars++;
    }
    if (option == 2)
    {
      countEighteenDollars++;
      countIncalculableDebt++;
      countOneMilDollars--;
    }
    if (option == 3)
    {
      countFiftyThousandDollars++;
      countOneDollars--;
      countOneMilDollarsDebt--;
    }
    if (option == 4)
    {
      countSixtyDollars--;
      countSixtyDollarsDebt++;
      countZeroDollars++;
    }
    if (option == 5)
    {
      countUnknownAmountDollars--;
      countThreeThousandDollars--;
      countFiftyDollars++;
    }


    Util.clearConsole();
    final String QUESTION_11_TEXT = """
      Question 11
      What time do you usually go to sleep?
      1. Before 9:30
      2. Between 9:30 and 10:30
      3. Between 10:30 and 11:30
      4. Around midnight
      5. After 1:00am
      """;
    System.out.println(QUESTION_11_TEXT);
    option = Util.enterInt(1,5);
    if (option == 1)
    {
      countSixtyDollars++;
      countFiftyThousandDollars++;
      countSixtyDollarsDebt++;
    }
    if (option == 2)
    {
      countOneMilDollarsDebt--;
      countOneMilDollars++;
      countHundredThousandDollarsDebt--;
    }
    if (option == 3)
    {
      countThreeThousandDollars++;
      countOneDollars--;
      countFiveHundredDollars--;
    }
    if (option == 4)
    {
      countHundredThousandDollars++;
      countZeroDollars++;
      countUnknownAmountDollars--;
    }
    if (option == 5)
    {
      countFiftyDollars++;
      countIncalculableDebt++;
      countEighteenDollars++;
    }


    Util.clearConsole();
    final String QUESTION_12_TEXT = """
      Question 12
      What side of your body do you sleep on?
      1. The left
      2. The right
      3. On my back
      4. On my stomach
      5. I cuddle myself into a ball
      """;
    System.out.println(QUESTION_12_TEXT);
    option = Util.enterInt(1,5);
    if (option == 1)
    {
      countFiftyThousandDollars--;
      countOneMilDollars++;
      countEighteenDollars++;
    }
    if (option == 2)
    {
      countSixtyDollarsDebt++;
      countOneDollars--;
      countIncalculableDebt--;
    }
    if (option == 3)
    {
      countSixtyDollars++;
      countFiftyDollars++;
      countHundredThousandDollarsDebt++;
    }
    if (option == 4)
    {
      countOneMilDollarsDebt++;
      countZeroDollars--;
      countHundredThousandDollars++;
    }
    if (option == 5)
    {
      countThreeThousandDollars++;
      countFiveHundredDollars--;
      countUnknownAmountDollars--;
    }

    Util.clearConsole();
    final String bonusQuestions = """

      BONUS QUESTIONS!:
      """;

    System.out.println(bonusQuestions);

    Util.pauseConsole();
    final String QUESTION_13_TEXT = """
      Question 13
      Where would you go on an all inclusive 2-week vacation?
      1. The Maldives
      2. Brazil
      3. Japan
      4. Tunisia
      5. Greece
      """;
    System.out.println(QUESTION_13_TEXT);
    option = Util.enterInt(1,5);
    if (option == 1)
    {
      countFiftyThousandDollars--;
      countIncalculableDebt++;
      countOneDollars++;
    }
    if (option == 2)
    {
      countFiveHundredDollars++;
      countHundredThousandDollars--;
      countFiftyDollars++;
    }
    if (option == 3)
    {
      countZeroDollars--;
      countUnknownAmountDollars++;
      countHundredThousandDollarsDebt--;
    }
    if (option == 4)
    {
      countSixtyDollars++;
      countOneMilDollars--;
      countEighteenDollars--;
    }
    if (option == 5)
    {
      countThreeThousandDollars++;
      countOneMilDollarsDebt++;
      countSixtyDollarsDebt--;
    }

    Util.clearConsole();
    final String QUESTION_14_TEXT = """
      Question 14
      If for 12 hours, you had the ability to hack into any online databases without ever getting caught, what would you hack into?
      1. The Epstein files
      2. All of CIA's classified documents (including information on extraterrestial life)
      3. A random bank's database
      4. All of North Korea's classified government documents
      5. Your grades
      """;
    System.out.println(QUESTION_14_TEXT);
    option = Util.enterInt(1,5);
    if (option == 1)
    {
      countIncalculableDebt++;
      countEighteenDollars++;
      countSixtyDollarsDebt--;
    }
    if (option == 2)
    {
      countOneMilDollars++;
      countFiftyDollars--;
      countFiftyThousandDollars++;
    }
    if (option == 3)
    {
      countHundredThousandDollars++;
      countOneMilDollarsDebt++;
      countZeroDollars--;
    }
    if (option == 4)
    {
      countHundredThousandDollarsDebt++;
      countUnknownAmountDollars--;
      countThreeThousandDollars--;
    }
    if (option == 5)
    {
      countSixtyDollars++;
      countOneDollars--;
      countFiveHundredDollars++;
    }


    Util.clearConsole();
    final String QUESTION_15_TEXT = """
      Question 15
      What's your goal in life?
      1. Make as much money as possible
      2. Achieve my dreams
      3. To be a well-respected person
      4. To help as many people as possible
      5. Just be happy and carefree
      """;
    System.out.println(QUESTION_15_TEXT);
    option = Util.enterInt(1,5);
    if (option == 1)
    {
      countHundredThousandDollarsDebt++;
      countFiftyThousandDollars++;
      countOneDollars--;
    }
    if (option == 2)
    {
      countEighteenDollars++;
      countHundredThousandDollars--;
      countUnknownAmountDollars++;
    }
    if (option == 3)
    {
      countOneMilDollarsDebt++;
      countFiftyDollars++;
      countSixtyDollars--;
    }
    if (option == 4)
    {
      countThreeThousandDollars++;
      countSixtyDollarsDebt++;
      countOneMilDollars--;
    }
    if (option == 5)
    {
      countZeroDollars--;
      countFiveHundredDollars++;
      countIncalculableDebt++;
    }



    

    //6. Calulate which category has the most points and display the results
    
    Util.clearConsole();
    final String RESULTS = "RESULTS...";
    Util.pauseConsole();

    String finalCategory = "";

    if (countOneMilDollars >= countHundredThousandDollars && 
        countOneMilDollars >= countFiveHundredDollars &&
        countOneMilDollars >= countZeroDollars &&
        countOneMilDollars >= countFiftyThousandDollars &&
        countOneMilDollars >= countFiftyDollars &&
        countOneMilDollars >= countOneDollars &&
        countOneMilDollars >= countEighteenDollars &&
        countOneMilDollars >= countThreeThousandDollars &&
        countOneMilDollars >= countSixtyDollars &&
        countOneMilDollars >= countOneMilDollarsDebt &&
        countOneMilDollars >= countSixtyDollarsDebt &&
        countOneMilDollars >= countHundredThousandDollarsDebt &&
        countOneMilDollars >= countIncalculableDebt && 
        countOneMilDollars >= countUnknownAmountDollars)
    {
      finalCategory = "$1 000 000";
      String description = "Congratulations! You are going to be a millionare. You have wokred hard, saved lots of money, and it has paid off. Be careful though, nothing in this world is permanent.";
      System.out.println("Net Worth: $1 000 000");
      System.out.println(description);
    }
    else if (countHundredThousandDollars >= countOneMilDollars && 
        countHundredThousandDollars >= countFiveHundredDollars &&
        countHundredThousandDollars >= countZeroDollars &&
        countHundredThousandDollars >= countFiftyThousandDollars &&
        countHundredThousandDollars >= countFiftyDollars &&
        countHundredThousandDollars >= countOneDollars &&
        countHundredThousandDollars >= countEighteenDollars &&
        countHundredThousandDollars >= countThreeThousandDollars &&
        countHundredThousandDollars >= countSixtyDollars &&
        countHundredThousandDollars >= countOneMilDollarsDebt &&
        countHundredThousandDollars >= countSixtyDollarsDebt &&
        countHundredThousandDollars >= countHundredThousandDollarsDebt &&
        countHundredThousandDollars >= countIncalculableDebt && 
        countHundredThousandDollars >= countUnknownAmountDollars)
    {
      finalCategory = "$100 000";
      String description = "Great Job! You are on track to being set for your retirement in a few years. Keep working hard, making more money, and you will undoubtedly see your desired results.";
      System.out.println("Net Worth: $100 000");
      System.out.println(description);
    }
    else if (countFiveHundredDollars >= countOneMilDollars && 
        countFiveHundredDollars >= countHundredThousandDollars &&
        countFiveHundredDollars >= countZeroDollars &&
        countFiveHundredDollars >= countFiftyThousandDollars &&
        countFiveHundredDollars >= countFiftyDollars &&
        countFiveHundredDollars >= countOneDollars &&
        countFiveHundredDollars >= countEighteenDollars &&
        countFiveHundredDollars >= countThreeThousandDollars &&
        countFiveHundredDollars >= countSixtyDollars &&
        countFiveHundredDollars >= countOneMilDollarsDebt &&
        countFiveHundredDollars >= countSixtyDollarsDebt &&
        countFiveHundredDollars >= countHundredThousandDollarsDebt &&
        countFiveHundredDollars >= countIncalculableDebt && 
        countFiveHundredDollars >= countUnknownAmountDollars)
    {
      finalCategory = "$500";
      String description = "You are not doing so well. Inflation is hitting you hard, and you are barely scraping by. Saving money is getting harder by the day, but you still haven't given up hope of having a better life.";
      System.out.println("Net Worth: $500");
      System.out.println(description);
    }
    else if (countZeroDollars >= countOneMilDollars && 
        countZeroDollars >= countHundredThousandDollars &&
        countZeroDollars >= countFiveHundredDollars &&
        countZeroDollars >= countFiftyThousandDollars &&
        countZeroDollars >= countFiftyDollars &&
        countZeroDollars >= countOneDollars &&
        countZeroDollars >= countEighteenDollars &&
        countZeroDollars >= countThreeThousandDollars &&
        countZeroDollars >= countSixtyDollars &&
        countZeroDollars >= countOneMilDollarsDebt &&
        countZeroDollars >= countSixtyDollarsDebt &&
        countZeroDollars >= countHundredThousandDollarsDebt &&
        countZeroDollars >= countIncalculableDebt && 
        countZeroDollars >= countUnknownAmountDollars)
    {
      finalCategory = "$0";
      String description = "You're broke. You've hit dead bottom. You have no house, no possessions, and most of all, no job. You better find a way to turn your life around before you fall into a bigger ditch.";
      System.out.println("Net Worth: $0");
      System.out.println(description);
    }
    else if (countFiftyThousandDollars >= countOneMilDollars && 
        countFiftyThousandDollars >= countHundredThousandDollars &&
        countFiftyThousandDollars >= countFiveHundredDollars &&
        countFiftyThousandDollars >= countZeroDollars &&
        countFiftyThousandDollars >= countFiftyDollars &&
        countFiftyThousandDollars >= countOneDollars &&
        countFiftyThousandDollars >= countEighteenDollars &&
        countFiftyThousandDollars >= countThreeThousandDollars &&
        countFiftyThousandDollars >= countSixtyDollars &&
        countFiftyThousandDollars >= countOneMilDollarsDebt &&
        countFiftyThousandDollars >= countSixtyDollarsDebt &&
        countFiftyThousandDollars >= countHundredThousandDollarsDebt &&
        countFiftyThousandDollars >= countIncalculableDebt && 
        countFiftyThousandDollars >= countUnknownAmountDollars) 
    {
      finalCategory = "$50 000";
      String description = "You're doing okay. You're ambitious in life and have set yourself some goals. However, you still aren't getting where you want to be. Keep working hard, and one day, you will reap the benfits.";
      System.out.println("Net Worth: $50 000");
      System.out.println(description);
    }
    else if (countFiftyDollars >= countOneMilDollars && 
        countFiftyDollars >= countHundredThousandDollars &&
        countFiftyDollars >= countFiveHundredDollars &&
        countFiftyDollars >= countZeroDollars &&
        countFiftyDollars >= countFiftyThousandDollars &&
        countFiftyDollars >= countOneDollars &&
        countFiftyDollars >= countEighteenDollars &&
        countFiftyDollars >= countThreeThousandDollars &&
        countFiftyDollars >= countSixtyDollars &&
        countFiftyDollars >= countOneMilDollarsDebt &&
        countFiftyDollars >= countSixtyDollarsDebt &&
        countFiftyDollars >= countHundredThousandDollarsDebt &&
        countFiftyDollars >= countIncalculableDebt && 
        countFiftyDollars >= countUnknownAmountDollars) 
    {
      finalCategory = "$50";
      String description = "You need a solution to your life, FAST! You have run out of money faster than you expected, and taking that loan from the bank a month ago did not last as long as you woul've wished for. You need to find a way to get your life back together, although at this point, in the current global economic state, that will be quite the challenge.";
      System.out.println("Net Worth: $50");
      System.out.println(description);
    }
    else if (countOneDollars >= countOneMilDollars && 
        countOneDollars >= countHundredThousandDollars &&
        countOneDollars >= countFiveHundredDollars &&
        countOneDollars >= countZeroDollars &&
        countOneDollars >= countFiftyThousandDollars &&
        countOneDollars >= countFiftyDollars &&
        countOneDollars >= countEighteenDollars &&
        countOneDollars >= countThreeThousandDollars &&
        countOneDollars >= countSixtyDollars &&
        countOneDollars >= countOneMilDollarsDebt &&
        countOneDollars >= countSixtyDollarsDebt &&
        countOneDollars >= countHundredThousandDollarsDebt &&
        countOneDollars >= countIncalculableDebt && 
        countOneDollars >= countUnknownAmountDollars) 
    {
      finalCategory = "$1";
      String description = "You realize the consequences of poor financial planning. You spent way too much money when you had it, and you never saved. Now you're stuck with one singular dollar in your bank account. Your job does not pay you enough, but without it, you'd be in a much more grave situation. It's safe to say, you have no way out from bankruptcy.";
      System.out.println("Net Worth: $1");
      System.out.println(description);
    }
    else if (countEighteenDollars >= countOneMilDollars && 
        countEighteenDollars >= countHundredThousandDollars &&
        countEighteenDollars >= countFiveHundredDollars &&
        countEighteenDollars >= countZeroDollars &&
        countEighteenDollars >= countFiftyThousandDollars &&
        countEighteenDollars >= countFiftyDollars &&
        countEighteenDollars >= countOneDollars &&
        countEighteenDollars >= countThreeThousandDollars &&
        countEighteenDollars >= countSixtyDollars &&
        countEighteenDollars >= countOneMilDollarsDebt &&
        countEighteenDollars >= countSixtyDollarsDebt &&
        countEighteenDollars >= countHundredThousandDollarsDebt &&
        countEighteenDollars >= countIncalculableDebt && 
        countEighteenDollars >= countUnknownAmountDollars)
    {
      finalCategory = "$18";
      String description = "You tried to invest, but it never worked out. You got hooked, and the stock market took everything from you. Now, you sit alone, contemplating whether you shoul've taken the safe route.";
      System.out.println("Net Worth: $18");
      System.out.println(description);
    }
    else if (countThreeThousandDollars >= countOneMilDollars && 
        countThreeThousandDollars >= countHundredThousandDollars &&
        countThreeThousandDollars >= countFiveHundredDollars &&
        countThreeThousandDollars >= countZeroDollars &&
        countThreeThousandDollars >= countFiftyThousandDollars &&
        countThreeThousandDollars >= countFiftyDollars &&
        countThreeThousandDollars >= countOneDollars &&
        countThreeThousandDollars >= countEighteenDollars &&
        countThreeThousandDollars >= countSixtyDollars &&
        countThreeThousandDollars >= countOneMilDollarsDebt &&
        countThreeThousandDollars >= countSixtyDollarsDebt &&
        countThreeThousandDollars >= countHundredThousandDollarsDebt &&
        countThreeThousandDollars >= countIncalculableDebt && 
        countThreeThousandDollars >= countUnknownAmountDollars) 
    {
      finalCategory = "$3 000";
      String description = "You're drastically trying to find a way to alleviate your financial situation. Inflation is eating your bank account by the minute, and you need to find a way to save these last few dollars for your future. You've been looking for jobs everywhere, but no one wants to hire someone who puts in the least effort to get the most output.";
      System.out.println("Net Worth: $3 000");
      System.out.println(description);
    }
    else if (countSixtyDollars >= countOneMilDollars && 
        countSixtyDollars >= countHundredThousandDollars &&
        countSixtyDollars >= countFiveHundredDollars &&
        countSixtyDollars >= countZeroDollars &&
        countSixtyDollars >= countFiftyThousandDollars &&
        countSixtyDollars >= countFiftyDollars &&
        countSixtyDollars >= countOneDollars &&
        countSixtyDollars >= countEighteenDollars &&
        countSixtyDollars >= countThreeThousandDollars &&
        countSixtyDollars >= countOneMilDollarsDebt &&
        countSixtyDollars >= countSixtyDollarsDebt &&
        countSixtyDollars >= countHundredThousandDollarsDebt &&
        countSixtyDollars >= countIncalculableDebt && 
        countSixtyDollars >= countUnknownAmountDollars)
    {
      finalCategory = "$60";
      String description = "You're scurrying, tyring to save your financial state. You've burned through your federal grants way too fast. Now you suffer from the perpetual threat of homelessness and seemingly inevitable bankrutcy, unless you find a way out.";
      System.out.println("Net Worth: $60");
      System.out.println(description);
    }
    else if (countOneMilDollarsDebt >= countOneMilDollars && 
        countOneMilDollarsDebt >= countHundredThousandDollars &&
        countOneMilDollarsDebt >= countFiveHundredDollars &&
        countOneMilDollarsDebt >= countZeroDollars &&
        countOneMilDollarsDebt >= countFiftyThousandDollars &&
        countOneMilDollarsDebt >= countFiftyDollars &&
        countOneMilDollarsDebt >= countOneDollars &&
        countOneMilDollarsDebt >= countEighteenDollars &&
        countOneMilDollarsDebt >= countThreeThousandDollars &&
        countOneMilDollarsDebt >= countSixtyDollars &&
        countOneMilDollarsDebt >= countSixtyDollarsDebt &&
        countOneMilDollarsDebt >= countHundredThousandDollarsDebt &&
        countOneMilDollarsDebt >= countIncalculableDebt && 
        countOneMilDollarsDebt >= countUnknownAmountDollars)
    {
      finalCategory = "-$1 000 000";
      String description = "You've hit rock bottom. You have no idea how to pay off such huge debts, and you haven't even thought about it for a few weeks. Your current job does nothing to help, and you wonder if an Ivy League education was the right option.";
      System.out.println("Net Worth: -$1 000 000");
      System.out.println(description);
    }
    else if (countSixtyDollarsDebt >= countOneMilDollars && 
        countSixtyDollarsDebt >= countHundredThousandDollars &&
        countSixtyDollarsDebt >= countFiveHundredDollars &&
        countSixtyDollarsDebt >= countZeroDollars &&
        countSixtyDollarsDebt >= countFiftyThousandDollars &&
        countSixtyDollarsDebt >= countFiftyDollars &&
        countSixtyDollarsDebt >= countOneDollars &&
        countSixtyDollarsDebt >= countEighteenDollars &&
        countSixtyDollarsDebt >= countThreeThousandDollars &&
        countSixtyDollarsDebt >= countSixtyDollars &&
        countSixtyDollarsDebt >= countOneMilDollarsDebt &&
        countSixtyDollarsDebt >= countHundredThousandDollarsDebt &&
        countSixtyDollarsDebt >= countIncalculableDebt && 
        countSixtyDollarsDebt >= countUnknownAmountDollars)
    {
      finalCategory = "-$60";
      String description = "You've just passed the bankruptcy mark. You're scrambling to climb back out of this hole before you're in too deep. There's hope for you, but you have to make some huge immediate sacrifices. You have to make a decision. Happiness or Longevity?";
      System.out.println("Net Worth: -$60");
      System.out.println(description);
    }
    else if (countHundredThousandDollarsDebt >= countOneMilDollars && 
        countHundredThousandDollarsDebt >= countHundredThousandDollars &&
        countHundredThousandDollarsDebt >= countFiveHundredDollars &&
        countHundredThousandDollarsDebt >= countZeroDollars &&
        countHundredThousandDollarsDebt >= countFiftyThousandDollars &&
        countHundredThousandDollarsDebt >= countFiftyDollars &&
        countHundredThousandDollarsDebt >= countOneDollars &&
        countHundredThousandDollarsDebt >= countEighteenDollars &&
        countHundredThousandDollarsDebt >= countThreeThousandDollars &&
        countHundredThousandDollarsDebt >= countSixtyDollars &&
        countHundredThousandDollarsDebt >= countOneMilDollarsDebt &&
        countHundredThousandDollarsDebt >= countSixtyDollarsDebt &&
        countHundredThousandDollarsDebt >= countIncalculableDebt && 
        countHundredThousandDollarsDebt >= countUnknownAmountDollars)
    {
      finalCategory = "-$100 000";
      String description = "You have way too much debt to cover by yourself. You ask for help from your parents, but they dismiss you as a failure, questioning their decision to even bring you into this world. You have to rely on yourself to repay these debts. And don't forget the newly implented all-time high interest rate on debts greater than $50K implemented by Trump to celbrate his seventh term as President.";
      System.out.println("Net Worth: -$100 000");
      System.out.println(description);
    }
    else if (countIncalculableDebt >= countOneMilDollars && 
        countIncalculableDebt >= countHundredThousandDollars &&
        countIncalculableDebt >= countFiveHundredDollars &&
        countIncalculableDebt >= countZeroDollars &&
        countIncalculableDebt >= countFiftyThousandDollars &&
        countIncalculableDebt >= countFiftyDollars &&
        countIncalculableDebt >= countOneDollars &&
        countIncalculableDebt >= countEighteenDollars &&
        countIncalculableDebt >= countThreeThousandDollars &&
        countIncalculableDebt >= countSixtyDollars &&
        countIncalculableDebt >= countOneMilDollarsDebt &&
        countIncalculableDebt >= countSixtyDollarsDebt &&
        countIncalculableDebt >= countHundredThousandDollarsDebt && 
        countIncalculableDebt >= countUnknownAmountDollars)
    {
      finalCategory = "Incalculable Debt";
      String description = "I don't even know what to say. How does one dig themselves a hole so deep. You have no way to solve your financial calamity, if you can even call it that. Honestly, we both know that you're not getting out of this mess even if you were proised 20 more years to your life.";
      System.out.println("Net Worth: Incalculable Debt");
      System.out.println(description);
    }
    else if (countUnknownAmountDollars >= countOneMilDollars && 
        countUnknownAmountDollars >= countHundredThousandDollars &&
        countUnknownAmountDollars >= countFiveHundredDollars &&
        countUnknownAmountDollars >= countZeroDollars &&
        countUnknownAmountDollars >= countFiftyThousandDollars &&
        countUnknownAmountDollars >= countFiftyDollars &&
        countUnknownAmountDollars >= countOneDollars &&
        countUnknownAmountDollars >= countEighteenDollars &&
        countUnknownAmountDollars >= countThreeThousandDollars &&
        countUnknownAmountDollars >= countSixtyDollars &&
        countUnknownAmountDollars >= countOneMilDollarsDebt &&
        countUnknownAmountDollars >= countSixtyDollarsDebt &&
        countUnknownAmountDollars >= countHundredThousandDollarsDebt && 
        countUnknownAmountDollars >= countIncalculableDebt)
    {
        finalCategory = "Unknown Net Worth";
      String description = "No one knows your value. You could be the wealthiest person on the planet, or have the most debt. You profession forces your money to be kept secret in a high security safe in the middle of nowhere, with all earnings going directly to that safe. Only when you retire will you see what financial state has been waiting for you.";
      System.out.println("Net worth: Unknown Net Worth");
      System.out.println(description);
    }
    

    //display stats
    
    Util.pauseConsole();
    System.out.println("$1 000 000:\t" + countOneMilDollars);
    System.out.println("$100 000:\t" + countHundredThousandDollars);
    System.out.println("$500:\t" + countFiveHundredDollars);
    System.out.println("$0:\t" + countZeroDollars);
    System.out.println("$50 000:\t" + countFiftyThousandDollars);
    System.out.println("$50:\t" + countFiftyDollars);
    System.out.println("$1:\t" + countOneDollars);
    System.out.println("$18:\t" + countEighteenDollars);
    System.out.println("$3 000:\t" + countThreeThousandDollars);
    System.out.println("$60:\t" + countSixtyDollars);
    System.out.println("-$1 000 000:\t" + countOneMilDollarsDebt);
    System.out.println("-$60:\t" + countSixtyDollarsDebt);
    System.out.println("-$100 000:\t" + countHundredThousandDollarsDebt);
    System.out.println("Incalculable Debt:\t" + countIncalculableDebt);
    System.out.println("Unknown Net Worth:\t" + countUnknownAmountDollars);
    
    Util.pauseConsole();
    

    //7. record the results in a text file
    
    ResultsManager.record(name, gradYear, height, finalCategory);
    //read the text file back to see all survey response
    Util.clearConsole();
    ResultsManager.printResults();
    
    

    
  }
}