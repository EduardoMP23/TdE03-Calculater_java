import java.text.DecimalFormat;
import java.util.ArrayList;

class metodos {


    public void somar (ArrayList<Double> lista) {
        double soma = 0;

        for (double list : lista ) {
            soma += list;
        }

        System.out.println(soma);
    }

    public void subtracao (ArrayList<Double> lista) {
        double sub = lista.get(0);
        double sub2 = lista.get(1);

        double sub3 = sub - sub2;

        //Formatando as casas decimais
        DecimalFormat df = new DecimalFormat("#.###");
        String sub3form = df.format(sub3);

        System.out.println(sub3form);
    }

    public void multiplicacao (ArrayList<Double> lista) {
        double mult = lista.get(0);
        double mult2 = lista.get(1);

        double mult3 = mult * mult2;

        //Formatando as casas decimais
        DecimalFormat df = new DecimalFormat("#.###");
        String mult3form = df.format(mult3);

        System.out.println(mult3form);
    }

    public void divisao (ArrayList<Double> lista) {
        double div = lista.get(0);
        double div2 = lista.get(1);

        double div3 = div / div2;

        //Formatando as casas decimais
        DecimalFormat df = new DecimalFormat("#.###");
        String div3form = df.format(div3);

        System.out.println(div3form);
    }



}
