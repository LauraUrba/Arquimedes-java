CREATE DATABASE Arquimedes;

USE Arquimedes;

CREATE TABLE Usuario (
    Matricula integer PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(255),
    Email VARCHAR(100),
    Endereco VARCHAR(100),
    Telefone VARCHAR(20)
);

CREATE TABLE Cadastro (
U_LoginCadastro varchar (50) primary key,
Senha varchar (50)
);

CREATE TABLE Administrador (
    idAdministrador INT PRIMARY KEY AUTO_INCREMENT,
    Permissoes VARCHAR(50)
);

CREATE TABLE Livro (
    Codigo integer PRIMARY KEY AUTO_INCREMENT,
    Titulo VARCHAR(255),
    Estado VARCHAR(100),
    Autor VARCHAR(255),
    Status VARCHAR(50),
    Categoria_Genero VARCHAR(50),
    Sinopse TEXT
);

CREATE TABLE Compra (
    idCompra INT PRIMARY KEY AUTO_INCREMENT,
    CodigoLivro INT,
    MatriculaUsuario INT,
    Data DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (CodigoLivro) REFERENCES Livro(Codigo),
    FOREIGN KEY (MatriculaUsuario) REFERENCES Usuario(Matricula)
);



