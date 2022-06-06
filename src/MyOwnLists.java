
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyOwnLists <T>{

    public static <T> List<T> asListedSorted(T valores[], Comparator<T> comparator){

        List<T> listaRetorno = new ArrayList<>();

        for (int i = 0; i < valores.length; i++) {
            listaRetorno.add(valores[i]);
        }
        Collections.sort(listaRetorno,comparator);
        return listaRetorno;
    }

}
