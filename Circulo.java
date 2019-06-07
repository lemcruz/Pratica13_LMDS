package questao3;

public class Circulo extends Forma2D{

    public Circulo(int x1, int y1, int x2, int y2) {
        super(new Ponto2D(x1,y1), new Ponto2D(x2,y2),new Ponto2D(0,0));
        this.raio = getRaio();
    }
    private double getRaio(){   
        return Forma2D.calcReta(this.p1, this.p2)/2;
    }
     
   
}
