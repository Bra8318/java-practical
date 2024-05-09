package P2;
import P1.twoDim;

public class threeDim extends twoDim{
    private int z;
    public threeDim() {
        
    }
    public threeDim(twoDim obj1,int z){
        super(obj1.getx(),obj1.gety()) ;
        this.z = z;
    }
    public int getz(){
        return z;
    }
    public String toString(){
        return ("threeDim coordinates:" + super.getx() +','+ super.gety() +','+getz());
    }
   
}
    


