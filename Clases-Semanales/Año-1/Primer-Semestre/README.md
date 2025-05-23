## CLASE 1 MIÉRCOLES 27 DE MARZO DEL 2024

## Lo que vimos en la clase anterior:

<sub>Abrimos la terminal de Git Bash en Windows o la terminal de Ubuntu, también la terminal de Mac, y comenzamos con los siguientes comandos y creación de directorios:</sub>

```bash
pwd  # Vemos la ruta de la carpeta en la que estamos

cd  # Es para navegar a una carpeta: change directory -> cambiar de directorio
cd /  # Nos lleva al home, en la raíz del disco
ls  # Esto es listar los archivos, nos muestra todos los archivos en la raíz
ls -al  # El espacio -al significa que es un argumento especial para ver archivos ocultos
ls -l  # Muestra casi todos los archivos sin los que están ocultos
ls -a  # Muestra el grupo de archivos pero no en una lista
clear  # Limpia la consola o ctrl + l
cd ..  # Nos devuelve a la carpeta anterior
cd U + tab  # Esto se usa para un autocompletado o para buscar una referencia
cd /D  # Cambiamos de disco en Windows
df -h  # Muestra todos los directorios en Ubuntu
cd /mnt/d  # Cambia de directorio usando WSL Ubuntu en Windows
```

## AHORA COMENZAMOS CON LA CREACIÓN DE CARPETAS

```sh
cd ..
cd ..
cd /mnt/c
cd ~  # Vamos a la raíz
mkdir Tecnicatura  # Recordar que en Windows las mayúsculas no tienen relevancia, pero sí en Linux
cd tecnicatura
mkdir Python
mkdir Java
mkdir JavaScript
```

<sub> Revisar y ejecutar cada comando, hacerlo como práctica. </sub>

<sub> Profesor Ariel Betancud </sub>

## CLASE 2 MIÉRCOLES 3 DE ABRIL DEL 2024

<sub>Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador</sub>

```sh

touch vacio.txt #Crea un archivo con su extención: ESCRIBIR DENTRO

ctrl + s #Guardamos lo que escribimos en el archivo

./ #Significa la carpeta actual

../ #Significa la carpeta anterior

cat vacio.txt #Vemos el contenido del archivo

history #Veremos la historia completa de los comandos que hemos utilizado

!72 + enter #Veremos el comando que utilizamos en ese número

rm vacio.txt #Borra el archivo seleccionado, ¡¡¡¡CUIDADO!!!!

rm --help #Muestra como funciona el comando
```

# CREAR UN REPOSITORIO DE GIT Y HAZ TU PRIMER COMMIT

```sh
cd tecnicatura

mkdir class-git

cd class-git #Entramos en la carpeta que necesitamos trabajar

git init #Creamos un repositorio en la carpeta central, se crea el archivo .git

code . #Abrimos VSC, el punto hace que se abra el archivo en el que estamos situados

ctrl + n #Creamos un archivo nuevo y escribimos en el, como lo hicimos antes

ctrl + s #Guardamos poniendo el nombre: historia.txt

git status #Vemos el estado del proyecto en tiempo real, esta en el área de trabajo

git add historia.txt #Enviamos el archivo al área de preparación

git status #Para ver el estado de cambios

git rm --cached historia.txt #Quitamos el archivo del área de preparación, cached significa que esta en memoria ram

git config #Tedremos la lista de como funciona la configuración

git config --list #Configuraciones por defecto, faltan cosas importantes

git config --list --show-origin #Veremos donde están las configuraciones guardadas

git config --global user.name "Ariel Betancud"

git config --global user.email "betancudariel@gmail.com" #El correo debe ser el mismo que usaremos en GitHub

git config --list #Ahora veremos que ya están todos los datos completos

git add . #Ingresamos todos los archivos al área de preparación (ram)

git commit -m "Mensaje importante del commit" #El primer commit esta hecho

code . #Hacemos cambios en el archivo y guardamos

git status #Hay cambios para commitear

git add .

git commit -m "Mi segundo commit"

git log historia.txt #Vemos toda la historia de este archivo, el número largo es el hash del commit
```

<sub>Revisar y ejecutar cada comando, hacerlo como practica</sub>

<sub>Profesor Ariel Betancud</sub>

## CLASE 3 MIÉRCOLES 10 DE ABRIL DEL 2024

<sub>Analizar cambios en los archivos de tu proyecto Git parte 3</sub>

<sub>Ingresamos de la siguiente manera:</sub>

<sub>Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.</sub>

```sh
cd tecnicatura #Ingresamos al direcotorio donde están nuestras carpetas de trabajo

ls #Vemos los archivos y directorios que ya tenemos

cd git #No hay nada

cd .. #Salimos

rm historia.txt #Eliminamos el archivo que habíamos hecho, esto en git bash (window) esto es para practica

rm Git #rm: cannot remove 'Git': Is a directory

rm --recursive -R Git #By default, rm does not remove directories.  Use the --recursive (-r or -R) arguments

option to remove each listed directory, too, along with all of its contents. Esto es para practica

rm --help #Nos muestra lo que les puse arriba como documentación en Inglés.

mkdir class-git #Creamos la carpeta o directorio para trabajar en Git local por ahora.

cd class-git #Entramos para crear el README.md para este sector.

touch README.md #Vamos a crear un archivo nuevo, md significa markdown y se pueden trabajar con editores de texto, este es un lenguaje que transforma el texto a html.
```

<sub> Enlace a la documentación en GitHub de MARKDOWN
Leemos la documentación para ir creando en README.md como lo enseña GitHub.</sub>

```sh
code . #Abrimos VSC para editar el archivo.
```

**_Empezamos a cargar lo visto en las clases anteriores (Comandos) en el README y pasamos a commitear_**

```sh
git status
git add .
git status
git commit -m "Cargamos el README dentro del directorio class-git"
git status
git log #Para ver los dos commits hechos: Si tienes commiteada alguna clase anterior veras mas commits de los que yo tengo.
cd ..
cd ..
```

<sub>Revisar y ejecutar cada comando, hacerlo como practica</sub>

<sub>Profesor Ariel Betancud</sub>

## CLASE 4 MIÉRCOLES 17 DE ABRIL DEL 2024

<sub>Analizar cambios en los archivos de tu proyecto Git parte 4</sub>

<sub>Ingresamos de la siguiente manera:</sub>

<sub>Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.</sub>

> TAREA -> AGREGAR LOS COMENTARIOS EN LOS COMANDOS, PARA SABER QUE PASA CON CADA UNO.</sub>

```sh
cd tecnicatura # Cambiamos al directorio 'tecnicatura'
cd class-git # Cambiamos al subdirectorio 'class-git'
ls # Listamos los archivos y directorios en 'class-git'
touch historia.txt # Creamos un archivo vacío llamado 'historia.txt'
code . # Abrimos el editor de código (Visual Studio Code) en el directorio actual
ctrl + s # Guardamos el archivo en Visual Studio Code
git status # Verificamos el estado del repositorio, viendo qué archivos han cambiado
git add . # Añadimos todos los archivos cambiados al área de preparación
git status # Verificamos nuevamente el estado del repositorio, viendo los archivos que están en el área de preparación
git commit #Sin agregar -m veremos que pasa
#Agregar mensaje y salir con
Esc # Presionamos Escape para salir del modo de inserción en vim (si estamos usando vim)
:wq! + enter # Guardamos y salimos en vim (si estamos en git bash en Windows)
Esc + shift + z + z # Salimos del editor en vim (en algunas terminales de Linux)
ctrl + s # Guardamos el archivo en Visual Studio Code
git add . # Añadimos todos los archivos cambiados al área de preparación
git commit # Realizamos un nuevo commit (sin -m se abrirá el editor para escribir el mensaje del commit)
Esc + i #Para comenzar a escribir mensaje del commit, no suele ser necesario
ctrl + x #Para salir en linux
s + enter #Para decir si al cambio y aceptar el nombre, ósea no cambiamos el nombre, la (s) es de si y la (y) es de yes, no olvidar enter en linux
git show #Vemos todos los cambios en el último commit
git log historia.txt #Vemos todos los commit
q # Para salir de la vista de diferencias

#Copiamos un hash mas antoguo y otro reciente, ingresamos el siguiente comando
git diff hash_commit_numerico hash_commit_numerico #Comparamos diferentes commits y sus cambios, poner la versión mas vieja primero, luego la mas nueva
q #Para salir
cd .. # Subimos un nivel en el directorio
cd .. # Subimos un nivel en el directorio
```

## CLASE 5 MIÉRCOLES 24 DE ABRIL DEL 2024

<sub>Volver en el tiempo en nuestro repositorio utilizando reset y checkout parte 6</sub>

<sub>Ingresamos de la siguiente manera:

Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.</sub>

> TAREA -> AGREGAR LOS COMENTARIOS EN LOS COMANDOS, PARA SABER QUE PASA CON CADA UNO.

```sh
cd tecnicatura
cd class-git
ls
code .
git log #Vemos los commit hechos hasta ahora
Copiar el hash #El número largo que tiene el commit
git reset hash-nombre-commit #Este nos permite volver a una versión anterior, hay 2 tipos de reset: el duro y el suave
git status
git add .
git commit -m "Agregamos datos"
git config --list #Veremos la configuración que ya hemos hecho con en nombre y email
git reset hash-nombre-commit --hard #Es el duro, todo vuelve a su estado anterior, es el más usado, desaparece todo
git reset hash-nombre-commit --soft #Este es el suave, lo que tengamos en staging segirá allí
crear un archivo #portafolio.html introducir el código y
touch portafolio.html
html : 5 #Con esto se carga el código básico de html y modificamos
ctrl + s #Guardamos
Clic derecho en VSC Open with Live Server para ver en el navegador
git status
ls
ls -al
git add .
git status
git commit -m "Agregamos el html para nuestro portafolio"
creamos CSS #Este es un archivo de estilos, para esto creamos una nueva carpeta llamada css
mkdir css
ls
cd css
touch style.css #creamos un archivo dentro: estilos.css le cargamos el código.
ctrl + s #abrimos en el navegador y todo esta allí, pero todo esto supuestamente en git no existe.
git status #tenemos cosas en el área de trabajo, en staging distintas
git diff + enter #y nos muestra los cambios en memoria ram y en disco
git add . #Agregamos todo al staging
git status #Ya esta todo en memoria ram, a git solo le importan los archivos, guarda las carpetas como rutas y automaticamente las crea
git commit -m "Creamos el css para darle algo de estilo a nuestro portafolio"
git log #vemos lo nuevo que hemos hecho sin lo que borramos con el reset fuerte
hacer cambios en historia.txt #Cambiamos la última línea y
ctrl + s
git diff
git commit -am "cambio en la última línea del historia.txt"
git log
q  #Esto para salir
git log --stat #veremos los cambios especificos que hicimos en cuales archivos por medio del commit y veremos los cambios en bits
q #salimos de la línea de commits, ahora queremos ver como era originalmente el archivo, osea la primera versión, copiamos el nombre del primer commit
git checkout hash-nombre-commit historia.txt #Veremos el archivo en su estado original
git status #Nos sugiere hacer un commit, si lo hacemos borramos todo lo que hicimos antes, debemos seguir con el siguiente commando
git checkout master historia.txt #Volvemos a la versión master del archivo historia.txt, esto es muy peligroso
git checkout hash-nombre-commit historia.txt #Volvemos a hacer esto y cambiamos cosas del archivo
git commit -am "Reemplazo de una versión por otra de la historia"
git log #Veremos los cambios sin tocar ningun otro archivo, esta es la forma de volver a una versión hacía atrás y llevarla a la cabeza de la master
cd ..
cd ..
```

## CLASE 6 MIÉRCOLES 8 DE MAYO DEL 2024

<sub>Git reset vs. Git rm parte 7</sub>

> Los comandos git reset y git rm tienen utilidades muy diferentes, pero pueden confundirse fácilmente.

<sub>GIT RESET</sub>

<sub>El comando git reset es una herramienta poderosa que te permite deshacer o revertir cambios en tu repositorio de Git. Lo puedes ejecutar de tres maneras diferentes, con las líneas de commando --soft, --mixed y --hard.</sub>

<sub>Pero como git checkout que nos deja ir, mirar, pasear y volver. Con git reset volvemos al pasado sin la posibilidad de volver al futuro. Borramos la historia y la debemos sobreescribir. No hay vuelta atrás.</sub>

<sub>Tres árboles en Git Para entender lo anterior, recordemos que los “tres árboles” de Git son estructuras de datos basadas en nodos y punteros que Git utiliza para hacer seguimiento a un cronograma de ediciones, aunque no sean estructuras en forma de árbol en el sentido tradicional.</sub>

<sub>La mejor forma de entender estos mecanismos es creando un conjunto de cambios en un repositorio y siguiéndolos a través de los tres árboles. Averigüémoslo.</sub>

<sub>Ingresamos de la siguiente manera:</sub>

<sub>Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.</sub>

> TAREA -> AGREGAR LOS COMENTARIOS EN LOS COMANDOS, PARA SABER QUE PASA CON CADA UNO.

```sh
mkdir git_reset_test #Vamos a hacer pruebas, es por esto que creamos una carpeta nueva
cd git_reset_test #Entramos en la carpeta
git init #Inicializamos el repositorio
touch reset_file.txt
git add reset_file.txt
git commit -m"Iniciando el primer commit"
```

<sub>
¿Cómo funciona Git Reset en tu flujo de trabajo?

Git reset permite moverte entre diferentes commits para deshacer o rehacer cambios. Git guarda todo lo nuevo del repositorio como commits, que son instantáneas del estado del código en un momento dado y existen variaciones de este comando.

Variaciones de Git Reset </sub>

```sh
git reset --soft: Borra el historial y los registros de Git de commits anteriores, pero guarda los cambios en Staging para aplicar las últimas actualizaciones a un nuevo commit.

git reset --hard: Deshace todo, absolutamente todo. Toda la información de los commits y del área de staging se elimina del historial.

git reset --mixed: Borra todo, exactamente todo. Toda la información de los commits y del área de staging se elimina del historial.
```

<sub>
git reset HEAD: El comando git reset saca archivos del área de staging sin borrarlos ni realizar otras acciones. Esto impide que los últimos cambios en estos archivos se envíen al último commit. Podemos incluirlos de nuevo en staging con git add si cambiamos de opinión. Ten en cuenta que, si deshaces commits en un repositorio compartido en GitHub, estarás cambiando su historia y esto puede causar problemas de sincronización con otros colaboradores.

¿Qué es git reset HEAD?

git reset HEAD es un comando que te permite revertir los cambios que ya habías preparado para subir, y moverlos de vuelta a tu proyecto. Con este comando puedes cancelar los cambios que ya habías agregado, para que puedas revisarlos, modificarlos o deshacerlos antes de confirmarlos con un commit.

git rm Por otro lado, es un comando que nos ayuda a eliminar archivos de Git sin eliminar su historial del sistema de versiones. Para recuperar el archivo eliminado, necesitamos retroceder en la historia del proyecto, recuperar el último commit y obtener la última confirmación antes de la eliminación del archivo.

Es importante tener en cuenta que git rm no puede usarse sin evaluarlo antes. Debemos usar uno de los flags siguientes para indicarle a Git cómo eliminar los archivos que ya no necesitamos en la última versión del proyecto.

Variaciones de Git rm</sub>

```sh
git rm --cached: Elimina archivos del repositorio local y del área de staging, pero los mantiene en el disco duro. Deja de trackear el historial de cambios de estos archivos, por lo que quedan en estado untracked, que significa: que un archivo no está siendo rastreado por Git

git rm --force: Elimina los archivos de Git y del disco duro. Git guarda todo, por lo que podemos recuperar archivos eliminados si es necesario (empleando comandos avanzados). ¡Al usar git rm lo que haremos será eliminar este archivo completamente de git!
```

<sub>
¿Cuál es la diferencia entre git rm y git reset Head?

La diferencia principal entre git rm y git reset HEAD radica en que git rm elimina archivos del repositorio y de la historia del proyecto, mientras que git reset saca los cambios del área de preparación y los mueve del espacio de trabajo, sin afectar la historia del repositorio.

Es importante tener en cuenta el efecto que cada comando tiene en el proyecto y usarlos según tus necesidades y objetivos específicos.

¿Cuándo utilizar git reset en lugar de git revert?

Para reescribir la historia del repositorio y eliminar confirmaciones anteriores, se utiliza git reset. Para deshacer cambios de confirmaciones anteriores de forma segura sin modificar la historia del repositorio, se emplea git revert.

Resumen Para evitar problemas en el trabajo, es valioso entender las implicaciones y riesgos de cada comando y elegir el enfoque adecuado según las necesidades y el flujo de trabajo del proyecto.

Con git rm eliminamos un archivo de Git, pero mantenemos su historial de cambios. Si no queremos borrar un archivo, sino dejarlo como está y actualizarlo después, no debemos usar este comando en este commit.

Empleando git reset HEAD, movemos los cambios de Staging a Unstaged, pero mantenemos el archivo en el repositorio con los últimos cambios en los que hicimos commit. Así, no perdemos nada relevante.

Siguientes pasos Bueno, todos los cambios están en el área de Staging, incluido el archivo con los cambios que no están listos. Esto significa que debemos sacar ese archivo de Staging para poder hacer commit de todos los demás.

Crear cambios en el archivo creado, donde vamos a hacer varios commits, para ir probando los nuevos comandos, al finalizar las pruebas, eliminar el directorio con todo su contenido.</sub>

## CLASE 7 MIÉRCOLES 15 DE MAYO DEL 2024

<sub>Flujo de trabajo básico con un repositorio remoto parte 8</sub>

<sub>
Cuando empiezas a trabajar en un entorno local, el proyecto vive únicamente en tu computadora. Esto significa que no hay forma de que otros miembros del equipo trabajen en él.

Para solucionar esto, utilizamos los servidores remotos: un nuevo estado que deben seguir nuestros archivos para conectarse y trabajar con equipos de cualquier parte del mundo.

Estos servidores remotos pueden estar alojados en GitHub, GitLab, BitBucket, entre otros. Lo que van a hacer es guardar el mismo repositorio que tienes en tu computadora y darnos una URL con la que todos podremos acceder a los archivos del proyecto. Así, el equipo podrá descargarlos, hacer cambios y volverlos a enviar al servidor remoto para que otras personas vean los cambios, comparen sus versiones y creen nuevas propuestas para el proyecto.

Esto significa que debes aprender algunos nuevos comandos

Comandos para trabajo remoto con GIT</sub>

```sh
git clone url_del_servidor_remoto #Nos permite descargar los archivos de la última versión de la rama principal y todo el historial de cambios en la carpeta .git

git push #Luego de hacer git add y git commit debemos ejecutar este comando para mandar los cambios al servidor remoto.

git fetch #Lo usamos para traer actualizaciones del servidor remoto y guardarlas en nuestro repositorio local (en caso de que hayan, por supuesto).

git merge #También usamos el comando git merge con servidores remotos. Lo necesitamos para combinar los últimos cambios del servidor remoto y nuestro directorio de trabajo.

git pull #Básicamente, git fetch y git merge al mismo tiempo.

#Adicionalmente, tenemos otros comandos que nos sirven para trabajar en proyectos muy grandes:

git log --oneline #Te muestra el id commit y el título del commit.

git log --decorate #Te muestra donde se encuentra el head point en el log.

git log --stat #Explica el número de líneas que se cambiaron brevemente.

git log -p #Explica el número de líneas que se cambiaron y te muestra que se cambió en el contenido.

git shortlog #Indica que commits ha realizado un usuario, mostrando el usuario y el título de sus commits.

git log --graph --oneline --decorate --all # Muestra el historial de commits en forma de gráfico, en una sola línea por commit, con decoraciones y para todas las ramas

git log --pretty=format #Muestra mensajes personalizados de los commits.

git log -3 #Limitamos el número de commits.

git log --after=“2018-1-2”

git log --after=“today”

git log --after=“2018-1-2” --before=“today” #Commits para localizar por fechas.

git log --author=“Name Author” #Commits hechos por autor que cumplan exactamente con el nombre.

git log --grep=“INVIE” #Busca los commits que cumplan tal cual está escrito entre las comillas.

git log --grep=“INVIE” –i #Busca los commits que cumplan sin importar mayúsculas o minúsculas.

git log – index.html #Busca los commits en un archivo en específico.

git log -S “Por contenido” #Buscar los commits con el contenido dentro del archivo.

git log > log.txt #guardar los logs en un archivo txt
```

## CLASE 8 MIÉRCOLES 22 DE MAYO DEL 2024

<sub>
Introducción a las ramas o branches de Git parte 9

Cuando entramos en el proyecto veremos que nos encontramos con la rama master, y es a partir de allí que debe saber que esta es la rama madre o principal rama, y las otras ramas se crean para no afectar a la master

Las ramas (branches) son la forma de hacer cambios en nuestro proyecto sin afectar el flujo de trabajo de la rama principal. Esto porque queremos trabajar una parte muy específica de la aplicación o simplemente experimentar.

La cabecera o HEAD representan la rama y el commit de esa rama donde estamos trabajando. Por defecto, esta cabecera aparecerá en el último commit de nuestra rama principal. Pero podemos cambiarlo al crear una rama (git branch rama, git checkout -b rama) o movernos en el tiempo a cualquier otro commit de cualquier otra rama con los comandos (git reset id-commit, git checkout rama-o-id-commit).

Repasa: ¿Qué es Git?

Cómo funcionan las ramas en GIT
Las ramas son la manera de hacer cambios en nuestro proyecto sin afectar el flujo de trabajo de la rama principal. Esto porque queremos trabajar una parte muy específica de la aplicación o simplemente experimentar.
</sub>

```sh
git branch nombre de la rama #Con este comando se genera una nueva rama.

git checkout nombre de la rama #Con este comando puedes saltar de una rama a otra.

git checkout -b rama #Genera una rama y nos mueve a ella automáticamente, Es decir, es la combinación de git branch y git checkout al mismo tiempo.

git reset id-commit #Nos lleva a cualquier commit no importa la rama, ya que identificamos el id del tag., eliminando el historial de los commit posteriores al tag seleccionado.

git checkout rama-o-id-commit #Nos lleva a cualquier commit sin borrar los commit posteriores al tag seleccionado.
```

<sub>
Vamos a hacer una practica: mientras la rama master esta cambiando normalmente, vamos a crear una rama paralela que va a crear nuevas secciones: osea una sección y a esta rama la vamos a llamar segunda y con esto, la vamos a fusionar para ver como queda en la rama master y así entender el flujo de ramas entre git. Al crear otra rama estamos creando una copia de todos los commit que ya tiene la rama master en la nueva rama y todos los cambios que hagamos en esta nueva rama, no los va a ver la rama master hasta que no la volvamos a fusionar con un proceso que se llama merge.</sub>

```sh
Abrir terminal #En ubuntu

Abrir como adminstrados git bash #En window

cd Tecnicatura

cd class-git

code . #En ubuntu

code . #En window, abrir como administrador

ctrl + s #Guardamos

clic mouse derecho #Abrimos en el navegador con Live Server vemos los cambios

git status

git commit -am "mensaje del commit" #Este solo funciona con archivos creado previamente

git commit -a -m "Mensaje del commit" #Esto es lo mismo que el anterior

git commit -a + enter #Se abrira el entorno para editar el vim con el mensaje

Escribir el mensaje

ctrl + x

s + enter #No cambiar el nombre ni ruta de ubicación

git log #Veremos los cambios guardados

q #Para salir

git log --stat #Veremos los cambios nombrando cada archivo

q #Para salir

git branch #Muestra en la rama que estamos, desde aquí crearemos una nueva

git show #Muestra el último cambio que hicimos, esto significa que desde el HEAD -> master es que haremos cambios

q #Para salir

ctrl + l #Limpiamos consola

git branch segunda #creamos una nueva rama

git show #Nos muestra ahora que esta en el HEAD -> master, cabecera aquí es donde esta apuntando, es decir el último commit esta pegado a dos ramas distintas, aunque todavía estemos en master

q #Para salir

git status #No hay nada para hacer commit

git chekout segunda #Nos movemos hacía otras ramas, en este caso a segunda, esto no se ve en mac ni en ubuntu, para ver donde estamos hay que ingresar...

git branch #veremos en que rama estamos ubicados o ingresando...

git status #Veremos en que HEAD estamos apuntando

ctrl + s

F5 #Actualizamos en el navegador para ver los cambios

git status #Veremos el archivo que modificamos

git add .

git commit

vim escribimos el mensaje del commit

ctrl + x

s #Para un si

enter #Terminado el mensaje del commit

git status #No hay mas nada para commitear y estamos en la rama segunda

git show #Vemos todo lo que cambiamos

q #Para salir

git log #Nos muestra donde estabamos con la rama master y el HEAD paso a la rama cabecera

q #Para salir

git checkout master #Volvemos a la rama master, desaparese lo que habíamos hecho

git log #No muestra lo que hicimos en el portafolio

q #Para salir


git checkout segunda #Volvemos a ver todos los cambios que hicimos de nuevo
```

## CLASE 9 MIÉRCOLES 29 DE MAYO DEL 2024

# Introducción a las ramas o branches de Git parte 9

Cuando entramos en el proyecto veremos que nos encontramos con la rama master, y es a partir de allí que debe saber que esta es la rama madre o principal rama, y las otras ramas se crean para no afectar a la master.

Las ramas (branches) son la forma de hacer cambios en nuestro proyecto sin afectar el flujo de trabajo de la rama principal. Esto porque queremos trabajar una parte muy específica de la aplicación o simplemente experimentar.

La cabecera o HEAD representa la rama y el commit de esa rama donde estamos trabajando. Por defecto, esta cabecera aparecerá en el último commit de nuestra rama principal. Pero podemos cambiarlo al crear una rama (`git branch rama`, `git checkout -b rama`) o movernos en el tiempo a cualquier otro commit de cualquier otra rama con los comandos (`git reset id-commit`, `git checkout rama-o-id-commit`).

**Repasa: ¿Qué es Git?**

## Cómo funcionan las ramas en GIT

Las ramas son la manera de hacer cambios en nuestro proyecto sin afectar el flujo de trabajo de la rama principal. Esto porque queremos trabajar una parte muy específica de la aplicación o simplemente experimentar.

```sh
git branch nombre de la rama # Con este comando se genera una nueva rama.
git checkout nombre de la rama # Con este comando puedes saltar de una rama a otra.
git checkout -b rama # Genera una rama y nos mueve a ella automáticamente, es decir, es la combinación de git branch y git checkout al mismo tiempo.
git reset id-commit # Nos lleva a cualquier commit no importa la rama, ya que identificamos el id del tag., eliminando el historial de los commit posteriores al tag seleccionado.
git checkout rama-o-id-commit # Nos lleva a cualquier commit sin borrar los commit posteriores al tag seleccionado.

# Abrir terminal en Ubuntu
# Abrir como administrador git bash en Windows
cd Tecnicatura
cd class-git
code . # En Ubuntu
code . # En Windows, abrir como administrador
ctrl + s # Guardamos
clic mouse derecho # Abrimos en el navegador con Live Server, vemos los cambios
git status
git commit -am "mensaje del commit" # Este solo funciona con archivos creados previamente
git commit -a -m "Mensaje del commit" # Esto es lo mismo que el anterior
git commit -a + enter # Se abrirá el entorno para editar el vim con el mensaje
# Escribir el mensaje
ctrl + x
s + enter # No cambiar el nombre ni ruta de ubicación
git log # Veremos los cambios guardados
q # Para salir
git log --stat # Veremos los cambios nombrando cada archivo
q # Para salir
git branch # Muestra en la rama que estamos, desde aquí crearemos una nueva
git show # Muestra el último cambio que hicimos, esto significa que desde el HEAD -> master es que haremos cambios
q # Para salir
ctrl + l # Limpiamos consola
git branch segunda # Creamos una nueva rama
git show # Nos muestra ahora que está en el HEAD -> master, cabecera aquí es donde está apuntando, es decir, el último commit está pegado a dos ramas distintas, aunque todavía estemos en master
q # Para salir
git status # No hay nada para hacer commit
git checkout segunda # Nos movemos hacia otra rama, en este caso a segunda, esto no se ve en Mac ni en Ubuntu, para ver dónde estamos hay que ingresar...
git branch # Veremos en qué rama estamos ubicados o ingresando...
git status # Veremos en qué HEAD estamos apuntando
# VSC: hacemos cambios que veremos con Nico

ctrl + s

F5 #Actualizamos en el navegador para ver los cambios

git status #Veremos el archivo que modificamos

git add .

git commit

vim escribimos el mensaje del commit

ctrl + x

s #Para un si

enter #Terminado el mensaje del commit

git status #No hay mas nada para commitear y estamos en la rama segunda

git show #Vemos todo lo que cambiamos

q #Para salir

git log #Nos muestra donde estabamos con la rama master y el HEAD paso a la rama cabecera

q #Para salir

git checkout master #Volvemos a la rama master, desaparese lo que habíamos hecho

git log #No muestra lo que hicimos en el portafolio

q #Para salir


git checkout segunda #Volvemos a ver todos los cambios que hicimos de nuevo



# La tarea de hoy, agregar esta clase al README.md con el lenguaje de markdown, como lo hicimos en la clase pasada, luego deben hacer el commit correspondiente al cambio agregado.



# Revisar y ejecutar cada comando, hacerlo como practica: NO olvidar hacer lo requerido por el Tutor Nico, lo que sea tarea o investigación.

<sub>Profesor Ariel Betancud</sub>

```

## CLASE 10 MIÉRCOLES 5 DE JUNIO DEL 2024

# Fusión de ramas con Git merge parte 10

La fusión en Git es la forma en que este sistema une un historial bifurcado. El comando `git merge` permite integrar líneas de desarrollo independientes generadas por `git branch` en una sola rama. Con este comando, podemos crear un nuevo commit que combina dos ramas o branches: la rama actual y la rama que se indica después del comando.

Estos comandos de fusión del merge afectan solo a la rama actual y no a la rama de destino. Por lo tanto, te recomendamos utilizar `git checkout` para seleccionar la rama actual y `git branch -d` para eliminar la rama de destino obsoleta.

## Funcionamiento de Git merge

Git merge fusiona secuencias de confirmaciones en un solo historial, generalmente para combinar dos ramas. Busca una confirmación de base común y genera una confirmación de fusión que representa la combinación de las dos ramas hasta el resultado final.

### ¿Cómo unir dos ramas en git?

Para combinar ramas en tu repositorio local, usa `git checkout` para cambiar a la rama donde deseas fusionar. Por lo general, esta es la rama principal. Luego, emplea `git merge` y especifica el nombre de la otra rama que deseas traer a esta rama. Ten en cuenta que esto es una combinación de avance rápido.

### ¿Cómo realizar un merge en git?

Para hacer un merge en Git, primero asegúrate de estar en la rama correcta. Después, usa el comando `git merge` seguido del nombre de la rama que quieres combinar. Por ejemplo, si quieres crear un nuevo commit en la rama master con los cambios de la rama segunda, usa este comando:

```sh

```

git checkout master
git merge segunda

```s
Es importante tener en cuenta que en caso de haber conflictos, debes guardar tus cambios antes de hacer git checkout para evitar perder tu trabajo. También es recomendable emplear los comandos básicos de GitHub, como git fetch, git push y git pull, para mantener actualizado tu repositorio.

En este ejemplo, vamos a crear un nuevo commit en la rama master combinando los cambios de una rama llamada segunda: Otra opción es crear un nuevo commit en la rama segunda combinando los cambios de cualquier otra rama:

Git es asombroso porque puede saber cuáles cambios deben conservarse en una rama y cuáles no. En casos de conflictos, asegúrate de guardar tus cambios antes de hacer git checkout para evitar perder tu trabajo.

```

```sh

git init # crear un repositorio, si ya esta en la nube traerlo sin hacer git init
git add . # agregar un archivo a staging
git commit -m "mensaje" # guardar el archivo en git con un mensaje
git branch nombre_rama # crear una nueva rama
git checkout nombre_rama # moverse entre ramas
git push origin rama # mandar cambios a un servidor remoto
git fetch # traer actualizaciones del servidor remoto y guardarlas en nuestro repositorio local
git merge rama # tiene dos usos: la fusión de ramas, funcionando como un commit en la rama actual, trayendo la rama indicada; o guardar los cambios de un servidor remoto en nuestro directorio
git pull origin rama # fetch y merge al mismo tiempo
git checkout "codigo de version" "nombre del archivo" # volver a la última versión de la que se ha hecho commit
git reset # vuelve al pasado sin posibilidad de volver al futuro, se debe usar con especificaciones
git reset --soft # vuelve a la versión en el repositorio, pero guarda los cambios en staging, permitiendo aplicar actualizaciones a un nuevo commit
git reset --hard # todo vuelve a su versión anterior
git reset HEAD # saca los cambios de staging, pero no los borra, es lo opuesto a git add
git rm # elimina los archivos, pero no su historial, si queremos recuperar algo, solo hay que regresar, se utiliza así:
git rm --cached # elimina los archivos en staging pero los mantiene en el disco duro
git rm --force # elimina los archivos de git y del disco duro
git status # estado de archivos en el repositorio
git log # historia entera del archivo
git log --stat # cambios específicos en el archivo a partir de un commit
git show # cambios históricos y específicos hechos en un archivo
git diff "codigo de version 1" "codigo de version 2" # comparar cambios entre versiones
git diff # comparar directorio con staging

git status # En rama segunda: hacemos cambios en el archivo y guardamos
git commit -am "Finalizado el cambio en rama segunda" # enter
git status
git checkout master # perdemos todo lo que ya habíamos hecho, hacemos cambios en el archivo agregando un nuevo párrafo y guardamos
git commit -am "Agregado el contenido adicional del archivo y un mejor aporte"
git checkout segunda # vemos como desaparecen los cambios
git checkout master # Aquí es que vamos a hacer el merge
git merge segunda # En mi caso tuve algunos conflictos que solucioné a través de VSC, aclaro que nunca debemos utilizar "Fusionar los dos cambios"
git commit -am "Arreglando conflicto" # Una vez solucionado debemos commitear
git status # Debemos revisar en el navegador y en el código si algo quedó mal y cambiarlo
git commit -am "Solucionado el conflicto 2"
git merge segunda # ahora todo va bien
git commit -am "Volví a comentar en este caso de mi área laboral" # Añado información al archivo
git log
q # Para salir
git commit -am "Para guardar estos cambios en el README.md"
git checkout segunda
git merge master # Traemos todos los cambios
git commit -am "Cargamos esto ahora" # vamos a master y mergeamos
git checkout master
git merge segunda # y terminamos con esto


```

## CLASE 11 MIÉRCOLES 12 DE JUNIO DEL 2024

# Resolución de conflictos al hacer merge parte 11

## Sección lectura

Git nunca borra nada, a menos que nosotros se lo indiquemos. Cuando usamos los comandos `git merge` o `git checkout` estamos cambiando de rama o creando un nuevo commit, no borrando ramas ni commits (recuerda que puedes borrar commits con `git reset` y ramas con `git branch -d`).

Git es muy inteligente y puede resolver algunos conflictos automáticamente: cambios, nuevas líneas, entre otros. Pero algunas veces no sabe cómo resolver estas diferencias, por ejemplo, cuando dos ramas diferentes hacen cambios distintos a una misma línea.

Esto lo conocemos como conflicto y lo podemos resolver manualmente. Solo debemos hacer el merge, ir a nuestro editor de código y elegir si queremos quedarnos con alguna de estas dos versiones o algo diferente. Algunos editores de código como Visual Studio Code nos ayudan a resolver estos conflictos sin necesidad de borrar o escribir líneas de texto, basta con hacer clic en un botón y guardar el archivo.

Recuerda que siempre debemos crear un nuevo commit para aplicar los cambios del merge. Si Git puede resolver el conflicto, hará commit automáticamente. Pero, en caso de no poder resolverlo, debemos solucionarlo y hacer el commit.

Los archivos con conflictos por el comando `git merge` entran en un nuevo estado que conocemos como Unmerged. Funcionan muy parecido a los archivos en estado Unstaged, algo así como un estado intermedio entre Untracked y Unstaged. Solo debemos ejecutar `git add` para pasarlos al área de staging y `git commit` para aplicar los cambios en el repositorio.

### Cómo revertir un merge

Si nos hemos equivocado y queremos cancelar el merge, debemos usar el siguiente comando:

```sh
git merge --abort
```

### Conflictos en repositorios remotos

Al trabajar con otras personas, es necesario utilizar un repositorio remoto.

- Para copiar el repositorio remoto al directorio de trabajo local, se utiliza el comando `git clone`, y para enviar cambios al repositorio remoto se utiliza `git push`.
- Para actualizar el repositorio local se hace uso del comando `git fetch`, luego se debe fusionar los datos traídos con los locales usando `git merge`.
- Para traer los datos y fusionarlos a la vez, en un solo comando, se usa `git pull`.

- Para crear commits rápidamente, fusionando `git add` y `git commit -m ""`, usamos `git commit -am ""`.
- Para generar nuevas ramas, hay que posicionarse sobre la rama que se desea copiar y utilizar el comando `git branch`.
- Para saltar entre ramas, se usa el comando `git checkout`.

Una vez realizados los cambios en la rama, estas deben fusionarse con `git merge`. El merge ocurre en la rama en la que se está posicionado. Por lo tanto, la rama a fusionar se transforma en la principal. Los merges también son commits y pueden generar conflictos. Esto aborta la acción y pide que soluciones el problema manualmente, aceptando o rechazando los cambios que vienen.

### Repasa qué es un branch

## Sección Práctica

```sh
git checkout segunda # falta lo que cargamos en master
git merge master # traemos los cambios desde la master y tenemos las dos ramas actualizadas


*Ahora vamos a crear un conflicto para ver cómo salir de él. Vamos a cargar datos nuevos creando archivos html y css estando en la rama `segunda`, y también vamos a hacer lo mismo estando en la `master` para ver cómo lo solucionamos.

*Abrimos el html y modificamos estando en la rama `segunda`.

*Luego commiteamos en la rama `segunda` y pasamos a la rama `master`, guardamos y commiteamos, hacemos un merge estando en `master`:

ctrl + s # Guardamos los cambios en la rama segunda, ponemos cambios en css
git commit -am "Modifiqué el css y el color del texto" # es un ejemplo
git checkout master # Modificamos el html, ponemos código y css ponemos texto blue
ctrl + s # Guardamos los cambios
git commit -am "Agregué suscripción, cambié el código y puse todo azul en css"
git merge segunda # Hacemos un merge estando en master y veremos el conflicto


*Para solucionar el conflicto podemos abrir el archivo con el editor de texto y modificar lo que nos este señalando y guardamos, esto en el css y en el html, lo podemos hacer desde VSC seleccionando: el cambio entrante.


<sub>Debemos ahora commitear estos cambios, abajo pongo los comandos.</sub>

git status

git commit -am #"Solución de conflictos al mergear las ramas"

git checkout segunda #Seguiremos con la versión anterior, porque el merge fue en master

git merge master #Ahora pasamos los cambios a la rama segunda.
```

# CLASE 12 MIÉRCOLES 19 DE JUNIO DEL 2024

## Cómo funcionan las llaves públicas y privadas parte 12

### Sección lectura

```sh
*Las llaves públicas y privadas, conocidas también como cifrado asimétrico de un solo camino, sirven para mandar mensajes privados entre varios nodos con la lógica de que firmas tu mensaje con una llave pública vinculada con una llave privada que puede leer el mensaje.

*Las llaves públicas y privadas nos ayudan a cifrar y descifrar nuestros archivos de forma que los podamos compartir sin correr el riesgo de que sean interceptados por personas con malas intenciones.
```

## Cómo funciona un mensaje cifrado con llaves públicas y privadas

```sh
1. Ambas personas deben crear su llave pública y privada.

2. Ambas personas pueden compartir su llave pública a las otras partes (recuerda que esta llave es pública, no hay problema si la “interceptan”).

3. La persona que quiere compartir un mensaje puede usar la llave pública de la otra persona para cifrar los archivos y asegurarse que solo puedan ser descifrados con la llave privada de la persona con la que queremos compartir el mensaje.

4. El mensaje está cifrado y puede ser enviado a la otra persona sin problemas en caso de que los archivos sean interceptados.

5. La persona a la que enviamos el mensaje cifrado puede emplear su llave privada para descifrar el mensaje y ver los archivos.
```

**Nota:** puedes compartir tu llave pública, pero nunca tu llave privada.

# CLASE 13 MIÉRCOLES 26 DE JUNIO DEL 2024

### Configura tus llaves SSH en local parte 13

Si usamos GitHub solo con usuario y contraseña, si un día perdemos nuestra PC, perdemos todo, nuestras contraseñas y los proyectos de nuestros clientes están todos en riesgo. Esta es la forma en que muchos sitios web son hackeados, para evitar esto tenemos que agregar una capa de seguridad mucho más fuerte. Es aquí donde podemos comenzar a crear el entorno con llaves públicas y privadas. Esto tiene una ventaja, no solo es que nuestra seguridad será más fuerte, sino que ya no tendrás que poner nunca más tu usuario y contraseña.

En nuestra máquina, debemos crear una llave privada y otra pública. Una vez creada la llave pública se la enviamos a GitHub en nuestro repositorio, y le decimos: para este repositorio quiero que uses esta llave pública, de mi llave privada en mi PC, todo esto lo conectamos por un protocolo nuevo, en vez de conectarnos al repositorio por HTTPS, vamos a conectarnos por un protocolo que se llama SSH.

En la primera conexión GitHub se va a dar cuenta que le mandaste una llave pública que está relacionada con tu llave privada y nos va a enviar cifrada con nuestra llave pública su propia llave pública de GitHub, porque GitHub también tiene una llave privada. Todo esto sucederá automáticamente. A la llave privada que nosotros tenemos, se le puede añadir una contraseña encima, para añadir más seguridad para hacerla más fuerte y más poderosa.

Las llaves SSH no son por repositorio o por proyecto, sino que son por persona, ahora vamos a crear unas llaves exclusivamente para nosotros.

## Comandos:

### En Windows:

Abrir Git Bash.

```bash
git config -l # Recordamos nuestra configuración en Git, podemos hacer esto estando en la ruta de cualquier sitio en nuestro PC

git config --global user.email "alumnos@mail.com" # Actualizamos el correo que usamos en GitHub.

ssh-keygen -t rsa -b 4096 -C "alumnos@mail.com" # Dirá que está generando la llave pública y privada, también nos pregunta dónde vamos a guardar la llave, presionamos Enter, nos va a pedir otra contraseña.

eval $(ssh-agent -s) # Encendemos el servidor de llaves SSH, ya está corriendo.

ssh-add ~/.ssh/id_ga35745 # Añadimos la llave, no la .pub, ponemos la llave privada, recordar que es una ruta, se debe poner el nombre de la carpeta que contiene la clave privada.


*En Ubuntu:

*Abrir terminal y asegurarse de no estar dentro de ningún proyecto o carpeta específica.

git config -l # Recordamos nuestra configuración en Git, podemos hacer esto estando en la ruta de cualquier sitio en nuestro PC

git config --global user.email "alumnos@mail.com" # Actualizamos el correo que usamos en GitHub.

ssh-keygen -t rsa -b 4096 -C "alumnos@mail.com" # Dirá que está generando la llave pública y privada, también nos pregunta dónde vamos a guardar la llave, presionamos Enter, nos va a pedir otra contraseña.

eval $(ssh-agent -s) # Encendemos el servidor de llaves SSH, ya está corriendo.

ssh-add ~/.ssh/id_ga35745 # Añadimos la llave, no la .pub, ponemos la llave privada, recordar que es una ruta, se debe poner el nombre de la carpeta que contiene la clave privada.

*Cómo generar tus llaves SSH:

a. Generar tus llaves SSH

*Recuerda que es muy buena idea proteger tu llave privada con una contraseña.

ssh-keygen -t rsa -b 4096 -C "tu@email.com"

b. Terminar de configurar nuestro sistema

**En Windows y Linux:

*Encender el "servidor" de llaves SSH de tu computadora:

eval $(ssh-agent -s)

*Añadir tu llave SSH a este "servidor":

ssh-add ruta-donde-guardaste-tu-llave-privada

**En Mac:

*Encender el "servidor" de llaves SSH de tu computadora:

eval "$(ssh-agent -s)"

*Si usas una versión de OSX superior a Mac Sierra (v10.12), debes crear o modificar un archivo config en la carpeta de tu usuario con el siguiente contenido:

Host *
  AddKeysToAgent yes
  UseKeychain yes
  IdentityFile ruta-donde-guardaste-tu-llave-privada

*Añadir tu llave SSH al "servidor" de llaves SSH de tu computadora (en caso de error puedes ejecutar este mismo comando pero sin el argumento -K):

ssh-add -K ruta-donde-guardaste-tu-llave-privada


*Por último, quiero hablar del 2FA: Segundo Factor de Autenticación. Este se puede hacer con varios dispositivos, y deberías hacerlo. Ante el robo o pérdida de un celular u ordenador, deberías tener un respaldo. Este 2FA se puede hacer con diferentes generadores de códigos de seguridad.

*Para añadir un 2FA:

1- Clic en nuestro perfil, arriba y a la derecha, seleccionamos...

2- Settings

3- Password and Authentication

4- GitHub Mobile: GitHub Mobile se puede utilizar para la autenticación de 2FA instalando la aplicación GitHub Mobile e iniciando sesión en su cuenta.

`***Esto significa que también se utiliza la app de GitHub donde al iniciar sesión desde cualquier dispositivo nos muestra un número que debemos ingresar en la app de nuestro dispositivo celular.***`

5- Authenticator app: Edit

`***Esto para agregar a través de un QR una app que genere cada 1 segundo nuevos códigos numéricos para la autenticación, recomiendo la aplicación: Twilio Authy Authenticator.***´

**Es recomendable iniciar sesión, o sea, registrarnos y guardar estos datos para que al cambiar de dispositivo sigamos teniendo acceso.**


```
