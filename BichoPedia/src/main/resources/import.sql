
insert into Familia (id,nombre,descripcion) values (1,'Lycosidae','Familia de Arañas Cazadoras');
insert into Familia (id,nombre,descripcion) values (2,'Salamandridae','Familia de las salamandras mas coumnes');
insert into Genero  (id,nombre,descripcion,familia_id) values (1,'Lycosa','Genero de arañas cazadoras',1);
insert into Genero  (id,nombre,descripcion,familia_id) values (2,'Triturus','Genero de tritones',2);
insert into Especie (id,nombre,descripcion,foto,genero_id) values (1,'lycosaHispanicus','Tarantula de España','https://lahuertinadetoni.es/wp-content/uploads/2015/01/233-163-Copiar.jpg',1);
insert into Especie (id,nombre,descripcion,foto,genero_id) values (2,'Lycosa Lycosa','Lycosa común','https://misanimales.com/wp-content/uploads/2022/01/ojo-arana-lobo-768x512.jpg',1);
insert into Especie (id,nombre,descripcion,foto,genero_id) values (3,'Tritorus marmoratus','Tritón Jaspeado (mola)','https://selvaasturiana.com/wp-content/uploads/2016/06/Triton-jaspeado.jpg',2);
insert into Especie (id,nombre,descripcion,foto,genero_id) values (4,'Lissotron ibericus','Tritón iberico (mola con webos)','https://www.vertebradosibericos.org/anfibios/identificacion/lisbosida.jpg',2);

