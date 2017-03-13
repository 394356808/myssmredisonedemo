package cn.ssm.filter;

public class cs {

	public static void main(String[] args) {
		String temp="12";
		// TODO Auto-generated method stub
 System.out.println(getType(temp));
 System.out.println(getType("saf"));
	}
public static<T> String getType(T t){
	if(t instanceof String){
		return "string";
	}else if(t instanceof Integer){
		return "int";
	}else{
		return "do not know";
	}
}
}
