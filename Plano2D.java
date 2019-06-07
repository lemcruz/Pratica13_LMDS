package questao3;

import java.util.*;
import javax.swing.JFrame;

public class Plano2D {
    private ArrayList<Forma2D> listForma2D;
    public Plano2D(){
        listForma2D = new ArrayList<>();
    }
    public void addForma2D(Forma2D fig){
        listForma2D.add(fig);
    }

    public ArrayList<Forma2D> getListForma2D() {
        return listForma2D;
    }
    
    public void desenha(){
        DesenhaFig fig = new DesenhaFig(listForma2D);
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(fig);
        application.setSize(800,600);
        application.setVisible(true);
    }
}
