package tudien_ver2;


import com.sun.speech.freetts.VoiceManager;
import com.sun.speech.freetts.Voice;
public class voice  {    
    VoiceManager voiceManager;
    Voice voice;
    public voice(String text){
        System.setProperty("mbrola.base", "C:\\Users\\MyPC\\Desktop\\music_hoa_ngua\\mbrola");
        voiceManager = VoiceManager.getInstance();
        voice = voiceManager.getVoice("mbrola_us2");
        voice.allocate();       
    }
    public void say(String t){
        this.voice.speak(t);
    }
    
    
}