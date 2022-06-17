package com.company;

import java.util.Scanner;

public class NGuessNumber {
    public int[] generateAnswer(){
        int a,b,c,d;
        int [] num = new int []{};
        for (;;){
            a=(int)(Math.random()*9);
            b=(int)(Math.random()*9);
            c=(int)(Math.random()*9);
            d=(int)(Math.random()*9);
            if (a!=b&&a!=c&&a!=d&&b!=c&&b!=d){
                num = new int[]{a,b,c,d};
                break ;
            }
        }
        return num;
    }

    public int[] getPlayerInput(){
        int num[]= new int[]{};
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int one =scanner.nextInt();
        System.out.println("请输入第二个数");
        int two = scanner.nextInt();
        System.out.println("请输入第三个数");
        int three = scanner.nextInt();
        System.out.println("请输入第四个数");
        int four = scanner.nextInt();
        num = new int []{one,two,three,four};
        return num;
    }

    public int isWin(){
        int answer [] = generateAnswer();
        int playerInput [] =getPlayerInput();
        int num = 0;
        for (int i = 0; i < answer.length-1; i++) {
            for (int j = 0; j < playerInput.length; j++) {
                if (answer[i]==playerInput[j]){
                    num++;
                }
            }
        }
        return num;
    }


    public static void main(String[] args) {
        NGuessNumber GuessNumber = new NGuessNumber();
        int win = GuessNumber.isWin();
        if (win==4){
            System.out.println("获胜");
        }else{
            System.out.println("失败");
        }

    }
}

