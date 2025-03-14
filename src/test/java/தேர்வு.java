import org.junit.Test;
import இயேரி.தமிழிசை.இயக்கு;

public class தேர்வு {

    @Test
    public void தேர்வு01() {
        System.out.println("" + String.valueOf("1/2"));


    }

    void populate() {

    }

    @Test
    public void சொதிசுரங்களைபெறு() {
        இயக்கு இயக்குமாறி = new இயக்கு();
        for (int மேளக்கர்த்தாஎண் =1 ; மேளக்கர்த்தாஎண் <= 72; மேளக்கர்த்தாஎண்++) {
            System.out.println( மேளக்கர்த்தாஎண் + "|"+ இயக்குமாறி.சுரங்களைபெறு(String.valueOf(மேளக்கர்த்தாஎண்)));
        }
    }
}
