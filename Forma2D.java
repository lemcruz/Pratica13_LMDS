package questao3;
import java.math.*;
public abstract class Forma2D {   
    protected Ponto2D p1,p2,p3;
    protected double raio;

    public Forma2D(Ponto2D p1, Ponto2D p2, Ponto2D p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;       
    }
    
        
    public static double calcReta(Ponto2D p1, Ponto2D p2){
        
        return Math.sqrt(Math.pow(p2.getX()- p1.getX(),2) + 
                         Math.pow(p2.getY()- p1.getY(),2) );
                
    }
}
