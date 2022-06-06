import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Empregado empregados [] = new Empregado[3];
        Empregado empregado1 = new Empregado("Gustavo", 21);
        empregados [0] = empregado1;
        Empregado empregado2 = new Empregado("Alan", 35);
        empregados [1] = empregado2;
        Empregado empregado3 = new Empregado("Bruno", 18);
        empregados [2] = empregado3;

        List<Empregado> empregadosList = MyOwnLists.asListedSorted(empregados, new Comparator<Empregado>() {
            @Override
            public int compare(Empregado o1, Empregado o2) {
                if (o1.getNome().compareTo(o2.getNome()) > 0){
                    return 1;
                }
                return -1;
            }
        });

        for (Empregado empregado: empregadosList) {
            System.out.println("Nome: " + empregado.getNome());
            System.out.println("Idade: " + empregado.getIdade());
        }
    }
}