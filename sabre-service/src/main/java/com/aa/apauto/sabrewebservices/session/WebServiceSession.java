package com.aa.apauto.sabrewebservices.session;

import java.util.HashMap;
import java.util.Map;

public class WebServiceSession {

    private static class ThreadLocalVal extends InheritableThreadLocal<HashMap<String, Object>> {
    	@Override
        public HashMap<String, Object> initialValue() {
            return new HashMap<>();
        }
    }

    private static ThreadLocalVal tval = new ThreadLocalVal();
    private WebServiceSession() {
    }

    public static void set(String key, Object val) {
        HashMap<String, Object> map = tval.get();
        map.put(key, val);
    }

    public static Object get(String key) {
        HashMap<String, Object> map = tval.get();
        return map.get(key);
    }

    public static String getWithFormat(String key) {
        String xml = "";
        HashMap<String, Object> map = tval.get();
        xml = (String) map.get(key);
        if (xml instanceof String) {
            xml = XMLFormater.format(xml);
        }

        return xml;
    }

    public static Map<String, Object> getMap() {
        return tval.get();
    }

    public static void remove() {
        tval.remove();
    }

}
