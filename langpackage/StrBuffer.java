package langPackage;

public class StrBuffer {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
		System.out.println("buffer = " + buffer);
		System.out.println("length = " + buffer.length());
		System.out.println("capacity = " + buffer.capacity());

		String s;
		int a = 42;
		buffer = new StringBuffer(40);
		s = buffer.append("a = ").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(buffer);

		buffer = new StringBuffer("I Java!");
		buffer.insert(2, "like    ");
		System.out.println(buffer);
		
		buffer.delete(7,10);
		System.out.println(buffer);
		
		System.out.println(buffer.reverse());
    }
}
