-- Insertar planes
INSERT INTO plan (id, nombre, precio) VALUES (1, 'Básico', 100.0);
INSERT INTO plan (id, nombre, precio) VALUES (2, 'Premium', 200.0);
INSERT INTO plan (id, nombre, precio) VALUES (3, 'VIP', 300.0);

-- Insertar residentes
INSERT INTO residente (id, nombre, apellido, edad, dni, nombre_familiar, plan_id) VALUES (1, 'Lucía', 'Gómez', 75, '12345678A', 'Carlos Gómez', 1);
INSERT INTO residente (id, nombre, apellido, edad, dni, nombre_familiar, plan_id) VALUES (2, 'Miguel', 'Ramírez', 80, '23456789B', 'Ana Ramírez', 2);
INSERT INTO residente (id, nombre, apellido, edad, dni, nombre_familiar, plan_id) VALUES (3, 'Elena', 'Martín', 68, '34567890C', 'Luis Martín', 3);