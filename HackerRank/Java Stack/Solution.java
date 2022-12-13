import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
            Stack<String> s = new Stack<String>();
			String input = sc.next();
            String[] inputArr = input.split("");
            boolean msg = true;
            
            if(inputArr.length == 0) {
            	msg = false;
            }
            else {
                for(String str : inputArr) {
                    if(":(:{:[".indexOf(str) > 0) {
                        s.push(str);
                    }
                    else {
                        if(s.size() > 0) {
                            if(("{".equals(s.peek()) && "}".equals(str))
                            	|| ("(".equals(s.peek()) && ")".equals(str))
                            	|| ("[".equals(s.peek()) && "]".equals(str))) {
                            	s.pop();
                            }
                        }
                        else {
                        	msg = false;
                        }
                    }
                }
                
                if(s.size() == 0 && msg != false) {
                    System.out.println("true");
                }
                else {
                    System.out.println("false");
                }
            }
		}
	}
}