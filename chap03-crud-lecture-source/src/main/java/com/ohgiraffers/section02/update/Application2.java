package com.ohgiraffers.section02.update;

import com.mysql.cj.xdevapi.UpdateStatement;
import com.ohgiraffers.model.dto.MenuDTO;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /* 1. 변경할 메뉴 코드, 이름, 가격을 입력 받기 */
        Scanner sc = new Scanner(System.in);

        System.out.println("변경할 메뉴 코드 입력 : ");
        int mCode = sc.nextInt();
        System.out.println("변경할 메뉴 이름 입력 : ");
        sc.nextLine();
        String mName = sc.nextLine();
        System.out.println("변경할 메뉴 가격 입력 : ");
        int mPrice = sc.nextInt();

        /* 2. MenuDTO 객체를 생성하여 입력받은 값으로 setting */
        MenuDTO mDTO = new MenuDTO();

        mDTO.setCode(mCode);
        mDTO.setName(mName);
        mDTO.setPrice(mPrice);

        /* 3. UpdateController의 updateMenu() 메소드 호출 */
        UpdateController updateController = new UpdateController();

//        updateController.updateMenu(mDTO);
        int result = updateController.updateMenu(mDTO);

        /* 4. update 결과에 따라 성공, 실패 메세지 출력 */

        if(result > 0) {
            System.out.println("메뉴 등록 성공!");
        } else {
            System.out.println("메뉴 등록 실패!");
        }

    }
}
