package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {


        @DataProvider(name = "dataSet")
        public Object[][] dataSet() {
            Object[][] data = new Object[][]{
                    {"Tester", "Harrow", "up to 25 miles", "30000", "70000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                    {"Tester", "Harrow", "up to 5 miles", "20000", "60000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                    {"Presser", "London", "up to 25 miles", "15000", "30000", "Per annum", "Permanent", "Permanent Presser jobs in London"},
                    {"Store Manager", "Northamptonshire", "up to 15 miles", "300", "600", "Per week", "Permanent", "Permanent Store Manager jobs in Northamptonshire"},
                    {"It Administrator", "Warwick, Warwickshire", "up to 15 miles", "40000", "80000", "Per annum", "Permanent", "Permanent It Administrator jobs in Warwick"},
                    {"Test Analyst", "Peterborough", "up to 15 miles", "45000", "55000", "Per annum", "Permanent", "Permanent Test Analyst jobs in Peterborough"},
                    {"Test Manager", "Milton Keynes", "up to 10 miles", "350", "700", "Per day", "Contract", "Contract Test Manager jobs in Milton Keynes"},
            };
            return data;
        }
    }
