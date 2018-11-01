package com.Silviu;

public class While {
    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("count value is " + count);
            count++;
        }

//        for (int i = 1; i<7; i++){
//            System.out.println("count value is "+count);
//        }

        for (count = 1; count < 6; count++) {
            System.out.println("count value is " + count);
        }

//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("count value is " + count);
//            count++;
//        }

//        count = 1;
//        do {
//            System.out.println("count value is " + count);
//            count++;
//        } while (count != 6);

//        challenge
        isEvenNumber(5);

        count = 0;
        int number = 4;
        int finishNumber = 20;
        while(number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("even number "+ number);
            count++;
            if(count == 5){
                break;
            }
        }
        System.out.println("We found "+ count + " even numbers");

    }

    private static boolean isEvenNumber(int a) {
        if(a%2==0){
            return true;
        } else{
        return false;
        }
    }
}
