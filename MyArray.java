public class MyArray {

    public static void main(String[] args) {

        int[] numbersArray = new int[10];
        numbersArray[0] = 17;
        numbersArray[1] = 20;
        numbersArray[2] = 64;
        numbersArray[3] = 98;
        numbersArray[4] = 48;
        numbersArray[5] = 19;
        numbersArray[6] = 18;
        numbersArray[7] = 29;
        numbersArray[8] = 54;
        numbersArray[9] = 34;

        for (int i = numbersArray.length; i >= 0; i--) {
            System.out.println(numbersArray[i]);
        }

    }

}


