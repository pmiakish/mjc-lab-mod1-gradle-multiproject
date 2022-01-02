package com.epam.util;

public class Utils {
    public static boolean isAllPositiveNumbers(String... str) {
        if (str != null && str.length > 0) {
            for (String s : str) {
                if (!StringUtils.isPositiveNumber(s)) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
