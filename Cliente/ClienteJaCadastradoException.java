package Cliente;

public class ClienteJaCadastradoException extends Exception {
	private Cliente cliente;
	public ClienteJaCadastradoException (Cliente cliente) {
		super ("O cliente " + cliente.getCPF() + " j� foi cadastrado no sistema.");
		this.cliente = cliente;
	}
}
