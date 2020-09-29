package Lista;


public class Lista {
	private Aluno topo, anterior;
	
//	Adiciona Aluno na Lista
	public void adiciona(Aluno aluno) { 
        if (anterior  == null) {
        	anterior  = aluno;
        	topo = aluno;
        } else {
            topo = aluno;
            topo.setAnterior(anterior);
        }
    }
	
//	Remove Aluno da Lista
	public void remove() {		
        if (topo == null) {
        	System.out.println("Não foi possível remover, a lista está vazia!");
        } else {
        topo = topo.getAnterior();
        anterior = topo;
        System.out.println(topo+"\nAluno foi removido");
        }
    }

    public Aluno top() {
        return topo;
    }

//	Mostra os elementos da Lista
    public void mostra() {
    	Aluno aux = topo;
    	if (aux == null) {
    		System.out.println("Lista esta vazia!");
    	} else {
    		while (aux != null) {
            System.out.println(aux.toString());
            aux = aux.getAnterior();
        	} 
    	}
    }
}
