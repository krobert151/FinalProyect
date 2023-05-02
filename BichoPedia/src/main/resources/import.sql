
insert into Familia (id,nombre,descripcion) values (1,'Lycosidae','Familia de Arañas Cazadoras');
insert into Familia (id,nombre,descripcion) values (2,'Salamandridae','Familia de las salamandras mas coumnes');
insert into Genero  (id,nombre,descripcion,familia_id) values (1,'Lycosa','Genero de arañas cazadoras',1);
insert into Genero  (id,nombre,descripcion,familia_id) values (2,'Triturus','Genero de tritones',2);
insert into Especie (id,nombre,descripcion,foto,genero_id) values (1,'lycosaHispanicus','Tarantula de España','fotico',1);
insert into Especie (id,nombre,descripcion,foto,genero_id) values (2,'Lycosa Lycosa','Lycosa común','fotico',1);
insert into Especie (id,nombre,descripcion,foto,genero_id) values (3,'Tritorus marmoratus','Tritón Jaspeado (mola)','fotico',2);
insert into Especie (id,nombre,descripcion,foto,genero_id) values (4,'Lissotron ibericus','Tritón iberico (mola con webos)','fotico',2);

