/*
    PROJETO FINAL - LABORATÓRIO PROGRAMAÇÃO DE COMPUTADORES II
    GRUPO: MATHEUS SOUZA 
*/
package quiz;


public class Quiz {

    private String[] Perguntas;
    private String[] Respostas;
    private String[] Opcoes;
    private String Letra;
    private int Pontuacao, Temas, num;

    public Quiz(String[] Perguntas, String[] Respostas, int Pontuacao, int Temas, String[] Opcoes, int num, String Letra) {
        this.Perguntas = Perguntas;
        this.Respostas = Respostas;
        this.Pontuacao = Pontuacao;
        this.Temas = Temas;
        this.Opcoes = Opcoes;
        this.num = num;
        this.Letra = Letra;
    }
    
    public Quiz(){
        this.Perguntas = new String[30];
        this.Respostas = new String[30];
        this.Pontuacao = 0;
        this.Temas = 0;
        this.Opcoes = new String[30];
        this.num = 0;
        this.Letra = "";
    }
    
    public boolean VerificaResp(){
        String var = Respostas(num);
        boolean a = Letra.equals(var);
        return a;
    }
    
    public String Perguntar(int i){
            num = i;
                            //FUTEBOL
            Perguntas[0] = "Qual é a única seleção penta campeã do mundo?";
            Perguntas[1] = "Que time paulista não tem mundial ?";
            Perguntas[2] = "Quantas libertadores tem o santos futebol clube ?";
            Perguntas[3] = "Qual foi a final da libertadores 2012 ?";
            Perguntas[4] = "Qual time carioca tem 4 rebaixamentos ?";
            Perguntas[5] = "Qual time brasileiro revelou o jogador de futebol Fabinho(Liverpool) ?";
            Perguntas[6] = "Qual o primeiro time do jogador de futebol Neymar ?";
            Perguntas[7] = "Qual time perdeu a copa do brasil para o Flamengo em 2013 ?";
            Perguntas[8] = "Qual o maior campeão da copa do brasil ?";
            Perguntas[9] = "Quem fez os dois gols da virada do Flamengo sobre o River Plate na libertadores de 2019?";
                            //GEOGRAFIA
            Perguntas[10] = "Qual é a primeira fase do capitalismo?";
            Perguntas[11] = "Quais países fazem parte do bloco econômico NAFTA?";
            Perguntas[12] = "Qual é o principal combustível fossil da 1 Revolução Industrial?";
            Perguntas[13] = "Qual o principal agente da globalização?";
            Perguntas[14] = "Qual palavra ou frase, que NÃO caracteriza o conceito de Capitalismo?";
            Perguntas[15] = "O que foi a Guerra Fria ou Ordem Bipolar?";
            Perguntas[16] = "Qual foi o principal alvo do Neocolonialismo da Europa?";
            Perguntas[17] = "O Mercosul está em qual estágio?";
            Perguntas[18] = "A Guerra Fria foi um conflito entre:";
            Perguntas[19] = "Quantos Blocos econômicos existem no mundo?";
                            //BIOLOGIA
            Perguntas[20] = "O que são coacervados?";
            Perguntas[21] = "Conforme seus estudos em sala,qual é a alternativa INCORRETA sobre a célula Eucarionte?";
            Perguntas[22] = "Qual a definição de metabolismo?";
            Perguntas[23] = "Qual das alternativas abaixo não corresponde com a função da água?";
            Perguntas[24] = "Qual é o papel da enzima?";
            Perguntas[25] = "Quais deses fatores abaixo afetam a atividade enzimática?";
            Perguntas[26] = "Por que ocorre curtas cadeias alimentares?";
            Perguntas[27] = "O que o colesterol ajuda para nós seres humanos?";
            Perguntas[28] = "Qual o maior osso humano?";
            Perguntas[29] = "A qual reino as bactérias pertencem?";
            
            return Perguntas[i];
    }
    
    public String Opcoes(int j){
        num = j;
        Opcoes[0] = "(A) Alemanha (B) Brasil (C) Argentina (D) Holanda";
        Opcoes[1] = "(A) Flamengo (B) Palmeiras (C) Atlético-MG (D) Botafogo";
        Opcoes[2] = "(A) 1 (B) 2 (C) 0 (D) 3";
        Opcoes[3] = "(A) Flamengo x River (B) Corinthians x Boca Juniors (C) Atlético-MG x Tolima (D) Santos x Palmeiras";
        Opcoes[4] = "(A) Vasco (B) Bangu (C) Flamengo (D) Botafogo";
        Opcoes[5] = "(A) Fluminense (B) Vasco (C) Flamengo (D) Botafogo";
        Opcoes[6] = "(A) Atlético-MG (B) Palmeiras (C) Santos (D) Avaí";
        Opcoes[7] = "(A) Atlético-MG (B) Ceará (C) Cruzeiro (D) Athletico-PR";
        Opcoes[8] = "(A) Flamengo (B) Cruzeiro (C) Fortaleza (D) Palmeiras";
        Opcoes[9] = "(A) Calleri (B) Gabriel Barbosa (C) Vitinho (D) Hulk";
        
        Opcoes[10] = "(A) Rev. Industrial (B) 2a Guerra (C) Nova Ordem (D) Guerra Fria";
        Opcoes[11] = "(A) Angola, Congo, Zâmbia (B) Mexico, EUA, Canadá (C) Cuba, Itália e França (D) Brasil, Argentina e Venezuela";
        Opcoes[12] = "(A) Petróleo (B) Carvão Mineral (C) Gás Natural (D) Óleo Diesel";
        Opcoes[13] = "(A) Empresário (B) Trabalhador (C) Governo (D) Transnacionais";
        Opcoes[14] = "(A) Concorrência (B) Propriedade Privada (C) Feudalismo (D) Lucro";
        Opcoes[15] = "(A) Conflito Brasil x Paraguai (B) Queda do Muro de Berlin (C) Conflito ideológico (D) Guerra sangrenta";
        Opcoes[16] = "(A) Ásia e África (B) Oceania e América Central (C) América do Sul e África (D) América do Norte";
        Opcoes[17] = "(A) Estágio 1 (B) Estágio 2 (C) Estágio 3 (D) Estágio 4";
        Opcoes[18] = "(A) EUA e União Soviética (B) EUA e Alemanha (C) França e Brasil (D) União Soviética e Itália";
        Opcoes[19] = "(A) 6 blocos (B) 8 blocos (C) 10 blocos (D) 9 blocos";
        
        Opcoes[20] = "(A) Moléculas proteicas envolvidas em água (B) Potes (C) Célula (D) Moléculas de carbono";
        Opcoes[21] = "(A) Possui ribossomos (B) Várias organelas (C) É apenas multicelular (D) Possui núcleo";
        Opcoes[22] = "(A) Conjunto de células (B) Conjunto de reações químicas (C) Mineralização dos ossos (D) Formação de hormônios";
        Opcoes[23] = "(A) Controle de temperatura corporal (B) Não transporta substâncias (C) Hidrólise (D) Solvente";
        Opcoes[24] = "(A) Filtrar o sangue (B) Acelerar os batimentos cardíacos (C) Acelerar reações químicas (D) Perder peso";
        Opcoes[25] = "(A) Temperatura e PH (B) Habitat (C) Colesterol (D) Proteínas e glicose";
        Opcoes[26] = "(A) São longas (B) Porque o produtor não produz matéria orgânica (C) Os animais falecem (D) Pois não varia os níveis tróficos";
        Opcoes[27] = "(A) Formação dos ossos (B) A ter Vitamina B1 (C) Não ajuda em nada (D) Formação de hormônios sexuais e vitamina D";
        Opcoes[28] = "(A) Fêmur (B) Crânio (C) Costelas (D) Esterno";
        Opcoes[29] = "(A) Fungi (B) Monera (C) Plantae (D) Protista";  
        
        return Opcoes[j];
    }
    
    public String Respostas(int g){
            Respostas[0] = "B";
            Respostas[1] = "B";
            Respostas[2] = "D";
            Respostas[3] = "B";
            Respostas[4] = "A";
            Respostas[5] = "A";
            Respostas[6] = "C";
            Respostas[7] = "D";
            Respostas[8] = "B";
            Respostas[9] = "B";
            
            Respostas[10] = "A";
            Respostas[11] = "B";
            Respostas[12] = "B";
            Respostas[13] = "D";
            Respostas[14] = "C";
            Respostas[15] = "C";
            Respostas[16] = "A";
            Respostas[17] = "C";
            Respostas[18] = "A";
            Respostas[19] = "D";
            
            Respostas[20] = "A";
            Respostas[21] = "C";
            Respostas[22] = "B";
            Respostas[23] = "B";
            Respostas[24] = "C";
            Respostas[25] = "A";
            Respostas[26] = "D";
            Respostas[27] = "D";
            Respostas[28] = "A";
            Respostas[29] = "B";

            return Respostas[g];
    }

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String[] getPerguntas() {
        return Perguntas;
    }

    public String[] getRespostas() {
        return Respostas;
    }

    public void setRespostas(String[] Respostas) {
        this.Respostas = Respostas;
    }

    public String[] getOpcoes() {
        return Opcoes;
    }

    public int getPontuacao() {
        return Pontuacao;
    }

    public void setPontuacao(int Pontuacao) {
        this.Pontuacao = Pontuacao;
    }

    public int getTemas() {
        return Temas;
    }

    public void setTemas(int Temas) {
        this.Temas = Temas;
    }

}
