
/**
 *
 * @author mariohervil
 */
import java.util.Scanner;
import java.text.DecimalFormat;

public class P17 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        keyboard.useDelimiter("\n");
        int option = -1;
        do {
            userMenu();
            option = keyboard.nextInt();

            switch (option) {//init switch 
                case 1:
                    p1();
                    break;
                case 2:
                    p2();
                    break;
                case 3:
                    p3();
                    break;
                case 4:
                    p4();
                    break;
                case 5:
                    p5();
                    break;
                case 6:
                    p6();
                    break;
                case 7:
                    System.out.println("Letter?");
                    char letter = (keyboard.next()).charAt(0);
                    charToBinary(letter);
                    break;
                case 8:
                    System.out.println("Name?");
                    String str = keyboard.next();
                    String result = StringToBinary(str);
                    System.out.println(result);
                    break;
                case 9:
                    p9();
                    break;
                case 10:
                    p10();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Option is not valid");
                    if (Character.isLetter(option)) {
                        System.out.println("Only numbers");

                    }

            }//end switch
            System.out.println("\n" + "\n" + "Press any key to continue.");
            String key = keyboard.next();
        } while (option != 0);//end of loop

    }//end of main

    private static void userMenu() {

        System.out.println("Option 1");
        System.out.println("Option 2");
        System.out.println("Option 3");
        System.out.println("Option 4");
        System.out.println("Option 5");
        System.out.println("Option 6");
        System.out.println("Option 7");
        System.out.println("Option 8");
        System.out.println("Option 9");
        System.out.println("Option 10");
        System.out.println("Option 0: Exit");

        System.out.println("\n\n Choose an option.");

    }

    private static void p1() {//int-float
        DecimalFormat df = new DecimalFormat("000.000");
        int euro;
        System.out.println("Give a sum of money in euros: ");
        euro = keyboard.nextInt();
        float dollar = (float) euro * 1.08f;
        System.out.println("$"+df.format(dollar));

    }

    private static void p2() {//int-double
        DecimalFormat df = new DecimalFormat("000.000");
        int euro;
        System.out.println("Give a sum of money in euros: ");
        euro = keyboard.nextInt();
        double dollar = euro * 1.08;
        System.out.println("$"+df.format(dollar));
    }

    private static void p3() {//int-string
        DecimalFormat df = new DecimalFormat("000.000");
        int euro;
        System.out.println("Give a sum of money in euros: ");
        euro = keyboard.nextInt();
        double dollar = euro * 1.08;
        String strdollar = "";
        strdollar = Double.toString(dollar);
        System.out.println(dollar);
    }

    private static void p4() {//String-int
        DecimalFormat df = new DecimalFormat("000.000");
        String euro;
        int dollar;
        System.out.println("Give a sum of money in euros: ");
        euro = keyboard.next();
        dollar = Integer.parseInt(euro);
        System.out.println("$" +df.format(dollar * 1.08));
    }

    private static void p5() {//float-int
        DecimalFormat df = new DecimalFormat("000.000");
        System.out.println("Give a sum of money in euros: ");
        float euro = keyboard.nextFloat();
        float dollar = euro * 1.08f;
        System.out.println("$"+df.format(dollar));
    }

    private static void p6() {//float-string
        DecimalFormat df = new DecimalFormat("000.000");
        String strdollar;
        System.out.println("Give a sum of money in euros: ");
        float euro = keyboard.nextFloat();
        float dollar = euro * 1.08f;
        strdollar = String.valueOf(df.format(dollar));
        System.out.println("$"+strdollar);
    }

    //7   
    private static void charToBinary(char letter) {
        String letterBinary = Integer.toBinaryString(letter);
        System.out.println(letter + " = " + letterBinary);
    }

    //8
    private static String StringToBinary(String str) {
        String result = "";
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            String letterBinary;
            result += Integer.toBinaryString(ch) + " ";
        }

        return result;
    }

    private static void p9() {//int-char
        System.out.println("Number between 0 and 255");
        int n= keyboard.nextInt();
        System.out.println(n+" = "+ (char)n);
    }

    private static void p10() {//char-int
        System.out.println("-------");
        for (int i = 0; i < 255; i++) {
            System.out.println(i + " = " + (char) i);

        }
    }
}
