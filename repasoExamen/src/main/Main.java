package main;

import java.util.List;

import ejercicios07.dataset.Dataset;
import ejercicios07.dataset.Empleado;
import ejercicios07.dataset.Pedido;
import ejercicios07.dataset.Producto;

public class Main {

	public static void main(String[] args) {
		
		

	}	
		
	//EJERCICIOS PROGRAMACION FUNCIONAL BASICOS
	
	//EJ 1. Obtener una lista con los nombres de todos los empleados del departamento "IT".
	public static List<String> ejercicio1funcional() {
		
		return Dataset.getEmpleados().stream()
				.filter(e -> e.getDepartamento().equals("IT"))
				.map(e -> e.getNombre())
				.toList();
		
	}
	
	//EJ 2. Obtener una lista con los nombres de todos los productos pasados a mayúsculas.
	public static List<String> ejercicio2funcional() {
		
		return Dataset.getProductos().stream()
				.map(p -> p.getNombre().toUpperCase())
				.toList();
		
	}
	
	//EJ 3. Obtener una lista de las categorías de productos disponibles, sin duplicados.
	public static List<String> ejercicio3funcional() {
		
		return Dataset.getProductos().stream()
				.filter(p -> p.getStock() > 0)
				.map(p -> p.getCategoria())
				.distinct()
				.toList();
		
	}
	
	//EJ 4. Obtener los empleados ordenados por salario de mayor a menor.
	public static List<Empleado> ejercicio4funcional() {
		
		return Dataset.getEmpleados().stream()
				.sorted((e1, e2) -> Double.compare(e2.getSalario(), e1.getSalario()))
				.toList();
		
	}
	
	//EJ 5. Obtener solo los 3 productos más caros de la lista.
	public static List<Producto> ejercicio5funcional() {
		
		return Dataset.getProductos().stream()
				.sorted((p1, p2) -> Double.compare(p2.getPrecio(), p1.getPrecio()))
				.limit(3)
				.toList();
		
	}

	//EJ 6. Omitir los 2 primeros pedidos de la lista y obtener los demás.
	public static List<Pedido> ejercicio6funcional() {
		
		return Dataset.getPedidos().stream()
				.skip(2)
				.toList();
		
	}
	
	//EJ 7. Filtrar los productos que tienen stock mayor a 0 y un precio menor a 50.
	public static List<Producto> ejercicio7funcional() {
		
		return Dataset.getProductos().stream()
				.filter(p -> p.getStock() > 0)
				.filter(p -> p.getPrecio() < 50)
				.toList();
		
	}

	//EJ 8. Obtener una lista con las edades de todos los empleados.
	public static List<Integer> ejercicio8funcional() {
		
		return Dataset.getEmpleados().stream()
				.map(e -> e.getEdad())
				.toList();
		
	}
	
	//EJ 9. Filtrar los empleados del departamento "Ventas" y ordenarlos alfabéticamente por nombre.
	public static List<Empleado> ejercicio9funcional() {
		
		return Dataset.getEmpleados().stream()
				.filter(e -> e.getDepartamento().equals("Ventas"))
				.sorted((e1, e2) -> e1.getNombre().compareTo(e2.getNombre()))
				.toList();
		
	}
	
	//EJ 10. Obtener los nombres de los productos que empiezan por la letra "A".
	public static List<String> ejercicio10funcional() {
		
		return Dataset.getProductos().stream()
				.filter(p -> p.getNombre().startsWith("A"))
				.map(p -> p.getNombre())
				.toList();
		
	}
	
	//EJ 11. Obtener una lista con todos los productos de la categoría "Electrónica".
	public static List<Producto> ejercicio11funcional() {
		
		return Dataset.getProductos().stream()
				.filter(p -> p.getCategoria().equals("Electrónica"))
				.toList();
		
	}

	//EJ 12. Obtener una lista que contenga únicamente los nombres de todos los empleados.
	public static List<String> ejercicio12funcional() {
		
		return Dataset.getEmpleados().stream()
				.map(e -> e.getNombre())
				.toList();
		
	}

	//EJ 13. Obtener una lista con los nombres de los empleados que pertenecen al departamento de "Ventas".
	public static List<String> ejercicio13funcional() {
		
		return Dataset.getEmpleados().stream()
				.filter(e -> e.getDepartamento().equals("Ventas"))
				.map(e -> e.getNombre())
				.toList();
		
	}

	//EJ 14. Obtener una lista con los diferentes estados de los pedidos (sin elementos duplicados).
	public static List<String> ejercicio14funcional() {
		
		return Dataset.getPedidos().stream()
				.map(p -> p.getEstado())
				.distinct()
				.toList();
		
	}

	//EJ 15. Contar cuántos empleados tienen estrictamente más de 30 años.
	public static long ejercicio15funcional() {
		
		return Dataset.getEmpleados().stream()
				.filter(e -> e.getEdad() > 30)
				.count();
		
	}


	
	//EJERCICIOS PROGRAMACION FUNCIONAL INTERMEDIOS
	
	//EJ 16. Contar cuántos pedidos están en estado "PENDIENTE".
	public static long ejercicio16funcional() {
		
		return Dataset.getPedidos().stream()
				.filter(p -> p.getEstado().equals("PENDIENTE"))
				.count();
		
	}
	
	//EJ 17. Comprobar si existe algún producto sin stock (devuelve boolean).
	public static boolean ejercicio17funcional() {
		
		return Dataset.getProductos().stream()
				.anyMatch(p -> p.getStock() == 0);
		
	}

	//EJ 18. Comprobar si todos los empleados ganan más de 1000 (devuelve boolean).
	public static boolean ejercicio18funcional() {
		
		return Dataset.getEmpleados().stream()
				.allMatch(e -> e.getSalario() > 1000);
		
	}
	
	//EJ 19. Comprobar si ningún producto supera los 5000 de precio.
	public static boolean ejercicio19funcional() {
		
		return Dataset.getProductos().stream()
				.noneMatch(p -> p.getPrecio() > 5000);
		
	}
	
	//EJ 20. Obtener una lista de todos los productos ordenados por su precio de menor a mayor.
	public static List<Producto> ejercicio20funcional() {
		
		return Dataset.getProductos().stream()
				.sorted((p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()))
				.toList();
		
	}
	
	//EJ 21. Comprobar si algún producto de la categoría "Alimentación" cuesta menos de 2 euros.
	public static boolean ejercicio21funcional() {
		
		return Dataset.getProductos().stream()
				.filter(p -> p.getCategoria().equals("Alimentación"))
				.anyMatch(p -> p.getPrecio() < 2);
		
	}

	//EJ 22. Comprobar si todos los empleados del departamento "IT" tienen un salario superior a 1000 euros.
	public static boolean ejercicio22funcional() {
		
		return Dataset.getEmpleados().stream()
				.filter(e -> e.getDepartamento().equals("IT"))
				.allMatch(e -> e.getSalario() > 1000);
		
	}

	//EJ 23. Comprobar que ningún producto de la tienda tenga un stock negativo (menor a 0).
	public static boolean ejercicio23funcional() {
		
		return Dataset.getProductos().stream()
				.noneMatch(p -> p.getStock() < 0);
		
	}

	//EJ 24. Obtener una lista con todos los pedidos, omitiendo los 5 primeros de la lista original.
	public static List<Pedido> ejercicio24funcional() {
		
		return Dataset.getPedidos().stream()
				.skip(5)
				.toList();
		
	}


	//EJERCICIOS PROGRAMACION FUNCIONAL AVANZADOS
	
	//EJ 25. Contar cuántos departamentos distintos existen en la empresa basándose en la lista de empleados.
	public static long ejercicio25funcional() {
		
		return Dataset.getEmpleados().stream()
				.map(e -> e.getDepartamento())
				.distinct()
				.count();
		
	}

	//EJ 26. Obtener una lista con los 3 empleados que tienen el salario más alto. (Pista: Ordena y limita).
	public static List<Empleado> ejercicio26funcional() {
		
		return Dataset.getEmpleados().stream()
				.sorted((e1, e2) -> Double.compare(e2.getSalario(), e1.getSalario()))
				.limit(3)
				.toList();
		
	}

	//EJ 27. Obtener los nombres de los 2 productos más baratos, pero ignora el primer producto más barato absoluto de toda la tienda. (Pista: Ordena, salta y limita).
	public static List<String> ejercicio27funcional() {
		
		return Dataset.getProductos().stream()
				.sorted((p1, p2) -> Double.compare(p1.getPrecio(), p2.getPrecio()))
				.map(p -> p.getNombre())
				.skip(1)
				.limit(2)
				.toList();
		
	}
	
	//EJ 28. Obtener una lista con los nombres únicos de los clientes que tienen al menos un pedido en estado "PENDIENTE", ordenados alfabéticamente.
	public static List<String> ejercicio28funcional() {
		
		return Dataset.getPedidos().stream()
				.filter(p -> p.getEstado().equals("PENDIENTE"))
				.map(p -> p.getCliente())
				.distinct()
				.sorted((p1, p2) -> p1.compareTo(p2))
				.toList();
		
	}

	//EJ 29. Obtener una lista que contenga únicamente el nombre del producto más caro que empieza por la letra "A".
	public static List<String> ejercicio29funcional() {
		
		return Dataset.getProductos().stream()
				.filter(p -> p.getNombre().startsWith("A"))
				.sorted((p1, p2) -> Double.compare(p2.getPrecio(), p1.getPrecio()))
				.limit(1)
				.map(p -> p.getNombre())
				.toList();
				
	}

	
}
