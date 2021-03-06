import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderInSameClassWithMultiParams {
    @Test(dataProvider = "data-provider")
    public void testMethod(String firstName, String lastName, String email){
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(email);
        System.out.println("*************");
    }

    @DataProvider(name = "data-provider")
    public Object[][] dataProviderMethod()
    {
        Object[][] data = new Object[2][3];
        data[0][0] = "FirstName1";
        data[0][1] = "LastName1";
        data[0][2] = "Email1";

        data[1][0] = "FirstName2";
        data[1][1] = "LastName2";
        data[1][2] = "Email2";
        return data;
    }
}
