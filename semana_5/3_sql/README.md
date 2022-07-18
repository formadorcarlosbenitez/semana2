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