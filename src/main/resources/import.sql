-- Insertar categorías
INSERT INTO categoria (nombre, descripcion) VALUES
    ('Electrónica', 'Dispositivos electrónicos como teléfonos, laptops, y más'),
    ('Hogar', 'Productos para el hogar y cocina'),
    ('Deportes', 'Equipos y ropa deportiva');

-- Insertar productos asociados a las categorías
-- Los productos se insertan con la relación a la categoría ya establecida, usando categoria_id como clave foránea

INSERT INTO productos (nombre, precio, description, stock, categoria_id) VALUES
    ('Smartphone', 299.99, 'Teléfono inteligente con pantalla táctil', 50, 1),
    ('Laptop', 899.99, 'Laptop de alto rendimiento para trabajo y juegos', 30, 1),
    ('Televisión', 399.99, 'Televisión LED de 42 pulgadas', 20, 1),
    ('Aspiradora', 150.00, 'Aspiradora potente para limpieza de alfombras', 40, 2),
    ('Cafetera', 85.50, 'Cafetera automática para espresso', 15, 2),
    ('Bicicleta de montaña', 499.99, 'Bicicleta todo terreno', 10, 3),
    ('Pelota de fútbol', 19.99, 'Pelota de fútbol de alta calidad', 100, 3);
