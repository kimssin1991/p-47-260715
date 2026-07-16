package org.example;

import java.util.Scanner;

public class App {
    // Scanner
    Scanner sc = new Scanner(System.in);
    int lastNo = 0;
    WiseSaying[] wiseSayings = new WiseSaying[10];

    public void run(){

        System.out.println("== 명언 앱 ==");
        String cmd = "";

        while(!cmd.equals("종료")) {
            System.out.print("명령) ");
            cmd = sc.nextLine();

            if(cmd.equals("등록")) {
                add();
            }
            if(cmd.equals("목록")) {
                list();
            }
        }
    }

    private void list() {
        System.out.println("번호 / 작가 / 명언");
        System.out.println("----------------------");
        for(int i = lastNo - 1; i >= 0; i--) { // 0 시작, lastNo - 1 끝
            WiseSaying target = wiseSayings[i];
            System.out.println("%d / %s / %s.".formatted(target.no, target.author, target.content));
        }
    }

    private void add() {
        WiseSaying wiseSaying = new WiseSaying();
        wiseSayings[lastNo] = wiseSaying;

        System.out.print("명언 : ");
        wiseSaying.content = sc.nextLine();
        System.out.print("작가 : ");
        wiseSaying.author = sc.nextLine();
        // %d => 숫자
        // %s => 문자열
        ++lastNo;
        wiseSaying.no = lastNo;
        System.out.println("%d번 명언이 등록되었습니다.".formatted(wiseSaying.no));

    }
}
