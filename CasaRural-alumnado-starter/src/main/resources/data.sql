INSERT INTO imagenes (url, descripcion_es, descripcion_en)
VALUES ('https://bit.ly/3yLp9p6', 'Vista exterior de la casa', 'Exterior view of the house');

INSERT INTO imagenes (url, descripcion_es, descripcion_en)
VALUES ('https://bit.ly/3M6W5T2', 'Nuestra habitación principal', 'Our main bedroom');
INSERT INTO reservas (cliente, telefono, fecha_inicio, fecha_fin, acciones)
VALUES
('Juan Pérez', '600112233', '2026-06-01', '2026-06-07', 'Ninguna'),
('María García', '655443322', '2026-07-15', '2026-07-20', 'Cuna supletoria'),
('Carlos Ruiz', '611889900', '2026-08-10', '2026-08-15', 'Trae mascota'),
('Ana López', '633221100', '2026-05-20', '2026-05-25', 'Check-in tardío');
-- data.sql
INSERT INTO contactos (nombre, email, telefono, mensaje, fecha_envio)
VALUES ('Juan Pérez', 'juan.perez@example.com', '123456789', 'Hola, me gustaría más información.', CURRENT_TIMESTAMP);

INSERT INTO contactos (nombre, email, telefono, mensaje, fecha_envio)
VALUES ('María García', 'maria.garcia@example.com', '987654321', 'Excelente servicio, saludos.', CURRENT_TIMESTAMP);