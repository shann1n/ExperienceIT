package Exceptions;

import javax.sound.midi.*;

public class MusicTest1 {
	public void play() {
		try {
			Sequencer sequencer = MidiSystem.getSequencer();
			System.out.println("Successfully got a sequncer");
		} catch (MidiUnavailableException ex) {
			System.out.println("Didn't get one");
		}
	}
	
	public static void main (String[] args) {
		MusicTest1 mt = new MusicTest1();
		mt.play();
		}
	}
