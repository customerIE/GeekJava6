
import java.util.ArrayList;
//import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Scanner;
public class Notebook {
    String model;
    int ram;
    int hdd;
    String os;
    String color;
    public Notebook(){}
    public Notebook(String model, int ram, int hdd, String os, String color){
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }
    public List<Notebook> filter(Set<Notebook> notebook){
        Scanner scan = new Scanner(System.in);
        System.out.println("What notebook's param-s do you want?" + "\nEnter HDD: 80, 320, 500");
        String inputhdd = scan.nextLine();
        int datahdd = Integer.parseInt(inputhdd);
        System.out.println("Enter RAM: 2, 4, 8");
        String inputram = scan.nextLine();
        int dataram = Integer.parseInt(inputram);
        System.out.println("Enter OS: Windows, Linux, MacOS");
        String inputos = scan.nextLine();
        System.out.println("Enter color: Black, Grey, Red");
        String inputcolor = scan.nextLine();

        List<Notebook> listNotebook = new ArrayList<>();
        //Set<Notebook> listNotebook = new HashSet<>(notebook);
        for (Notebook temp: notebook){
            if(datahdd == temp.hdd){
                if(dataram == temp.ram){
                    if(inputos.equals(temp.os)){
                        if(inputcolor.equals(temp.color)){
                            listNotebook.add(temp);
                        }
                    }
                }
            }
        }
        if (listNotebook.isEmpty()) System.out.println("Такого ноутбука нет в наличии!");
        return listNotebook;
    }

    @Override
    public String toString() {
        //String res = String.format("model:%d ram:%s hdd:%s os:%d", model, ram, hdd, os);
        return String.format("Model:%s, RAM:%s, HDD:%s, OS:%s, Color:%s", model, ram, hdd, os, color);
    }
}
