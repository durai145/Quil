package இயேரி.தமிழிசை;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jm.JMC;
import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Play;
import jm.util.Write;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

import static இயேரி.தமிழிசை.பயன்பாடுகள்.அச்சு;
import static இயேரி.தமிழிசை.பயன்பாடுகள்.வெற்றிடமா;

public class இயக்கு implements JMC {

    static Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .setPrettyPrinting()
            .create();
    static எழுத்துவகை ச  = எழுத்து.பாகுபடுத்து("ச");
    static எழுத்துவகை ரி  = எழுத்து.பாகுபடுத்து("ரி");
    static எழுத்துவகை க  = எழுத்து.பாகுபடுத்து("க");
    static எழுத்துவகை ம  = எழுத்து.பாகுபடுத்து("ம");
    static எழுத்துவகை ப  = எழுத்து.பாகுபடுத்து("ப");
    static எழுத்துவகை த  = எழுத்து.பாகுபடுத்து("த");
    static எழுத்துவகை நி  = எழுத்து.பாகுபடுத்து("நி");


    static String கீர்த்தனை1 = "  {\n" +
            " \"பெயர்\":\"ரிஷபப்பிரியா-சீர்காழி\"," +
            "  \t\"வகை\" : \"கீர்த்தனை\",\n" +
            "  \t\"இயற்றியவர்\" : \"சீர்காழி முத்துத்தாண்டவர்\",\n" +
            "  \t\"இராகம்\" : \"ரிஷபப்பிரியா\",\n" +
            "  \t\"தாளம்\" : \"ஆதி\",\n" +
            //"  \t\"பண்\" : \"ரிஷபப்பிரியா\",\n" +
            //"  \t\"பாணி\" : \"எட்டொத்து\",\n" +
            "  \t\"மேளக்கர்த்தாஎண்\" : 62,\n" +
            "  \t\"இசையின்வேகம்\" : 120,\n" +
            "  \t\"பெயர்\" : \"அம்பரசிதம்\",\n" +
            "  \t\"கீர்த்தனை\": [{\n" +
            "  \t\t\"தலைப்பு\" : \"பல்லவி\",\n" +
            "  \t\t\"வரிகள்\" :[ \n" +
            "  \t\t\t\t{ \"சுரம்\" : \"சா\" , \"வார்த்தை\" : \"அம்\", \t\t\"சுரவளவு\" : \"மேல்\",   \t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"சா\" , \"வார்த்தை\" : \"ப\",  \t\t\"சுரவளவு\" : \"மேல்\", \t \t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"ச\"  , \"வார்த்தை\" : \"ர\",   \t\"சுரவளவு\" : \"மேல்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"நி\"  , \"வார்த்தை\" : \".\",   \t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"நீ\"  , \"வார்த்தை\" : \".\",   \t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "  \t\t\t\t\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"நி\"  , \"வார்த்தை\" : \"சி\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"ச\"  , \"வார்த்தை\" : \".\",   \t\"சுரவளவு\" : \"மேல்\",    \t\"சுரகாலளவு\" : 1,   \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"நி\"  , \"வார்த்தை\" : \".\",   \t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"ரி\"  , \"வார்த்தை\" : \".\",   \t\"சுரவளவு\" : \"மேல்\",   \t\"சுரகாலளவு\" : 1,   \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"ச\"  , \"வார்த்தை\" : \".\",   \t\"சுரவளவு\" : \"மேல்\", \t\t\"சுரகாலளவு\" : 1,   \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"நி\"  , \"வார்த்தை\" : \".\",   \t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1,  \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"தா\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"பா\" , \"வார்த்தை\" : \"ப\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"த\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"நி\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"த\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"ப\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"மா\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t\t\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"பா\" , \"வார்த்தை\" : \"ர\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \";\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \";\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"ம\" , \"வார்த்தை\" : \"ச\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"ப\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"ம\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"த\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t\t\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"ப\" , \"வார்த்தை\" : \"தா\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"ம\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"கா\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \"ரி\" , \"வார்த்தை\" : \"ன\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \"க\" , \"வார்த்தை\" : \"ந்\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"ம\" , \"வார்த்தை\" : \"த\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"ப\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"த\" , \"வார்த்தை\" : \"மே\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"நி\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "\n" +
            "\t\t\t\t{ \"சுரம்\" : \"சா\" , \"வார்த்தை\" : \"அம்\",  \t\"சுரவளவு\" : \"மேல்\", \t\t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \"ச\" , \"வார்த்தை\" :  \"ப\",  \t\t\"சுரவளவு\" : \"மேல்\", \t\t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \"நி\" , \"வார்த்தை\" :  \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\",\t\t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \"ச\" , \"வார்த்தை\" :  \"ர\",  \t\t\"சுரவளவு\" : \"மேல்\", \t\t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \"ரி\" , \"வார்த்தை\" :  \".\",  \t\t\"சுரவளவு\" : \"மேல்\", \t\t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \"க\" , \"வார்த்தை\" :  \".\",  \t\t\"சுரவளவு\" : \"மேல்\", \t\t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \"ரி\" , \"வார்த்தை\" :  \".\",  \t\t\"சுரவளவு\" : \"மேல்\", \t\t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \"சா\", \"வார்த்தை\" :  \".\",  \t\t\"சுரவளவு\" : \"மேல்\", \t\t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \";\", \"வார்த்தை\" :  \".\",  \t\t\"சுரவளவு\" : \"மேல்\", \t\t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +

            "\t\t\t\t\n" +
            "\t\t\t\t{ \"சுரம்\" : \"நீ\", \"வார்த்தை\" :  \"சி\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \";\", \"வார்த்தை\" :  \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \"த\", \"வார்த்தை\" :  \"த\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \"ப\", \"வார்த்தை\" :  \"ம்\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \"மா\", \"வார்த்தை\" :  \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "\n" +
            "\t\t\t\t{ \"சுரம்\" : \"பா\", \"வார்த்தை\" :  \"ப\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \"த\", \"வார்த்தை\" :  \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \"நி\", \"வார்த்தை\" :  \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \"த\", \"வார்த்தை\" :  \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \"ப\", \"வார்த்தை\" :  \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \"மா\", \"வார்த்தை\" :  \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "\n" +
            "\n" +
            "\t\t\t\t{ \"சுரம்\" : \"பா\" , \"வார்த்தை\" : \"ர\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \";\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \";\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"ம\" , \"வார்த்தை\" : \"ச\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"ப\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"ம\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"த\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t\t\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"ப\" , \"வார்த்தை\" : \"தா\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"ம\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"கா\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 2, \t\"அக்சரகாலம்\" : \"1/4\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \"ரி\" , \"வார்த்தை\" : \"ன\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "\t\t\t\t{ \"சுரம்\" : \"க\" , \"வார்த்தை\" : \"ந்\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"ம\" , \"வார்த்தை\" : \"த\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"ப\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"த\" , \"வார்த்தை\" : \"மே\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/2\"},\n" +
            "  \t\t\t\t{ \"சுரம்\" : \"நி\" , \"வார்த்தை\" : \".\",  \t\t\"சுரவளவு\" : \"மத்திமம்\", \t\"சுரகாலளவு\" : 1, \t\"அக்சரகாலம்\" : \"1/2\"}\n" +
            "\n" +
            "  \t\t\t]\n" +
            "  \n" +
            "  \t\t}]\n" +
            "}";

    static double மொத்தஎளிமைகாலம் =0;
    public static void main(String argv[]) throws IOException {



      /*  File f = new File("/Users/durai/Google Drive/கீர்த்தனைகள்/அம்பரசிதம்பரசதானந்தமே.json");
        FileInputStream fio = new FileInputStream(f);
        byte[] as = fio.readAllBytes();
        
            குரல் ச;
    துத்தம் ரி;
    கைக்கிளை க;
    உழை ம;
    இளி ப;
    விளரி த;
    தாரம் நி;
*/
        // S R2 G3 M2 P D1 N2 S, S N2
        /*
        பாணி பாணி = new பாணி.திரிபுடை(இயேரி.தமிழிசை.பாணி.லகு.I3);

        System.out.println("திரிபுடை" + பாணி.பெறு());

         பாணி = new பாணி.அட(இயேரி.தமிழிசை.பாணி.லகு.I4);

        System.out.println("அட" + பாணி.பெறு());
        பாணி = new பாணி.ஏகம்(இயேரி.தமிழிசை.பாணி.லகு.I5);

        System.out.println("ஏகம்" + பாணி.பெறு());

        பாணி = new பாணி.சம்பை(இயேரி.தமிழிசை.பாணி.லகு.I7);

        System.out.println("சம்பை=" + பாணி.பெறு());


        பாணி = new பாணி.ரூபம்(இயேரி.தமிழிசை.பாணி.லகு.I9);

        System.out.println("ரூபம்=" + பாணி.பெறு());

        பாணி = new பாணி.மட்டியம்(இயேரி.தமிழிசை.பாணி.லகு.I3);

        System.out.println("மட்டியம்=" + பாணி.பெறு());

        பாணி = new பாணி.துருவம்(இயேரி.தமிழிசை.பாணி.லகு.I3, இயேரி.தமிழிசை.பாணி.நடைஎண்.I3);

       // System.out.println("துருவம்:" + பாணி.பெறு());
       // System.out.println("நடையைபெறு:" + பாணி.நடைஎண்மாறி.நடைகள்);
       // System.out.println("சைகைபெறு:" + பாணி.சைகைபெறு());


        */

        //அச்சு(ப1.இறங்குவரிசை.சுரங்களைபெறு("ரி").சுரத்தானம் );
        கீர்த்தனை  கீர்த்தனைமாறி  = gson.fromJson(கீர்த்தனை1, கீர்த்தனை.class);

        கீர்த்தனைமாறி.பாணி = new பாணி.மட்டியம்(இயேரி.தமிழிசை.பாணி.லகு.I4);
        கீர்த்தனைமாறி.பண்  = சுரங்களைபெறு(கீர்த்தனைமாறி.மேளக்கர்த்தாஎண்);

        அச்சு(கீர்த்தனைமாறி);
        அச்சு(gson.toJson(கீர்த்தனைமாறி));
        try {
            சரியா(கீர்த்தனைமாறி);
        } catch (சரிபாத்தலில்விலக்கு சரிபாத்தலில்விலக்கு) {
            சரிபாத்தலில்விலக்கு.printStackTrace();
        }

        அச்சு(கீர்த்தனைமாறி);
       // Phrase phrase1= இசைகருவிஎண்ணியல்இடைமுகம்(கீர்த்தனைமாறி );

       // Phrase phrase2= இசைகருவிஎண்ணியல்இடைமுகம்(கீர்த்தனைமாறி.பாணி );

        இசைகருவிஎண்ணியல்இடைமுகம்(கீர்த்தனைமாறி);


    }



    private static void சரியா(கீர்த்தனை  கீர்த்தனைமாறி) throws சரிபாத்தலில்விலக்கு {
        if (வெற்றிடமா(கீர்த்தனைமாறி.இயற்றியவர்)) {
            throw  new சரிபாத்தலில்விலக்கு("இயற்றியவர் இன்றியமையாதது");
        }

        if (வெற்றிடமா(கீர்த்தனைமாறி.தாளம்) && Objects.isNull(கீர்த்தனைமாறி.பாணி)) {
            throw  new சரிபாத்தலில்விலக்கு("பாணி அல்லது தாளம் இன்றியமையாதது");
        }

        if (வெற்றிடமா(கீர்த்தனைமாறி.இராகம்) && Objects.isNull(கீர்த்தனைமாறி.பண்)) {
            throw  new சரிபாத்தலில்விலக்கு("இராகம் அல்லது பண் இன்றியமையாதது");
        }

        if (வெற்றிடமா(கீர்த்தனைமாறி.மேளக்கர்த்தாஎண்)) {
            throw  new சரிபாத்தலில்விலக்கு("மேளக்கர்த்தாஎண் இன்றியமையாதது");
        }

        if (வெற்றிடமா(கீர்த்தனைமாறி.இசையின்வேகம்)) {
            throw  new சரிபாத்தலில்விலக்கு("இசையின்வேகம் இன்றியமையாதது");
        }


        for(பாடல் பாடல் : கீர்த்தனைமாறி.கீர்த்தனை) {

            if (வெற்றிடமா(பாடல்.தலைப்பு)) {
                throw  new சரிபாத்தலில்விலக்கு("தலைப்பு இன்றியமையாதது");
            }
            if (!பாடல்.வரிகள்.isEmpty()) {
                எழுத்துவகை கடைசிசுரம் ;
                for (வரி வரிமாறி : பாடல்.வரிகள்) {

                    if (வெற்றிடமா(வரிமாறி.சுரம்)) {
                        throw  new சரிபாத்தலில்விலக்கு("சுரம் இன்றியமையாதது");
                    }

                    if (வெற்றிடமா(வரிமாறி.வார்த்தை)) {
                        throw  new சரிபாத்தலில்விலக்கு("வார்த்தை இன்றியமையாதது");
                    }

                    if (வெற்றிடமா(வரிமாறி.அக்சரகாலம்)) {
                        throw  new சரிபாத்தலில்விலக்கு("அக்சரகாலம் இன்றியமையாதது, வரி=" + வரிமாறி);
                    }

                    if (வெற்றிடமா(வரிமாறி.சுரகாலளவு)) {
                        throw  new சரிபாத்தலில்விலக்கு("சுரகாலளவு இன்றியமையாதது, வரி=" + வரிமாறி);
                    }
                    வரிமாறி.சுரங்கள்  = எழுத்து.பாகுபடுத்து(வரிமாறி.சுரம்);
                    //அச்சு("சுரம் [" + வரிமாறி.சுரம் + "]  அதன் சுரகாலளவு [" + வரிமாறி.சுரகாலளவு + "] ");
                    if (!சுரவளவைகணக்கிடு(வரிமாறி.சுரங்கள்).equals(வரிமாறி.சுரகாலளவு)) {
                        throw  new சரிபாத்தலில்விலக்கு("சுரம் [" + வரிமாறி.சுரம் + "] (" +சுரவளவைகணக்கிடு(வரிமாறி.சுரங்கள்) +") அதன் சுரகாலளவு [" + வரிமாறி.சுரகாலளவு + "] ஒப்பவிலலை" );
                    }
                    int வகுத்தல்குறியினிடம்=வரிமாறி.அக்சரகாலம்.indexOf("/");
                    double வகுக்குமெண் = 1;
                    double வகுப்படுமெண் = 1;
                    if (வகுத்தல்குறியினிடம் != -1) {
                        வகுக்குமெண் = Double.parseDouble(வரிமாறி.அக்சரகாலம்.substring(வகுத்தல்குறியினிடம் + 1));
                        வகுப்படுமெண் = Double.parseDouble(வரிமாறி.அக்சரகாலம்.substring(0,வகுத்தல்குறியினிடம்));
                    } else {
                        வகுப்படுமெண் = Integer.parseInt(வரிமாறி.அக்சரகாலம்);
                    }
                    வரிமாறி.அக்சரகாலதசமஎண் = வகுப்படுமெண் / வகுக்குமெண்;
                    அச்சு(வரிமாறி.சுரம் + " அக்சரகாலம் = [" + வரிமாறி.அக்சரகாலம் + "] வகுப்படுமெண்=[" +வகுப்படுமெண்+ "] ,  வகுக்குமெண் =["+வகுக்குமெண்+ "] அதன் அக்சரகாலதசமஎண் [" + வரிமாறி.அக்சரகாலதசமஎண் + "] ");
                    வரிமாறி.காலம் = வரிமாறி.அக்சரகாலதசமஎண் * Double.parseDouble(வரிமாறி.சுரகாலளவு);

                }
            }
        }

    }

    private static String சுரவளவைகணக்கிடு(எழுத்துவகை சுர) {

            int மத்திரை =0;

            if (சுர instanceof  குறியீடு) {
                if (சுர.ஒருங்குறி.equals(";")) {
                    மத்திரை += 2;
                }

                if (சுர.ஒருங்குறி.equals(",")) {
                    மத்திரை += 1;
                }
            } else {
                if (சுர.நெடிலா()) {
                    மத்திரை += 2;
                } else {
                    மத்திரை += 1;
                }
            }
            return String.valueOf(மத்திரை);
    }
 private static void இசைகருவிஎண்ணியல்இடைமுகம்(கீர்த்தனை  கீர்த்தனைமாறி) {

        //Create the data objects we want to use
        Score score ;//= new Score("Piano Phase", 120.0);
        Part p1 = new Part("SITAR", SITAR, 0);
        p1.setNumerator(பாணி.பிரிவு.I4.மதிப்பு);
        p1.setDenominator(4);

       // Part p2 = new Part("Piano2", VIOLIN, 1);
        Phrase phrase1 = new Phrase();
        score = new Score(கீர்த்தனைமாறி.இராகம் + "-" + கீர்த்தனைமாறி.இயற்றியவர், Double.parseDouble(கீர்த்தனைமாறி.இசையின்வேகம்));
        குறிதயீடுகளைசுரங்களாகமாற்று(கீர்த்தனைமாறி.கீர்த்தனை);
        for (பாடல்  பாடல்: கீர்த்தனைமாறி.கீர்த்தனை) {
            for (வரி வரி:  பாடல்.வரிகள்) {

                    சுரத்திலிருந்து(வரி, கீர்த்தனைமாறி.பண்);

                    //அச்சு("எளிமைசுரம்=" +  ப1.இறங்குவரிசை.சுரங்களைபெறு(வரி.எளிமைசுரம்) + ",எளிமைகாலம்= " + வரி.எளிமைகாலம்);
                    if (வரி != null && வரி.எளிமைசுரம் != null && கீர்த்தனைமாறி.பண்.இறங்குவரிசை.சுரங்களைபெறு(வரி.எளிமைசுரம்) != null ) {

                       int offset=0;
                        if (வரி.சுரவளவு.equals("மேல்") ) {
                            offset=12;
                        }

                        //அச்சு(ப1.இறங்குவரிசை.சுரங்களைபெறு(வரி.எளிமைசுரம்).சுரத்தானம் + offset + C4);
                        Note note1 = new Note(கீர்த்தனைமாறி.பண்.இறங்குவரிசை.சுரங்களைபெறு(வரி.எளிமைசுரம்).சுரத்தானம் + offset + C4 , வரி.எளிமைகாலம்);
                        phrase1.add(note1);
                    }

                    /**
                    if (சுரம்ToNotes.containsKey(சுரம்)) {
                        Note note1 = new Note(சுரம்ToNotes.get(சுரம்), வரி.அக்சரகாலதசமஎண்);
                        phrase1.add(note1);
                    } else {
                        அச்சு(சுரம் + " சுரம்ToNotes-ல் இல்லை");
                    }*/



            }

        }


        //add the notes to the first phrase
        // Phrase phrase2 = (Phrase) phrase1.copy();
        //Phrase phrase3 = (Phrase) phrase1.copy();
        //Phrse four is played after the offset period
        //Phrase phrase4 = (Phrase) phrase1.copy();

        // repeat the sstable piano part and add it to a part and score
       // Mod.repeat(phrase1, 8);
       // Mod.repeat(phrase2, 8); // stable
        //phrase2.setStartTime(0.0);
        //Mod.repeat(phrase3, 24); // accellerate
        //phrase3.setTempo(120. * (6. * 24.) / (6. * 24. - 1.));
        //System.out.println("End time = " + phrase3.getEndTime());
        //Mod.repeat(phrase4, 8); //stable again

        // Phrase 3 is the one which extends phrase two at a different tempo
       // phrase3.setStartTime(24.0);
        //phrase4.setStartTime(32 * 3 - 1);
        //Play different parts in different octaves for more audible clarity
        // Mod.transpose(phrase2, 12);
        // Mod.transpose(phrase3, 12);
        //Mod.transpose(phrase4, 12);

        //add phrases to the two instruments
        p1.addPhrase(phrase1);

        p1.setPan(0.9);
        //add parts to the score
        score.addPart(p1);

        //OK now we SMF write
        Write.midi(score, கீர்த்தனைமாறி.பெயர்+"_" + கீர்த்தனைமாறி.மேளக்கர்த்தாஎண் + "_" + கீர்த்தனைமாறி.இசையின்வேகம்  +".mid");
        // playback with JavaSound
        Play.midi(score);

    }

    private static void சுரத்திலிருந்து(வரி வரி, பண் பண்மாறி) {
        //பண்மாறி.இற்ங்குவரிசை()



        மொத்தஎளிமைகாலம்= மொத்தஎளிமைகாலம் + வரி.எளிமைகாலம்;

        System.out.println( "சுரம்=" + வரி.சுரம்  + "| மொத்தஎளிமைகாலம்=" + மொத்தஎளிமைகாலம் + ", எளிமைகாலம்=" + வரி.எளிமைகாலம்);

    }

    private static void குறிதயீடுகளைசுரங்களாகமாற்று(List<பாடல்> கீர்த்தனை) {

        கீர்த்தனை.forEach(பாடல் -> {
            AtomicReference<வரி> கடைசிவரி = new AtomicReference<>();
            List<வரி> புதியவரிகள் = new ArrayList<>();
            பாடல்.வரிகள்.forEach(வரி -> {
                எழுத்துவகை எழுத்துமாறி = எழுத்து.பாகுபடுத்து(வரி.சுரம்);
                வரி.setசுரங்கள்(எழுத்துமாறி);

                        if (எழுத்துமாறி instanceof குறியீடு) {
                            switch (எழுத்துமாறி.ஒருங்குறி) {
                                case ";" :
                                    கடைசிவரி.get().setஎளிமைகாலம்(கடைசிவரி.get().getஎளிமைகாலம்() + வரி.getகாலம்() );
                                    break;
                                case "," :
                                    கடைசிவரி.get().setஎளிமைகாலம்(கடைசிவரி.get().getஎளிமைகாலம்() + வரி.getகாலம்() );
                                    break;
                            }
                        } else {

                                வரி.setஎளிமைசுரம்(எழுத்துமாறி.குறிலைப்பெறு().ஒருங்குறி);
                                வரி.setஎளிமைகாலம்(வரி.getகாலம்());
                                if (கடைசிவரி.get() != null) {
                                    புதியவரிகள்.add(கடைசிவரி.get());
                                }
                                கடைசிவரி.set(வரி);
                        }



            });

            //அச்சு("புதியவரிகள்=" + புதியவரிகள்);
        });

    }

    private static void இசைகருவிஎண்ணியல்இடைமுகம்V1(கீர்த்தனை  கீர்த்தனைமாறி) {

        //Create the data objects we want to use
        Score score ;//= new Score("Piano Phase", 120.0);
        Part p1 = new Part("Piano1", PIANO, 0);
       // Part p2 = new Part("Piano2", VIOLIN, 1);
        Phrase phrase1 = new Phrase();
        //Lets write the music in a convenient way.

        Map<String, Integer> சுரம்ToNotes= new HashMap<>();

        சுரம்ToNotes.put("ச" + "மத்திமம்" , C3);
        சுரம்ToNotes.put("சா" + "மத்திமம்", C3);

         சுரம்ToNotes.put("ச" + "மேல்" , C4);
         சுரம்ToNotes.put("சா" + "மேல்", C4);

        சுரம்ToNotes.put("ரி"  + "மத்திமம்", DS3);
        சுரம்ToNotes.put("ரீ"  + "மத்திமம்", DS3);

        சுரம்ToNotes.put("ரி"  + "மேல்", DS4);
        சுரம்ToNotes.put("ரீ"  + "மேல்", DS4);


        சுரம்ToNotes.put("க"  + "மத்திமம்", E3);
        சுரம்ToNotes.put("கா" + "மத்திமம்", E3);


        சுரம்ToNotes.put("க"  + "மேல்", E4);
        சுரம்ToNotes.put("கா" + "மேல்", E4);


        சுரம்ToNotes.put("ம" + "மத்திமம்", FS3);
        சுரம்ToNotes.put("மா" + "மத்திமம்", FS3);
        சுரம்ToNotes.put("ம" + "மேல்", FS4);
        சுரம்ToNotes.put("மா" + "மேல்", FS4);



        சுரம்ToNotes.put("ப" + "மத்திமம்", G3);
        சுரம்ToNotes.put("பா"  + "மத்திமம்", G3);

        சுரம்ToNotes.put("ப" + "மேல்", G4);
        சுரம்ToNotes.put("பா" + "மேல்", G4);


        சுரம்ToNotes.put("த" + "மத்திமம்", GS3);
        சுரம்ToNotes.put("தா" + "மத்திமம்", GS3);

        சுரம்ToNotes.put("த" + "மேல்", GS4);
        சுரம்ToNotes.put("தா" + "மேல்", GS4);

        சுரம்ToNotes.put("நி" + "மத்திமம்" , A3);
        சுரம்ToNotes.put("நீ" + "மத்திமம்", A3);

        சுரம்ToNotes.put("நி" + "மேல்", A4);
        சுரம்ToNotes.put("நீ" + "மேல்", A4);

        score = new Score(கீர்த்தனைமாறி.இராகம் + "-" + கீர்த்தனைமாறி.இயற்றியவர், 120 );
        score.setTimeSignature(8, 8);

        //score.setTimeSignature(8, 8);

        for (பாடல்  பாடல்: கீர்த்தனைமாறி.கீர்த்தனை) {
            String சுரம் = "ச";
            double அக்சரகாலதசமஎண் = 0.1;
            for (வரி வரி:  பாடல்.வரிகள்) {
                List<எழுத்துவகை> சுரப்பட்டியல் = எழுத்து.பாகுபடுத்தி(வரி.சுரம்);
                for(எழுத்துவகை சுர :சுரப்பட்டியல்) {
                    if (சுர instanceof  குறியீடு) {

                    } else {
                        சுரம் = சுர.ஒருங்குறி + வரி.சுரவளவு;
                    }
                    if (சுரம்ToNotes.containsKey(சுரம்)) {
                        Note note1 = new Note(சுரம்ToNotes.get(சுரம்), வரி.அக்சரகாலதசமஎண்);
                        phrase1.add(note1);
                    } else {
                        அச்சு(சுரம் + " சுரம்ToNotes-ல் இல்லை");
                    }
                }


            };

        }


        //add the notes to the first phrase
        Phrase phrase2 = (Phrase) phrase1.copy();
        //Phrase phrase3 = (Phrase) phrase1.copy();
        //Phrse four is played after the offset period
        //Phrase phrase4 = (Phrase) phrase1.copy();

        // repeat the sstable piano part and add it to a part and score
       // Mod.repeat(phrase1, 8);
       // Mod.repeat(phrase2, 8); // stable
        //phrase2.setStartTime(0.0);
        //Mod.repeat(phrase3, 24); // accellerate
        //phrase3.setTempo(120. * (6. * 24.) / (6. * 24. - 1.));
        //System.out.println("End time = " + phrase3.getEndTime());
        //Mod.repeat(phrase4, 8); //stable again

        // Phrase 3 is the one which extends phrase two at a different tempo
       // phrase3.setStartTime(24.0);
        //phrase4.setStartTime(32 * 3 - 1);
        //Play different parts in different octaves for more audible clarity
        // Mod.transpose(phrase2, 12);
        // Mod.transpose(phrase3, 12);
        //Mod.transpose(phrase4, 12);

        //add phrases to the two instruments
        p1.addPhrase(phrase1);

        p1.setPan(0.9);
        //add parts to the score
        score.addPart(p1);

        //OK now we SMF write
        Write.midi(score, கீர்த்தனைமாறி.பெயர்+"_" + கீர்த்தனைமாறி.மேளக்கர்த்தாஎண் + "_" + கீர்த்தனைமாறி.இசையின்வேகம்  + ".mid"
        );
        // playback with JavaSound
        Play.midi(score);

    }
/*
    public static Map<எழுத்துவகை, Integer> சுரங்களைபெறு(String மேளக்கர்த்தாஎண்) {

        Map<எழுத்துவகை, Integer> மேளக்கர்த்தா =new HashMap<>();

        double மேளக்கர்த்தாதசமஎண் = Double.parseDouble(மேளக்கர்த்தாஎண்);
        மேளக்கர்த்தா.put(ச, C3);
        மேளக்கர்த்தா.put(ப, G3);
        if (மேளக்கர்த்தாதசமஎண் >36)  {
            மேளக்கர்த்தா.put(ம, FS3);
            மேளக்கர்த்தாதசமஎண் = மேளக்கர்த்தாதசமஎண்-36;
        } else {
            மேளக்கர்த்தா.put(ம, F3);

        }

        double lrg= மேளக்கர்த்தாதசமஎண்;

        if((lrg>=7 )&& ( lrg<=12))
        {
            மேளக்கர்த்தா.put(ரி, CS3);//ri=1;
            மேளக்கர்த்தா.put(க, DS3);//ga=2;
        }
        else if(lrg>=13 &&  lrg<=18)
        {
            மேளக்கர்த்தா.put(ரி, CS3);//ri=1;
            மேளக்கர்த்தா.put(க, E3);//ga=3;
        }
        else if(lrg>=19 &&  lrg<=24)
        {
            //ri=2;
            //ga=2;
            மேளக்கர்த்தா.put(ரி, D3);//ri=2;
            மேளக்கர்த்தா.put(க, DS3);//ga=2;
        }
        else if(lrg>=25 &&  lrg<=30)
        {
            //ri=2;
            //ga=3;
            மேளக்கர்த்தா.put(ரி, D3);
            மேளக்கர்த்தா.put(க, E3);
        }
        else if(lrg>=31 &&  lrg<=36)
        {
            //ri=3;
            //ga=3;
            மேளக்கர்த்தா.put(ரி, DS3);
            மேளக்கர்த்தா.put(க, E3);
        }
        else if(lrg>=1 &&  lrg<=6)
        {
            //ri=1;
            //ga=1;
            மேளக்கர்த்தா.put(ரி, CS3);
            மேளக்கர்த்தா.put(க, D3);
        }

        lrg= மேளக்கர்த்தாதசமஎண் %6;
        if(lrg ==1)
        {
            //da=1;
            //nee=1;
            மேளக்கர்த்தா.put(த, GS3);
            மேளக்கர்த்தா.put(நி, A3);
        }
        else if(lrg ==2)
        {
            //da=1;
            //nee=2;
            மேளக்கர்த்தா.put(த, GS3);
            மேளக்கர்த்தா.put(நி, AS3);
        }
        else if(lrg ==3)
        {
            //da=1;
            //nee=3;
            மேளக்கர்த்தா.put(த, GS3);
            மேளக்கர்த்தா.put(நி, B3);

        }
        else if(lrg == 4 )
        {
           // da=2;
           // nee=2;
            மேளக்கர்த்தா.put(த, A3);
            மேளக்கர்த்தா.put(நி, AS3);
        }
        else if(lrg == 5 )
        {
           // da=2;
            // nee=3;
            மேளக்கர்த்தா.put(த, A3);
            மேளக்கர்த்தா.put(நி, B3);
        }
        else if(lrg == 0 )
        {
           // da=3;
            // nee=3;
            மேளக்கர்த்தா.put(த, AS3);
            மேளக்கர்த்தா.put(நி, B3);
        }

        return  மேளக்கர்த்தா;


    }

 */

    public static பண் சுரங்களைபெறு(String மேளக்கர்த்தாஎண்) {

        பண் பண்மாறி = new பண்();


        double மேளக்கர்த்தாதசமஎண் = Double.parseDouble(மேளக்கர்த்தாஎண்);
        சுரங்கள் இறங்குவரிசை =new சுரங்கள்();


        இறங்குவரிசை.சவைப்பிடி(சுரங்கள்.குரல்.ச);
        இறங்குவரிசை.பவைப்பிடி(சுரங்கள்.இளி.ப);
        if (மேளக்கர்த்தாதசமஎண் >36)  {
            இறங்குவரிசை.மவைப்பிடி(சுரங்கள்.உழை.ம2);
            மேளக்கர்த்தாதசமஎண் = மேளக்கர்த்தாதசமஎண்-36;
        } else {
            இறங்குவரிசை.மவைப்பிடி(சுரங்கள்.உழை.ம1);

        }

        double lrg= மேளக்கர்த்தாதசமஎண்;

         if(lrg>=1 &&  lrg<=6)
        {

            இறங்குவரிசை.ரியைப்பிடி(சுரங்கள்.துத்தம்.ரி1);
            இறங்குவரிசை.கவைப்பிடி(சுரங்கள்.கைக்கிளை.க1);
        }
        else if((lrg>=7 )&& ( lrg<=12))
        {
            இறங்குவரிசை.ரியைப்பிடி(சுரங்கள்.துத்தம்.ரி1);
            இறங்குவரிசை.கவைப்பிடி(சுரங்கள்.கைக்கிளை.க2);

        }
        else if(lrg>=13 &&  lrg<=18)
        {
            இறங்குவரிசை.ரியைப்பிடி(சுரங்கள்.துத்தம்.ரி1);
            இறங்குவரிசை.கவைப்பிடி(சுரங்கள்.கைக்கிளை.க3) ;

        }
        else if(lrg>=19 &&  lrg<=24)
        {

            இறங்குவரிசை.ரியைப்பிடி(சுரங்கள்.துத்தம்.ரி2);
            இறங்குவரிசை.கவைப்பிடி(சுரங்கள்.கைக்கிளை.க2);

        }
        else if(lrg>=25 &&  lrg<=30)
        {

            //ga=3;
            இறங்குவரிசை.ரியைப்பிடி(சுரங்கள்.துத்தம்.ரி2);
            இறங்குவரிசை.கவைப்பிடி(சுரங்கள்.கைக்கிளை.க3);
        }
        else if(lrg>=31 &&  lrg<=36)
        {
            //ri=3;
            //ga=3;
            இறங்குவரிசை.ரியைப்பிடி(சுரங்கள்.துத்தம்.ரி3);
            இறங்குவரிசை.கவைப்பிடி(சுரங்கள்.கைக்கிளை.க3);
        }


        lrg= மேளக்கர்த்தாதசமஎண் %6;
        if(lrg ==1)
        {
            //da=1;
            //nee=1;
            இறங்குவரிசை.தவைப்பிடி(சுரங்கள்.விளரி.த1);
            இறங்குவரிசை.நியைப்பிடி(சுரங்கள்.தாரம்.நி1);

        }
        else if(lrg ==2)
        {
            //da=1;
            //nee=2;
            இறங்குவரிசை.தவைப்பிடி(சுரங்கள்.விளரி.த1);
            இறங்குவரிசை.நியைப்பிடி(சுரங்கள்.தாரம்.நி2);
        }
        else if(lrg ==3)
        {
            //da=1;
            //nee=3;
            இறங்குவரிசை.தவைப்பிடி(சுரங்கள்.விளரி.த1);
            இறங்குவரிசை.நியைப்பிடி(சுரங்கள்.தாரம்.நி3);

        }
        else if(lrg == 4 )
        {
            // da=2;
            // nee=2;
            இறங்குவரிசை.தவைப்பிடி(சுரங்கள்.விளரி.த2);
            இறங்குவரிசை.நியைப்பிடி(சுரங்கள்.தாரம்.நி2);
        }
        else if(lrg == 5 )
        {
            // da=2;
            // nee=3;
            இறங்குவரிசை.தவைப்பிடி(சுரங்கள்.விளரி.த2);
            இறங்குவரிசை.நியைப்பிடி(சுரங்கள்.தாரம்.நி3);
        }
        else if(lrg == 0 )
        {
            // da=3;
            // nee=3;
            இறங்குவரிசை.தவைப்பிடி(சுரங்கள்.விளரி.த3);
            இறங்குவரிசை.நியைப்பிடி(சுரங்கள்.தாரம்.நி3);
        }
        பண்மாறி.setஇறங்குவரிசை(இறங்குவரிசை);
        பண்மாறி.setஏறுவரிசை(இறங்குவரிசை);


        return  பண்மாறி;

    }
}
