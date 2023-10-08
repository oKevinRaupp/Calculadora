package org.kevinraupp.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
    private static final Memoria instancia = new Memoria();
    private String textoAtual = "";
    private final List<MemoriaObservador> observadores = new ArrayList<>();
    public Memoria(){

    }
    public static Memoria getInstancia() {
        return instancia;
    }

    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }

    public void adicionarObservador(MemoriaObservador o){
        observadores.add(o);
    }

    public void processaroComando(String valor){
        if("AC".equalsIgnoreCase(valor)){
            textoAtual = "";
        } else {

            textoAtual += valor;
        }
        observadores.forEach(o -> o.valorAlterado(getTextoAtual()));

    }
}
