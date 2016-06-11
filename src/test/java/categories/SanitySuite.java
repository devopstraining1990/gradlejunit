package categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Created by Sagar on 30-04-2016.
 */
@Category(CategoryX.class)
public class SanitySuite {

    @Test
    public void teSanity1(){
        System.out.println("Category X - Running sanity test - 1");
        System.out.println(System.getProperty("browser"));
    }

    @Test
    public void testSanity2(){

        System.out.println("Category X - Running sanity test - 2");
    }
}
