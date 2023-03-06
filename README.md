# Romans go home
En este repositorio realizo un ejercicio para practicar los tipos Eumerados y las Expresiones Regulares. El enunciado nos pide que cumplamos los siguientes requisitos:

1 - Escribir un programa que trasforme números en notación romana en notación indo-arábigo
```
I  uno 1
II dos 2
III tres 3 
IV  cuatro 4 
V cinco 5
VI  seis 6
VII  siete 7
VIII  ocho 8
IX   nueve 9
XXXII  treinta y dos 32
XLV  cuarenta y cinco 45
```

2 - Para completar el ejercicio se deben usar expresiones regulares y enumerados y no sirve otra solución paralela.

3 - Desarrollar mediante casos Test decritos en el [enunciado del ejercicio](https://github.com/dfleta/romans-go-home).

## Lógica

La lógica que se debe implementar es la propia de los números romanos descrita en la web [Wikipedia](https://es.wikipedia.org/wiki/Numeraci%C3%B3n_romana) o resumido en el enunciado del ejercicio que cito literalmente aquí:
 
>Dado un número romano, p.e:
>
>String numeroRomano = "MDCCCLXXXVIII";
>
>de las citadas reglas puede deducirse que estas son las únicas combinaciones que se presentarán:
>
>M, C, X, I pueden aparecer de cero a tres veces (sumando).
>
>D, L, V pueden aparecer de cero a una vez sumando, ya que no pueden restar.
>
>Restando, sólo pueden aparecer las combinaciones:
>
>IV e IX
>
>XL y XC
>
>CD y CM
>
>D, L, V no pueden aparecer restando.
>
>Esto puede traducirse a expresiones regulares y a tipos enumerados:
>
>Crea expresiones regulares para identificar en el string que representa el número romano los conjuntos anteriores, que no dejan de ser meros patrones.
Luego, utiliza los tipos enumerados para obtener el valor de los símbolos romanos (y las combinaciones permitidas, por ejemplo, aunque esto no es necesario).

Escrito por [dfleta](https://github.com/dfleta) 



## Casos Test

Los casos test serán exactamente las posibles combinaciones según las reglas estrictas del código romano.

## Recursos

Nuestro tutor [David Gelpi](https://github.com/dfleta), nos proporciona para desarrollar el ejercicio el fichero `RomansGoHome.java` que es el programa principal. 
Además nos recomienda usar esta herramienta online para testear las expresiones reguares: [freeformatter.com](http://www.freeformatter.com/java-regex-tester.html)

## Mejoras

Cuando finalize el ejercicio, se nos solicita que gestionemos las dependecias del Proyecto Maven, pasando de Junit 4 a Junit 5 con todo lo que ello implica.

## Material de estudio

Usaré el libro  _Beginning Java 8 Fundamentals_, el capítulo _Expresiones Regulares_ (pág 527) para documentarme sobre el uso y aplicación de las Exp. Reg. 