package helpers;

import com.codeborne.selenide.Configuration;

public class DriverHelper {
    public static void configureDriver() {
        Configuration.baseUrl = "https://expload.com/";
    }
}
