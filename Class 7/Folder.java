import java.util.*;
public class Folder{
    
    private String name;
    static ArrayList<File> files = new ArrayList<File>();

    Folder(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    ArrayList<File> getFiles(){
        return files;
    }
    void display(){
        System.out.println("FOLDER: "+getName());
        for(int i = 0; i<files.size(); i++){
            System.out.println("-  "+files.get(i).getName()+files.get(i).getExt()+" SIZE: "+files.get(i).getSize()+" KB");
        }
    }
    public static void main(String[] args){
        Folder fold1 = new Folder("PP3");
        File f1 = new File("Zad06",".txt",20);
        File f2 = new File("Zad07",".exe",523);
        File f3 = new File("test01",".pdf",444);
        files.add(f1);
        files.add(f2);
        fold1.display();
        files.add(f3);
        fold1.display();
        files.remove(f1);
        fold1.display();
        
    }
    
}
