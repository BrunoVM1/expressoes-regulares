public class ExpressaoRegular {
    public String LETRA = "[A-Za-z]";
    public String LETRAS = LETRA + "*";
    public String BRANCO = "\\s";
    public String BRANCOS = BRANCO + "*";
    public String NOME = "("+LETRAS+"|"+BRANCOS+")*";

    public void confere(String exp, String sentenca){
        if(sentenca.matches(exp)){
            System.out.println("W:'" + sentenca + " ACEITA");
        } else {
            System.err.println("W:'" + sentenca + " REJEITADA");
        }
    }
}
