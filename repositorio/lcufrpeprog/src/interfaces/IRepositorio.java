/*---------------------------------------------
 * Autor: Jonathan Moura
 * Data:30/04/2018
 *---------------------------------------------
 * Descri��o: Interface dos Repositorios
 * 
 *---------------------------------------------
 * Hist�rico de modifica��o
 * Data    Autor    Descri��o
 *       |        |
 *-------------------------------------------*/
package interfaces;
import negocio.Objetos;
public interface IRepositorio {
	public void inserir(Objetos objeto,String identificador);
//	public boolean existe(String identificador);
	public Object procurar(String identificador);
	public void remover(String identificador);
	public void atualizar(Objetos objeto,String identificador);
}
