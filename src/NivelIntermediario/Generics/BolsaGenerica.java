package NivelIntermediario.Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> equipamentos;


    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>();
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    // Colocar equipamentos Genericos
    public void adcionarEquipamentos(T equipamento){
        equipamentos.add(equipamento);

    }

    @Override
    public String toString(){
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}
