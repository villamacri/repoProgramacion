INSERT INTO plan ( tipo, precio, servicios) VALUES ('Básico', 100.0, 'Alojamiento compartido, Limpieza semanal, 3 comidas al día, Atención básica de enfermería');

INSERT INTO plan ( tipo, precio, servicios) VALUES ('Intermedio', 200.0, 'Habitación individual, Limpieza diaria, 5 comidas al día, Revisión médica semanal');

INSERT INTO plan ( tipo, precio, servicios) VALUES ('Avanzado', 300.0, 'Habitación individual con baño, Limpieza diaria, Dieta personalizada, Atención médica 24h');

INSERT INTO plan ( tipo, precio, servicios) VALUES ('Premium', 400.0, 'Habitación privada, Comida gourmet, Servicios de fisioterapia, Actividades exclusivas, Wifi');

INSERT INTO plan ( tipo, precio, servicios) VALUES ('VIP', 500.0, 'Suite privada, Servicio de lavandería diario, Atención médica y psicológica 24h, Transporte privado, Acceso a spa y gimnasio');


INSERT INTO residente (nombre, apellido, fecha_nacimiento, dni, nombre_familiar, plan_id) VALUES ('Lucía', 'Gómez', '1949-05-14', '12345678A', 'Carlos Gómez', 1);

INSERT INTO residente (nombre, apellido, fecha_nacimiento, dni, nombre_familiar, plan_id) VALUES ('Miguel', 'Ramírez', '1944-11-22', '23456789B', 'Ana Ramírez', 2);

INSERT INTO residente (nombre, apellido, fecha_nacimiento, dni, nombre_familiar, plan_id) VALUES ('Elena', 'Martín', '1953-03-10', '34567890C', 'Luis Martín', 3);
