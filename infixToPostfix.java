import java.util.*;
public class infixToPostfix{
	public static int precedence(char c){
		if(c=='+' || c=='-') return 1;
		else return 2;
	}
	public static int compute(int a,int b,char c){
		if(c=='+') return a+b;
		else if(c=='-') return a-b;
		else if(c=='*') return a*b;
		else return a/b;
	}
	public static int solve(String s){
		Stack<Integer> oper = new Stack<>();
		Stack<Character> oprt = new Stack<>();
		for(int i=0;i<s.length();i++){
			char c= s.charAt(i);
			if(c=='('){oprt.push('(');}
			else if(Character.isDigit(c)){
				oper.push(c-'0');
			}else if(c==')'){
				while(oprt.peek()!='('){
					int a2= oper.pop();
					int a1= oper.pop();
					char op = oprt.pop();
					int cp= compute(a1,a2,op);
					oper.push(cp);
				}
				oprt.pop();
			}else{
				while(oprt.size()>0 && oprt.peek()!='(' && precedence(oprt.peek())>=precedence(c)){
					int a2= oper.pop();
					int a1= oper.pop();
					char op = oprt.pop();
					int cp= compute(a1,a2,op);
					oper.push(cp);	
				}
				oprt.push(c);
			}
		}
		while(oprt.size()>0){
			int a2= oper.pop();
			int a1= oper.pop();
			char op = oprt.pop();
			int cp= compute(a1,a2,op);
			oper.push(cp);
		}
		return oper.pop();
	}
	public static String conversion(String s){
		Stack<String> pre = new Stack<>();
		Stack<String> post = new Stack<>();
		Stack<Character> op = new Stack<>();
		for(int i=0;i<s.length();i++){
			char c= s.charAt(i);
			if(c=='('){
				op.push(c);
			}else if(c==')'){
				while(op.peek()!='('){
					// for prefix		
					char operator= op.pop();
					String p2=pre.pop();
					String p1= pre.pop();
					pre.push(operator+p1+p2);
					// for postfix
					p2=post.pop();
					p1=post.pop();
					post.push(p1+p2+operator);

				}op.pop(); // to remove the closing bracket
			}else if(Character.isDigit(c)){
				pre.push(c+"");
				post.push(c+"");
			}else{
				while(op.size()>0 && op.peek()!='(' && precedence(op.peek())>= precedence(c) ){
					char operator= op.pop();
					// for prefix
					String p2=pre.pop();
					String p1= pre.pop();
					pre.push(operator+p1+p2);
					// for postfix
					p2=post.pop();
					p1=post.pop();
					post.push(p1+p2+operator);
				}
				op.push(c);
			}
			// System.out.println(i+" "+pre+" "+post+" "+op);
		}
		while(op.size()>0){
			char c=op.pop();
			String p2=pre.pop();
			String p1= pre.pop();
			pre.push(c+p1+p2);
			// for postfix
			p2=post.pop();
			p1=post.pop();
			post.push(p1+p2+c);
		}
		System.out.println(pre.peek());
		return post.peek();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(conversion(s));
	}
}