package src.main.java.iphone;

public class Main {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Testando ReprodutorMusical
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.tocar();
        meuIPhone.pausar();


        // Testando AparelhoTelefonico
        meuIPhone.ligar("123-456-7890");
        meuIPhone.atender();
        meuIPhone.iniciarCorrenoVoz();

        // Testando NavegadorInternet
        meuIPhone.exibirPagina("https://www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
