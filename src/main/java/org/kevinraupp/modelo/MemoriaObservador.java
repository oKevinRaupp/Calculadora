package org.kevinraupp.modelo;
@FunctionalInterface
public interface MemoriaObservador {
    void valorAlterado(String novoValor);
}
