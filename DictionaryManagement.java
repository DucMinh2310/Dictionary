/*ducminh*/
package tudien_ver2;

import java.io.*;
import java.util.*;

public class DictionaryManagement extends Word {
    Scanner sc = new Scanner(System.in);
    protected ArrayList<Word> list = new ArrayList<>();

    public void insertFromFile() throws FileNotFoundException, IOException {
        FileInputStream fileIS = new FileInputStream("anhviet109K.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fileIS, "UTF8"));
        String s = null;
        while ((s = br.readLine()) != null) {
            if (s.startsWith("@")) {
                String str = s.substring(1, s.length());
                Word w = new Word();
                w.setWordTarget(str);
                w.setWordExplain("");
                list.add(w);
            } else {
                int d = list.size();
                if (d > 0) {
                    list.get(d - 1).setWordExplain(list.get(d - 1).getWordExplain() + "\n" + s);
                }
            }
        }

        br.close();
        fileIS.close();
    }

    // tra từ có trong từ diển
    public void dictionaryLookup() throws IOException {
        this.insertFromFile();
        int i = 0;
        System.out.print("nhap tu can tra:");
        String str = sc.nextLine();
        int temp = 0;
        while (i < list.size()) {
            if (str.equalsIgnoreCase(list.get(i).getWordTarget())) {
                temp = 1;
                System.out.println(list.get(i).getWordTarget() + " \t" + list.get(i).getWordExplain());
            }
            i++;
        }
        if (temp == 0) {
            System.out.println("ko tim thay tu can tra!");
        }

    }

    public void deleteWord(String s) {
        int i = 0;
        while (i < list.size()) {
            if (s.equalsIgnoreCase(list.get(i).getWordTarget())) {
                list.remove(i);
            }
            i++;
        }
    }

    public void repairWord(String s, String s1) {
        int i = 0;
        while (i < list.size()) {
            if (s.equalsIgnoreCase(list.get(i).getWordTarget())) {
                list.get(i).setWordExplain(s1);
            }
            i++;
        }
    }

    public String chuanhoa(String s) {
        s = s.toLowerCase();
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        return s;
    }
}
