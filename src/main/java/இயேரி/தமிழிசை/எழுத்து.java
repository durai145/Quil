package இயேரி.தமிழிசை;

import java.util.ArrayList;
import java.util.List;

class எழுத்து {

    static boolean உயிரா(char எழுத்து) {
        return (எழுத்து == 'அ'
                || எழுத்து == 'ஆ'
                || எழுத்து == 'இ'
                || எழுத்து == 'ஈ'
                || எழுத்து == 'உ'
                || எழுத்து == 'ஊ'
                || எழுத்து == 'எ'
                || எழுத்து == 'ஏ'
                || எழுத்து == 'ஐ'
                || எழுத்து == 'ஒ'
                || எழுத்து == 'ஓ'
                || எழுத்து == 'ஔ');
    }

    static boolean நெடிலா(char எழுத்து) {
        return (எழுத்து == 'ஆ'
                || எழுத்து == 'ஈ'
                || எழுத்து == 'ஊ'
                || எழுத்து == 'ஏ'
                || எழுத்து == 'ஐ'
                || எழுத்து == 'ஓ'
                || எழுத்து == 'ஔ');
    }


    static boolean குறியிடா(char எழுத்து) {
        return (எழுத்து == '்'
                || எழுத்து == 'ா'
                || எழுத்து == 'ீ'
                || எழுத்து == 'ூ'
                || எழுத்து == 'ே'
                || எழுத்து == 'ை'
                || எழுத்து == 'ோ'
                || எழுத்து == 'ௌ'
                || எழுத்து == 'ி'
                || எழுத்து == 'ு'
                || எழுத்து == 'ெ'
                || எழுத்து == 'ொ'
        );
    }

    static boolean நெடிலா(char முன்எழுத்து, char எழுத்து) {
        return ((உயிர்மெய்யா(முன்எழுத்து) && (எழுத்து != '்') &&
                (எழுத்து == 'ா'
                        || எழுத்து == 'ீ'
                        || எழுத்து == 'ூ'
                        || எழுத்து == 'ே'
                        || எழுத்து == 'ை'
                        || எழுத்து == 'ோ'
                        || எழுத்து == 'ௌ')))

                || (முன்எழுத்து == 'ஆ'
                || முன்எழுத்து == 'ஈ'
                || முன்எழுத்து == 'ஊ'
                || முன்எழுத்து == 'ஏ'
                || முன்எழுத்து == 'ஐ'
                || முன்எழுத்து == 'ஓ'
                || முன்எழுத்து == 'ஔ')

                ;
    }

    static boolean குறிலா(char முன்எழுத்து, char எழுத்து) {
        return
                ((உயிர்மெய்யா(முன்எழுத்து) && (எழுத்து != '்' )
                        || (உயிர்மெய்யா(முன்எழுத்து) && (
                        எழுத்து == 'ி'
                                || எழுத்து == 'ு'
                                || எழுத்து == 'ெ'
                                || எழுத்து == 'ொ'))) ||
                        (முன்எழுத்து == 'அ'
                                || முன்எழுத்து == 'இ'
                                || முன்எழுத்து == 'உ'
                                || முன்எழுத்து == 'எ'
                                || முன்எழுத்து == 'ஒ'));
    }

    //ஃ
    static boolean அயுதமா(char முன்எழுத்து) {
        return (முன்எழுத்து == 'ஃ');
    }
    static boolean வல்லினமா(char எழுத்து) {
        return (எழுத்து == 'க'
                || எழுத்து == 'ச'
                || எழுத்து == 'ட'
                || எழுத்து == 'த'
                || எழுத்து == 'ப'
                || எழுத்து == 'ற');
    }

    static boolean மெல்லினமா(char எழுத்து) {
        return (எழுத்து == 'ங'
                || எழுத்து == 'ஞ'
                || எழுத்து == 'ண'
                || எழுத்து == 'ந'
                || எழுத்து == 'ம'
                || எழுத்து == 'ன');
    }

    static boolean ஓற்றா(char முன்எழுத்து, char எழுத்து) {
        return (உயிர்மெய்யா(முன்எழுத்து) && (எழுத்து == '்'));
    }

    static boolean இடையினமா(char எழுத்து) {
        return (எழுத்து == 'ய'
                || எழுத்து == 'ர'
                || எழுத்து == 'ல'
                || எழுத்து == 'வ'
                || எழுத்து == 'ழ'
                || எழுத்து == 'ள');
    }

    static boolean வெற்றிடாமா(char எழுத்து) {
        return (எழுத்து == ' '
                || எழுத்து == '\t');
    }

    static boolean அடுத்தஅடியா(char எழுத்து) {
        return (எழுத்து == '\n');
    }
    static boolean உயிர்மெய்யா(char எழுத்து) {
        return வல்லினமா(எழுத்து) || மெல்லினமா(எழுத்து) || இடையினமா(எழுத்து);
    }

    static  எழுத்துவகை பாகுபடுத்து(String சீர்) {
        இயேரி.தமிழிசை.எழுத்துவகை எழுத்துவகை1 = பாகுபடுத்தி(சீர்).get(0);
        return எழுத்துவகை1;
    }

    static List<எழுத்துவகை> பாகுபடுத்தி(String சீர்) {
        List<எழுத்துவகை> எழுத்துவரிசை = new ArrayList<எழுத்துவகை>();
        char முன்எழுத்து = '\0';
        char எழுத்து ;
        for (int i = 0; i < சீர்.length() + 1 ; i++) {

            if (i < சீர்.length()) {
                எழுத்து = சீர்.charAt(i);
            } else {
                எழுத்து = ' ';
            }
            if (முன்எழுத்து == '!' ||முன்எழுத்து == ',' || முன்எழுத்து == ';' || முன்எழுத்து == ' ' || முன்எழுத்து == '\n' || முன்எழுத்து == '\r' || முன்எழுத்து == '\t' || முன்எழுத்து == '.') {
                எழுத்துவரிசை.add(new குறியீடு(String.valueOf(முன்எழுத்து), முன்எழுத்து));

            } else {
                // அ
                if (முன்எழுத்து == ' '
                        || அயுதமா(முன்எழுத்து)
                        || உயிரா(முன்எழுத்து)
                        || ஓற்றா(முன்எழுத்து, எழுத்து)    // ம + ்
                        || உயிர்மெய்யா(முன்எழுத்து) && குறியிடா(எழுத்து)
                        || உயிர்மெய்யா(முன்எழுத்து) && உயிர்மெய்யா(எழுத்து)
                        || உயிர்மெய்யா(முன்எழுத்து) && (நெடிலா(முன்எழுத்து, எழுத்து) // கீ
                        || குறிலா(முன்எழுத்து, எழுத்து))) {  // கி
                    int தமிழ்தனிகுறியீடு = 0;
                    //12             11         10          9      8    7    6    5    4    3            2   1   0
                    // thmizhThani   ayutham  mei      uyir     mel2 mel1 m3   m2   m1   kuril/nedil  s3  s2  s1
                    // 2048     1024     512      256  128  64   32   16   8            4   2   1
                    if (வெற்றிடாமா(முன்எழுத்து)) {

                    }

                    if (அடுத்தஅடியா(முன்எழுத்து)) {

                    }

                    if (அயுதமா(முன்எழுத்து)) {
                        தமிழ்தனிகுறியீடு = தமிழ்தனிகுறியீடு | எழுத்துவகை.ஆயுதஎண்மாறிலி;
                    } else {


                        if (உயிரா(முன்எழுத்து)) {
                            தமிழ்தனிகுறியீடு = தமிழ்தனிகுறியீடு | 512;
                            தமிழ்தனிகுறியீடு = தமிழ்தனிகுறியீடு | உயிர்வரிசைஎண்னைபெறு(முன்எழுத்து);

                        }
                        if (நெடிலா(முன்எழுத்து, எழுத்து)) {
                            தமிழ்தனிகுறியீடு = தமிழ்தனிகுறியீடு | 8;
                        }

                        if (உயிர்மெய்யா(முன்எழுத்து)) {
                            தமிழ்தனிகுறியீடு = தமிழ்தனிகுறியீடு | 1024;
                            if (வல்லினமா(முன்எழுத்து)) {
                                தமிழ்தனிகுறியீடு = தமிழ்தனிகுறியீடு | எழுத்துவகை.வல்லினஎண்மாறிலி;
                            } else if (மெல்லினமா(முன்எழுத்து)) {
                                தமிழ்தனிகுறியீடு = தமிழ்தனிகுறியீடு | எழுத்துவகை.மெல்லினஎண்மாறிலி;
                            } else if (இடையினமா(முன்எழுத்து)) {
                                தமிழ்தனிகுறியீடு = தமிழ்தனிகுறியீடு | எழுத்துவகை.இடையினஎண்மாறிலி;
                            }
                            தமிழ்தனிகுறியீடு = தமிழ்தனிகுறியீடு | மெய்வரிசைஎண்னைபெறு(முன்எழுத்து);
                            if (!ஓற்றா(முன்எழுத்து, எழுத்து)) {
                                தமிழ்தனிகுறியீடு = தமிழ்தனிகுறியீடு | 512;
                                தமிழ்தனிகுறியீடு = தமிழ்தனிகுறியீடு | உயிர்வரிசைஎண்னைபெறு(எழுத்து);
                            }
                        }
                    }
                    StringBuffer sb = new StringBuffer();

                    sb.append(முன்எழுத்து);
                    if (!உயிரா(முன்எழுத்து) && !உயிரா(எழுத்து) && !உயிர்மெய்யா(எழுத்து) && எழுத்து != ' ') {
                        sb.append(எழுத்து);
                    }
                    String ஒருங்குறி = sb.toString();
                    எழுத்துவகை எழுத்துபொருள் = new எழுத்துவகை(ஒருங்குறி, தமிழ்தனிகுறியீடு);
                    எழுத்துவரிசை.add(எழுத்துபொருள்);
                }
            }

            முன்எழுத்து = எழுத்து;
        }
        return  எழுத்துவரிசை;
    }

    public static <string> void main(String[] argv) {

      System.out.println(  பாகுபடுத்து("சா").குறிலைப்பெறு());
      System.out.println(  பாகுபடுத்து("ச").நெடிலைப்பெறு());

       /* for (int i = 0; i < மெய்.length(); i++) {

            for (int j = 0; j < உயிர்குறியீடு.length(); j++) {
                தமிழெழுத்துக்கள்.append(மெய்.charAt(i));
                தமிழெழுத்துக்கள்.append(உயிர்குறியீடு.charAt(j));


            }

        }*/
      //System.out.println(தமிழெழுத்துக்கள்);



    }

    private static int மெய்வரிசைஎண்னைபெறு(char எழுத்து) {
        int மெய்வரிசைஎண் = 0;
        if (எழுத்து == 'க' || எழுத்து == 'ய' || எழுத்து == 'ங' ) {
            மெய்வரிசைஎண் = 0;
        }
        if (எழுத்து == 'ச' || எழுத்து == 'ர' || எழுத்து == 'ஞ' ) {
            மெய்வரிசைஎண் =  1;
        }
        if (எழுத்து == 'ட' || எழுத்து == 'ல' || எழுத்து == 'ண' ) {
            மெய்வரிசைஎண் =  2;
        }
        if (எழுத்து == 'த' || எழுத்து == 'வ' || எழுத்து == 'ந' ) {
            மெய்வரிசைஎண் =  3;
        }
        if (எழுத்து == 'ப' || எழுத்து == 'ழ' || எழுத்து == 'ம' ) {
            மெய்வரிசைஎண் =  4;
        }
        if (எழுத்து == 'ற' || எழுத்து == 'ள' || எழுத்து == 'ன' ) {
            மெய்வரிசைஎண் =  5;
        }
        //
        return  மெய்வரிசைஎண் << 4;
    }

    static int உயிர்வரிசைஎண்னைபெறு(char எழுத்து) {

        if (எழுத்து == 'அ' ) {
            return  0;
        }
        if (எழுத்து == 'ஆ' || எழுத்து == 'ா') {
            return  0;
        }
        if (எழுத்து == 'இ' || எழுத்து == 'ி') {
            return  1;
        }
        if (எழுத்து == 'ஈ' || எழுத்து == 'ீ') {
            return 1;
        }

        if (எழுத்து == 'உ' || எழுத்து == 'ு') {
            return 2;
        }
        if (எழுத்து == 'ஊ' || எழுத்து == 'ூ') {
            return 2;
        }
        if (எழுத்து == 'எ' || எழுத்து == 'ெ') {
            return 3;
        }
        if (எழுத்து == 'ஏ' || எழுத்து == 'ே') {
            return 3;
        }

        if (எழுத்து == 'ஒ' || எழுத்து == 'ொ') {
            return 4;
        }
        if (எழுத்து == 'ஓ' || எழுத்து == 'ோ') {
            return 4;
        }
        if  (எழுத்து == 'ஐ' || எழுத்து == 'ை') {
            return 5;
        }
        if (எழுத்து == 'ஔ' || எழுத்து == 'ௌ') {
            return 6;
        }


        return  0;
    }
}