package இயேரி.தமிழிசை;

import javax.sound.midi.*;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class MidiLyricsPlayer {

    public static void main(String[] args) {
        String midiFilePath = "null2.mid"; // Provide the correct path to your MIDI file

        // Define lyrics with timestamps (in milliseconds)
        String[][] lyrics = {
                {"Twinkle", "1000"},
                {"twinkle", "2000"},
                {"little", "3000"},
                {"star", "4000"},
                {"How", "5000"},
                {"I", "6000"},
                {"wonder", "7000"},
                {"what", "8000"},
                {"you", "9000"},
                {"are", "10000"}
        };

        // Start playing MIDI file
        playMidiWithLyrics(midiFilePath, lyrics);
    }

    public static void playMidiWithLyrics(String filePath, String[][] lyrics) {
        try {
            // Open MIDI file
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            Sequence sequence = MidiSystem.getSequence(new File("/Users/agalyaramadoss/repo/Quil/null2.mid"));
            sequencer.setSequence(sequence);

            // Start playing
            sequencer.start();
            System.out.println("Playing MIDI...");

            // Display lyrics in sync
            Timer timer = new Timer();
            for (String[] lyric : lyrics) {
                String word = lyric[0];
                int time = Integer.parseInt(lyric[1]);
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        System.out.println(word);
                    }
                }, time);
            }

            // Wait until MIDI finishes
            while (sequencer.isRunning()) {
                Thread.sleep(500);
            }

            // Cleanup
            sequencer.close();
            timer.cancel();
            System.out.println("MIDI playback finished.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
