package questao3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.*;
import javax.swing.JPanel;

public class DesenhaFig extends JPanel {
    private ArrayList<Forma2D> lista;

    public DesenhaFig(ArrayList<Forma2D> listForma2D) {
        setBackground(Color.WHITE);
        this.lista = new ArrayList<>();
        for(Forma2D f1 : listForma2D){
            lista.add(f1);
        }
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Forma2D f;
        boolean solido = true;
        
        int []x = {0,0,0,0,0};
        int []y = {0,0,0,0,0};
        
        for(Iterator<Forma2D>it = lista.iterator(); it.hasNext();){
            f = it.next();
            if (f instanceof Circulo){
                g.setColor(Color.blue);
                g.drawOval((int)f.p1.getX(), (int)f.p1.getY(), (int)f.raio*2,
                            (int)f.raio*2);
            }else {
                g.setColor(Color.green);
                x[0] = f.p1.getX();
                x[1] = f.p2.getX();
                x[2] = f.p3.getX();
                
                y[0] = f.p1.getY();
                y[1] = f.p2.getY();
                y[2] = f.p3.getY();
                g.drawPolygon(x, y, 3);
                
            }
        }
    }
   
   
}
