import java.util.*;
public class balancedPar{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s  = sc.nextLine();
		Stack<Character> st = new Stack<>();
		System.out.println("THe orignal strings is : "+s);
		for(int i=0;i<s.length();i++){
			Character c= s.charAt(i);
			if(c=='[' || c=='{' || c=='('){
				st.push(c);
				continue;
			}else{
				Character cc = null;
				if(c==']') cc='[';
				if(c=='}') cc='{';
				if(c==')') cc='(';
				if(st.peek()==cc) st.pop();
			}
		}	
		if(st.size()==0){
			System.out.println("The equaiton is balanced");
		}else{
			System.out.println("The equation is not balanced");
		}

	}
}