# Conversor de Monedas en Java

## Descripción

Este proyecto es una aplicación de consola desarrollada en Java que permite convertir montos entre diferentes monedas utilizando la API de ExchangeRate-API. La aplicación ofrece un menú interactivo donde el usuario puede seleccionar la moneda de origen y destino, ingresar el monto a convertir y obtener el resultado en tiempo real.

## Características

- Conversión entre múltiples pares de divisas.
- Interacción con la API de ExchangeRate-API para obtener las tasas de cambio actualizadas.
- Manejo de excepciones y verificación de respuestas HTTP.
- Interfaz de línea de comandos sencilla y fácil de usar.

## Requisitos

- Java 17 o superior.
- Conexión a internet para acceder a la API de ExchangeRate-API.

## Instalación

1. Clona el repositorio:

   ```bash
   git clone https://github.com/D4VID-01/conversor-de-monedas.git
   cd conversor-de-monedas

2. Abre el proyecto en tu IDE de Java preferido.

3. Compila y ejecuta la aplicación:
   
   ```bash
   javac Principal.java
   java Principal

## Uso

Al ejecutar la aplicación, se mostrará un menú con las siguientes opciones:

1. Convertir USD a MXN.
2. Convertir MXN a USD.
3. Convertir USD a EUR.
4. Convertir EUR a USD.
5. Convertir USD a COP.
6. Convertir COP a USD.
7. Salir.

Selecciona la opción deseada ingresando el número correspondiente. Luego, ingresa el monto a convertir y la aplicación mostrará el resultado en la moneda de destino.

## Contribuciones
Las contribuciones son bienvenidas. Si deseas mejorar este proyecto, por favor sigue estos pasos:

1. Haz un fork de este repositorio.

2. Crea una nueva rama para tu funcionalidad:

```bash
git checkout -b feature/nueva-funcionalidad
```

3. Realiza tus cambios y haz commit:

```bash
git commit -m 'Agregar nueva funcionalidad'
```

4. Sube tus cambios a tu fork:

```bash
git push origin feature/nueva-funcionalidad
```

5. Abre un Pull Request describiendo tus cambios.
