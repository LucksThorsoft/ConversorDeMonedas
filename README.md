# Conversor de Monedas en Java

Este es un proyecto de conversión de monedas en Java que permite convertir entre diferentes monedas utilizando las tasas de cambio actuales obtenidas desde una API externa. La aplicación soporta varias monedas, incluyendo el Peso Mexicano (MXN), Peso Argentino (ARS), Boliviano (BOB), Real Brasileño (BRL), Peso Chileno (CLP), Peso Colombiano (COP) y Dólar Estadounidense (USD).

## Funcionalidades

- Obtiene las tasas de cambio de la API de ExchangeRate-API.
- Permite al usuario ingresar una cantidad en una moneda específica y obtener el equivalente en dólares estadounidenses.
- Soporta múltiples monedas: MXN, ARS, BOB, BRL, CLP, COP, USD.
- El programa se ejecuta en un bucle interactivo hasta que el usuario decida salir.

## Tecnologías

- Java (JDK 8 o superior).
- JSON (usando la biblioteca Gson).
- API externa para obtener las tasas de cambio de las monedas.

## Requisitos

- Tener instalado Java 8 o superior en tu máquina.
- Conexión a Internet para obtener las tasas de cambio de la API externa.

## Instalación

1. Clona este repositorio a tu máquina local:
    ```bash
    git clone https://github.com/<tu-usuario>/<tu-repositorio>.git
    cd <tu-repositorio>
    ```

2. Asegúrate de tener la biblioteca Gson instalada. Si usas Maven, añade la siguiente dependencia en tu archivo `pom.xml`:
    ```xml
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.8</version>
    </dependency>
    ```

3. Si no usas Maven, puedes descargar el archivo JAR de Gson desde [aquí](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.8.8) y agregarlo al classpath de tu proyecto.

## Uso

1. Abre una terminal y navega al directorio donde tienes el proyecto.
2. Compila y ejecuta el programa:
    ```bash
    javac Principal.java
    java Principal
    ```

3. El programa mostrará un menú donde podrás seleccionar la moneda de origen e ingresar la cantidad que deseas convertir. El resultado de la conversión se mostrará en dólares estadounidenses (USD).

4. Puedes elegir continuar convirtiendo otras monedas o salir del programa en cualquier momento.

### Ejemplo de ejecución:

