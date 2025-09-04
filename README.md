# Programación en Java - Búsqueda y Ordenación en Arreglos Multidimensionales

Este repositorio contiene dos programas en **Java** que demuestran el uso de **búsqueda** y **ordenación** en arreglos bidimensionales (matrices).  
Los programas fueron desarrollados en **IntelliJ IDEA**, pero también pueden ejecutarse en **NetBeans** o **Eclipse**.

---

##  Programa 1: Búsqueda en Arreglo Multidimensional
**Archivo:** `Programa1_Busqueda2D.java`

- Declara una matriz 3×3 de enteros.  
- Implementa un método que busca un valor específico y devuelve su posición `[fila, columna]`.  
- Si no se encuentra, devuelve `[-1, -1]`.  
- Muestra en consola si el valor se encontró o no.  

Ejemplo de salida:
```
El valor 9 se encontró en la posición: [1, 2]
```

---

##  Programa 2: Ordenación de Arreglo Multidimensional
**Archivo:** `Programa2_Ordenacion2D.java`

- Declara una matriz 3×3 de enteros.  
- Ordena una fila específica usando `Arrays.sort()`.  
- Muestra la **matriz original** y la **matriz con la fila ordenada**.  

Ejemplo de salida:
```
Matriz original:
[9, 3, 7]
[5, 1, 8]
[6, 4, 2]

Matriz después de ordenar la fila 1:
[9, 3, 7]
[1, 5, 8]
[6, 4, 2]
```

---

##  Tecnologías utilizadas
- Java (JDK 8+)
- IntelliJ IDEA / NetBeans / Eclipse
- Git y GitHub

---

##  Sincronización en GitHub
1. Inicializar repositorio:
   ```bash
   git init
   git branch -M main
   git remote add origin https://github.com/TU_USUARIO/Java-Arreglos2D.git
   ```
2. Añadir archivos y hacer commit:
   ```bash
   git add Programa1_Busqueda2D.java Programa2_Ordenacion2D.java README.md
   git commit -m "Programas de búsqueda y ordenación en matrices 2D en Java"
   ```
3. Subir al repositorio:
   ```bash
   git push -u origin main
   ```

---

##  Autor
- **Roddy** 
