package codetestfile;

import java.util.Random;
import java.util.Scanner;

public class doublebBall1 {
    public static void main(String[] args) {
//        接收用户输入的7位号码
        int[] numbers = new int[7];
        System.out.println("请输入号码：");
        numbers = userSelectNumbers();
        System.out.print("[");
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print(numbers[i]);
            System.out.print(",");
        }
        System.out.print(numbers[6] + "]");
        //系统产生随机中奖号码
        int[] luckyNumbers1numbers = new int[7];
        luckyNumbers1numbers = luckyNumbers();
        System.out.print("[");
        for (int i = 0; i < luckyNumbers1numbers.length - 1; i++) {
            System.out.print(luckyNumbers1numbers[i]);
            System.out.print(",");
        }
        System.out.print(luckyNumbers1numbers[6] + "]");


    }
    public static int[] userSelectNumbers () {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[7];
        for (int i = 0; i < numbers.length - 1; i++) {
            while (true) {
                System.out.println("请输入第" + (i + 1) + "个红色球号码：");
                int number = sc.nextInt();
                if (number < 1 || number > 33) {
                    System.out.println("输入有误，请输入位于1~33的数");
                } else if (exist(numbers, number)) {
//                        这个号码重复了
                    System.out.println("这个号码重复了，请重新输入：");
                } else {
                    numbers[i] = number;
                    break;
                }
            }
        }
        while (true) {
            System.out.println("请输入蓝色球的号码：");
            int number = sc.nextInt();
            if (number < 1 || number > 16) {
                System.out.println("您输入的号码有误，请输入位于1-16的数：");
            } else {
                numbers[6] = number;
                break;
            }
        }
        return numbers;
    }
    public static boolean exist ( int[] numbers, int n){
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == n) {
                return true;
            }
        }
        return false;
    }

    //    设计一个方法，使系统随机一组中奖号码（前6个是红球号码，第7个是蓝球号码，并返回这组中奖号码）
    public static int[] luckyNumbers () {
        Random r = new Random();
        int[] numbers = new int[7];
        for (int i = 0; i < numbers.length - 1; i++) {
            while (true) {
                int data = r.nextInt(33) + 1;
                if (!exist(numbers, data)) {
                    numbers[i] = data;
                    break;
                }
            }
        }
        int data = r.nextInt(16) + 1;
        numbers[6] = data;
        return numbers;
    }
}

