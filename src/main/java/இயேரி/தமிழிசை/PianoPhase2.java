package இயேரி.தமிழிசை;

import jm.music.data.*;
import jm.music.tools.*;
import jm.JMC;
import jm.util.*;
//import qt.*;
import jm.util.*;

import java.awt.*;

/**
 * Play's the opening section of Steve Reich's "Piano Phase"
 * This deomsytrates playing two parts at different tempi.
 * @author Andrew Brown
 */
public final class PianoPhase2 implements JMC{
    public static void main(String[] args){
        new PianoPhase2();
    }

    public PianoPhase2() {
        //Create the data objects we want to use
        Score score = new Score("Piano Phase", 120.0);
        score.setTimeSignature(6, 8);
        Part p1 = new Part("Piano1", PIANO, 0);
        Part p2 = new Part("Piano2", VIOLIN, 1);
        Phrase phrase1 = new Phrase();
        //Lets write the music in a convenient way.
        int[] pitchArray = {E4,FS4,B4,CS5,D5,FS4,E4,CS5,B4,FS4,D5,CS5};
        double[] rhythmArray = {0.25,0.25,0.25,0.25,0.25,0.25,0.25,0.25,0.25,0.25,0.25,0.25};


        Note note1  = new Note(C, 0.25, 1);
        phrase1.add( note1 );
        //add the notes to the first phrase
        phrase1.addNoteList(pitchArray, rhythmArray);
        Phrase phrase2 = (Phrase) phrase1.copy();
        Phrase phrase3 = (Phrase) phrase1.copy();
        //Phrse four is played after the offset period
        Phrase phrase4 = (Phrase) phrase1.copy();

        // repeat the sstable piano part and add it to a part and score
        Mod.repeat(phrase1, 40);
        Mod.repeat(phrase2, 8); // stable
        phrase2.setStartTime(0.0);
        Mod.repeat(phrase3, 24); // accellerate
        phrase3.setTempo(120. * (6. * 24.) / (6. * 24. - 1.));
        System.out.println("End time = " + phrase3.getEndTime());
        Mod.repeat(phrase4, 8); //stable again

        // Phrase 3 is the one which extends phrase two at a different tempo
        phrase3.setStartTime(24.0);
        phrase4.setStartTime(32 * 3 - 1);
        //Play different parts in different octaves for more audible clarity
        Mod.transpose(phrase2, 12);
        Mod.transpose(phrase3, 12);
        Mod.transpose(phrase4, 12);

        //add phrases to the two instruments
        p1.addPhrase(phrase1);
        p2.addPhrase(phrase2);
        p2.addPhrase(phrase3);
        p2.addPhrase(phrase4);
        // set pan
        p1.setPan(0.1);
        p2.setPan(0.9);
        //add parts to the score
        score.addPart(p1);
        score.addPart(p2);
        //OK now we SMF write
        Write.midi(score, "PianoPhase.mid");
        // playback with JavaSound
        Play.midi(score);
    }
}