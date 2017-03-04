package utils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by QrCeric on 01/03/2017.
 */
public class ReflectHashCodeUtil {

    public static final class EXCEPTION_DESCRIPTION {
        public static final String EXCEPTION_RESULT_NULL = String.valueOf("EXCEPTION_RESULT_NULL   SOA返回结果为空".hashCode());
        public static final String EXCEPTION_SOA_ERROR = String.valueOf("EXCEPTION_SOA_ERROR   SOA调用错误".hashCode());
        public static final String EXCEPTION_SYSTEM_ERROR = String.valueOf("EXCEPTION_SYSTEM_ERROR SOA返回系统错误".hashCode());
        public static final String EXCEPTION_BUSINESS_ERROR = String.valueOf("EXCEPTION_BUSINESS_ERROR SOA返回业务错误".hashCode());
        public static final String EXCEPTION_KEY_NULL = String.valueOf("EXCEPTION_KEY_NULL  SOA返回Key为空".hashCode());
        public static final String EXCEPTION_SHIELD_DISABLED = String.valueOf("EXCEPTION_SHIELD_DISABLED   功能临时禁用".hashCode());
        public static final String EXCEPTION_SHIELD_ENABLED = String.valueOf("EXCEPTION_SHIELD_ENABLED  功能重新恢复".hashCode());
        public static final String EXCEPTION_PARSE_RESULT = String.valueOf("EXCEPTION_PARSE_RESULT 校验SOA返回结果异常".hashCode());
        public static final String EXCEPTION_GET_CLIENTIP = String.valueOf("EXCEPTION_GET_CLIENTIP 获取ClientIP失败".hashCode());
        public static final String EXCEPTION_GET_HEADERS = String.valueOf("EXCEPTION_GET_HEADERS   获取Headers失败".hashCode());
        public static final String EXCEPTION_BUILD_HEADERS = String.valueOf("EXCEPTION_BUILD_HEADERS   构造Headers失败".hashCode());
        public static final String EXCEPTION_REGEX_HOTELID = String.valueOf("EXCEPTION_REGEX_HOTELID   参数HotelID不合法".hashCode());
        public static final String EXCEPTION_REGEX_ACTIONNAME = String.valueOf("EXCEPTION_REGEX_ACTIONNAME   参数ActionName不合法".hashCode());
        public static final String EXCEPTION_BUILD_REQUEST = String.valueOf("EXCEPTION_BUILD_REQUEST   构造请求参数失败".hashCode());
        public static final String EXCEPTION_CHECK_SWITCH = String.valueOf("EXCEPTION_CHECK_SWITCH 检查临时开关失败".hashCode());
        public static final String EXCEPTION_REDIS_NULL = String.valueOf("EXCEPTION_REDIS_NULL  检查REDIS异常".hashCode());
    }

    public static void main(String[] args) {

        String tempString = "这是二十个字符89##abc";
        String question = (tempString = tempString.split("##")[0]).length() > 10 ? tempString.substring(0, 9) + "..." : tempString;
        System.out.println(question);

        reflectValues(new EXCEPTION_DESCRIPTION());

    }

    public static Map<String, String> reflectValues(Object object) {
        Map<String, String> map = new HashMap<>(20);
        try {
            Class cls = object.getClass();
            Field[] fields = cls.getDeclaredFields();
            for (Field field : fields) {
                map.put(field.get(String.class).toString(), field.getName());
            }
            String returnLine = "\r\n";
            System.out.println(cls.getName() + returnLine);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "\t" + entry.getValue());
            }
        } catch (IllegalAccessException throwable) {
            throwable.printStackTrace();
        } catch (IllegalArgumentException throwable) {
            throwable.printStackTrace();
        } catch (SecurityException throwable) {
            throwable.printStackTrace();
        }
        return map;
    }
}