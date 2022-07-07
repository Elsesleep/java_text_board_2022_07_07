package com.bjh.exam.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int articleLastId = 0;
      System.out.println("== 게시판 v 0.1 ==");
      System.out.println("== 프로그램 시작 ==");
    while (true) {
      System.out.printf("명령) ");
      String cmd = sc.nextLine();
      System.out.printf("입력 된 명령어 : %s\n", cmd);

      if ( cmd.equals("exit")) {
        System.out.println("== 프로그램 끝 ==");
        break;
      }
      else if ( cmd.equals("/usr/article/write")) {
        System.out.printf("== 게시물 등록 ==\n");
        System.out.printf("제목 : ");
        String title = sc.nextLine();
        System.out.printf("내용 : ");
        String body = sc.nextLine();
        int id = articleLastId + 1;
        articleLastId++;

        Article article = new Article();
        article.id = id;
        article.title = title;
        article.body = body;

        System.out.println("생성된 게시물 객체 : " + article);
        System.out.printf("%d번 게시물이 등록되었습니다.\n", article.id);
      }



    }



    sc.close();
  }
}
class Article {
  int id;
  String title;
  String body;
  public String toString() {
    return String.format("{id : \"%s\", title : \"%s\", body : \"%s\"}", id, title, body);
  }

}
