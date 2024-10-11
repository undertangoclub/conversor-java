# Conversor de monedas basado en java

# Conversor de Monedas

Este proyecto forma parte del curso de **Oracle ONE Alura Latam** y fue creado como una forma práctica de aprender a trabajar con APIs, manipular datos en formato JSON y construir un cliente de consola en Java para realizar conversiones de monedas. Este conversor permite al usuario consultar y convertir entre diferentes monedas utilizando las tasas de cambio actuales, proporcionadas por una API externa.

## Características del Proyecto

- **Interacción con el Usuario**: La aplicación tiene una interfaz basada en consola que permite al usuario seleccionar la moneda de origen, la moneda de destino y el monto a convertir.
- **API de Tasas de Cambio**: Utiliza la API de ExchangeRate para obtener tasas de cambio actualizadas en tiempo real.
- **Conversión de Monedas**: Permite la conversión entre distintas monedas soportadas, incluyendo ARS (Peso Argentino), BOB (Boliviano), BRL (Real Brasileño), CLP (Peso Chileno), COP (Peso Colombiano) y USD (Dólar Estadounidense).
- **Uso de Librerías Modernas**: Emplea la biblioteca `Gson` para manejar las respuestas en formato JSON de la API, y `HttpClient` para realizar las solicitudes HTTP.

## Tecnologías Utilizadas

- **Java 11+**: El proyecto está desarrollado en Java, utilizando características modernas de la versión 11 y superiores.
- **Biblioteca `Gson`**: Para la manipulación de respuestas JSON y mapeo de datos a objetos Java.
- **API ExchangeRate**: Para obtener las tasas de cambio actualizadas y poder realizar las conversiones.
- **IntelliJ IDEA**: Entorno de desarrollo integrado (IDE) utilizado para crear y mantener el proyecto.

## Estructura del Proyecto

El proyecto está compuesto por las siguientes clases:

- **ApiClient**: Se encarga de realizar las solicitudes a la API de tasas de cambio y obtener las respuestas necesarias.
- **Currency**: Representa una moneda con atributos como el código de la moneda, el nombre y la tasa de conversión.
- **CurrencyConverter**: La clase que contiene la lógica para interactuar con el usuario, realizar la conversión entre monedas y manejar los datos obtenidos de la API.
- **Main**: Contiene el punto de entrada al programa, proporcionando un bucle que permite al usuario realizar múltiples conversiones hasta que decida salir.

## Ejecución del Proyecto

Para ejecutar el proyecto:

1. **Clonar el Repositorio**:
   ```bash
   git clone https://github.com/undertangoclub/conversor-java.git
   ```

2. **Configurar el Entorno**: Asegúrate de tener Java 11 o superior y la biblioteca `Gson` agregada al proyecto.

3. **Ejecutar la Aplicación**: Puedes ejecutar la clase `Main` desde tu IDE o desde la línea de comandos, lo cual abrirá el menú de conversión interactivo.

## Ejemplo de Uso

Al iniciar el programa, se mostrará un menú con las opciones disponibles para convertir monedas o salir. Un ejemplo de interacción sería:

1. Seleccionar la moneda de origen (por ejemplo, `USD`).
2. Seleccionar la moneda de destino (por ejemplo, `ARS`).
3. Ingresar la cantidad a convertir.
4. Ver el resultado de la conversión en la consola.

## Recursos Adicionales

- **API utilizada**: [ExchangeRate API](https://www.exchangerate-api.com/docs/java-currency-api)
- **Documentación Java**: [Java 11 Documentation](https://docs.oracle.com/en/java/javase/11/)

## Video Explicativo

Si quieres ver una demostración del proyecto y una explicación sobre cómo se desarrolló, puedes ver el video a continuación:

https://youtu.be/NEwRDnJ4tlQ


## Conclusión

Este proyecto representa una excelente oportunidad para practicar habilidades fundamentales en el desarrollo de software, como la interacción con APIs, el uso de bibliotecas externas para la manipulación de datos JSON, y la implementación de una lógica de negocios clara y útil para el usuario.

Siéntete libre de explorar el código, realizar mejoras y personalizar el proyecto para satisfacer tus propias necesidades de conversión. ¡Espero que este conversor de monedas sea un punto de partida para muchos otros proyectos interesantes!

## Autor

Pablo Guillermo Cieslik

---

¡Gracias por visitar este proyecto y espero que disfruten el video explicativo donde demostraré cómo funciona este conversor de monedas y qué desafíos se enfrentaron durante el desarrollo!


