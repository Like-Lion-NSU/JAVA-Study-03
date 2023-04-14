package ju;

public class ju04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]hex= {'C','A','F','E'};
		
		String [] binary = { //2진수 값을 담아놓은 배열
				"0000","0001","0010","0011",
				"0100","0101","0110","0111",
				"1000","1001","1010","1011",
				"1100","1101","1110","1111"};
		
		String result="";
		
		for(int i=0; i<hex.length; i++) { //배열에 저장된 문자만큼 반복
			if(hex[i]>='0'&&hex[i]<='9') {//hex 배열의 저장된 문자가 0~9면->숫자면
				result +=binary[hex[i]-'0'];//해당 숫자에 맞는 2진수 값을 result에 대입
			}else { //hex배열에 들어있는 값이 문자이면
				result += binary[hex[i]-'A'+10];//해당 문자에 맞는 2진수 값을 result에 대입
			}
		}
		System.out.println("hex:"+new String (hex));
		System.out.println("binary:"+result);
		}

	}


