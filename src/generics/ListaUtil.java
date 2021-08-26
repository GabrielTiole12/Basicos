package generics;

import java.util.List;

import lambdas.T;

public class ListaUtil {

	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size()- 1);
	}
	
	@SuppressWarnings("hiding")
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1);
	}
}
