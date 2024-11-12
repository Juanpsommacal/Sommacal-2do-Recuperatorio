1 - Copiar el contenido de este enlace: https://pastebin.com/6R1hdyJA

2 - Pegarlo en un archivo llamado jugadores.json

3 - Dicho archivo pegarlo en la raíz de nuestro proyecto java.

4 - Incluir librería JSON en nuestro proyecto.

5 - Copiar esta clase: https://github.com/benoffi7/Programacion-Laboratorio-3-UTNMDP/blob/master/2019/json/src/json/JsonUtiles.java

7 - En el main declarar un JSONArray / JSONObject y pasarle el contenido del método “leer”
al constructor.

8 - Crear 2 colecciones de tipo clave - valor ordenadas. Una por color de ojos y otra por
posición. Ambas colecciones deben permitir agregar, devolver un elemento por clave, listar y
contar. El valor de ambas colecciones es una lista de jugadores. 5 pts.

9 - Hacer un método que dado una colección X, una clave Y y un número Z, retorne la cantidad
de elementos. Si la cantidad supera al parámetro Z, lanzar una excepción que contenga
nombre de la colección, clave y la diferencia entre Z y la cantidad real.

Ej: colección “colores”, clave “green”, número 3. Entonces, si hay tres o más jugadores con
esa clave, lanzar la excepción y guardar la cantidad real. 5pts.

10 - Guardar en un archivo binario de objetos todos los jugadores cuyo sueldo superen un
parámetro enviado. (Opcional