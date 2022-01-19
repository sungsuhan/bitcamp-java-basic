package com.example.han;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("id = ");
        String id = scanner.next();

        System.out.print("password = ");
        String pw = scanner.next();

        System.out.print("이름 = ");
        String name = scanner.next();

        System.out.print("나이 = ");
        String age = scanner.next();

        System.out.println("<<<id는 " + id + ", password는 " + pw + ", 이름은 " + name + ", 나이는 " + age + "살 입니다>>>");











    }


}
