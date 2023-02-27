import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) throws IOException {


        File fileInt = new File("Tutorial1Int.txt");
        File fileDouble = new File("Tutorial1Double.txt");
        File fileString = new File("Tutorial1String.txt");
        FileWriter fwInt = new FileWriter(fileInt);
        FileWriter fwDouble = new FileWriter(fileDouble);
        FileWriter fwString = new FileWriter(fileString);




        //--------------Integers--------------------//

        for (int i = 0; i < 1000001; i++) {
            int random = (int) Math.random() * 100000;
            fwInt.write(" " + random);

        }
        Integer[] integerman = new Integer[100];
        Scanner scannerInt = new Scanner(fileInt);
        for (int i = 0;i<integerman.length;i++){
            integerman[i] = scannerInt.nextInt();
        }

        //-------------Doubles--------------------//
        for (int i = 0; i < 1000001; i++) {
            double random = Math.random() * 1000000.0;
            fwDouble.write(" " + random);

        }
        Double[] doubleMan = new Double[100];
        Scanner scannerDouble = new Scanner(fileDouble);
        for (int i = 0;i<doubleMan.length;i++){
            String temp = scannerDouble.next();
            doubleMan[i] = Double.valueOf(temp);
        }


        //-------------String-----------------//

        for (int j = 0; j < 1000001; j++) {
        fwString.write(" "+givenUsingPlainJava_whenGeneratingRandomStringBounded_thenCorrect());

        }

        String[] stringMan = new String[100];
        Scanner scannerString = new Scanner(fileString);
        for (int i = 0;i<stringMan.length;i++){
            stringMan[i] = scannerString.next();
        }
        //----------Insertion---------- int//
        long first = System.nanoTime();
        Insertion.sort(integerman);
        long second = System.nanoTime();
        long timeInt = Math.abs(first-second);
        //------------Insertion double -----------//

         first = System.nanoTime();
        Insertion.sort(doubleMan);
         second = System.nanoTime();
         long timeDouble = Math.abs(first-second);

         //------------------Insertion String--------//

        first = System.nanoTime();
        Insertion.sort(stringMan);
        second = System.nanoTime();
        long timeString = Math.abs(first-second);

        File fileInsertion = new File("Algs.txt");
        FileWriter algs = new FileWriter(fileInsertion);
        algs.write("Insertion \n"+"Time taken(Nano) for Ints :  " + timeInt+ "  Time taken(Nano) for doubles :  "+timeDouble+"  Time taken for Strings(Nano):  "+timeString+"\n");

        //----------- Selection int -------//
        first = System.nanoTime();
        Selection.sort(integerman);
        second = System.nanoTime();
        timeInt = Math.abs(first-second);
        //--------------Selection Double------//
        first = System.nanoTime();
        Selection.sort(doubleMan);
        second = System.nanoTime();
         timeDouble = Math.abs(first-second);
        //----------------Selection String------//
        first = System.nanoTime();
        Selection.sort(stringMan);
        second = System.nanoTime();
        timeString = Math.abs(first-second);
        algs.write("Selection \n"+"Time taken(Nano) for Ints :  " + timeInt+ "  Time taken(Nano) for doubles :  "+timeDouble+"  Time taken for Strings(Nano):  "+timeString+"\n");


        //----------- Merge int -------//
        first = System.nanoTime();
        Merge.sort(integerman);
        second = System.nanoTime();
        timeInt = Math.abs(first-second);
        //--------------Merge Double------//
        first = System.nanoTime();
        Merge.sort(doubleMan);
        second = System.nanoTime();
        timeDouble = Math.abs(first-second);
        //----------------Merge String------//
        first = System.nanoTime();
        Merge.sort(stringMan);
        second = System.nanoTime();
        timeString = Math.abs(first-second);
        algs.write("Merge \n"+"Time taken(Nano) for Ints :  " + timeInt+ "  Time taken(Nano) for doubles :  "+timeDouble+"  Time taken for Strings(Nano):  "+timeString+"\n");

        //----------- Shell int -------//
        first = System.nanoTime();
        Shell.sort(integerman);
        second = System.nanoTime();
        timeInt = Math.abs(first-second);
        //------------Shell Double------//
        first = System.nanoTime();
        Shell.sort(doubleMan);
        second = System.nanoTime();
        timeDouble = Math.abs(first-second);
        //---------------Shell String------//
        first = System.nanoTime();
        Shell.sort(stringMan);
        second = System.nanoTime();
        timeString = Math.abs(first-second);
        algs.write("Shell \n"+"Time taken(Nano) for Ints :  " + timeInt+ "  Time taken(Nano) for doubles :  "+timeDouble+"  Time taken for Strings(Nano):  "+timeString+"\n");

        //----------- Quick int -------//
        first = System.nanoTime();
        Quick.sort(integerman);
        second = System.nanoTime();
        timeInt = Math.abs(first-second);
        //------------Quick Double------//
        first = System.nanoTime();
        Quick.sort(doubleMan);
        second = System.nanoTime();
        timeDouble = Math.abs(first-second);
        //---------------Quick String------//
        first = System.nanoTime();
        Quick.sort(stringMan);
        second = System.nanoTime();
        timeString = Math.abs(first-second);
        algs.write("Quick \n"+"Time taken(Nano) for Ints :  " + timeInt+ "  Time taken(Nano) for doubles :  "+timeDouble+"  Time taken for Strings(Nano):  "+timeString+"\n");

    }
    //Insertion , selection, merge , shell, quick

        public static String givenUsingPlainJava_whenGeneratingRandomStringBounded_thenCorrect () {

            int leftLimit = 97; // letter 'a'
            int rightLimit = 122; // letter 'z'
            int targetStringLength = (int)(Math.random()+1)*19;
            Random random = new Random();
            StringBuilder buffer = new StringBuilder(targetStringLength);
            for (int i = 0; i < targetStringLength; i++) {
                int randomLimitedInt = leftLimit + (int)
                        (random.nextFloat() * (rightLimit - leftLimit + 1));
                buffer.append((char) randomLimitedInt);
            }
            String generatedString = buffer.toString();
            return generatedString;


        }

    }