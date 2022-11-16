package இயேரி.தமிழிசை;

import java.util.List;

public class வரி {

    String சுரம்;
    String சுரவளவு;
    String சுரகாலளவு;
    String வார்த்தை;
    String அக்சரகாலம்;
    double அக்சரகாலதசமஎண்;
    double காலம்;
    double பாடும்காலம்;
    List<எழுத்துவகை>  சுரங்கள்;

    String எளிமைசுரம்;
    double எளிமைகாலம்;

    public String getசுரம்() {
        return சுரம்;
    }

    public void setசுரம்(String சுரம்) {
        this.சுரம் = சுரம்;
    }

    public String getசுரவளவு() {
        return சுரவளவு;
    }

    public void setசுரவளவு(String சுரவளவு) {
        this.சுரவளவு = சுரவளவு;
    }

    public String getசுரகாலளவு() {
        return சுரகாலளவு;
    }

    public void setசுரகாலளவு(String சுரகாலளவு) {
        this.சுரகாலளவு = சுரகாலளவு;
    }

    public String getவார்த்தை() {
        return வார்த்தை;
    }

    public void setவார்த்தை(String வார்த்தை) {
        this.வார்த்தை = வார்த்தை;
    }

    public String getஅக்சரகாலம்() {
        return அக்சரகாலம்;
    }

    public void setஅக்சரகாலம்(String அக்சரகாலம்) {
        this.அக்சரகாலம் = அக்சரகாலம்;
    }

    public double getஅக்சரகாலதசமஎண்() {
        return அக்சரகாலதசமஎண்;
    }

    public void setஅக்சரகாலதசமஎண்(double அக்சரகாலதசமஎண்) {
        this.அக்சரகாலதசமஎண் = அக்சரகாலதசமஎண்;
    }

    public double getகாலம்() {
        return காலம்;
    }

    public void setகாலம்(double காலம்) {
        this.காலம் = காலம்;
    }

    public double getபாடும்காலம்() {
        return பாடும்காலம்;
    }

    public void setபாடும்காலம்(double பாடும்காலம்) {
        this.பாடும்காலம் = பாடும்காலம்;
    }

    public List<எழுத்துவகை> getசுரங்கள்() {
        return சுரங்கள்;
    }

    public void setசுரங்கள்(List<எழுத்துவகை> சுரங்கள்) {
        this.சுரங்கள் = சுரங்கள்;
    }

    public String getஎளிமைசுரம்() {
        return எளிமைசுரம்;
    }

    public void setஎளிமைசுரம்(String எளிமைசுரம்) {
        this.எளிமைசுரம் = எளிமைசுரம்;
    }

    public double getஎளிமைகாலம்() {
        return எளிமைகாலம்;
    }

    public void setஎளிமைகாலம்(double எளிமைகாலம்) {
        this.எளிமைகாலம் = எளிமைகாலம்;
    }

    @Override
    public String toString() {
        return "வரி{" +
                "சுரம்='" + சுரம் + '\'' +
                ", சுரவளவு='" + சுரவளவு + '\'' +
                ", சுரகாலளவு='" + சுரகாலளவு + '\'' +
                ", வார்த்தை='" + வார்த்தை + '\'' +
                ", அக்சரகாலம்='" + அக்சரகாலம் + '\'' +
                ", அக்சரகாலதசமஎண்=" + அக்சரகாலதசமஎண் +
                ", காலம்=" + காலம் +
                ", பாடும்காலம்=" + பாடும்காலம் +
                ", சுரங்கள்=" + சுரங்கள் +
                ", எளிமைசுரம்='" + எளிமைசுரம் + '\'' +
                ", எளிமைகாலம்=" + எளிமைகாலம் +
                '}';
    }
}
