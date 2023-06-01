package codigo_unis;

import javax.swing.*;

public class Projeto_calcIMC {
    public static void main(String[] args){
        float altura;
        float peso;
        float imc;

        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura. Exemplo: 1.70")); //Abre uma jabela pedindo para o usuário digitar a altura
        JOptionPane.showMessageDialog(null,"Altura digitada: " + altura + "cm"); //Mostra a altura digitada na tela

        peso = Float.parseFloat(JOptionPane.showInputDialog("Digite seu peso. Exemplo: 60.5")); //Abre uma janela pedindo para o usuário digitar o peso
        JOptionPane.showMessageDialog(null,"Peso digitado: " + peso + "kg"); //Mostra o peso digitado na tela

        imc = calcIMC(altura,peso); //chamada da função que calcula o IMC


        if (imc < 18.5){ //se a condição for verdadeira
            JOptionPane.showMessageDialog(null,"Seu imc é: " + imc +".");
            JOptionPane.showMessageDialog(null,"Aconselhavél procurar um médico, pois seu imc está abaixo da média!");
        }else if (imc >= 25){ //se a primeira condição for falsa e a segunda verdadeira
            JOptionPane.showMessageDialog(null,"Seu imc é: " + imc +".");
            JOptionPane.showMessageDialog(null,"Aconselhavél procurar um médico, pois seu imc está acima da média!");
        }else{ //se a primeira e a segunda condição forem falsas
            JOptionPane.showMessageDialog(null,"Seu imc é: " + imc +".");
            JOptionPane.showMessageDialog(null,"Não há com o que se preocupar, continue se cuidando!");
        }

    }
    static float calcIMC(float height, float weight){ //esta função calcula as entradas digitadas pelo usuário
        float calc; //variável criada para armazenar o resultado
        calc = weight/(height * height); //essa é a fórmula que calcula o IMC
        return calc; //pede pra função retornar o valor final do cálculo
    }
}
