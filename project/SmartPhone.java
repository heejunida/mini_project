package practice;

import java.util.Scanner;

public class SmartPhone {
	Scanner sc = new Scanner(System.in);
	Addr[] addrArr = new Addr[0];

	public Addr inputAddrData() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화 번호: ");
		String number = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		System.out.print("주소 : ");
		String address = sc.nextLine();
		System.out.print("그룹(친구/가족) : ");
		String group = sc.nextLine();
		Addr addr = new Addr(name, number, email, address, group);
		System.out.printf(">>> 데이터가 저장되었습니다. (%d)", addrArr.length + 1);
		System.out.println(addr.getName() + "\n" + addr.getNumber() + "\n" + addr.getEmail() + "\n" + addr.getAddress()
				+ "\n" + addr.getGroup());
		return addr;
	}

	public Addr[] addAddr(Addr addr) {
		Addr[] newAddr = new Addr[addrArr.length + 1];
		for (int i = 0; i < addrArr.length; i++) {
			newAddr[i] = addrArr[i];
		}
		newAddr[addrArr.length] = addr;
		addrArr = newAddr;
		System.out.println(addr.getName() + "님이 추가되었습니다. ");
		return addrArr;
	}

	public void printAddr(Addr addr) {
		System.out.println(addr.getName() + "\n" + addr.getNumber() + "\n" + addr.getEmail() + "\n" + addr.getAddress()
				+ "\n" + addr.getGroup());
	}

	public void printAllAddr() {
		for (int i = 0; i < addrArr.length; i++) {
			System.out.println(addrArr[i].getName() + "\n" + addrArr[i].getNumber() + "\n" + addrArr[i].getEmail()
					+ "\n" + addrArr[i].getAddress() + "\n" + addrArr[i].getGroup());
		}
	}

	public void searchAddr(String name) {
		for (int i = 0; i < addrArr.length; i++) {
			System.out.println("what");
			if (name.equals(addrArr[i].getName())) {
				System.out.println(name + "님의 연락처입니다.");
				System.out.println(addrArr[i].getName() + "\n" + addrArr[i].getNumber() + "\n" + addrArr[i].getEmail()
						+ "\n" + addrArr[i].getAddress() + "\n" + addrArr[i].getGroup());
			}
		}
	}

	public Addr[] deleteAddr(String name) {
		int index = -1;
		for (int i = 0; i < addrArr.length; i++) {
			if (name.equals(addrArr[i].getName())) {
				index = i;
				break;
			}
		}
		Addr[] addrNew = new Addr[addrArr.length - 1];
	    for (int i = 0, j = 0; i < addrArr.length; i++) {
	        if (i == index){
	        	continue;
	        	}
	        addrNew[j++] = addrArr[i];
	    }
	   addrArr = addrNew;
		return addrArr;
	}

	public void editAddr(String name, Addr newAddr) {
		for (int i = 0; i < addrArr.length; i++) {
			if (name.equals(addrArr[i].getName())) {
				addrArr[i].setNumber(newAddr.getNumber());
				addrArr[i].setEmail(newAddr.getEmail());
				addrArr[i].setAddress(newAddr.getAddress());
				addrArr[i].setGroup(newAddr.getGroup());
			}
		}
	}
}
