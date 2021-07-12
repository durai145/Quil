package இயேரி.தமிழிசை;

import java.util.List;

public class அசைவகை {
    final static String நேரசைமாறிலி = "நேர்";
    final static String நிரைமாறிலி = "நிரை";
    int சீர்;

    final List<எழுத்துவகை> அசைஎழுத்துக்கள்;
    final String அசை;

    அசைவகை(List<எழுத்துவகை> அசைஎழுத்துக்கள், String அசை) {
        this.அசை = அசை;
        this.அசைஎழுத்துக்கள் = அசைஎழுத்துக்கள்;
        this.சீர் =0;
    }

    public அசைவகை(List<எழுத்துவகை> அசைஎழுத்துக்கள், String அசை, int சீர்) {
        this.அசை = அசை;
        this.அசைஎழுத்துக்கள் = அசைஎழுத்துக்கள்;
        this.சீர் =சீர்;
    }

    @Override
    public String toString() {
        return "அசைவகை{" +
                "சீர்=" + சீர் +
                ", அசைஎழுத்துக்கள்=" + அசைஎழுத்துக்கள் +
                ", அசை='" + அசை + '\'' +
                '}';
    }
}
