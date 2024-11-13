-- Inserción de categorías por defecto
INSERT INTO categoria (nombre, descripcion) VALUES ('Arte', 'Productos artesanales de arte');
INSERT INTO categoria (nombre, descripcion) VALUES ('Ropa', 'Ropa artesanal de algodón');
INSERT INTO categoria (nombre, descripcion) VALUES ('Juguetes', 'Juguetes hechos a mano');

-- Inserción de productos por defecto
INSERT INTO productos (nombre, precio, description, stock, categoria_id)
VALUES ('Cuadro Pintado a Mano', 50.00, 'Cuadro con pintura acrílica sobre lienzo', 10, (SELECT categoriaId FROM categoria WHERE nombre = 'Arte'));

INSERT INTO productos (nombre, precio, description, stock, categoria_id)
VALUES ('Camiseta de Algodón', 20.00, 'Camiseta de algodón artesanal', 30, (SELECT categoriaId FROM categoria WHERE nombre = 'Ropa'));

INSERT INTO productos (nombre, precio, description, stock, categoria_id)
VALUES ('Muñeco de Tela', 15.00, 'Muñeco artesanal de tela', 50, (SELECT categoriaId FROM categoria WHERE nombre = 'Juguetes'));
