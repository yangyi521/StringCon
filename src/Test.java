import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
*@title：Test.java
* @author：被抛弃的猫咪
* @version：1.0
* @date：2017年5月5日 下午1:06:00
* @description：获取相同的  分别不同
*/
public class Test {

	private static Scanner sc;

	public static void main(String[] args) {
		System.out.println("输入花纹或者品牌字符串1：");
		sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String[] strArray1 = null;  
		//String strTrim1 = str1.replace(" ", "");
	    strArray1 = str1.split(";");
	    for(int k=0;k<strArray1.length;k++){
	    	strArray1[k]=strArray1[k].trim();
	    }
	    System.out.print("字符串1中的内容:");
	    for(int i=0;i<strArray1.length;i++){
	    	System.out.print(strArray1[i]+";");	
	    }
	    System.out.println();
		System.out.println("输入花纹或者品牌字符串2：");
		//sc = new Scanner(System.in);
		String str2 = sc.nextLine();
		String[] strArray2 = null;
		//String strTrim2 = str2.replace(" ", "");
	    strArray2 = str2.split(";");
	    for(int k=0;k<strArray2.length;k++){
	    	strArray2[k]=strArray2[k].trim();
	    }
	    System.out.print("字符串2中的内容:");
	    for(int i=0;i<strArray2.length;i++){
	    	System.out.print(strArray2[i]+";");	
	    }
	    System.out.println();
		//Method method = new Method();
		//String a[] = {"2","1","4","5"};
		//String b[] = {"3","2","1"};
		List<String> list = new ArrayList<String>();
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		for(int i=0;i<strArray1.length;i++){
			for(int j=0;j<strArray2.length;j++){
				if(strArray1[i].equals(strArray2[j])){
					list.add(strArray1[i]);
				}			
			}
		}
		
	//将一个list转换成一个数组
		String con[] = new String[list.size()];
		for(int m=0;m<list.size();m++){
			con[m]=(String) list.get(m);
		}
		//输出共有的
		System.out.println("共有数据：");
		for(int n=0;n<con.length;n++){
			System.out.print(con[n]+";");
		}
		 System.out.println();
		list1 = Method.compare(con, strArray1);
		list2 = Method.compare(con, strArray2);
		System.out.println("与字符串1不同的有："+list1);
		System.out.println("与字符串2不同的有："+list2);
			
	}

}
