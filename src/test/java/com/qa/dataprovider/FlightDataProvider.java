package com.qa.dataprovider;

import org.testng.annotations.DataProvider;

public class FlightDataProvider {

    @DataProvider(name = "flightDetails")
    public static Object[][] flightDetails() {
//        final Object[][] objReturn = ExcelUtilities.getTableArray(System.getProperty("user.dir") + File.separator
//                        + "TestData\\Integrations\\Loaders" + File.separator + "Integration_DataProvider.xls", "Data",
//                "product");
//        return objReturn;

        return new Object[][] {
                {"Paris", "Rome"},
                {"Boston", "London"},
                {"Portland", "Berlin"}
        };
    }
}
