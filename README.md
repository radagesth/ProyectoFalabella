# Proyecto de Ingreso Falabella // Falabella Income Project
Primer Proyecto Para Falabella. // Falabella Income Project.

## Comenzando // Starting 🚀

Se Crea un proyecto Mavern
Se Asigna las dependencias en el archivo pom.xml
Se va a la centrar de repositorios de Mavnm
Se busca por Rest Assured
https://mvnrepository.com/repos/central
Se selecciona el primer resultado de la busqueda 
https://mvnrepository.com/artifact/io.rest-assured/rest-assured/5.1.0
Se copia la dependencia en la seccion correspondiente en el archivo pom.xml	
	<dependency>
	    <groupId>io.rest-assured</groupId>
	    <artifactId>rest-assured</artifactId>
	    <version>5.1.0</version>
	    <scope>test</scope>
	</dependency>
Al darle al boton guardar en nuestro proyecto se creara una carpeta con un repositorio de librerias mavern

Posteriormente buscamos lo que vendría siendo las librerias de TestNG en el mismo sitio Web.
https://mvnrepository.com/artifact/org.testng/testng
se agrega el apartado para proyectos maven
<dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>rest-assured</artifactId>
      <version>5.1.0</version>
      <scope>test</scope>
</dependency>



se instala el plugin de TestNg en Eclipse








### Pre-requisitos 📋


**librerias:**

```
-Java SE 1.7
-Maven
-testNG 7.6
-RestAssured 5.1
```

### Instalación 🔧

-Abrir Con eclipse en el workspace correspondiente y ejecutar acorde a lo requerido.

-Open With eclipse in the corresponding workspace and execute according to what is required.

## Ejecutando las pruebas ⚙️

Using HTTP Methods for RESTful Services
<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>HTTP Verb</th>
								<th>CRUD</th>
								<th>Entire Collection (e.g. /customers)</th>
								<th>Specific Item (e.g. /customers/{id})</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>POST</td>
								<td>Create</td>
								<td>201 (Created), 'Location' header with link to /customers/{id} containing new ID.</td>
								<td>404 (Not Found), 409 (Conflict) if resource already exists..</td>
							</tr>
							<tr>
								<td>GET</td>
								<td>Read</td>
								<td>200 (OK), list of customers. Use pagination, sorting and filtering to navigate big lists.</td>
								<td>200 (OK), single customer. 404 (Not Found), if ID not found or invalid.</td>
							</tr>
							<tr>
								<td>PUT</td>
								<td>Update/Replace</td>
								<td>405 (Method Not Allowed), unless you want to update/replace every resource in the entire collection.</td>
								<td>200 (OK) or 204 (No Content).  404 (Not Found), if ID not found or invalid.</td>
							</tr>
							<tr>
								<td>PATCH</td>
								<td>Update/Modify</td>
								<td>405 (Method Not Allowed), unless you want to modify the collection itself.</td>
								<td>200 (OK) or 204 (No Content).  404 (Not Found), if ID not found or invalid.</td>
							</tr>
							<tr>
								<td>DELETE</td>
								<td>Delete</td>
								<td>405 (Method Not Allowed), unless you want to delete the whole collection—not often desirable.</td>
								<td>200 (OK).  404 (Not Found), if ID not found or invalid.</td>
							</tr>
						</tbody>
					</table>

### Analice las pruebas end-to-end 🔩
A continuacion se explican los casos de prueba y lo qu se determina a traves de la ejecucion de cada uno de estos.
```
test_1_1_Get()
Se ejecuta la siguiente linea de codigo en donse se solicita la respuesta a la api user entregando el listado de dos paginas de datos :

Response response = RestAssured.get("https://reqres.in/api/users?page=2");

Se obtiene Status Code Status Line Time Header y una vez obtenido el status code se condiciona
acorde al que nosotros indicamos arriba que recibiriamos, una vez obtenida toda la informacion 
se cierra el caso y se termina la ejecucion de este.

/////

The following line of code is executed where the response is requested from the user api, delivering the list of two data pages:

Response response = RestAssured.get("https://reqres.in/api/users?page=2");
Status Code Status Line Time Header is obtained and once the status code is obtained, it is conditioned according to what 
we indicated above that we would receive, once all the information is obtained, the case is closed and its execution is finished.


test_2_Post()

test_3_Put()

test_4_Patch()

test_5_Delete()


```

## Despliegue 📦

_Agrega notas adicionales sobre como hacer deploy_

## Autor ✒️

* **Roderick Roco** - *Trabajo Inicial* - [radagesth](https://github.com/radagesth)

## Licencia 📄

Este proyecto está bajo la Licencia (Tu Licencia) - mira el archivo [LICENSE.md](LICENSE.md) para detalles

---
<center>06-2022</center>
