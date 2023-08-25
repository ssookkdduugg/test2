class MyButton{
	String title;
	
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	void click() {
		System.out.println("쏙 들어갔다 나옴");
	}
	
	
	
}



class LoginButton extends MyButton{ 
	//회원가입이나, 로그아웃버튼도 계속 버튼을 상속받아서 오버라이드메소드하기에 복잡하
	//니까 인터페이스를 쓰는거임
	
	@Override
	void click() {
		super.click();
		System.out.println("로그인 처리");
	}
}
public class InterfaceTest2 {
	public static void main(String[] args) {
		MyButton loginBtn = new LoginButton();
		loginBtn.setTitle("로그인");
		loginBtn.click();
		
	}

}
