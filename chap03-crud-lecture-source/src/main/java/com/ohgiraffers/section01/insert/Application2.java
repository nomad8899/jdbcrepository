package com.ohgiraffers.section01.insert;

import com.ohgiraffers.model.dto.MenuDTO;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* 1. 메뉴의 이름, 가격, 카테고리 코드, 판매여부를 입력 받기 (Scanner 이용) */

        Scanner sc = new Scanner(System.in);

        System.out.print("메뉴의 이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.print("메뉴의 가격을 입력해주세요 : ");
        int price = sc.nextInt();
        System.out.print("메뉴의 카테고리 코드를 입력해주세요 : ");
        int cCode = sc.nextInt();
        System.out.print("메뉴의 판매여부를 입력해주세요 Y/N : ");
        sc.nextLine(); // 버퍼에 개행문자가 남아 있기 때문에 제거하기 위해 씀
        String sellStatus = sc.nextLine().toUpperCase();

        /* MenuDTO 객체를 생성하여 입력받은 값으로 Setting */

        MenuDTO menuDTO = new MenuDTO();

        menuDTO.setName(name);
        menuDTO.setPrice(price);
        menuDTO.setcCode(cCode);
        menuDTO.setSellStatus(sellStatus);

        /* InsertController의 insetMenu() 메소드 호출 */

        InsertController insertController = new InsertController();
        int result = insertController.insertMenu(menuDTO);

        /* insert 결과에 따라서 성공이면 메뉴 등록 성공! , 실패이면 메뉴 등록 실패! 출력*/
        if(result > 0) {
            System.out.println("메뉴 등록 성공!");
        } else {
            System.out.println("메뉴 등록 실패ㅠㅠ");
        }
    }
}
