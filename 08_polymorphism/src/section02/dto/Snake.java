package section02.dto;

public class Snake extends Animal{
	
	//생성자
	public Snake(String type) {
		super(type);
	}

	@Override
	public void move() {
		System.err.println("뱀 : S자로 슬금슬금 기어다님");
	}
	
	@Override
	public void eat() {
		System.err.println("뱀 : 통으로 삼킴");
	}
	@Override
	public void sleep() {
		System.err.println("뱀 : 똬리를 틀고 잠");
	}

	
}
