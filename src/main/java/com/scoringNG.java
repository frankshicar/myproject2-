package com;

public class scoringNG {
    public static void main(String[] args) {
        String[] names = {"fish","hack","joey","cows","pigs"};
        int[] englishs = {70,80,90,20,50};
        int[] maths = {90,60,40,50,75};
        for( int i = 0 ; i < 5 ; i++){
            System.out.println(names[i]+"\t" + englishs[i]+"\t" + maths[i]+"\t"+((maths[i]+englishs[i])/2));
        }
    }
}
