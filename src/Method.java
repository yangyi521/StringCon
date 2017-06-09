import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
*@title：test1.java
* @author：被抛弃的猫咪
* @version：1.0
* @date：2017年5月5日 下午2:10:28
* @description：字符串的比较
*/
public class Method {
	public static <T> List<T> compare(T[] t1, T[] t2) {
	    List<T> list1 = Arrays.asList(t1);
	    List<T> list2 = new ArrayList<T>();
	    for (T t : t2) {
	      if (!list1.contains(t)) {
	        list2.add(t);
	      }
	    }
	    return list2;
	}

}
