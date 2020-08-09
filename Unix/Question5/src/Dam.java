import java.security.PublicKey;

public class Dam {
    public String Dam_name;
    public String FSC;
    public String Dam_level;
    

    public Dam(String Dam_name, String FSC, String Dam_level){
        this.Dam_name = Dam_name;
        this.FSC = FSC;
        this.Dam_level = Dam_level;
    }


    public String getname() {
        return this.Dam_name;
    }
    
    public String getFSC() {
        return this.FSC;
    }

    public String getlevel() {
        return this.Dam_level;
    }

    public String toString(){
        return "Dam Name:" + this.Dam_name +"|" + "FSC:" + this.FSC + "|" + "Dam Level:" + this.Dam_level;
    }





}