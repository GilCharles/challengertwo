import javax.swing.*;

public class Usuario {

    // Atributo

    String nome;

    // Métodos

    public String recebeNome() {

        nome = JOptionPane.showInputDialog("Olá, bem vindo ao conversor, qual é o seu nome ?");

        return nome;
    }
}
