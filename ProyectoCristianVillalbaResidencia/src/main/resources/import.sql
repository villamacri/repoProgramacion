INSERT INTO plan ( tipo, precio, servicios) VALUES ('Básico', 100.0, 'Alojamiento compartido, Limpieza semanal, 3 comidas al día, Atención básica de enfermería');

INSERT INTO plan ( tipo, precio, servicios) VALUES ('Intermedio', 200.0, 'Habitación individual, Limpieza diaria, 5 comidas al día, Revisión médica semanal');

INSERT INTO plan ( tipo, precio, servicios) VALUES ('Avanzado', 300.0, 'Habitación individual con baño, Limpieza diaria, Dieta personalizada, Atención médica 24h');

INSERT INTO plan ( tipo, precio, servicios) VALUES ('Premium', 400.0, 'Habitación privada, Comida gourmet, Servicios de fisioterapia, Actividades exclusivas, Wifi');

INSERT INTO plan ( tipo, precio, servicios) VALUES ('VIP', 500.0, 'Suite privada, Servicio de lavandería diario, Atención médica y psicológica 24h, Transporte privado, Acceso a spa y gimnasio');


INSERT INTO residente (nombre, apellido, url_foto, fecha_nacimiento, dni, nombre_familiar, plan_id) VALUES ('Lucía', 'Gómez', 'https://preview.redd.it/ynoffswkhyi51.png?auto=webp&s=bc79585424dec00d7189e1a5df6d97bcceda52fa', '1949-05-14', '12345678A', 'Carlos Gómez', 1);

INSERT INTO residente (nombre, apellido, url_foto, fecha_nacimiento, dni, nombre_familiar, plan_id) VALUES ('Miguel', 'Ramírez','https://ih1.redbubble.net/image.581819845.3804/tst,small,845x845-pad,1000x1000,f8f8f8.u2.jpg', '1944-11-22', '23456789B', 'Ana Ramírez', 2);

INSERT INTO residente (nombre, apellido, url_foto, fecha_nacimiento, dni, nombre_familiar, plan_id) VALUES ('Elena', 'Martín', 'https://uploads.candelaestereo.com/1/2017/03/k2_items_src_43f99f487414e634444018cb3bf4f66b.jpg', '1953-03-10', '34567890C', 'Luis Martín', 3);
