package generics;

class GenericsRun {
	public static void main(String[] args) {
		
		/* Box의 제네릭 타입을 String으로 지정 */
		Box<String> box1 = new Box<String>();
		
		box1.setValue("String만 전달 가능");
		
		System.out.println( box1.getValue() );
	}
}
