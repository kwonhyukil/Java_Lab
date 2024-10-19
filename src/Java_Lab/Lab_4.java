package Java_Lab;

import java.util.Scanner;

public class Lab_4 {

    public float calculate_average(float math_score, float science_score, float english_score){

        float average = (math_score + science_score + english_score) / 3;
        return average;

    }

    public static void main(String[] args) {
        Lab_4 lab = new Lab_4();
        Scanner scan = new Scanner(System.in);

        System.out.print("수학 점수를 입력하세요: ");
        float math_score = scan.nextFloat();
        System.out.print("과학 점수를 입력하세요: ");
        float science_score = scan.nextFloat();
        System.out.print("영어 점수를 입력하세요: ");
        float english_score = scan.nextFloat();

        float average = lab.calculate_average(math_score, science_score, english_score);

        char rating;

        if (average >= 90){
            rating = 'A';
        }else if (average >= 80){
            rating = 'B';
        }else if (average >= 70){
            rating = 'C';
        }else if (average >= 60){
            rating = 'D';
        }else{
            rating = 'F';
        }
        System.out.println("평균 점수는 " + average + "점이고, 학점은 " + rating + "입니다.");
    }
}
