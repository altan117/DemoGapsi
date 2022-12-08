# DemoGapsi

Dado que este proyecyo se realizó con maven y spring-boot:

1. Ejecutar el script (SQL) en una base de datos, de preferencia MYSQL (ya que fue diseñada ahí)
2. Importar el projecto maven en el IDE de su preferencia
3. En consola ejecutar 'mvn clean install' o './mvnw clean install' (si se usa windows powershell) para compilar y descargar las dependencias
4. En mi caso lo ejecute con powerShell mediante el comando './mvnw spring-boot:run'
5. Una vez inicializado el componente, abrir postman:
	5.1 Para buscar todos los productos, se debe crear una petición GET con el path 'api/product'
	5.2 Para buscar un producto en específico, se debe crear una petición GET e indicar el ID a buscar en el path: 'api/product/{id}'
	5.3 Para editar un producto, se debe crear una petición PUT y especificar el ID en el path, así como también el objeto a modificar en el body: 'api/prduct/{id}' + (raw/json) 

Ejemplo:
{
    "id":"1259",
    "descripcionProducto": "(PRUEBA DE CAMBIO)",
    "modeloProducto": "SM-PRUEBA",
    "nombreProducto": "PRUEBA",
    "precioProducto": 299.0
}

6. La URL para el swagger que se maneja: http://localhost:8080/swagger-ui.html.

NOTA: Todas las evidencias de ejecución están en la misma carpeta donde se encuentran las instrucciones. Este proyecto se realizó con spring-boot, maven, java y se subió parte del código a https://github.com/altan117/DemoGapsi como funcionalidad GIT
