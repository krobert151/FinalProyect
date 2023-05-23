<h1>BichoPedia </h1>

Bichopedia es un sitio en el que la gente interesada en los encuentros con las especies de la natura puedan compartir sus encuentros e información sobre estos fantasticos seres.

<h2>Uso</h2>
En el programa sin iniciar sesión podermos "bichearlo" y ver los encuentros que han realizado los usuarios y las especies que puedes resgitrar, e incluso registrar una especie si no está y nos la encontramos, para poder acceder a tu perfil y poder hacer registros primero deberás iniciar sesión, para ello se atorgan las siguientes credenciales.

Usuario común:

  username: user
  password: 1234

Usuario administrador:

  username: admin
  password: admin
  
 Si iniciamos sesión como usuario vamos a poder registrar encuentro y darle valoraciones a los encuentros de los demás, y si inicamos sesión como administrador vamos a poder gestionar literalmente todas las entidades del programa.

<h3>Versión 0.1</h3>
En esta primera versión de BichoPedia se va a poder ver y buscar las especies dependiendo de su nivel taxonómico superior, por ejemplo puede buscar todos los generos de la familia Lycosa mediante un click en la familia de Lycosa, también se va a poder iniciar sesión tanto como <strong>Usuario</strong> o como <strong>Admin</strong> con las diferencias de que iniciando sesión como administrador en el menú que aparece en grán parte del sitio se nos desbloqueará una lista desplegable en la que vamos a poder acceder a distintas páginas de gestión de entidades para la aplicación en estas entidades se listan todos datos que se encuentran en el y podemos filtrarlos por orden de id, nombre científico, nombre común, y el nombre de su padre(entidad taxonómica superior a la que pertenece), todas ellas de forma ascendente, estas clases gestión también nos va a permitir hacer los principales metodos cruds como editar agregar o borrar, anuqe no se va a poder borrar una entidad si hay otras que dependen de ella , en ese caso nos devolverá un whitlabel error que se corregirá en la siguiente versión.
  
 
<h3>Version 0.2</h3> 
En esta segunda versión el sitio web ya está algo más complejo, se han añadido funciones nuevas como un sistema de valoración, un diseño más intuitivo para usuarios nuevos, un formulario para poder registrar los encuentros con las especies, y una página en la que se da información al usuario de lo que hacemos y a lo que nos dedicamos, se han pasado ciertas pruebas antes de subirse a modo de introducir todo tipo de datos, todos los formularios están validados por boostrap5 por lo cual los imput que contengan un required deben completarse antes de enviar los datos, el único formulario que está validado totalmente con javaScript es el más importantes y el que le da sentido a todo el programa, que es el de registrar un encuentro, está validado de forma en que no puedas encontrar una especie en una fecha posterior a hoy, que el tamaño y peso de la especie no sea inferior a 0 y que se seleccione una especie y no el valor por defecto que aparece en el select, por último también se valora la url de la foto que le introduciomos al encuentro de forma en que siga un patrón de ruta de imagen para que no de errores la imagen, lo único que da errores es a la hora de encontrar una especie nueva que se seleccione en el select un campo que no sea ela especie .
