package இயேரி.தமிழிசை;

import java.util.EnumSet;
import java.util.List;

public class சுரங்கள்ஒதத்தபண் extends  பண் {

    List<String> இறங்குவரிசைபேதம் ;
    List<String> ஏறுவரிசைபேதம்;

    @Override
    public int மேளகர்ததாஎண்() {
        return   (இறங்குவரிசை.மேளகர்தா() >  ஏறுவரிசை.மேளகர்தா() ? இறங்குவரிசை.மேளகர்தா() :  ஏறுவரிசை.மேளகர்தா());
    }

    public List<String> இறங்குவரிசைபேதம்() {
        return இறங்குவரிசைபேதம்;
    }

    public void setஇறங்குவரிசைபேதம்(List<String> இறங்குவரிசைபேதம்) {
        this.இறங்குவரிசைபேதம் = இறங்குவரிசைபேதம்;
    }

    public List<String> ஏறுவரிசைபேதம்() {
        return ஏறுவரிசைபேதம்;
    }

    public void setஏறுவரிசைபேதம்(List<String> ஏறுவரிசைபேதம்) {
        this.ஏறுவரிசைபேதம் = ஏறுவரிசைபேதம்;
    }

    @Override
    public String toString() {
        return "சுரங்கள்ஒதத்தபண்{" +
                "இறங்குவரிசைபேதம்=" + இறங்குவரிசைபேதம் +
                ", ஏறுவரிசைபேதம்=" + ஏறுவரிசைபேதம் +
                ", இறங்குவரிசை=" + இறங்குவரிசை +
                ", ஏறுவரிசை=" + ஏறுவரிசை +
                '}';
    }
}
