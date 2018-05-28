import java.util.Collection;
import java.util.Map;

/**
 * Java≈–∂œπ§æﬂ
 * 
 * @author William_HCX
 *
 */
public final class AssertUtil {
	private AssertUtil() {
	}

	private static boolean isNull(Object object) {
		return object == null;
	}

	public static boolean isEmpty(Collection<?> collection) {
		return isNull(collection) || collection.size() < 1;
	}

	public static boolean isEmpty(Map<?, ?> map) {
		return isNull(map) || map.size() < 1;
	}

	public static boolean isEmpty(Object object) {
		return isNull(object);
	}

	public static boolean isEmpty(Object[] objectArray) {
		return isNull(objectArray) || objectArray.length < 1;
	}

	public static boolean isEmpty(String string) {
		return isNull(string) || string.trim().length() < 1;
	}

	public static boolean isNotEmpty(Collection<?> collection) {
		return !isEmpty(collection);
	}

	public static boolean isNotEmpty(Map<?, ?> map) {
		return !isEmpty(map);
	}

	public static boolean isNotEmpty(Object object) {
		return !isEmpty(object);
	}

	public static boolean isNotEmpty(Object[] objectArray) {
		return !isEmpty(objectArray);
	}
	
	
}
