package இயேரி.தமிழிசை;

import jm.JMC;
import jm.music.data.*;
import jm.music.tools.*;
import jm.util.*;

/**
 * A short example which generates a drum kit pattern
 * and writes to a MIDI file called kit.mid
 * @author Andrew Brown
 */
public final class Kit implements JMC{
    public static void main(String[] args){
        Score pattern1 = new Score("JMDemo - Kit");
        Part drums = new Part("Drums", 0, 9); // 9 = MIDI channel 10
        Phrase phrBD = new Phrase(0.0);
        Phrase phrSD = new Phrase(0.0);
        Phrase phrHH = new Phrase(0.0);

        //Let us know things have started
        System.out.println("Creating drum patterns . . .");
         பாணி பாணி= new பாணி.மட்டியம்(இயேரி.தமிழிசை.பாணி.லகு.I5, இயேரி.தமிழிசை.பாணி.நடைஎண்.I9);

         பாணி.பெறு().forEach( பிரிவு->{
             System.out.println(பிரிவு.மதிப்பு);
         });

        பாணி.நடையைபெறு().forEach( மதிப்பு->{
            System.out.println(மதிப்பு);
        });


        System.out.println( பாணி.நடைகளைபெறு());
        // make bass drum
        for(int i=0;i<4;i++){
            Note note = new Note(36, C);
            phrBD.addNote(note);
            Note rest = new Note(REST, C); //rest
            phrBD.addNote(rest);
        }

        // make snare drum
        for(int i=0;i<4;i++){
            Note rest = new Note(REST, C); //rest
            phrSD.addNote(rest);
            Note note = new Note(38, C);
            phrSD.addNote(note);
        }

        // make hats
        for(int i=0;i<15;i++){
            Note note = new Note(42, Q);
            phrHH.addNote(note);
        }
        Note note = new Note(46, Q); // open hi hat
        phrHH.addNote(note);

        // loop the drum pattern for 16 bars
        Mod.repeat(phrBD, 7);
        Mod.repeat(phrSD, 7);
        Mod.repeat(phrHH, 7);

        // add phrases to the instrument (part)
        drums.addPhrase(phrBD);
        drums.addPhrase(phrSD);
        drums.addPhrase(phrHH);

        // add the drum part to a score.
        pattern1.addPart(drums);

        // write the score to a MIDIfile
        Write.midi(pattern1, "Kit.mid");
    }
}