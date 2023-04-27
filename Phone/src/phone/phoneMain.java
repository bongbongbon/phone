package phone;

public class phoneMain {
	public static void main(String[] args) {
		Phone01 ph = new Phone01("검정", "삼성","종료");
		System.out.println("1세대 폰" +"("+ "색상: " + ph.color + "  모델명: " + ph.model + "  상태: " + ph.condition + ")" +"가 지급 되었습니다.");

			ph.powerOnOff();
			ph.hang();
	}
}
