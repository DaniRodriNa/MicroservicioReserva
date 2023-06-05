# MicroservicioReserva
## Resumen
Microservicio Reserva que recoge los datos del cliente y las claves principales del vuelo y el hotel para realizar una reserva. 
## Estructura
### Paquetes
* com.curso.inicio
  - Clase **Application.java**
* com.curso.model
  - Clase **Reserva.java**
    - idReserva: numero entero, identificador de la reserva
    - nombreCliente: cadena de caracteres, nombre del cliente que realiza la reserva
    - dni: cadena de caracteres, dni del cliente que realiza la reserva
    - idHotel: numero entero, identificador del hotel
    - idVuelo: numero entero, identificador del vuelo
  - Clase **ReservaConPlazas.java**
    - idReserva: numero entero, identificador de la reserva
    - nombreCliente: cadena de caracteres, nombre del cliente que realiza la reserva
    - dni: cadena de caracteres, dni del cliente que realiza la reserva
    - idHotel: numero entero, identificador del hotel
    - idVuelo: numero entero, identificador del vuelo
    - plazas: numero entero, cantidad de plazas que solicita el cliente
  - Clase **Hotel.java**
  - Clase **Vuelo.java**
    - idVuelo: numero entero, identificador del vuelo
    - compania: nombre de la compañia
    - plazas: numero entero, plazas disponibles del vuelo
    - fechaVuelo: varible datetime que devuelve la fecha del vuelo
    - precio: numero con decimales, precio del vuelo
* com.curso.dao
  - Clase **ReservasDao.java**
* com.curso.service
  - Interfaz **ReservasService.java**
  - Clase **ReservasServiceImpl.java** (Implementa la interfaz **ReseevasService.java**)
* com.curso.controller
  - Clase **ReservasController.java**
  
  > GET: Recojo la lista de las reservas
  
  > POST: Creo una reserva

### Metodos
* listaReservas() -> Lista de reservas almacenados
* realizarReserva() -> Realiza una reserva 
## Autor
* Daniel Rodriguez
## Estado
Mejorando
