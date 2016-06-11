package junit;

import categories.CategoryY;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Created by Sagar on 30-04-2016.
 */

@Category(CategoryY.class)
public class SimpleSuite {

    @Test
    public void test1() throws Exception{
        //added wait of 2 min
        Thread.sleep(1000*60*2);
        System.out.println("Category Y - executing test1");
        System.out.println(System.getProperty("browser"));
    }

    @Test
    public void test2(){
        System.out.println("Category Y - executing test2");
    }
}
