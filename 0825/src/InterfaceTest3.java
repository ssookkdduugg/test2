
interface IClick {
	void iclick();
}

class BasicButton {
	String title;
	IClick iClick;

	void click() {
		System.out.println("버튼 기본 처리");
		if (iClick != null) {
			iClick.iclick();
		}
	}

	void addClickEventHandler(IClick iClick) {
		this.iClick = iClick;
	}
}



class LoginClick implements IClick {

	@Override
	public void iclick() {
		System.out.println("로그인 처리");

	}

}

public class InterfaceTest3 {

	public static void main(String[] args) {
		BasicButton loginBtn = new BasicButton();
		loginBtn.addClickEventHandler(new LoginClick());
		loginBtn.click();
		BasicButton joinBtn = new BasicButton();
		joinBtn.addClickEventHandler(new IClick() { //익명클래스, 이너클래스 
			
			@Override
			public void iclick() {
				System.out.println("회원 가입 처리");
				
			}
		});
		joinBtn.click();

	}

}
