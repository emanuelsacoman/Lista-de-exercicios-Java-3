public class TesteRetangulo {
    public static void main(String[] args) throws Exception {
        Retangulo retangulo1 = new Retangulo();
        Retangulo retangulo2 = new Retangulo(3, 4);

        System.out.println("Comprimento: "+ retangulo1.getComprimento() + "\nLargura: "+ retangulo1.getLargura() + "\nPerímetro do retangulo1: "+ retangulo1.calcular() + "\nÁrea do retangulo1: "+ retangulo1.calcularArea() + "\n");
        System.out.println("Comprimento: "+ retangulo2.getComprimento() + "\nLargura: "+ retangulo2.getLargura() + "\nPerímetro do retangulo2: "+ retangulo2.calcular()+ "\nÁrea do retangulo2: "+ retangulo2.calcularArea() + "\n");
    }
}
