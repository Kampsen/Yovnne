package com.yovnne.utils;
/*
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//import com.sun.xml.internal.ws.util.StringUtils;
//import org.apache.commons.lang3.StringUtils;

*/


/*
@SuppressWarnings("rawtypes")
public class Collections3 {
	
	

	public Collections3() {
		super();
	}


	*//*
	public static String convertToString(final Collection collection, final String separator) {
		return StringUtils.join(collection, separator);
	}

	*/

	/*
	public static String convertToString(final Collection collection, final String prefix, final String postfix) {
		StringBuilder builder = new StringBuilder();
		for (Object o : collection) {
			builder.append(prefix).append(o).append(postfix);
		}
		return builder.toString();
	}
	*/

	/*
	public static boolean isEmpty(Collection collection) {
		return collection == null || collection.isEmpty();
	}
	
	*/

	/*
	public static boolean isNotEmpty(Collection collection){
		return !isEmpty(collection);
	}
	
	*/

	/*
	public static Integer size(Collection collection){
		if(isEmpty(collection)){
			return 0;
		}else{
			return collection.size();
		}
	}
	
	*/

	/*
	public static Integer size(Map<?,?> map){
		if(map == null){
			return 0;
		}else{
			return map.size();
		}
	}

	*/

	/*
	public static <T> T getFirst(Collection<T> collection) {
		if (isEmpty(collection)) {
			return null;
		}

		return collection.iterator().next();
	}

	*/

	/*
	public static <T> T getLast(Collection<T> collection) {
		if (isEmpty(collection)) {
			return null;
		}

				if (collection instanceof List) {
			List<T> list = (List<T>) collection;
			return list.get(list.size() - 1);
		}


		Iterator<T> iterator = collection.iterator();
		while (true) {
			T current = iterator.next();
			if (!iterator.hasNext()) {
				return current;
			}
		}
	}

	*/

	/*
	public static <T> List<T> union(final Collection<T> a, final Collection<T> b) {
		List<T> result = new ArrayList<>(a);
		result.addAll(b);
		return result;
	}

	*/

	/*
	public static <T> List<T> subtract(final Collection<T> a, final Collection<T> b) {
		List<T> list = new ArrayList<>(a);
			
		list.removeAll(b);

		return list;
	}

	*/

	/*
	public static <T> List<T> intersection(Collection<T> a, Collection<T> b) {
		List<T> list = new ArrayList<>(a);

		list.retainAll(b);
		
		return list;
	}
}
*/