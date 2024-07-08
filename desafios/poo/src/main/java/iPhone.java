public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero + ".");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Chamada!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música aleatória da biblioteca!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música atual!");
    }

    @Override
    public void selecionarMusica(String musica) {
        pausar();
        System.out.println("Tocando agora a música: " + musica + ".");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Redirecionando pra página com a url: " + url + ".");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando novo Aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a Página!");
    }
}
