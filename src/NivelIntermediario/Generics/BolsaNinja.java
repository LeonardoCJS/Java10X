package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
    // Inicializar nosso Array
    private List<T> itens;

    public BolsaNinja() {
        this.itens = new ArrayList<>();
    }

    public List<T> getItens() {
        return itens;
    }

    public void setItens(List<T> itens) {
        this.itens = itens;
    }

    // Colocar itens no nosso Array
    public void adicionarItem(T item){
        itens.add(item);
    }
    
    // Mostrar a nossa lista de itens
    public void mostrarItens(){
        for (T item : itens) {
            System.out.println(item);
        }
    }
}
