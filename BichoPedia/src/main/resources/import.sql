insert into Usuario (id,nombre,apellidos,correo,username,passwd,fechaNac,administrator) values (1,'Roberto','Rebolledo Naharro', 'robertorebolledo151@gmail.com', 'krobert151','{bcrypt}$2a$10$A9DV.mG33AJifviPz4BxOOeRoHh15fuPNKpM3dOd6AFH6uz4EH1wC','2004-10-12',true);
insert into Usuario (id,nombre,apellidos,correo,username,passwd,fechaNac,administrator) values (2,'User','Useruser', 'useruser@gmail.com', 'user','{bcrypt}$2a$10$RwEPPcLsFl9CLtewb/3ksOnazOUtSexxXF01x6mSJOfU/I2CFmMrW','1990-10-10',false);
insert into Usuario (id,nombre,apellidos,correo,username,passwd,fechaNac,administrator) values (3,'Admin','AdminAdmin', 'adminadmin@gmail.com', 'admin','{bcrypt}$2a$10$wdNOqfAzt8.QbKs4B7VzSepgh6SzjqIHApOGq/bUj6tTPQl4Htp4G','1990-10-10',true);

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
insert into Orden   (id,nombre,descripcion,clase_id) values (6,'Anura','Orden de las ranas',2);
insert into Orden   (id,nombre,descripcion,clase_id) values (7,'Escorpiones','Orden de los escorpiones',1);


insert into Familia (id,nombre,descripcion,orden_id) values (1,'Lycosidae','Familia de Arañas Cazadoras',1);
insert into Familia (id,nombre,descripcion,orden_id) values (2,'Salamandridae','Familia de las salamandras mas coumnes',2);
insert into Familia (id,nombre,descripcion,orden_id) values (3,'Accipitridae','Familia de las aves rapaces',3);
insert into Familia (id,nombre,descripcion,orden_id) values (4,'Lacertidae','Lagartijas y lagartos comunes',4);
insert into Familia (id,nombre,descripcion,orden_id) values (5,'Felidae','Felinos',5);
insert into Familia (id,nombre,descripcion,orden_id) values (6,'Bufonidae','Sapos Comunes',6);
insert into Familia (id,nombre,descripcion,orden_id) values (7,'Pelobatidae','Sapos de Espuela',6);
insert into Familia (id,nombre,descripcion,orden_id) values (8,'Hylidae','Ranas arborícolas',6);
insert into Familia (id,nombre,descripcion,orden_id) values (9,'Phyllodactylidae','Geckos de Europa',4);
insert into Familia (id,nombre,descripcion,orden_id) values (10,'Gekkonidae','Geckos',4);
insert into Familia (id,nombre,descripcion,orden_id) values (11,'Lacertidae','Lacertidos',4);
insert into Familia (id,nombre,descripcion,orden_id) values (12,'Colubridae','Culebras',4);
insert into Familia (id,nombre,descripcion,orden_id) values (13,'Buthidae','Escorpiones',7);
insert into Familia (id,nombre,descripcion,orden_id) values (14,'Herpestidae','Familia de mamiferos',5);




insert into Genero  (id,nombre,descripcion,familia_id) values (1,'Lycosa','Genero de arañas cazadoras',1);
insert into Genero  (id,nombre,descripcion,familia_id) values (2,'Triturus','Genero de tritones',2);
insert into Genero  (id,nombre,descripcion,familia_id) values (3,'Gypaetus','Genero de buitre-aguila',3);
insert into Genero  (id,nombre,descripcion,familia_id) values (4,'Timon ','Genero de Lagartos del sur de Europa',4);
insert into Genero  (id,nombre,descripcion,familia_id) values (5,'Aquila ','Genero de Aguilas',3);
insert into Genero  (id,nombre,descripcion,familia_id) values (6,'Lynx ','Linces',5);
insert into Genero  (id,nombre,descripcion,familia_id) values (7,'Bufo ','Genero de los sapos mas comunes',6);
insert into Genero  (id,nombre,descripcion,familia_id) values (8,'Epidalea ','Genero de los sapos corredores',6);
insert into Genero  (id,nombre,descripcion,familia_id) values (9,'Pelobates ','Genero de los sapos de espuelas',7);
insert into Genero  (id,nombre,descripcion,familia_id) values (10,'Hyla ','Genero de las ranas arboricolas',8);
insert into Genero  (id,nombre,descripcion,familia_id) values (11,'Pleurodelest','Genero de salamandras',2);
insert into Genero  (id,nombre,descripcion,familia_id) values (12,'Salamandra','Genero de salamandras comunes',2);
insert into Genero  (id,nombre,descripcion,familia_id) values (13,'Tarentola','Genero de salamanquesas comunes',9);
insert into Genero  (id,nombre,descripcion,familia_id) values (14,'Hemidactylus','Genero de geckos comunes',10);
insert into Genero  (id,nombre,descripcion,familia_id) values (15,'Psammodromus','Genero de lagartijas comunes',11);
insert into Genero  (id,nombre,descripcion,familia_id) values (16,'Natrix','Genero de culebras',12);
insert into Genero  (id,nombre,descripcion,familia_id) values (17,'Zamenis','Genero de culebras',12);
insert into Genero  (id,nombre,descripcion,familia_id) values (18,'Buthus','Escorpiones amarillos',13);
insert into Genero  (id,nombre,descripcion,familia_id) values (19,'Herpestes','Mangostas',14);


insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (1,'lycosaHispanicus','Tarantula de España','detalles','https://lahuertinadetoni.es/wp-content/uploads/2015/01/233-163-Copiar.jpg',1);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (2,'Lycosa Lycosa','Lycosa común','detalles','https://misanimales.com/wp-content/uploads/2022/01/ojo-arana-lobo-768x512.jpg',1);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (3,'Tritorus marmoratus','Tritón Jaspeado (mola)','detalles','https://selvaasturiana.com/wp-content/uploads/2016/06/Triton-jaspeado.jpg',2);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (4,'Lissotron ibericus','Tritón iberico (mola con webos)','detalles','https://www.vertebradosibericos.org/anfibios/identificacion/lisbosida.jpg',2);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (5,'Gypaetus barbatus','El quebrantahuesos','detalles','https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/Bartgeier_%28Gypaetus_barbatus%29_01.jpg/1200px-Bartgeier_%28Gypaetus_barbatus%29_01.jpg',3);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (6,'Timon lepidus','Lagarto Ocelado','detalles','https://misanimales.com/wp-content/uploads/2020/12/lagarto-ocelado-abre-boca-1024x683.jpg',4);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (7,'Timon nevadensis','Lagarto Bético','detalles','https://static.inaturalist.org/photos/83954014/large.jpg',4);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (8,'Aquila adalberti','Aguila imperial ibérica','detalles','https://iberianlynxland.com/wp-content/uploads/2021/11/aguila_imperial.jpg',5);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (9,'Lynx pardinus','Lince ibérco','detalles','https://e00-elmundo.uecdn.es/assets/multimedia/imagenes/2022/03/21/16478695249126.jpg',6);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (10,'Bufo bufo','Sapo Común','detalles','https://upload.wikimedia.org/wikipedia/commons/8/81/Bufo_bufo_03.jpg',7);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (11,'Epidalea calamita','Sapo corredor','detalles','https://upload.wikimedia.org/wikipedia/commons/thumb/3/39/Epidalea_calamita_01_by-dpc.jpg/1200px-Epidalea_calamita_01_by-dpc.jpg',8);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (12,'Pelobates cultripes','Sapo de espuelas','detalles','https://static.inaturalist.org/photos/46513345/large.jpg',9);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (13,'Hyla meridionalis','Ranita meridional','detalles','https://1.bp.blogspot.com/-AQoPkPs2sHU/UhCO-JxFflI/AAAAAAAAGtE/qWd9WZ_TDCk/s1600/IMG_8169.jpg',10);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (14,'Pleurodelest Waltl','Gallipato','detalles','https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Pleurodeles_waltl_BUD.jpg/1280px-Pleurodeles_waltl_BUD.jpg',11);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (15,'Salamandra Salamandra','Salamandra común','detalles','https://misanimales.com/wp-content/uploads/2021/01/salamandra-musgo.jpg',12);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (16,'Tarentola mauritanica','Salamanquesa común','detalles','https://static.inaturalist.org/photos/21873580/large.jpeg',13);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (17,'Hemidactylus turcicus','Salamanquesa rosada','detalles','https://inaturalist-open-data.s3.amazonaws.com/photos/171801218/large.jpg',14);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (18,'Psammodromus algirus','Lagartija colilarga','detalles','https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Psammodromus_algirus_2601.jpg/1280px-Psammodromus_algirus_2601.jpg',15);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (19,'Natrix Maura','Culebra viperina','detalles','https://www.montesdevalsain.es/images/Natmau4_a.jpg',16);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (20,'Natrix natrix','Culebra de collar','detalles','https://www.fishipedia.es/wp-content/uploads/2021/04/34888189801_2182df33f2_h.jpeg',16);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (21,'Zamenis scalaris','Culebra de escalera','detalles','https://www.vertebradosibericos.org/reptiles/identificacion/rhiscaid1.jpg',17);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (22,'Buthus occitanus','alacrán','detalles','https://granadanatural.com/imagenes/fauna_fichas/buthus-occitanus-1.jpg',18);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (23,'Buthus ibericus','alacrán ibérico','detalles','https://www.biodiversidadvirtual.org/insectarium/data/media/9033/Buthus-ibericus-1-de-2-972736.jpg',18);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (24,'Herpestes ichneumon','Meloncillo','detalles','https://cazaworld.com/wp-content/uploads/2018/10/Meloncillo.jpg',19);



insert into Encuentro (id,usuario_id,especie_id,fecha,descripcion,foto,zona,tamanio,peso,sexo) values (1,1,1,'2023-01-01T12:30:30','encuentro de un bicho','https://lahuertinadetoni.es/wp-content/uploads/2015/01/233-163-Copiar.jpg','Gerena',10,5,'f');

alter sequence hibernate_sequence restart with 1000;
