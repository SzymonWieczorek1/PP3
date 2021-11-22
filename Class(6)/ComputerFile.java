public class ComputerFile{
    float size;
    String name;
    String extension;
    String content;
    
    public ComputerFile(String name, String extension, String content){
        this.name = name;
        this.extension = extension;
    }
    
    public String toString(){
        return this.content;
    }
    
    public float getSize(){
        return this.size;
    }
    
    public String getFullName(){
        return this.name + "." + this.extension;
    }
    
    public void writeContent(String content){
        this.content = content;
    }
    
}