## Preguntas Preliminares Laboratorio 3
### Integrantes
 Julian Arenas
 Tomas Ramirez


**A. Distinción clave** entre pruebas unitarias y pruebas de integración de extremo a extremo:
- Prueba unitaria: se centra en comprobar el funcionamiento de elementos o funciones individuales de manera aislada. 
  -   Por ejemplo: verificar que una función que suma dos números entregue el resultado adecuado.

- **Prueba de integración E2E** (de extremo a extremo): asegura que todo el proceso del sistema opere de manera efectiva, 
  desde el comienzo hasta el final, incluyendo la interacción con bases de datos, APIs, interfaces de usuario, etc. 
  - Por ejemplo: en Netflix, reproducir un video desde que el usuario inicia la reproducción hasta que se detiene, sin fallos.

**B. Objetivo de la Retrospectiva de Sprint en Scrum:**
- Es un encuentro en el que el grupo examina lo que funcionó bien, lo que no fue efectivo y las áreas de mejora.
 Es fundamental para la mejora continua puesto que facilita la adaptación de los procesos, incrementa la productividad 
 y disminuye los errores de un sprint a otro. Sin esta práctica, los problemas tienden a repetirse.

**C. Distinción entre Épica, Funcionalidad y Historia de Usuario (ejemplo en Netflix):**
- **Épica:** un gran objetivo o funcionalidad que se divide en características más pequeñas.
Ejemplo: “Optimizar la experiencia de visualización de videos”.

- **Funcionalidad:** una característica específica dentro de una épica.
Ejemplo: “Desarrollar un sistema de recomendaciones personalizadas”.

- **Historia de Usuario:** una tarea concreta y puntual desde la visión del usuario.
Ejemplo: “Como usuario, deseo que Netflix me sugiera películas en función de mi historial de reproducciones para descubrir nuevo contenido”.

**D. Cobertura de Código:**
- Evalúa qué proporción del código ha sido ejecutada a través de pruebas.
Alcanzar un 100% de cobertura no asegura que no existan errores, ya que se puede ejecutar el código completo sin probar todos 
- los casos límite o combinaciones posibles.

**E. Diagrama de Casos de Uso:**
- Muestra las interacciones entre los actores (usuarios/sistemas) y el sistema para alcanzar un objetivo.
- **Componentes:** actores, casos de uso y relaciones (asociación, generalización, inclusión y extensión).
- Es útil en el análisis de requerimientos para visualizar las funcionalidades desde la perspectiva del usuario, clarificar las 
expectativas del sistema y identificar problemas potenciales.

**F. Diferencias entre JUnit y JaCoCo, y la función de SonarQube:**
- **JUnit:** es un marco de trabajo para la realización de pruebas unitarias en Java.
- **JaCoCo:** es una herramienta que evalúa la cobertura del código durante la ejecución de las pruebas.
- **SonarQube:** analiza la calidad del código e incluye métricas como cobertura, errores, vulnerabilidades y deuda técnica. Su función 
es complementaria, ya que no solo indica qué pruebas hay, sino también la salud general del código.

**G. Beneficios del Planning Poker:**
- Facilita estimaciones más precisas y acordadas, evitando que la voz más fuerte domine la conversación.
 Fomenta la transparencia, el diálogo y el compromiso del equipo, ya que todos participan y justifican sus estimaciones.

**H. Valores de Scrum y cuál es el más desafiante:**
- **Valores:** Coraje, Enfoque, Compromiso, Respeto y Apertura.
- El más complicado de poner en práctica: depende del grupo, pero a menudo es el Coraje, ya que requiere expresar claramente 
los problemas, cuestionar decisiones y sugerir cambios sin temor a represalias. Muchos equipos enfrentan dificultades en este aspecto.