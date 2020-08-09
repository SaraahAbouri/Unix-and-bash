
public class DamArrayApp {
    
    public void printDam(String damName) {
        
        Dam[] b = CSVreader.CSVreader();
        for (Dam j : b){
            if (j.getname().equals(damName)){
                System.out.println(j);
                break;
            }
            else if (!j.getname().equals(damName)){
            System.out.println("Dam Not Found");
        }
        }    
        
    }



    public void printAllDams() {

        Dam [] M = CSVreader.CSVreader();
        for(int x = 0; x < M.length ; x++){
            System.out.println(M[x]);
            if (x == 212){
                break;
            }
        } 
       
    }


public static void main(String[] args) {
    DamArrayApp damarrayapp = new DamArrayApp();
    damarrayapp.printDam("Inyaka Dam");
    damarrayapp.printAllDams();
    
}

}
    


