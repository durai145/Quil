package இயேரி.தமிழிசை;

import java.util.List;

public class அடிவகை {
    List<அசைவகை> சொற்கள்;
    int படி;

    public அடிவகை(List<அசைவகை> சொற்கள், int படி) {
        this.சொற்கள் = சொற்கள்;
        this.படி = படி;
    }

    @Override
    public String toString() {
        return "அடிவகை{" +
                "சொற்கள்=" + சொற்கள் +
                ", படி=" + படி +
                '}';
    }
}
