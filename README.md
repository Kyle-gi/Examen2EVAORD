# Tienda de Videojuegos - Ejercicio de Inversión de Control

## Descripción

Es un proyecto sencillo de gestión de una tienda de videojuegos que tiene algunos problemas de acoplamiento.

El sistema permite gestionar:
- **Videojuegos**: catálogo de productos con stock y precios
- **Clientes**: base de datos de clientes registrados
- **Ventas**: registro de transacciones con gestión automática de inventario

## Estructura del Proyecto

```
es.iesquevedo
├── Main.java                          # Punto de entrada
├── modelo/
│   ├── Cliente.java
│   ├── Videojuego.java
│   └── Venta.java
├── dao/
│   ├── ClienteRepository.java
│   ├── VideojuegoRepository.java
│   └── VentaRepository.java
├── service/
│   ├── ClienteService.java
│   ├── VideojuegoService.java
│   └── VentaService.java
├── ui/
│   └── ControladorConsola.java
└── util/
    └── GsonFactory.java
```

## Tecnologías

- **Java 21**
- **Maven** para gestión de dependencias
- **Gson 2.10.1** para persistencia JSON

## Ejecución

```bash
mvn exec:java
```

---

## 📋 Tareas a Realizar

### 1️⃣ Crear rama de trabajo
Crea nueva rama que se llame **"ioc"**.

```bash
git checkout -b ioc
```

### 2️⃣ Inversión de Dependencias (IoC)
Desacopla la aplicación según el **principio de inversión de dependencias**, inyectando las dependencias de forma manual.

- Debes crear interfaces y aplicar inyección de dependencias manual

**Haz un commit comentando los cambios realizados.**

### 3️⃣ Weld CDI
Utiliza **Weld** para automatizar la inyección de dependencias.

**Haz un commit comentando los cambios realizados.**

### 4️⃣ Pruebas Unitarias
Crear una prueba unitaria para el módulo **`buscarPorCodigo`** de `VideojuegoRepository`.

- Probar casos: videojuego existente, videojuego no existente

**Haz un commit comentando los cambios realizados.**

### 5️⃣ Merge y Pull Request
- Haz un **merge** a la rama principal
- Haz un último **commit**
- Solicita un **PR** al repositorio original

**Entrega**: Captura de GitHub donde se vea tu PR.

---

## 🎯 Criterios de Evaluación

- ✅ Correcta aplicación del principio de Inversión de Dependencias
- ✅ Uso adecuado de interfaces para desacoplamiento
- ✅ Configuración correcta de Weld CDI
- ✅ Pruebas unitarias funcionales y significativas
- ✅ Commits claros y descriptivos
- ✅ PR correctamente formateado

---

## 📚 Conceptos Clave

### Inversión de Dependencias (DIP)
Los módulos de alto nivel no deben depender de módulos de bajo nivel. Ambos deben depender de abstracciones.

### Inyección de Dependencias (DI)
Patrón de diseño que permite proporcionar las dependencias desde el exterior en lugar de crearlas internamente.

### Weld CDI
Implementación de referencia de Contexts and Dependency Injection para Java EE/Jakarta EE.

---

## 🔍 Notas Adicionales

- El proyecto usa **persistencia en JSON** mediante archivos en `/data`
- La gestión de **stock** se actualiza automáticamente al procesar ventas
- Las **validaciones** de negocio están en la capa de servicio

---

## 📝 Datos de Ejemplo

El proyecto incluye datos precargados:
- 3 clientes registrados
- 4 videojuegos en catálogo (PS5, Xbox, PC, Switch)
- 2 ventas de ejemplo

Los archivos JSON se encuentran en `/data/`:
- `clientes.json`
- `videojuegos.json`
- `ventas.json`

