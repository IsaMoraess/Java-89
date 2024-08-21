/*"Desenvolva um programa em Java chamado ResultadoEscolar que avalie o desempenho
de um aluno com base em sua nota. O programa deve inicializar a variável 'nota' com o valor 6.
Em seguida, o programa deve verificar se a nota é maior ou igual a 7.
Se for, o programa deve imprimir 'Aprovado'. 
Se a nota estiver entre 5 (inclusive) e 7 (exclusive), o programa deve imprimir 'Recuperação'. 
Caso contrário, deve imprimir 'Reprovado'." */
public class App {
    public static void main(String[] args) throws Exception {
        int nota = 6;

        //contole de fluxo encadeado
        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7) //true ou false
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
    }
}