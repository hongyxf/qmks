package com.company;

import static org.junit.Assert.*;

public class NGuessNumberTest extends NGuessNumber {

    @org.junit.Test
    public void generateAnswerTest() {
        NGuessNumber GuessNumber = new NGuessNumber();
        int num[] = GuessNumber.generateAnswer();


        if (num.length == 4) {

            for (int i = 0; i < num.length - 1; i++) {
                for (int j = num.length - 1; j > i; j--) {
                    if (num[i] != num[j]) {

                        if (0 < num[i] && num[i] < 9) {
                            System.out.println("满足要求");
                        }
                    }
                }
            }
        }
        generateAnswer();
    }
    @org.junit.Test
    public void getPlayerInputTest() {
        NGuessNumber GuessNumber = new NGuessNumber();
        int num[] = GuessNumber.getPlayerInput();
        if (num.length == 4) {
            System.out.println("玩家输入了四个数");
        }
    }

    @org.junit.Test
    public void isWinTest(){
        NGuessNumber GuessNumber = new NGuessNumber();
        int i = GuessNumber.isWin();
        if (i==4){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

}