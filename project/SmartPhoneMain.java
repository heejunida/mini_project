package practice;

import java.util.Scanner;

public class SmartPhoneMain {
	public static void printMenu() {
		System.out.println("주소관리 메뉴---------------");
		System.out.println("1. 연락처 등록");
		System.out.println("2. 모든 연락처 출력");
		System.out.println("3. 연락처 검색");
		System.out.println("4. 연락처 삭제");
		System.out.println("5. 연락처 수정");
		System.out.println("6. 프로그램 종료");
		System.out.println("-------------------------");
	}
	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone();
		Scanner sc = new Scanner(System.in);
		System.out.println("# 데이터 2개를 입력합니다.");
		Addr contact = phone.inputAddrData();
		phone.addAddr(contact);
		Addr contact2 = phone.inputAddrData();
		phone.addAddr(contact2);
		while (true) {
		printMenu();
		int option = sc.nextInt();
		sc.nextLine();
			switch (option) {
			case (1):
				Addr contact3 = phone.inputAddrData();
				phone.addAddr(contact3);
				break;
			case (2):
				phone.printAllAddr();
				break;
			case (3):
				System.out.println("검색하실 연락처의 이름을 입력해 주세요.");
				String search = sc.nextLine();
				phone.searchAddr(search);
				break;
			case (4):
				System.out.println("삭제하실 연락처의 이름을 입력해 주세요.");
				String delete = sc.nextLine();
				phone.deleteAddr(delete);
				break;
			case (5):
				System.out.println("수정하실 연락처의 이름을 입력해 주세요.");
				String name = sc.nextLine();
				contact = phone.inputAddrData();
				phone.editAddr(name, contact);
				break;
			case(6):
				System.out.println("프로그램이 종료됩니다.");
				System.exit(0);
			default:
				break;
			}
		}
	}

}
