CREATE TABLE IF NOT EXISTS imagenes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    url VARCHAR(255) NOT NULL,
    descripcion_es VARCHAR(500),
    descripcion_en VARCHAR(500)
);
CREATE TABLE reservas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cliente VARCHAR(100) NOT NULL,
    telefono VARCHAR(20),
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    acciones VARCHAR(255) -- Aunque no esté en tu constructor, lo dejamos en la tabla por si lo usas luego
);
CREATE TABLE contactos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefono VARCHAR(20),
    mensaje CLOB NOT NULL,
    fecha_envio TIMESTAMP NOT NULL
);