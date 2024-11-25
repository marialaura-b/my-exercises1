DROP DATABASE IF EXISTS library;

CREATE DATABASE library;

USE library;

CREATE TABLE books(
    book_id INTEGER NOT NULL UNIQUE PRIMARY KEY,
    book_name VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    publish_date DATE NOT NULL,
    company VARCHAR(255) NOT NULL
);

CREATE TABLE users(
    user_id INTEGER NOT NULL UNIQUE PRIMARY KEY,
    user_name VARCHAR(255) NOT NULL
);

CREATE TABLE reservations(
    reservation_id INTEGER NOT NULL UNIQUE,
    user_id INTEGER NOT NULL,
    book_id INTEGER NOT NULL,
    is_loaned BOOLEAN NOT NULL default false,
    reservation_date DATE NOT NULL,
    PRIMARY KEY (book_id, user_id),
    FOREIGN KEY (book_id) REFERENCES books (book_id),
    FOREIGN KEY (user_id) REFERENCES users (user_id)
);

    INSERT INTO books(book_id, book_name, author, publish_date, company)
    VALUES  (1, "O mundo da fotografia", "Igor", '2021-01-01', "Glert"),
            (2, "A Arte de Programar", "Carlos Souza", '2019-05-12', "TechBooks"),
            (3, "JavaScript e Maizena", "Maria Oliveira", '2020-07-22', "CodePress"),
            (4, "Design Gráfico Essencial", "João Silva", '2018-03-15', "Designer"),
            (5, "Introdução à Inteligência Artificial", "Ana Costa", '2022-09-10', "MindTech");

    INSERT INTO users(user_id, user_name)
    VALUES  (1, "João Silva"),
            (2, "Maria Oliveira"),
            (3, "Carlos Souza"),
            (4, "Fernanda Almeida"),
            (5, "Pedro Santos");

    INSERT INTO reservations(reservation_id, user_id, book_id, is_loaned, reservation_date)
    VALUES  (1001, 1, 1, true, '2019-09-11'),
            (1002, 2, 2, false, '2002-07-09'),
            (1003, 3, 3, true, '1990-05-30'),
            (1004, 4, 4, false, '2020-12-27'),
            (1005, 5, 5, true, '2020-12-31');

    -- QUERYS
    SELECT book_name, author, publish_date, company FROM books WHERE author LIKE 'João Silva';
    SELECT COUNT(*) AS books_out_on_loan FROM reservations WHERE is_loaned = true;
    SELECT book_name AS tutorial_como_fazer_maconha FROM books WHERE company = "CodePress";
    SELECT DISTINCT u.user_name FROM users u JOIN reservations r ON u.user_id = r.user_id JOIN books b ON r.book_id = b.book_id WHERE b.publish_date < '1974-01-01' AND r.is_loaned = true;