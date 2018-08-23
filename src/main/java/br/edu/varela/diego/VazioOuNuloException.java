package br.edu.varela.diego;

class VazioOuNuloException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Nao pode ser nulo ou vazio";
    }
    
}
