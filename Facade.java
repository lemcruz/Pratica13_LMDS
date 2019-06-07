package questao3;

public class Facade {
    Plano2D plano;
    public Facade(){
        plano = new Plano2D();
        
    }
    public void desenha(){
       plano.desenha();
    }
    public void criaFig(float x1, float y1,float x2, float y2){
        this.plano.addForma2D(new Circulo( Math.round(x1),Math.round(y1)
                                    ,Math.round(x2),Math.round(y2)));
    }
    public void criaFig(float x1, float y1,float x2, float y2, float x3, float y3){
        this.plano.addForma2D(new Triangulo( Math.round(x1),Math.round(y1),
                            Math.round(x2),Math.round(y2),Math.round(x3),
                            Math.round(y3)));
    }
}
