package இயேரி.தமிழிசை;

import junit.framework.TestCase;
import org.junit.Test;

public class இயக்குசோதி  {

    @Test
    public void சொதிசுரங்களைபெறு() {
        இயக்கு இயக்குமாறி = new இயக்கு();
        for (int மேளக்கர்த்தாஎண் =1 ; மேளக்கர்த்தாஎண் <= 72; மேளக்கர்த்தாஎண்++) {
           System.out.println( இயக்குமாறி.சுரங்களைபெறு(String.valueOf(மேளக்கர்த்தாஎண்)));
        }
    }
}