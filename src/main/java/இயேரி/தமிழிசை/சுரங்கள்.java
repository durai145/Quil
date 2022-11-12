package இயேரி.தமிழிசை;

public class சுரங்கள் {

    int மதிப்பு;

    public int மதிப்பு() {
        return மதிப்பு;
    }



    public static enum குரல்  {
            ச(0,0);
        int மதிப்பு;
        int சுரத்தானம் ;

        குரல்(int மதிப்பு, int  சுரத்தானம்) {
            this.மதிப்பு = மதிப்பு;
            this.சுரத்தானம் = சுரத்தானம்;
        }

        public int மதிப்பு() {
            return மதிப்பு;
        }

        public void setமதிப்பு(int மதிப்பு) {
            this.மதிப்பு = மதிப்பு;
        }

        public int getசுரத்தானம்() {
            return சுரத்தானம்;
        }

        public void setசுரத்தானம்(int சுரத்தானம்) {
            this.சுரத்தானம் = சுரத்தானம்;
        }
    }

    public static enum துத்தம் {
        ரி1(0, 1),
        ரி2(12, 2),
        ரி3(18, 3);

        int மதிப்பு;
        int சுரத்தானம் ;
        துத்தம்(int மதிப்பு, int சுரத்தானம் ) {
            this.மதிப்பு = மதிப்பு;
            this.சுரத்தானம் = சுரத்தானம் ;
        }

        public int getசுரத்தானம்() {
            return சுரத்தானம்;
        }

        public void setசுரத்தானம்(int சுரத்தானம்) {
            this.சுரத்தானம் = சுரத்தானம்;
        }
    }

    public static  enum கைக்கிளை {
        க1(0,2),
        க2(6,3),
        க3(12,4);
        int மதிப்பு;
        int சுரத்தானம் ;
        கைக்கிளை(int மதிப்பு, int சுரத்தானம் ) {
            this.மதிப்பு = மதிப்பு;
            this.சுரத்தானம் = சுரத்தானம் ;
        }

        public int மதிப்பு() {
            return மதிப்பு;
        }

        public void setமதிப்பு(int மதிப்பு) {
            this.மதிப்பு = மதிப்பு;
        }

        public int getசுரத்தானம்() {
            return சுரத்தானம்;
        }

        public void setசுரத்தானம்(int சுரத்தானம்) {
            this.சுரத்தானம் = சுரத்தானம்;
        }
    }

    public static enum உழை {
        ம1(0, 5),
        ம2(36, 6);
        int மதிப்பு;
        int சுரத்தானம் ;

        உழை(int மதிப்பு, int சுரத்தானம் ) {
            this.மதிப்பு = மதிப்பு;
            this.சுரத்தானம் = சுரத்தானம்;
        }

        public int மதிப்பு() {
            return மதிப்பு;
        }

        public void setமதிப்பு(int மதிப்பு) {
            this.மதிப்பு = மதிப்பு;
        }

        public int getசுரத்தானம்() {
            return சுரத்தானம்;
        }

        public void setசுரத்தானம்(int சுரத்தானம்) {
            this.சுரத்தானம் = சுரத்தானம்;
        }
    }

    public static enum இளி {
        ப(0, 7);
        int மதிப்பு;
        int சுரத்தானம் ;
        இளி(int மதிப்பு,int சுரத்தானம் ) {
            this.மதிப்பு = மதிப்பு;
            this.சுரத்தானம் =  சுரத்தானம்;
        }

        public int மதிப்பு() {
            return மதிப்பு;
        }

        public void setமதிப்பு(int மதிப்பு) {
            this.மதிப்பு = மதிப்பு;
        }

        public int getசுரத்தானம்() {
            return சுரத்தானம்;
        }

        public void setசுரத்தானம்(int சுரத்தானம்) {
            this.சுரத்தானம் = சுரத்தானம்;
        }
    }

    public static enum விளரி {

        த1(0,8),
        த2(2,9),
        த3(3,10);
        int மதிப்பு;
        int சுரத்தானம் ;


        public int மதிப்பு() {
            return மதிப்பு;
        }

        public void setமதிப்பு(int மதிப்பு) {
            this.மதிப்பு = மதிப்பு;
        }

        விளரி(int மதிப்பு, int சுரத்தானம் ) {
            this.மதிப்பு = மதிப்பு;
            this.சுரத்தானம் = சுரத்தானம்;
        }


    }

    public static enum தாரம் {

        நி1(1, 9),
        நி2(2,10),
        நி3(3,11);

        int மதிப்பு;
        int சுரத்தானம் ;

        தாரம்(int மதிப்பு, int சுரத்தானம் ) {
            this.மதிப்பு = மதிப்பு;
            this.சுரத்தானம் = சுரத்தானம் ;
        }

        public int மதிப்பு() {
            return மதிப்பு;
        }

        public void setமதிப்பு(int மதிப்பு) {
            this.மதிப்பு = மதிப்பு;
        }

        public int getசுரத்தானம்() {
            return சுரத்தானம்;
        }

        public void setசுரத்தானம்(int சுரத்தானம்) {
            this.சுரத்தானம் = சுரத்தானம்;
        }
    }


    குரல் ச;
    துத்தம் ரி;
    கைக்கிளை க;
    உழை ம;
    இளி ப;
    விளரி த;
    தாரம் நி;


    public void setமதிப்பு(int மதிப்பு) {
        this.மதிப்பு = மதிப்பு;
    }



    public குரல் ச() {
        return ச;
    }

    public void setச(குரல் ச) {
        this.ச = ச;
    }

    public துத்தம் ரி() {
        return ரி;
    }

    public void setரி(துத்தம் ரி) {
        this.ரி = ரி;
    }

    public கைக்கிளை க() {
        return க;
    }

    public void setக(கைக்கிளை க) {
        if (this.ரி == துத்தம்.ரி3 && க != கைக்கிளை.க3
                ||  this.ரி == துத்தம்.ரி2  &&  க != கைக்கிளை.க2 &&  க != கைக்கிளை.க3 ) {
            throw new RuntimeException(this.ரி  + " மற்றும் " + க  +" பகை சுரஙள் " );
        }
        this.க = க;
    }

    public உழை ம() {
        return ம;
    }

    public void setம(உழை ம) {
        this.ம = ம;
    }

    public இளி ப() {
        return ப;
    }

    public void setப(இளி ப) {
        this.ப = ப;
    }

    public விளரி த() {
        return த;
    }

    public void setத(விளரி த) {
        this.த = த;
    }

    public தாரம் நி() {
        return நி;
    }

    public void setநி(தாரம் நி) {
        if (this.த ==  விளரி.த3 &&  நி != தாரம்.நி3  ||  this.த ==  விளரி.த2 && நி != தாரம்.நி2  && நி != தாரம்.நி3  ) {
            throw new RuntimeException(this.த  + " மற்றும் " + நி  +" பகை சுரஙள் " );
        }
        this.நி = நி;
    }


    public int மேளகர்தா() {
        return  ச.மதிப்பு +  ரி.மதிப்பு + க.மதிப்பு + ம.மதிப்பு + ப.மதிப்பு + த.மதிப்பு + நி.மதிப்பு;
    }

    @Override
    public String toString() {
        return "சுரங்கள்{" +
                "ச=" + ச +
                ", ரி=" + ரி +
                ", க=" + க +
                ", ம=" + ம +
                ", ப=" + ப +
                ", த=" + த +
                ", நி=" + நி +
                '}';
    }
}
