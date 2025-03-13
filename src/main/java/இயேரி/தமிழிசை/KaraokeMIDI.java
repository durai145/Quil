package இயேரி.தமிழிசை;

import javax.sound.midi.*;
import java.io.File;
import java.io.IOException;

public class KaraokeMIDI {

    public static void main(String[] args) {
        String filePath = "/Users/agalyaramadoss/repo/Quil/null2.mid"; // MIDI file to save
        createKaraokeMIDI(filePath);
        System.out.println("MIDI file created: " + filePath);
        playMIDI(filePath);
    }

    public static void createKaraokeMIDI(String filePath) {
        try {
            // Create a MIDI sequence with resolution 480 ticks per beat
            Sequence sequence = new Sequence(Sequence.PPQ, 480);
            Track track = sequence.createTrack();

            // Add tempo (120 BPM)
            addMetaMessage(track, 0x51, new byte[]{0x07, (byte) 0xA1, 0x20}, 0);

            // Add MIDI Notes (C Major melody)
            int[][] notes = {
                    {60, 500}, {60, 500}, {67, 500}, {67, 500}, {69, 500}, {69, 500}, {67, 1000} // "Twinkle twinkle little star"
            };

            int time = 0;
            for (int[] note : notes) {
                addNote(track, note[0], time, note[1]);
                time += note[1];
            }

            // Add lyrics with timestamps
            String[][] lyrics = {
                    {"Twinkle", "0"}, {"twinkle", "1000"}, {"little", "2000"}, {"star", "3000"}
            };
            for (String[] lyric : lyrics) {
                addLyric(track, lyric[0], Integer.parseInt( lyric[1]));
            }

            // Save MIDI file
            File midiFile = new File(filePath);
            MidiSystem.write(sequence, 1, midiFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addMetaMessage(Track track, int type, byte[] data, int tick) throws InvalidMidiDataException {
        MetaMessage message = new MetaMessage();
        message.setMessage(type, data, data.length);
        MidiEvent event = new MidiEvent(message, tick);
        track.add(event);
    }

    public static void addNote(Track track, int note, int tick, int duration) throws InvalidMidiDataException {
        ShortMessage on = new ShortMessage(ShortMessage.NOTE_ON, 0, note, 90);
        ShortMessage off = new ShortMessage(ShortMessage.NOTE_OFF, 0, note, 90);
        track.add(new MidiEvent(on, tick));
        track.add(new MidiEvent(off, tick + duration));
    }

    public static void addLyric(Track track, String lyric, int tick) throws InvalidMidiDataException {
        MetaMessage message = new MetaMessage();
        message.setMessage(0x05, lyric.getBytes(), lyric.length());
        track.add(new MidiEvent(message, tick));
    }

    public static void playMIDI(String filePath) {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            Sequence sequence = MidiSystem.getSequence(new File(filePath));
            sequencer.setSequence(sequence);

            sequencer.addMetaEventListener(meta -> {
                if (meta.getType() == 0x05) {
                    String lyric = new String(meta.getData());
                    System.out.println("Lyrics: " + lyric);
                }
            });

            sequencer.start();
            while (sequencer.isRunning()) {
                Thread.sleep(500);
            }
            sequencer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
