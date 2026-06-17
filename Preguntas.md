1. ¿Qué problema busca solucionar el patrón Singleton?
El patrón Singleton busca evitar que se creen varias instancias de una misma clase cuando solo se necesita una. Así se controla mejor el uso de los recursos.

2. ¿Por qué es importante garantizar que una clase tenga una única instancia en determinados escenarios?
Porque algunas clases manejan información o procesos que deben ser compartidos por toda la aplicación. Tener una sola instancia evita inconsistencias y ahorra memoria.

3. ¿Qué características identifican a una clase implementada mediante el patrón Singleton?
Tiene una única instancia, no permite crear objetos libremente desde otras clases y ofrece un método para acceder a esa instancia compartida.

4. ¿Cuál es la diferencia entre crear múltiples instancias de una clase y utilizar una única instancia compartida?
Cuando se crean múltiples instancias, cada objeto tiene sus propios datos. En cambio, con una única instancia compartida, todas las clases trabajan con el mismo objeto y la misma información.

5. ¿Cómo implementa Spring Boot el comportamiento del patrón Singleton en sus Beans?
Spring Boot crea una sola instancia de cada Bean por defecto y la comparte en toda la aplicación cuando es necesaria.

6. ¿Qué ventajas ofrece utilizar Beans Singleton administrados por Spring Boot frente a implementar el patrón manualmente en Java?
Spring Boot lo hace de forma automática, por lo que se necesita menos código y es más fácil de mantener. Además, Spring se encarga de gestionar las instancias.

7. ¿En qué situaciones considera que el uso del patrón Singleton puede ser una buena alternativa dentro de una aplicación de software?
Es una buena opción cuando se necesita compartir información o recursos en toda la aplicación, por ejemplo en servicios de configuración, registros de estadísticas o conexiones que deben ser únicas.
