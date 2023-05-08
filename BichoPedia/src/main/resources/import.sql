insert into Usuario (nombre,apellidos,correo,username,passwd,fechaNac,administrator) values ('Roberto','Rebolledo Naharro', 'robertorebolledo151@gmail.com', 'krobert151','{bcrypt}$2a$10$T8oP9NRoHGAhJgiiSH0R3udRenWQVQqF6BMFfNL4hyNpME1L/dFqy','2004-10-12',true);
insert into Usuario (nombre,apellidos,correo,username,passwd,fechaNac,administrator) values ('User','Useruser', 'useruser@gmail.com', 'user','{bcrypt}$2a$10$RwEPPcLsFl9CLtewb/3ksOnazOUtSexxXF01x6mSJOfU/I2CFmMrW','1990-10-10',false);
insert into Usuario (nombre,apellidos,correo,username,passwd,fechaNac,administrator) values ('Admin','AdminAdmin', 'adminadmin@gmail.com', 'admin','{bcrypt}$2a$10$KJUpOwFP/rY041YWmnhbru9l/jy8KoNmBl/UXhw0NRFFZA2hdhLSu','1990-10-10',true);

insert into Reino   (id,nombre,descripcion) values (1,'Animal','Reino animal');

insert into Filo    (id,nombre,descripcion,reino_id) values (1,'Artropodos','Filo de los artropodos',1);
insert into Filo    (id,nombre,descripcion,reino_id) values (2,'Chordata','Filo de los vertebrados',1);

insert into Clase   (id,nombre,descripcion,filo_id) values (1,'Aracnidos','Clase de los aracnidos',1);
insert into Clase   (id,nombre,descripcion,filo_id) values (2,'Amphibia','Clase de los amphibios',2);
insert into Clase   (id,nombre,descripcion,filo_id) values (3,'Aves','Clase de las aves',2);
insert into Clase   (id,nombre,descripcion,filo_id) values (4,'Sauropsida','Lagartos y Serpientes',2);
insert into Clase   (id,nombre,descripcion,filo_id) values (5,'Mamalia','Mamiferos',2);

insert into Orden   (id,nombre,descripcion,clase_id) values (1,'Aranae','Orden de las arañas',1);
insert into Orden   (id,nombre,descripcion,clase_id) values (2,'Urodelos','Orden de las salamandras',2);
insert into Orden   (id,nombre,descripcion,clase_id) values (3,'Accipitriformes','Aves rapaces diurnas',3);
insert into Orden   (id,nombre,descripcion,clase_id) values (4,'Squamata','Lagartos escamosos',4);
insert into Orden   (id,nombre,descripcion,clase_id) values (5,'Carnivora','Mamiferos carnivoros',5);

insert into Familia (id,nombre,descripcion,orden_id) values (1,'Lycosidae','Familia de Arañas Cazadoras',1);
insert into Familia (id,nombre,descripcion,orden_id) values (2,'Salamandridae','Familia de las salamandras mas coumnes',2);
insert into Familia (id,nombre,descripcion,orden_id) values (3,'Accipitridae','Familia de las aves rapaces',3);
insert into Familia (id,nombre,descripcion,orden_id) values (4,'Lacertidae','Lagartijas y lagartos comunes',4);
insert into Familia (id,nombre,descripcion,orden_id) values (5,'Felidae','Felinos',5);

insert into Genero  (id,nombre,descripcion,familia_id) values (1,'Lycosa','Genero de arañas cazadoras',1);
insert into Genero  (id,nombre,descripcion,familia_id) values (2,'Triturus','Genero de tritones',2);
insert into Genero  (id,nombre,descripcion,familia_id) values (3,'Gypaetus','Genero de buitre-aguila',3);
insert into Genero  (id,nombre,descripcion,familia_id) values (4,'Timon ','Genero de Lagartos del sur de Europa',4);
insert into Genero  (id,nombre,descripcion,familia_id) values (5,'Aquila ','Genero de Aguilas',3);
insert into Genero  (id,nombre,descripcion,familia_id) values (6,'Lynx ','Linces',5);


insert into Especie (id,nombre,descripcion,foto,genero_id) values (1,'lycosaHispanicus','Tarantula de España','https://lahuertinadetoni.es/wp-content/uploads/2015/01/233-163-Copiar.jpg',1);
insert into Especie (id,nombre,descripcion,foto,genero_id) values (2,'Lycosa Lycosa','Lycosa común','https://misanimales.com/wp-content/uploads/2022/01/ojo-arana-lobo-768x512.jpg',1);
insert into Especie (id,nombre,descripcion,foto,genero_id) values (3,'Tritorus marmoratus','Tritón Jaspeado (mola)','https://selvaasturiana.com/wp-content/uploads/2016/06/Triton-jaspeado.jpg',2);
insert into Especie (id,nombre,descripcion,foto,genero_id) values (4,'Lissotron ibericus','Tritón iberico (mola con webos)','https://www.vertebradosibericos.org/anfibios/identificacion/lisbosida.jpg',2);
insert into Especie (id,nombre,descripcion,foto,genero_id) values (5,'Gypaetus barbatus','El quebrantahuesos','https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/Bartgeier_%28Gypaetus_barbatus%29_01.jpg/1200px-Bartgeier_%28Gypaetus_barbatus%29_01.jpg',3);
insert into Especie (id,nombre,descripcion,foto,genero_id) values (6,'Timon lepidus','Lagarto Ocelado','https://misanimales.com/wp-content/uploads/2020/12/lagarto-ocelado-abre-boca-1024x683.jpg',4);
insert into Especie (id,nombre,descripcion,foto,genero_id) values (7,'Timon nevadensis','Lagarto Bético','https://static.inaturalist.org/photos/83954014/large.jpg',4);
insert into Especie (id,nombre,descripcion,foto,genero_id) values (8,'Aquila adalberti','Aguila imperial ibérica','https://iberianlynxland.com/wp-content/uploads/2021/11/aguila_imperial.jpg',5);
insert into Especie (id,nombre,descripcion,foto,genero_id) values (9,'Lynx pardinus','Lince ibérco','https://e00-elmundo.uecdn.es/assets/multimedia/imagenes/2022/03/21/16478695249126.jpg',6);


insert into Encuentro (id,usuario_id,especie_id,fecha,descripcion,foto,zona,tamanio,peso,sexo) values (1,1,1,'2023-01-01T12:30:30','encuentro de un bicho','https://lahuertinadetoni.es/wp-content/uploads/2015/01/233-163-Copiar.jpg','Gerena',10,5,'f');

alter sequence hibernate_sequence restart with 1000;
