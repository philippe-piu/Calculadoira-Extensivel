package calculadora.extensivel;

public class Main {

    public static void main(String[] args) throws Exception {
        int operacao;
        double num1;
        double num2;

        Leitura leitura = new Leitura();
        Adicao adi = new Adicao();
        Subtracao sub = new Subtracao();
        Multiplicacao mult = new Multiplicacao();
        Divisao div = new Divisao();

        System.out.println("Calculadora");
        System.out.println("Na opção de operação escolha entre  1 - adicao, 2 - subtracao,  3 - divisao e 4 - multiplicacao");
        System.out.println("Informe primeiro Número: ");
        num1 = Double.parseDouble(leitura.inData(""));
        System.out.println("Informe Operação ");
        operacao = Integer.parseInt(leitura.inData("Informe a Operação:  "));
        System.out.println("Informe segundo Número: ");
        num2 = Double.parseDouble(leitura.inData(""));
        
        if(operacao == 1){
            System.out.println(adi.calcular(num1, num2));
        }else if(operacao == 2){
            System.out.println(sub.calcular(num1, num2));
        }else if(operacao == 4){
            System.out.println(mult.calcular(num1, num2));
        }else if(operacao == 3){
            System.out.println(div.calcular(num1, num2));
        }
        
    }

}
