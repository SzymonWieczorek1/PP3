import java.util.*;
public class File{
    
    private String name;
    private int size;
    private String ext;
    
    File(String name, String ext, int size){
        this.name = name;
        this.ext = ext;
        this.size = size;
    }
    
    String getName(){
        return name;
    }
    
    int getSize(){
        return size;
    }
    
    String getExt(){
        return ext;
    }
    
    void setName(String newName){
        this.name = newName;
    }
    
}