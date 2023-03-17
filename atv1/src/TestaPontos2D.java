public class TestaPontos2D {
    public static void main(String[] args) throws Exception {
        Ponto2D ponto1 = new Ponto2D();
        Ponto2D ponto2 = new Ponto2D(1.2, 3.4);

        System.out.println("Coordenadas do ponto1: (" + ponto1.getX() + ", " + ponto1.getY() + ")");
        System.out.println("Coordenadas do ponto2: (" + ponto2.getX() + ", " + ponto2.getY() + ")");
        System.out.println("Número de instâncias criadas: " + Ponto2D.getContar());
    }
}