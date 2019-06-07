package questao3;

public class Triangulo extends Forma2D{
    public Triangulo(int x1, int y1, int x2, int y2, int x3, int y3){
        super(new Ponto2D(x1,y1), new Ponto2D(x2,y2),new Ponto2D(x3,y3));
    }
}
