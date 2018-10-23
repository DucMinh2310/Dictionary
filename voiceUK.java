package tudien_ver2;


import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.Voice;
public class voiceUK  {    
    VoiceManager voiceManager;
    Voice voice;
    public voiceUK(String text){
        System.setProperty("mbrola.base", "C:\\Users\\MyPC\\Desktop\\music_hoa_ngua\\mbrola");
        voiceManager = VoiceManager.getInstance();
        voice = voiceManager.getVoice("mbrola_en1");
        voice.allocate();       
    }
    public void say(String uk){
        this.voice.speak(uk);
    }
    
    
}