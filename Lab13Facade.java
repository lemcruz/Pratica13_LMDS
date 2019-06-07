package questao3;

public class Lab13Facade {

    public static void main(String[] args) {
        Facade f = new Facade();
        for (int i = 10; i < 100; i = i + 10) {
            f.criaFig(150, 150, 150 + i, 150 + i);
        }
        for (int i = 10; i < 100; i = i + 10) {
            f.criaFig(350 + i, 350 + i, 400 + i, 400 + i, 500 + i, 350 + i);
        }
        f.desenha();
    }
}
