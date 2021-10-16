import java.util.*;
public class postfixEval{
	public static void evaluvate(String s){
		Stack<Integer> nm =new Stack<>();
		Stack<Character> op = new Stack<>();
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(Character.isDigit(c)){
				nm.push(c-'0');
			}else{
				nm.push(doit(nm.pop(),nm.pop(),c));
			}
		}
		System.out.println(nm.peek());
	}
	public static int doit(int a,int b,char c){
		if(c=='+') return a+b;
		else if (c=='-') return a-b;
		else if (c=='*') return a*b;
		else  return a/b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		System.out.println("The expression to be evaluvated is :"+s);
		evaluvate(s);
		
	}
}