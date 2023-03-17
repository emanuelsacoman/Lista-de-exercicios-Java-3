public class Retangulo {
    private double comprimento, largura;

    public Retangulo(){
        comprimento = 1;
        largura = 1;
    }

    public Retangulo(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcular(){
        double perimetro = 2 * (comprimento + largura);
        return perimetro;
    }

    public Double getComprimento(){
        return comprimento;
    }

    public Double getLargura(){
        return largura;
    }

    public double calcularArea(){
        return comprimento * largura;
    }
}
