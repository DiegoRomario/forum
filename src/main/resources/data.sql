INSERT INTO USUARIO(nome, email, senha) VALUES('aluno', 'aluno@email.com', '$2a$10$04XIkRG1zj5CJagw3BDFbu94QJ73q2nKdzcoXchrj7aV7a6GBl0vq');
INSERT INTO USUARIO(nome, email, senha) VALUES('moderador', 'moderador@email.com', '$2a$10$04XIkRG1zj5CJagw3BDFbu94QJ73q2nKdzcoXchrj7aV7a6GBl0vq');

INSERT INTO PERFIL(id, nome) VALUES(1, 'ROLE_ALUNO');
INSERT INTO PERFIL(id, nome) VALUES(2, 'ROLE_MODERADOR');

INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(1, 1);
INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES(2, 2);

INSERT INTO CURSO(nome, categoria) VALUES('Spring Boot', 'Programação');
INSERT INTO CURSO(nome, categoria) VALUES('HTML 5', 'Front-end');

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida', 'Deu pau', '2019-05-05 18:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 2', 'Projeto não funciona', '2019-05-05 19:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Dúvida 3', 'Tag HTML louca', '2019-05-05 20:00:00', 'NAO_RESPONDIDO', 1, 2);