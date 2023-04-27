package phone;

import java.util.Scanner;

public class Phone01 {
	String color;
	String model;
	String condition; 
	public Phone01(String color, String model, String condition) {
		this.color = color;
		this.model = model;
		this.condition = condition;
	}

	//전역 변수
	Scanner sc = new Scanner(System.in);
	int powerOn;
	int hangOn;
	int hangOff;
	// 전원 켜기
	public void powerOnOff() {
		while (true) {
			System.out.println("전원을 켜시겠습니까? 1.on 2. off");
			powerOn = Integer.parseInt(sc.nextLine());
		if(powerOn==1) {
			condition = "실행";
			System.out.println(model + "폰 전원이 켜졌습니다.");
			System.out.println("상태 : " + condition);
			break;
		}else if (powerOn ==2 ) {
			condition = "종료";
			System.out.println(model + "폰 전원이 꺼졌습니다.");
			System.out.println("상태 : " + condition);
			continue;
			}
		}
	}
	
	public void hang() {
		System.out.println("전화를 받으시겠습니까? 1. 받기 2. 끊기");
		hangOn =Integer.parseInt(sc.nextLine());
			while(true) {
				if(condition.equals("실행")&&hangOn == 1 ) {
				condition = "전화중";
				System.out.println(condition);
				System.out.println("끊기 원하시면 2번을 입력해주세요");
				hangOn =Integer.parseInt(sc.nextLine());
				continue;
			}else {
				System.out.println("전화를 끊으셨습니다.");
				break;
			}
			}	
	}
	

}

