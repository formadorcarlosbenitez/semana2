# Bases de datos
Una base de datos es cualquier elemento que contenga información, por ejemplo, una libreta de contactos, un excel, etc. Sin embargo, se dice que la información (o los datos) toman un papel fundamental en una empresa o entidad, además, son invaluables.
Debido a la importancia de las bases de datos se constituyeron varias tecnologías que den soporte al almacenamiento de información digital, en este caso, las tecnologias se dividen en dos tipos, bases de datos relacionales y no relacionales.

## Bases de datos relacionales, SQL
Son gestores y administradores de bases de datos relacionales que implementan un lenguaje en común, SQL. SQL permite estructurar y operar bases de datos que se componen de tablas, a su vez, las tablas de las bases de datos se pueden relacionar (A esto se debe el nombre de bases de datos relacionales).

## SQLite
SQLite permite gestionar y realizar transacciones de bases de datos en un archivo local (generalmente con extension .db o .sqlite3). Todas las bases de datos se pueden gestionar mediante consola de comandos,. Sin embargo, al ser una tarea tediosa cuando se trata con muchas tablas, se suelen usar administradores de bases de datos. En el caso de SQLite existen programas como DBeaver, DbVisualizer y [DB Browser For SQLite](https://sqlitebrowser.org/).
</br>
Para el contenido de este curso vamos a usar DB Browser. Ahora, ¿Cómo creamos una base de datos?. Veamos el siguiente tutorial.
&nbsp;

1. En DB Browser dar click en New Database
2. Buscar una carpeta para guardar la base de datos, preferiblemente en la raíz de un proyecto de NetBeans junto a la carpeta src y target
3. Asignar un nombre y extensión a la base de datos

&nbsp;&nbsp;
![creardb](./creardb.PNG)
&nbsp;&nbsp;

Automaticamente aparecera la ventana para crear una tabla.

4. Se asigna un nombre a la tabla (en plural)
5. Al dar click en add, se agrega una nueva columna a la tabla.
6. Asignar nombre de columna (siempre en minuscula), tipo de variables a guardar en la columna, indicar si es obligatorio (check NN), indicar una sola llave primaria (recomendable que sea autoincrementable) y finalmente indicar si ese valor deberia ser unico (check U)

&nbsp;&nbsp;
![creartabla](./creartabla.PNG)
&nbsp;&nbsp;

7. Finalmente, damos click en write changes para guardar los cambios en nuestra base de datos.

&nbsp;&nbsp;
![guardar](./guardarcambios.PNG)

## Conexiones Java - SQLite
Para usar SQLite o cualquier base de datos en Java, es necesario importar dependencias en nuestro proyecto, para ello nos dirigimos al [repositorio de dependencias Maven](https://mvnrepository.com/), ahora buscamos SQLite, damos click al repositorio que concuerde con SQLite JDBC, y seleccionamos una versión (Que sea más actual y tenga más usos), en este caso la versión 3.36.0.3, allí podemos copiar las etiquetas dependency con el fin de pegarlas en el archivo que esta dentro de Project Files (pom.xml). Un ejemplo de un pom con la dependencia seria:

```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.ingcarlos.parqueadero</groupId>
    <artifactId>Parqueadero</artifactId>
    <version>1.0-SNAPSHOT</version>
    <properties>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.source>1.8</maven.compiler.source>
        <maven.compiler.target>1.8</maven.compiler.target>
        <exec.mainClass>com.ingcarlos.parqueadero.Parqueadero</exec.mainClass>
    </properties>
    
    <!-- Creamos una etiqueta dependiencies para guardar lo que queramos importar -->
    <dependencies>
        <dependency>
            <groupId>org.xerial</groupId>
            <artifactId>sqlite-jdbc</artifactId>
            <version>3.36.0.3</version>
        </dependency>
    </dependencies>
    
</project>
```

Ahora, creamos una clase que permita conectar a la base de datos y permita realizar operaciones CRUD (Create, Read, Update y Delete). Empecemos con los atributos de la clase:

- url, indica el tipo de driver (sqlite) y la ubicacion de la base de datos
- conexion, es un objeto que permite conectar con la base de datos haciendo uso de sus métodos
- sentencia, es un objeto que permite ejecutar sentencias de SQL como String para realizar una transacción con la base de datos. Necesita que primero se haya hecho la conexion.
- resultadosConsulta, despues de usar el objeto sentencia, se usa para recuperar los resultados de una consulta en la base de datos.

```
private String url = "jdbc:sqlite:datos.db";
public Connection conexion;
private Statement sentencia;
private ResultSet resultadosConsulta;
```

Ahora revisemos el método constructor (para una clase que en este caso se llama ConexionDB). Siempre que trabajemos con bases de datos existen errores que no se pueden manejar, en estos casos, para responder a un posible error se utiliza el *try catch*, en pocas palabras, se trata de intentar ejecutar un bloque de código, si algo sale mal (por ejemplo, no colocamos bien la url de la base de datos), entonces inmediatamente se ejecuta el catch, donde podemos manejar el error a nuestro antojo (en este caso solo se imprime el error).

```
public ConexionDB() {
    try {
        conexion = DriverManager.getConnection(url);
        DatabaseMetaData meta = conexion.getMetaData();
        System.out.println("Base de datos conectada! \n" + meta.getDriverName());
    } catch (SQLException e) {
        System.err.println(e.getMessage());
    }
}
```
### Cerrar conexion:
Se crea un método para cerrar la conexion. Este método usa el atributo conexion para cerrar el enlace con la base de datos.

```
public void closeConnection() {
    if (conexion != null) {
        try {
           conexion.close(); 
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
```

### CRUD: Create


