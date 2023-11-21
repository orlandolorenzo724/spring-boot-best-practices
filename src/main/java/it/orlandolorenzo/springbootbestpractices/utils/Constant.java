package it.orlandolorenzo.springbootbestpractices.utils;

import java.util.Map;

public class Constant {

    private Constant() {
        throw new IllegalStateException("Utility class");
    }

    public static final String RESULT_OK = "OK";
    public static final String RESULT_KO = "KO";

    public static final String GENERIC_RESPONSE_CODE = "GENERIC-ERROR";

    public static final String LOG_RESPONSE_CODE_PREFIX = "LOG-";

    public static Map<String, String> getLogResponseHashMap() {
        return Map.of(
            LOG_RESPONSE_CODE_PREFIX + "1", "Log not found",
            LOG_RESPONSE_CODE_PREFIX + "2", "Log already exists",
            LOG_RESPONSE_CODE_PREFIX + "3", "Log not created",
            LOG_RESPONSE_CODE_PREFIX + "4", "Log not updated",
            LOG_RESPONSE_CODE_PREFIX + "5", "Log not deleted",
            LOG_RESPONSE_CODE_PREFIX + "6", "Log found",
            LOG_RESPONSE_CODE_PREFIX + "7", "Log created",
            LOG_RESPONSE_CODE_PREFIX + "8", "Log updated",
            LOG_RESPONSE_CODE_PREFIX + "9", "Log deleted",
            LOG_RESPONSE_CODE_PREFIX + "10", "Log list found"
        );
    }
}
