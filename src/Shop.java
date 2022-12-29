import java.util.HashSet;
import java.util.Set;

public class Shop {
    public static void main(String[] args){
        Notebook hp_6685 = new Notebook("hp_6685", 2, 80, "Windows", "Black" );
        Notebook acer_5553 = new Notebook("acer_5553", 8, 500, "Linux", "Grey");
        Notebook macbook = new Notebook("macbook", 4, 320, "MacOS", "Red");
        Set <Notebook> notebook = new HashSet<>();
        notebook.add(hp_6685);
        notebook.add(acer_5553);
        notebook.add(macbook);

        Notebook FilterNotebook = new Notebook();
        System.out.println("Found : " + FilterNotebook.filter(notebook));

    }
}
