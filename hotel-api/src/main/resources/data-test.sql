

INSERT INTO cliente (id,dni_ce, nombres, apellidos, nacionalidad, email, password, role, telefono, fecha_de_nacimiento, created_at, update_at)
VALUES
    (1,'12345678', 'Juan', 'Perez', 'Peru', 'juan.perez@example.com', 'password123', 'USER', '999999999', '1985-01-15', '2024-01-01', '2024-01-01'),
    (2,'23456789', 'Maria', 'Lopez', 'Chile', 'maria.lopez@example.com', 'password123', 'USER', '998888888', '1990-03-20', '2024-01-02', '2024-01-02'),
    (3,'34567890', 'Carlos', 'Sanchez', 'Mexico', 'carlos.sanchez@example.com', 'password123', 'USER', '997777777', '1982-05-12', '2024-01-03', '2024-01-03'),
    (4,'45678901', 'Ana', 'Rodriguez', 'Colombia', 'ana.rodriguez@example.com', 'password123', 'ADMIN', '996666666', '1995-07-25', '2024-01-04', '2024-01-04'),
    (5,'56789012', 'Luis', 'Garcia', 'Argentina', 'luis.garcia@example.com', 'password123', 'USER', '995555555', '1989-09-08', '2024-01-05', '2024-01-05'),
    (6,'67890123', 'Pedro', 'Fernandez', 'Ecuador', 'pedro.fernandez@example.com', 'password123', 'USER', '994444444', '1991-10-10', '2024-01-06', '2024-01-06'),
    (7,'78901234', 'Lucia', 'Martinez', 'Bolivia', 'lucia.martinez@example.com', 'password123', 'USER', '993333333', '1993-11-15', '2024-01-07', '2024-01-07'),
    (8,'89012345', 'Miguel', 'Rojas', 'Peru', 'miguel.rojas@example.com', 'password123', 'ADMIN', '992222222', '1984-12-22', '2024-01-08', '2024-01-08'),
    (9,'90123456', 'Laura', 'Diaz', 'Venezuela', 'laura.diaz@example.com', 'password123', 'USER', '991111111', '1988-02-17', '2024-01-09', '2024-01-09'),
    (10,'01234567', 'Jorge', 'Morales', 'Uruguay', 'jorge.morales@example.com', 'password123', 'USER', '990000000', '1994-04-04', '2024-01-10', '2024-01-10'),
    (11,'23456701', 'Natalia', 'Silva', 'Peru', 'natalia.silva@example.com', 'password123', 'USER', '999111222', '1990-02-14', '2024-01-11', '2024-01-11'),
    (12,'34567012', 'Esteban', 'Gutierrez', 'Chile', 'esteban.gutierrez@example.com', 'password123', 'USER', '998122333', '1993-03-10', '2024-01-12', '2024-01-12'),
    (13,'45670123', 'Camila', 'Ramirez', 'Argentina', 'camila.ramirez@example.com', 'password123', 'ADMIN', '997133444', '1997-11-11', '2024-01-13', '2024-01-13'),
    (14,'56701234', 'Felipe', 'Castro', 'Mexico', 'felipe.castro@example.com', 'password123', 'USER', '996144555', '1986-06-23', '2024-01-14', '2024-01-14'),
    (15,'67812345', 'Andrea', 'Hernandez', 'Colombia', 'andrea.hernandez@example.com', 'password123', 'USER', '995155666', '1989-09-20', '2024-01-15', '2024-01-15'),
    (16,'78923456', 'Daniel', 'Navarro', 'Peru', 'daniel.navarro@example.com', 'password123', 'USER', '994166777', '1995-05-05', '2024-01-16', '2024-01-16'),
    (17,'89034567', 'Fernanda', 'Vega', 'Peru', 'fernanda.vega@example.com', 'password123', 'ADMIN', '993177888', '1990-12-12', '2024-01-17', '2024-01-17'),
    (18,'90145678', 'Rodrigo', 'Mejia', 'Ecuador', 'rodrigo.mejia@example.com', 'password123', 'USER', '992188999', '1992-07-13', '2024-01-18', '2024-01-18'),
    (19,'01256789', 'Paola', 'Jimenez', 'Chile', 'paola.jimenez@example.com', 'password123', 'USER', '991199111', '1985-10-20', '2024-01-19', '2024-01-19'),
    (20,'12367890', 'Ignacio', 'Mendoza', 'Bolivia', 'ignacio.mendoza@example.com', 'password123', 'USER', '990211222', '1991-01-01', '2024-01-20', '2024-01-20');
-- Insertar habitaciones
INSERT INTO habitacion (id,numero_habitacion, tipo_habitacion, capacidad, precio_por_noche, estado_habitacion, create_at, update_at)
VALUES
    (1,'101', 'Single', 1, 50.00, 'Disponible', '2024-01-01', '2024-01-01'),
    (2,'102', 'Double', 2, 75.00, 'Ocupado', '2024-01-02', '2024-01-02'),
    (3,'103', 'Suite', 4, 150.00, 'Disponible', '2024-01-03', '2024-01-03'),
    (4,'104', 'Single', 1, 55.00, 'Mantenimiento', '2024-01-04', '2024-01-04'),
    (5,'105', 'Double', 2, 80.00, 'Disponible', '2024-01-05', '2024-01-05'),
    (6,'106', 'Suite', 3, 120.00, 'Disponible', '2024-01-06', '2024-01-06'),
    (7,'107', 'Single', 1, 60.00, 'Ocupado', '2024-01-07', '2024-01-07'),
    (8,'108', 'Double', 2, 85.00, 'Mantenimiento', '2024-01-08', '2024-01-08'),
    (9,'109', 'Suite', 4, 160.00, 'Disponible', '2024-01-09', '2024-01-09'),
    (10,'110', 'Single', 1, 70.00, 'Disponible', '2024-01-10', '2024-01-10'),
    (11,'111', 'Single', 1, 50.00, 'Disponible', '2024-01-11', '2024-01-11'),
    (12,'112', 'Double', 2, 75.00, 'Ocupado', '2024-01-12', '2024-01-12'),
    (13,'113', 'Suite', 4, 150.00, 'Disponible', '2024-01-13', '2024-01-13'),
    (14,'114', 'Single', 1, 55.00, 'Mantenimiento', '2024-01-14', '2024-01-14'),
    (15,'115', 'Double', 2, 80.00, 'Disponible', '2024-01-15', '2024-01-15'),
    (16,'116', 'Suite', 3, 120.00, 'Disponible', '2024-01-16', '2024-01-16'),
    (17,'117', 'Single', 1, 60.00, 'Ocupado', '2024-01-17', '2024-01-17'),
    (18,'118', 'Double', 2, 85.00, 'Mantenimiento', '2024-01-18', '2024-01-18'),
    (19,'119', 'Suite', 4, 160.00, 'Disponible', '2024-01-19', '2024-01-19'),
    (20,'120', 'Single', 1, 70.00, 'Disponible', '2024-01-20', '2024-01-20');
-- Insertar servicios
INSERT INTO servicio (id,nombre_servicio, descripcion, precio, create_at, update_at)
VALUES
    (1,'Wi-Fi', 'Internet de alta velocidad', 10.00, '2024-01-01', '2024-01-01'),
    (2,'Desayuno', 'Desayuno buffet', 20.00, '2024-01-02', '2024-01-02'),
    (3,'Spa', 'Acceso al spa del hotel', 50.00, '2024-01-03', '2024-01-03'),
    (4,'Gimnasio', 'Acceso al gimnasio', 15.00, '2024-01-04', '2024-01-04'),
    (5,'Transporte', 'Transporte al aeropuerto', 30.00, '2024-01-05', '2024-01-05'),
    (6,'Lavandería', 'Servicio de lavandería', 25.00, '2024-01-06', '2024-01-06'),
    (7,'Piscina', 'Acceso a la piscina', 20.00, '2024-01-07', '2024-01-07'),
    (8,'Estacionamiento', 'Espacio de estacionamiento', 15.00, '2024-01-08', '2024-01-08'),
    (9,'Almuerzo', 'Servicio de almuerzo', 35.00, '2024-01-09', '2024-01-09'),
    (10,'Cena', 'Servicio de cena', 40.00, '2024-01-10', '2024-01-10'),
    (11,'Wi-Fi Premium', 'Internet ultra rápido', 20.00, '2024-01-11', '2024-01-11'),
    (12,'Excursiones', 'Tour guiado por la ciudad', 60.00, '2024-01-12', '2024-01-12'),
    (13,'Bar', 'Acceso al bar del hotel', 30.00, '2024-01-13', '2024-01-13'),
    (14,'Talleres', 'Talleres recreativos', 45.00, '2024-01-14', '2024-01-14'),
    (15,'Sauna', 'Acceso al sauna', 25.00, '2024-01-15', '2024-01-15'),
    (16,'Clases de Yoga', 'Clases de yoga matutinas', 30.00, '2024-01-16', '2024-01-16'),
    (17,'Masajes', 'Servicio de masajes relajantes', 70.00, '2024-01-17', '2024-01-17'),
    (18,'Conserjería', 'Servicio de conserjería', 15.00, '2024-01-18', '2024-01-18'),
    (19,'Mini Bar', 'Acceso al mini bar de la habitación', 50.00, '2024-01-19', '2024-01-19'),
    (20,'Clases de Tenis', 'Clases de tenis', 40.00, '2024-01-20', '2024-01-20');
-- Insertar reservas
INSERT INTO reservas (id,fecha_inicio, fecha_fin, estado_reserva, cliente_id, habitacion_id)
VALUES
    (1,'2024-02-01', '2024-02-05', 'Confirmada', 1, 1),
    (2,'2024-02-06', '2024-02-10', 'Confirmada', 2, 2),
    (3,'2024-02-11', '2024-02-15', 'Pendiente', 3, 3),
    (4,'2024-02-16', '2024-02-20', 'Cancelada', 4, 4),
    (5,'2024-02-21', '2024-02-25', 'Confirmada', 5, 5),
    (6,'2024-02-26', '2024-03-01', 'Pendiente', 6, 6),
    (7,'2024-03-02', '2024-03-06', 'Confirmada', 7, 7),
    (8,'2024-03-07', '2024-03-11', 'Confirmada', 8, 8),
    (9,'2024-03-12', '2024-03-16', 'Pendiente', 9, 9),
    (10,'2024-03-17', '2024-03-21', 'Cancelada', 10, 10),
    (11,'2024-03-22', '2024-03-26', 'Confirmada', 11, 11),
    (12,'2024-03-27', '2024-03-31', 'Pendiente', 12, 12),
    (13,'2024-04-01', '2024-04-05', 'Confirmada', 13, 13),
    (14,'2024-04-06', '2024-04-10', 'Confirmada', 14, 14),
    (15,'2024-04-11', '2024-04-15', 'Pendiente', 15, 15),
    (16,'2024-04-16', '2024-04-20', 'Cancelada', 16, 16),
    (17,'2024-04-21', '2024-04-25', 'Confirmada', 17, 17),
    (18,'2024-04-26', '2024-04-30', 'Pendiente', 18, 18),
    (19,'2024-05-01', '2024-05-05', 'Confirmada', 19, 19),
    (20,'2024-05-06', '2024-05-10', 'Pendiente', 20, 20);



-- Insertar reserva_servicio (reservas con servicios adicionales)
INSERT INTO reserva_servicio (id_reserva, id_servicio, added_date)
VALUES
    (1, 1, '2024-02-02'),
    (2, 2, '2024-02-07'),
    (3, 3, '2024-02-12'),
    (4, 4, '2024-02-17'),
    (5, 5, '2024-02-22'),
    (6, 6, '2024-02-27'),
    (7, 7, '2024-03-03'),
    (8, 8, '2024-03-08'),
    (9, 9, '2024-03-13'),
    (10, 10, '2024-03-18'),
    (11, 11, '2024-03-23'),
    (12, 12, '2024-03-28'),
    (13, 13, '2024-04-02'),
    (14, 14, '2024-04-07'),
    (15, 15, '2024-04-12'),
    (16, 16, '2024-04-17'),
    (17, 17, '2024-04-22'),
    (18, 18, '2024-04-27'),
    (19, 19, '2024-05-02'),
    (20, 20, '2024-05-07');

-- Insertar pagos
INSERT INTO pago (id,fecha_pago, monto, metodo_de_pago, reserva_id)
VALUES
    (1,'2024-02-02', 250.00, 'Tarjeta de Crédito', 1),
    (2,'2024-02-07', 375.00, 'Efectivo', 2),
    (3,'2024-02-12', 150.00, 'Transferencia Bancaria', 3),
    (4,'2024-02-17', 600.00, 'Tarjeta de Débito', 4),
    (5,'2024-02-22', 400.00, 'Tarjeta de Crédito', 5),
    (6,'2024-02-27', 450.00, 'Efectivo', 6),
    (7,'2024-03-03', 300.00, 'Transferencia Bancaria', 7),
    (8,'2024-03-08', 500.00, 'Tarjeta de Débito', 8),
    (9,'2024-03-13', 200.00, 'Tarjeta de Crédito', 9),
    (10,'2024-03-18', 350.00, 'Efectivo', 10),
    (11,'2024-03-23', 250.00, 'Transferencia Bancaria', 11),
    (12,'2024-03-28', 375.00, 'Tarjeta de Débito', 12),
    (13,'2024-04-02', 150.00, 'Tarjeta de Crédito', 13),
    (14,'2024-04-07', 600.00, 'Efectivo', 14),
    (15,'2024-04-12', 400.00, 'Transferencia Bancaria', 15),
    (16,'2024-04-17', 450.00, 'Tarjeta de Débito', 16),
    (17,'2024-04-22', 300.00, 'Tarjeta de Crédito', 17),
    (18,'2024-04-27', 500.00, 'Efectivo', 18),
    (19,'2024-05-02', 200.00, 'Transferencia Bancaria', 19),
    (20,'2024-05-07', 350.00, 'Tarjeta de Débito', 20);