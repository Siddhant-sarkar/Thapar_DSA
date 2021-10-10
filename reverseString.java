import java.util.*;
public class reverseString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Character> st = new Stack<>();
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++) st.push(s.charAt(i));
		while(st.size()>0){
			System.out.print(st.pop());
		}
	}
}