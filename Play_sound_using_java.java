import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.ShortMessage;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Play_sound_using_java {
    public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {
      var receiver= MidiSystem.getReceiver();
        ShortMessage msg=new ShortMessage();
        msg.setMessage(ShortMessage.NOTE_ON,0,60,127);
        receiver.send(msg,-1);
        Thread.sleep(6000);
    }
}