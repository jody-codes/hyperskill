/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jody
 */
public class Belajar {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        greet("Aid", "2018"); // change it as you need
        remindName();
        guessAge();
        count();
        // ...
        test();
        end();
    }
    
    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        // write your code here
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        int correct = 2;
        int answer;
        do {            
            int tryAnswer = scanner.nextInt();
            answer = tryAnswer;
            if (tryAnswer != correct) {
            System.out.println("Please, try again.");
            }
        } while (answer != correct);
    }
    
//    static void answer(){
//        int correct = 2;
//        int answer;
//        do {            
//            int tryAnswer = scanner.nextInt();
//            answer = tryAnswer;
//            if (tryAnswer != correct) {
//            System.out.println("Please, try again.");
//            }
//        } while (answer != correct);
//    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
    
    public static long power(int n, int m) {
        // write your code here
        return (long) Math.pow((double) n, (double) m);
    }
    
     public static boolean isVowel(char ch) {
        // write your code here
        boolean isVowel = true;
        String vowel = "AEIUOaeiuo";
         if (vowel.contains(String.valueOf(ch))) {
             return isVowel;
         } else {
             return !isVowel;
         }
    }
    
    public static void bridge(){
        Scanner sc = new Scanner(System.in);
        int[] busBridge = new int[2];
        List<Integer> bridges = new ArrayList<>();
        for (int i = 0; i <= busBridge.length; i++) {
            int input = sc.nextInt();
            busBridge[i] = input;
        }
        for (int i = 0; i < busBridge[1]; i++) {
            int bridge = sc.nextInt();
            bridges.add(bridge);
        }
        
        boolean crash = false;
        for (Integer bridge : bridges) {
            if (bridge < busBridge[0]) {
                System.out.println("Will crash on bridge " + (bridges.indexOf(bridge) + 1));
                crash = true;
                break;
            }
        }
        
        if (!crash) {
            System.out.println("Will not crash");
        }
    }
    
    public static void compareArray(){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        int num;
        do {            
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            list.add(num);
        } while (num > 0);
        
        List<Integer> asc = new ArrayList<>();
        asc.addAll(list);
        Collections.sort(asc);
        
        List<Integer> desc = new ArrayList<>();
        desc.addAll(asc);
        Collections.reverse(desc);
        
        boolean result = list.equals(asc) || list.equals(desc);
        System.out.println(result);
    }
    
    public static void theSequence(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                if (count > n) {
                    break;
                }
                System.out.print(i + " ");
            }
        }
    }
    
    public static void oddEven(){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        do {            
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            list.add(n);
        } while (true);
    
        for (Integer l : list) {
            if (l % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
    
    public static void bankInterest(){
        Scanner sc = new Scanner(System.in);
        double m = sc.nextInt();
        double p = sc.nextInt();
        double k = sc.nextInt();
        int y = 0;
        while (m < k) {            
            m = m * ((p + 100) / 100);
            y++;
        }
        System.out.println(y);
    }
    
    public static void max(){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int num;
        do {            
            num = sc.nextInt();
            list.add(num);
        } while (num != 0);
        int max = 0;
        for (Integer i : list) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
    
    public static void collatzConjecture(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num != 1) {
            System.out.println(num + " ");
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
        }
        System.out.println(num);
    }
    
    public static void sumIf(){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean statement = true;
        while (statement) {            
            int value = sc.nextInt();
            sum += value;
            if (value == 0) {
                statement = false;
            }
        }
        System.out.println(sum);
    }
    
    public static void casting(){
            double d = 2.00003;
        System.out.println("double = " + d);
        long l = (long) d;
        System.out.println("long = " + l );
        int i = (int) l;
        System.out.println("int = " + i);
        short s = (short) i;
        System.out.println("short = " + s);
        byte b = (byte) s;
        System.out.println("byte = " + b);
        int val = (int) (3+2L);
        System.out.println("val = " + val);
        char ch = (char) 55L;
        System.out.println("char = " + ch);
        long bigNum = 100_000_000_000_000L;
        int n = (int) bigNum;
        System.out.println("n = " + n);
        int num = 10;
        long redundant = (long) num;
        System.out.println("redundant casting = " + redundant);
        float f =  i;
        System.out.println("float = " + f);
        double df = f;
        System.out.println("df = " + df);
    }
    
    public static void modAndByInterval() {
    Scanner sc = new Scanner(System.in);
        int nums[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = sc.nextInt();
            nums[i] = num;
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i = nums[0]; i <= nums[1]; i++) {
            if (i % 3 == 0) {
                list.add(i);
            }
        }
        
        double total = 0;
        double count = 0;
        for (Integer l : list) {
            total += l;
            count++;
        }
        System.out.println(total/count);
    }
    
    public static void multiple(){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int finish = sc.nextInt();
        long result = 1;
        for (int i = start; i < finish; i++) {
            result *= i;
        }
        System.out.println(result);
    }
    
    public static void sizeOfPart(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[3];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            switch (num) {
                case 0:
                    nums[0]++;
                    break;
                case 1:
                    nums[1]++;
                    break;
                case -1:
                    nums[2]++;
                    break;
                default:
                    break;
            }
        }
        
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
    public static void maxValueModulus4(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            int num = sc.nextInt();
            nums[i] = num;
        }
        
        int max = 0;
        for (int num : nums) {
            if (num % 4 == 0 && num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
    
    public static void quotation(){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[4];
        for (int i = 0; i < nums.length; i++) {
            int num = sc.nextInt();
            nums[i]=num;
        }
        
        for (int i = 0; i <= 1000; i++) {
            if (nums[0] * (i * i * i) + nums[1] * (i * i) + nums[2] * i + nums[3] == 0) {
                System.out.println(i);
            }
        }
    }
    
    public static void fizzbuzz(){
    Scanner sc = new Scanner(System.in);
        int[] nums = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = sc.nextInt();
            nums[i]=num;
        }
        
        for (int i = nums[0]; i <= nums[1]; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            } else if (i % 3 != 0 && i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
    
    public static void grade(){
        Scanner sc = new Scanner(System.in);
        int nInput = sc.nextInt();
        int[] grades = new int[4];
        for (int i = 0; i < nInput; i++) {
            int grade = sc.nextInt();
            if (grade <= 5 && grade >= 2) {
                grades[grade-2]++;
            }
        }
        
        for (int grade : grades) {
            System.out.println(grade+" ");
        }
    }
   
}


