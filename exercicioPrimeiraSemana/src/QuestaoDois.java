    //QUESTÃO_2: Imprima a média aritmética dos números 8,9 e 7. A
    //média dos números 4, 5 e 6. A soma das duas médias. A média das
    //medias.
public class QuestaoDois {
    public static void main(String[] args) {
        //Declara e atribui as variaveis com os dados
        Double primeiroNumero=8.9,segundoNumero=7.00;
        Double terceiroNumero=4.00,quartoNumero=5.00,quintoNumero=6.00;

        //Calcula e mostra a prmeira media
        Double primeiraMedia = (primeiroNumero+segundoNumero)/2;
        System.out.println("Média aritmética dos números 8,9 e 7: "+primeiraMedia);

        //Calcula e mostra a segunda media
        Double segundaMedia = (terceiroNumero+quartoNumero+quintoNumero)/3;
        System.out.println("Média aritmética dos números 4, 5 e 6: "+segundaMedia);

        //Calcula e mostra a soma das medias
        Double somaDasMedias = primeiraMedia+segundaMedia;
        System.out.println("A soma das duas médias: "+somaDasMedias);

        //Calcula e mostra a media das medias
        Double mediasTotal = somaDasMedias/2;
        System.out.println("A média das medias: "+mediasTotal);
    }
}
