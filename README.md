# DESIGN-PATTERNS

PATRONES DE DISEÑO CREACIONALES

Los patrones de diseño creacional proporcionan diversos mecanismos de creación de objetos, que aumentan la flexibilidad 
y la reutilización del código existente.


-> Factory Method
Factory Method es un patrón de diseño creativo que proporciona una interfaz para crear objetos en una superclase,
pero permite que las subclases alteren el tipo de objetos que se crearán.

------------------------------------------------------------------------------------------------------------------------

-> Abstract Factory
Abstract Factory es un patrón de diseño creativo que le permite producir familias de objetos relacionados sin
especificar sus clases concretas.

------------------------------------------------------------------------------------------------------------------------

-> Builder
Builder es un patrón de diseño creativo que le permite construir objetos complejos paso a paso. El patrón le permite
producir diferentes tipos y representaciones de un objeto utilizando el mismo código de construcción.

------------------------------------------------------------------------------------------------------------------------

-> Prototype
Prototype es un patrón de diseño creativo que le permite copiar objetos existentes sin que su código dependa
de sus clases.

------------------------------------------------------------------------------------------------------------------------

-> Singleton
Singleton es un patrón de diseño creativo que le permite asegurarse de que una clase tenga solo una instancia, al tiempo
que proporciona un punto de acceso global a esta instancia.

------------------------------------------------------------------------------------------------------------------------

PATRONES DE DISEÑO ESTRUCTURALES

Los patrones estructurales explican cómo ensamblar objetos y clases en estructuras más grandes, a la vez que mantienen
estas estructuras flexibles y eficientes.

-> Adapter
El adaptador es un patrón de diseño estructural que permite que los objetos con interfaces incompatibles colaboren.

------------------------------------------------------------------------------------------------------------------------

-> Bridge
Bridge es un patrón de diseño estructural que le permite dividir una clase grande o un conjunto de clases estrechamente
relacionadas en dos jerarquías separadas (abstracción e implementación) que se pueden desarrollar de manera
independiente una de otra.

------------------------------------------------------------------------------------------------------------------------

-> Composite
El compuesto es un patrón de diseño estructural que le permite componer objetos en estructuras de árbol y luego trabajar
con estas estructuras como si fueran objetos individuales.

------------------------------------------------------------------------------------------------------------------------

-> Decorator
Decorator es un patrón de diseño estructural que le permite adjuntar nuevos comportamientos a los objetos al colocar
estos objetos dentro de objetos envoltorios especiales que contienen los comportamientos.

------------------------------------------------------------------------------------------------------------------------

-> Facade
Facade es un patrón de diseño estructural que proporciona una interfaz simplificada para una biblioteca, un marco o
cualquier otro conjunto complejo de clases.

------------------------------------------------------------------------------------------------------------------------

-> Flyweight
Flyweight es un patrón de diseño estructural que le permite ajustar más objetos en la cantidad disponible de RAM
al compartir partes comunes de estado entre múltiples objetos en lugar de mantener todos los datos en cada objeto.

------------------------------------------------------------------------------------------------------------------------

-> Proxy
Proxy es un patrón de diseño estructural que le permite proporcionar un sustituto o marcador de posición para otro
objeto. Un proxy controla el acceso al objeto original, lo que le permite realizar algo antes o después de que la
solicitud llegue al objeto original.

------------------------------------------------------------------------------------------------------------------------

PATRONES DE COMPORTAMIENTO

Los patrones de diseño de comportamiento están relacionados con los algoritmos y la asignación de responsabilidades
entre objetos.

-> Chain of Responsability
La Cadena de responsabilidad es un patrón de diseño de comportamiento que le permite pasar solicitudes a lo largo de una
cadena de manejadores.
Al recibir una solicitud, cada controlador decide procesar la solicitud o pasarla al siguiente controlador de la cadena.

------------------------------------------------------------------------------------------------------------------------

-> Command
Command es un patrón de diseño de comportamiento que convierte una solicitud en un objeto independiente que contiene
toda la información sobre la solicitud. Esta transformación le permite parametrizar métodos con diferentes solicitudes,
retrasar o poner en cola la ejecución de una solicitud y admitir operaciones que se pueden deshacer. 

------------------------------------------------------------------------------------------------------------------------

-> Iterator
Iterator es un patrón de diseño de comportamiento que le permite recorrer elementos de una colección sin exponer su
representación subyacente (lista, pila, árbol, etc.).

------------------------------------------------------------------------------------------------------------------------

-> Mediator
Mediator es un patrón de diseño de comportamiento que le permite reducir las dependencias caóticas entre los objetos.
El patrón restringe las comunicaciones directas entre los objetos y los obliga a colaborar solo a través de un
objeto mediador.

------------------------------------------------------------------------------------------------------------------------

-> Memento
Memento es un patrón de diseño de comportamiento que le permite guardar y restaurar el estado anterior de un objeto 
sin revelar los detalles de su implementación.

------------------------------------------------------------------------------------------------------------------------

-> Observer
Observer es un patrón de diseño de comportamiento que le permite definir un mecanismo de suscripción para notificar a
varios objetos sobre los eventos que suceden en el objeto que están observando.

------------------------------------------------------------------------------------------------------------------------

-> State
State es un patrón de diseño de comportamiento que permite a un objeto alterar su comportamiento cuando cambia su
estado interno. Aparece como si el objeto cambiara su clase.

------------------------------------------------------------------------------------------------------------------------

-> Strategy
Strategy es un patrón de diseño de comportamiento que le permite definir una familia de algoritmos, colocar cada uno de
ellos en una clase separada y hacer que sus objetos sean intercambiables. 

------------------------------------------------------------------------------------------------------------------------

-> Template Method
Template Method es un patrón de diseño de comportamiento que define el esqueleto de un algoritmo en la superclase,
pero permite que las subclases anulen pasos específicos del algoritmo sin cambiar su estructura.

------------------------------------------------------------------------------------------------------------------------

-> Visitor
Visitor es un patrón de diseño de comportamiento que le permite separar algoritmos de los objetos en los que operan.
           
------------------------------------------------------------------------------------------------------------------------






