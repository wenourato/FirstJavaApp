public class Main {

    public static void main(String[] args) {
	int myVar;

    myVar = 50;
    System.out.println(myVar);

    int anotherVar = 100;
    System.out.println(anotherVar);

    //reassigning a variable
    myVar = anotherVar;
    System.out.println(myVar);

    //like "const" in javascript.  cannot be changed
    final int maxStudents = 25;
    final int someVariable;
    int someOtherVariable = 100;
    someVariable = someOtherVariable;

    //these are all primitive types

    //Smallest interger type is byte...8 bits/ ranges from -127 - 127
        // short...16 bits ranges from -32768 - 32767
        //int ... 32 bits ranges from -2147483648 - 2147483648
        //long ... 64 bits, ranges from -9223372036854775808 - 9223372036854775808

        byte numberOfEnglishLetters = 26;
        short feetInAMile = 5280;
        int milesToSun = 92960000;
        long milesInALightYear = 587900000000L;

        //float is a decimal, or fractional number...must declare f at the end...+ or -

        float kilometersInAMarathon = 42.195f;

        //double is a very large decimal

        double atomWidthInMeters = 0.00000000001d;

        //char is used with single quotes, for a single character

        char regularU = 'U';

        //boolean stores tru and false

        boolean iLobeJava = true;
    }
}
