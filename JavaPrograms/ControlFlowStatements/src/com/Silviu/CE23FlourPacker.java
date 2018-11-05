package com.Silviu;

public class CE23FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 12));
        System.out.println(canPack(-3, 2, 12));

    }

//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//        int kilosBigBags = bigCount * 5;
//        int kilosSmallBags = smallCount * 1;
//
//        if(kilosBigBags+kilosSmallBags == goal){
//            return true;
//        }else if(kilosBigBags+kilosSmallBags > goal){
//            return true;
//        }else{
//            return false;
//        }
//
//    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        int total = (5 * bigCount) + (smallCount);
        if (total < goal || goal < 0 || bigCount < 0 || smallCount < 0 ||  goal % 5 > smallCount){
            return false;
        }
        return true;
    } // :)))) eliminating the true posibilities :))) no math :)) tricky one
}
