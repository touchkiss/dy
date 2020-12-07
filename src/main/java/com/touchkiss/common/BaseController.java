package com.touchkiss.common;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2020/03/19 9:45
 *
 * @author Touchkiss
 */
public interface BaseController {
    default HashMap<String, String> parameterMap(HttpServletRequest request) {

        Map<String, String[]> prmap = request.getParameterMap();
        HashMap<String, String> parameterMap = new HashMap<>();
        String key;
        String[] value;


        for (Map.Entry<String, String[]> entry : prmap.entrySet()) {
            key = entry.getKey();
            if (!StringUtils.equalsAny(key, "p", "pagesize", "ordering")) {
                value = entry.getValue();
                parameterMap.put(key, value == null ? null : String.join(",", value));
            }
        }
        String[] orderings = prmap.get("ordering");
        if (orderings != null && orderings.length > 0 && StringUtils.isNotBlank(orderings[0])) {
            String ordering = orderings[0];
            if (ordering.startsWith("-")) {
                parameterMap.put("datatableorderby", "order by " + ordering.substring(1) + " desc");
            } else {
                parameterMap.put("datatableorderby", "order by " + ordering);
            }
        }
        return parameterMap;
    }
}
