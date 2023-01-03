import java.util.HashMap;
import java.util.Set;

public class Muse {
    public static void Songs() {

        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Space Dementia", "I'd cut your name in my heart");
        trackList.put("Eternally Missed", "I just don't care if it's real");
        trackList.put("Hyper Music", "I don't want you and I never will");
        trackList.put("MK Ultra", "How much longer until you break?");

        String song = trackList.get("Hyper Music");

        Set<String> keys = trackList.keySet();
        for (String key: keys) {
            System.out.println("Title: " + key);
            System.out.println("Lyrics: " + trackList.get(key));
        }
    }
}