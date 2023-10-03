package com.ohgiraffers.section01.level01.basic;

import java.util.SplittableRandom;

public class Application1 {

    /* 실행용 메소드*/


        
        /* Calculater 클래스의 메소드를 호출해서 실행 */
        public static void main(String[] args) {
            Calculator calc = new Calculator();
            calc.checkMethod();

            int a = 10;
            int b = 20;

            String result = calc.sumTwoNumber(a,b);
            System.out.println(result);

            String result2= calc.multiTwoNumber(a,b);
            System.out.println(result2);

            int result3= calc.multiTwoNumber2(a,b);
            System.out.println("10과 20의 곱은 "+result3+" 입니다.");

    }
}
