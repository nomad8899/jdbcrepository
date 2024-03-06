package com.ohgiraffers.section03.delete;

import com.ohgiraffers.model.dto.MenuDTO;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        /* 1. 삭제할 메뉴 코드 입력받기 */
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 메뉴 코드 입력 요청 : ");
        int code = sc.nextInt();


        /* 2. DeleteController의 deleteMenu() 메소드 호출 */
        MenuDTO mDTO = new MenuDTO();
        mDTO.setCode(code);
        DeleteController dCon = new DeleteController();
        int result = dCon.deleteMenu(mDTO);

        /* 3. delete 결과에 따라 성공이면  메뉴 삭제 성공! 실패이면 메뉴 삭제 실패! 출력 */

        if (result > 0) {
            System.out.println("메뉴삭제성공");
        } else {
            System.out.println("메뉴삭제실패");
        }

        /* entry key = "deleteMenu" */
    }
}
