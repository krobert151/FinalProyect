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


insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (1,'lycosa Hispanicus','Tarantula de España','Lycosa hispanica, también conocida como araña lobo ibérica, es una especie de araña que se encuentra principalmente en la península ibérica. Es una araña de tamaño mediano, con un cuerpo marrón rojizo y patas largas y delgadas de color amarillo pálido. Su hábitat natural son las áreas boscosas, aunque también se pueden encontrar en zonas urbanas.Esta especie de araña es depredadora y se alimenta de otros insectos y arañas. A diferencia de otras especies de arañas, la lycosa hispanica no construye una tela para cazar, sino que persigue y caza a su presa utilizando su velocidad y habilidades de camuflaje.En cuanto a su comportamiento reproductivo, los machos de lycosa hispanica construyen un pequeño nido en el suelo y esperan a que una hembra entre. Una vez dentro, el macho emite feromonas para atraer a la hembra y aparearse con ella. Después de la cópula, la hembra pondrá sus huevos dentro del nido del macho y los cuidará hasta que eclosionen. Es importante tener en cuenta que la lycosa hispanica no es venenosa para los humanos y, de hecho, puede ser beneficiosa para controlar las poblaciones de insectos en áreas urbanas y rurales.','https://lahuertinadetoni.es/wp-content/uploads/2015/01/233-163-Copiar.jpg',1);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (2,'Lycosa Lycosa','Lycosa común','Lycosa Lycosa, comúnmente conocida como tarántula común europea, es una especie de araña de la familia Lycosidae. Esta especie se encuentra en toda Europa y Asia, desde el sur de Escandinavia hasta el norte de África y el Cáucaso. Es una araña grande y peluda, que puede medir hasta 2,5 cm de longitud. Su color varía de marrón oscuro a marrón claro o amarillento, y tiene una marca distintiva en forma de corazón en la parte posterior de su abdomen. Las tarántulas comunes europeas son depredadoras nocturnas y cazadoras activas, y se alimentan principalmente de insectos, aunque también pueden comer otros arácnidos y pequeños vertebrados. A diferencia de otras arañas que construyen telas, las tarántulas comunes europeas no construyen telarañas para atrapar presas. En su lugar, cazan persiguiendo a sus presas en el suelo. Estas arañas también son conocidas por su veneno, que puede causar dolor y reacciones alérgicas en los seres humanos. Sin embargo, su mordedura no es mortal para los humanos y rara vez se produce una reacción grave.','https://misanimales.com/wp-content/uploads/2022/01/ojo-arana-lobo-768x512.jpg',1);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (3,'Tritorus marmoratus','Tritón Jaspeado (mola)','Triturus marmoratus, también conocido como tritón marmóreo, es un anfibio caudado de la familia Salamandridae. Esta especie es endémica de la Península Ibérica, y se puede encontrar en diversos hábitats acuáticos, desde pequeñas charcas hasta grandes ríos y embalses. El tritón marmóreo es un animal de tamaño mediano, que puede llegar a alcanzar los 15 cm de longitud total. Presenta una coloración muy vistosa, con un fondo negro y una serie de manchas y verrugas de color amarillo, naranja o rojo brillante. Además, los machos en época de reproducción desarrollan una cresta dorsal más alta y llamativa. Esta especie se alimenta de una amplia variedad de presas acuáticas, como insectos, crustáceos, moluscos y otros anfibios más pequeños. A pesar de que no se considera una especie amenazada, el tritón marmóreo está protegido por diversas leyes y normativas debido a su valor ecológico y cultural.','https://selvaasturiana.com/wp-content/uploads/2016/06/Triton-jaspeado.jpg',2);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (4,'Lissotron boscai','Tritón iberico (mola con webos)','Es un urodelo de pequeño tamaño que puede alcanzar hasta 97 mm de longitud total. Los machos no desarrollan cresta dorsal, sino sólo una cresta caudal baja durante el periodo de celo. La cola, de similar longitud al cuerpo, está comprimida lateralmente, y en los machos acaba en un pequeñísimo filamento. La coloración de cabeza y dorso es de color pardo o marrón, y ventralmente es de color naranja o rojizo, sobre el que destacan conspicuas manchas o puntos gruesos negros, irregularmente dispuestos, pero frecuentemente alineados lateralmente.','https://www.vertebradosibericos.org/anfibios/identificacion/lisbosida.jpg',2);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (5,'Gypaetus barbatus','El quebrantahuesos','El quebrantahuesos (Gypaetus barbatus, literalmente «buitre-águila barbado») es una especie de ave accipitriforme de la familia Accipitridae. Es un buitre notablemente distinto de otras aves de presa parecidas. Recibe su nombre por su costumbre de recoger huesos y caparazones hasta grandes alturas para soltarlos, partirlos contra las rocas y poder ingerirlos para alimentarse. Se trata de una especie amenazada en amplias zonas de su distribución, y en el continente europeo es un animal en grave peligro de extinción que ha desaparecido de varias regiones donde antes era abundante. En la actualidad se le puede observar en la cordillera Cantábrica (donde ha sido reintroducido gracias a ejemplares oscenses), los Pirineos, los Alpes (donde ha sido reintroducido), norte de África, el Gran Valle del Rift, Sudáfrica, Grecia y desde Anatolia hasta los montes Tian Shan y el Himalaya.','https://upload.wikimedia.org/wikipedia/commons/thumb/8/8e/Bartgeier_%28Gypaetus_barbatus%29_01.jpg/1200px-Bartgeier_%28Gypaetus_barbatus%29_01.jpg',3);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (6,'Timon lepidus','Lagarto Ocelado','El lagarto ocelado es uno de los principales miembros de su familia. El adulto mide de 30 a 60 cm (1-2 pies) de largo y puede alcanzar hasta 90 cm (3 pies), con un peso de más de 0,5 kg (1,1 libras). Recién nacidos miden de 4 a 5 cm (1½-2) de largo, excluyendo la cola. Es un lagarto robusto. El macho tiene la cabeza ancha con patas gruesas y fuertes, y garras largas y curvadas. El color dorsal es generalmente de color verde, pero a veces puede ser gris o marrón, especialmente en la cabeza y la cola. A esto se superpone un punteado negro. La parte inferior es de color amarillenta o verdosa. El macho es más brillante que la hembra y tiene manchas azules en sus flancos. Los jóvenes son de color verde, gris o marrón, con partes amarillentas o blancas con manchas por todas partes.','https://misanimales.com/wp-content/uploads/2020/12/lagarto-ocelado-abre-boca-1024x683.jpg',4);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (7,'Timon nevadensis','Lagarto Bético','El lagarto bético o lagarto de Sierra Nevada (Timon nevadensis) es una especie de lagarto endémico del sureste de la península ibérica. En ocasiones aparece descrito como una subespecie de lagarto ocelado (Timon lepidus nevadensis).','https://static.inaturalist.org/photos/83954014/large.jpg',4);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (8,'Aquila adalberti','Aguila imperial ibérica','El plumaje de los ejemplares adultos es de un pardo muy oscuro en todo el cuerpo, excepto en los hombros y la parte alta de las alas, donde es de color pardo salpicado de plumas blancas. La nuca es ligeramente más pálida que otras partes del cuerpo, y la cola más oscura, sin bandas claras o líneas blancas como en el águila imperial oriental. En el caso de los individuos juveniles, de menos de un año, la coloración es de un color entre pardo y rojizo, cambiando a un color amarillo pajizo más o menos homogéneo en su segundo año de vida, a lo largo del segundo y tercer año de vida, los ejemplares adoptan fases de plumaje conocidas como de damero, en las que el color amarillento se va intercalando con plumas cada vez más numerosas de color pardo oscuro y negro, en el plumaje de subadulto, que aparece entre el cuarto y quinto año se observa ya un claro predominio del marrón oscuro, aunque aún entremezclado con plumas de color más claro, alcanzando el plumaje de los individuos maduros, anteriormente descrito, en el quinto año, al mismo tiempo que la madurez sexual. El tamaño medio de los adultos es de entre 78 y 83 cm de altura, y 2,8 kg, si bien las hembras, más grandes que los machos, pueden llegar a los 3,5 kg. La envergadura alar varía entre los 1,8 y 2,1 m. Viven unos veinte años de media, habiéndose documentado ejemplares de veintisiete años en el medio natural y de cuarenta y uno en cautividad.11​','https://iberianlynxland.com/wp-content/uploads/2021/11/aguila_imperial.jpg',5);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (9,'Lynx pardinus','Lince ibérco','Es un felino de aspecto grácil, con patas largas y una cola corta con una borla negra en el extremo que suele mantener erguida batiéndola en momentos de peligro o excitación. Sus características orejas puntiagudas están terminadas en un pincel de pelos negros rígidos que favorece su camuflaje al descomponer la redonda silueta de su cabeza. También son características las patillas que cuelgan de sus mejillas. Aparecen a partir del año de vida, cuando apenas cuelgan por debajo de la barbilla y aumentan de tamaño con la edad. Los machos tienen las patillas y los pinceles negros y más largos que las hembras.','https://e00-elmundo.uecdn.es/assets/multimedia/imagenes/2022/03/21/16478695249126.jpg',6);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (10,'Bufo bufo','Sapo Común','El sapo común o sapo europeo (Bufo bufo) es una especie de anfibio anuro de la familia Bufonidae muy habitual en toda clase de hábitats europeos, sobre todo en aguas estancadas: balsas de riego, albercas, etc. al ser más resistente a las aguas insalubres que otras especies de anfibios durante la fase de renacuajo. Se distribuye por toda Europa salvo Irlanda, Islandia y algunas islas mediterráneas, además de Asia noroccidental y pequeñas partes del noreste africano. Es uno de los anfibios más conocidos, dada su distribución y requerimientos ecológicos laxos Es una especie de un grupo de ellas estrechamente relacionadas, que descienden de una línea ancestral común y que forman un complejo de especies. El sapo es un animal poco visible, ya que por lo general se esconde durante el día. Se activa al atardecer y caza de noche los invertebrados de que se alimenta principalmente. Se mueve con un paso lento y torpe o a saltos cortos; tiene la piel de color marrón grisáceo, cubierta de protuberancias parecidas a verrugas. Aunque los sapos son generalmente animales solitarios, en la época de reproducción un gran número de ellos converge en ciertos estanques de cría, donde los machos compiten por aparearse con las hembras. Los huevos, en forma de cadenas gelatinosas, son depositados en el agua y de ellos eclosionan los renacuajos. Después de varios meses de crecimiento y desarrollo, les brotan los miembros y se metamorfosean a pequeños sapos; estos salen del agua y en adelante serán mucho más terrestres que acuáticos. El sapo común parece estar en declive en ciertas regiones. Está amenazado por la pérdida de hábitat, sobre todo por el drenaje de sus lugares de reproducción y el tráfico rodado que interfiere en sus migraciones anuales. Tradicionalmente, en la cultura popular y la literatura se ha asociado con, por ejemplo, la brujería o el Demonio y en general, ha estado connotado negativamente.','https://upload.wikimedia.org/wikipedia/commons/8/81/Bufo_bufo_03.jpg',7);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (11,'Epidalea calamita','Sapo corredor','El sapo corredor (Epidalea calamita) es la única especie del género monotípico Epidalea. Es un anfibio anuro de la familia Bufonidae, nativo de áreas arenosas de Europa central y occidental. Se encuentra en una amplia variedad de hábitats, siendo capaz de sobrevivir en zonas bastante secas siempre que disponga al menos de alguna charca para reproducirse. De hecho, es uno de los anfibios más comunes en gran parte de su área de distribución. Los adultos miden unos 6 cm de longitud. Se distingue del sapo común por una línea amarilla o verde claro longitudinal en la mitad de la espalda. Cuerpo rechoncho y muy verrugoso; glándulas parotídeas paralelas. Tienen patas relativamente largas que le dan su distintivo andar en contraste con los movimientos de salto de muchas otras especies de sapos.','https://upload.wikimedia.org/wikipedia/commons/thumb/3/39/Epidalea_calamita_01_by-dpc.jpg/1200px-Epidalea_calamita_01_by-dpc.jpg',8);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (12,'Pelobates cultripes','Sapo de espuelas','Su distribución mundial se limita exclusivamente a la Península Ibérica y a las costas mediterránea y sudoccidental de Francia. Dentro de la península Ibérica tiene una distribución prácticamente continua haciéndose sus poblaciones más escasas o incluso desapareciendo en el Norte. En Galicia, sólo aparece al sur de la Comunidad y en la franja costera de las rías Bajas. No se encuentran en Asturias ni Santander. En el País Vasco su presencia se limita a la Rioja alavesa. En Navarra sus poblaciones se concentran en el sureste árido y en Aragón no penetran en los Pirineos. Por otro lado, es escaso en las zonas más áridas del sureste peninsular, estando ausente en la provincia de Almería. (BUSACK & ZUG 1976; GOSÁ & BERGERANDI 1994).','https://static.inaturalist.org/photos/46513345/large.jpg',9);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (13,'Hyla meridionalis','Ranita meridional','Su cuerpo presenta un aspecto gomoso pues tiene la piel muy lisa y brillante en color verde claro, pudiendo presentar tonos amarillentos y pardos. Se observa una raya negra que va desde los orificios nasales, pasando por los ojos, hasta las axilas de las patas delanteras. Por debajo es de tono blancuzco. Posee unas largas patas con ventosas en la punta de los dedos que le dan la capacidad de trepar con facilidad por la vegetación, o ramas de los arbustos que encuentra en su hábitat, por lo que es una rana arborícola. Sus ojos son saltones y de pupila horizontal. Tiene un cierto parecido con su pariente más cercano, la Ranita de San Antonio. De forma poco frecuente podemos encontrar ejemplares de color azul. Esto es debido a una mutación en los genes que determinan la pigmentación de la piel. Estas ranas fabrican dos pigmentos diferentes, el pigmento azul y el pigmento amarillo, que normalmente están presentes de forma conjunta, dando la coloración verde a la piel. A veces por causa de la mutación mencionada, algunos ejemplares no fabrican el pigmento amarillo y por tanto muestran solo la coloración azul.','https://1.bp.blogspot.com/-AQoPkPs2sHU/UhCO-JxFflI/AAAAAAAAGtE/qWd9WZ_TDCk/s1600/IMG_8169.jpg',10);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (14,'Pleurodelest Waltl','Gallipato','Posee una cabeza grande, ancha en la parte posterior, con ojos pequeños, que se vuelven saltones hacia arriba cuando la aplasta hasta convertirla en apenas un disco semicircular. El cuerpo se halla cubierto por verrugas de punta negra y su coloración varía del prácticamente negro al amarillo pálido, aunque suele ser gris pardusca con manchas oscuras y un color más claro en la parte ventral. La cola, comprimida lateralmente, suele mostrar la misma coloración que el resto del cuerpo con bandas anaranjadas ocasionalmente en los bordes superior e inferior. Presenta crestas caudales pequeñas, algo más desarrolladas en los machos durante el periodo reproductivo. En cada costado se hace visible una hilera de 7 a 10 manchas anaranjadas que coinciden con los extremos de las costillas y por donde, en ocasiones, asoman los extremos de éstas, considerado este hecho como un mecanismo de defensa por diversos autores. Este mecanismo podría ser considerado como un primitivo y rudimentario sistema de inoculación, aunque es totalmente inofensivo para el hombre. En caso de ataque, a la vez que las costillas se extienden hacia el exterior del cuerpo, secretan un veneno que se produce en glándulas existentes para tal efecto. Estas costillas recubiertas de veneno crean un eficiente mecanismo de picadura que inyecta toxinas el la fina piel de la boca del depredador. El efectivo sistema inmunológico del gallipato y las costillas recubiertas de colágeno consiguen que la piel perforada durante este mecanismo de defensa se recupere rápidamente y sin infecciones. En cuanto a dimorfismo sexual, los machos suelen ser más estilizados que las hembras, con unos miembros anteriores más robustos, los cuales presentan unas callosidades de color negro en la época de celo. Sirven para afianzar la aprehensión durante el amplexo, evitando que se escurra la hembra mientras la agarra desde abajo.','https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Pleurodeles_waltl_BUD.jpg/1280px-Pleurodeles_waltl_BUD.jpg',11);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (15,'Salamandra Salamandra','Salamandra común','La salamandra común (Salamandra salamandra) es una especie de anfibio urodelo de la familia Salamandridae. Es el más común de los urodelos en Europa. De hábitos terrestres, únicamente entra en el agua para parir, y muchas subespecies lo hacen en tierra. Es un urodelo inconfundible, de fondo negro y manchas variadas amarillas muy intensas que pueden llegar a cubrir la casi totalidad del cuerpo. A veces también se aprecian manchas de color rojizo. La apariencia de esta especie es bastante diferente entre las subespecies; Salamandra infraimmaculata infraimmaculata es grande (hasta 324 mm) y tiene grandes puntos amarillos en todo el cuerpo, excepto en el vientre. Por lo general, hay cuatro manchas amarillas en la cabeza; uno en cada paratoides y uno encima de cada ojo. Sí. orientalis tiene una apariencia similar a S. i. infraimmaculata , pero tiene pequeñas manchas amarillas en todo el cuerpo, excepto en el vientre. Se cuestiona la validez de esta subespecie. Sí. semenovi es grande y tiene manchas redondas como rosas en todo el cuerpo. La cabeza es bastante redonda. Esta es la especie de salamandra de fuego más grande; puede alcanzar una longitud de 324 mm. Las hembras suelen ser más grandes que los machos. Esta especie no tiene coloración en el vientre, la parte inferior es completamente negra.','https://misanimales.com/wp-content/uploads/2021/01/salamandra-musgo.jpg',12);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (16,'Tarentola mauritanica','Salamanquesa común','Los adultos pueden llegar a medir de 5 a 15cm, más una longitud similar o poco más para la cola. El lomo, las patas y la cola tienen bultos cónicos prominentes. Su cuerpo es robusto, aplastado, y su cabeza grande y ancha, triangular y separada del cuerpo por un pescuezo marcado. Cuando pierde su cola puede regenerarla, aunque la nueva es más lisa y carece de bultos. Su color habitual es de un gris pardusco o marrón, con variaciones desde el gris blanquecino hasta el casi negro, con manchas más claras y oscuras; el vientre es blanquecino. Sin embargo su color cambia de intensidad dependiendo de la luminosidad que recibe su piel: cuando se encuentra activa durante el día el color es más oscuro que durante la noche. Su boca es obtusa, y sus ojos grandes, sin párpados y con pupila vertical. Los dedos, cinco en cada extremidad, tienen protuberancias laminares laterales e inferiores que le proporcionan cierta adherencia para trepar y desplazarse por superficies verticales (incluso en cristales). Aunque la mayoría de las personas creen, erróneamente, que la facultad que tienen las salamanquesas para trepar y adherirse a paredes verticales o, incluso, deambular en los techos boca abajo, es debido a que en los dedos de sus patas cuentan con múltiples ventosas, en realidad el mecanismo que esencialmente emplean estos reptiles es el fenómeno del denominado principio de las fuerzas de Van der Waals. Las fuerzas o interacciones de Van der Waals son las fuerzas atractivas o repulsivas entre moléculas distintas a aquellas debidas a un enlace intermolecular o a la interacción electrostática de iones con moléculas neutras. Al margen, es cierto que los dedos tienen láminas escamosas que también le ayudan en dicha tarea, pero carecen de ventosas.','https://static.inaturalist.org/photos/21873580/large.jpeg',13);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (17,'Hemidactylus turcicus','Salamanquesa rosada','La salamanquesa rosada (Hemidactylus turcicus) es una especie de gecos de la familia Gekkonidae presente en buena parte de los países mediterráneos e introducida en diversas regiones del mundo. Son nocturnos e insectívoros. Tienen ojos enormes sin párpados y una piel pálida con manchas negras en su cuerpo y a menudo con la cola jaspeada. Su vientre es un poco traslúcido. En América del Norte, las Antillas Mayores y Centroamérica es una especie invasora.','https://inaturalist-open-data.s3.amazonaws.com/photos/171801218/large.jpg',14);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (18,'Psammodromus algirus','Lagartija colilarga','Es una lagartija fácilmente identificable, a primera vista, por tener la cola muy desarrollada. Los adultos alcanzan hasta 7,5 cm de longitud (cabeza-cuerpo). La cola es muy larga, como indica su nombre, del orden de dos o incluso tres veces la longitud del conjunto cabeza-cuerpo. Las escamas del dorso y flancos son grandes, planas y puntiagudas, carenadas de forma evidente. La coloración general es parda presentando dos líneas blancas muy conspicuas a ambos lados. Las partes inferiores son blancas o levemente teñidas de verde. Los machos suelen tener una o más manchas azules en los hombros, cuando están en celo tienen la garganta y los lados de la cabeza de color naranja.Las escamas que recubren el dorso y los flancos son aquillados y a la vez imbricadas, salvo que también se extienden a las ventrales. Estas características descritas de las escamas, además de la longitud de la cola, permiten diferenciarla fácilmente de la lagartija roquera (Podarcis muralis) y de la lagartija ibérica (Podarcis hispanica). Un rasgo muy característico de este pequeño saurio radica en la capacidad de emitir chillidos, lo que también se da en Psammodromus hispanicus y en Acanthodactylus erythrurus .','https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/Psammodromus_algirus_2601.jpg/1280px-Psammodromus_algirus_2601.jpg',15);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (19,'Natrix Maura','Culebra viperina','Es de tamaño medio, pudiendo alcanzar una longitud de hasta 80 cm, aunque no suele superar los 50 cm. Se caracteriza por mostrar escamas muy carenadas en el dorso. Su coloración es muy variada, generalmente olivácea o marrón amarillenta, pero también puede ser rojiza. Presenta a lo largo de la línea medio dorsal una fila de manchas que en algunos ejemplares pueden llegar a juntarse hasta dar forma a una línea en zig-zag','https://www.montesdevalsain.es/images/Natmau4_a.jpg',16);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (20,'Natrix natrix','Culebra de collar','Excepcionalmente puede llegar a medir dos metros de longitud, los adultos normalmente rondan los 120 cm. Tiene el cuerpo grueso, la cabeza redondeada y los ojos de pupilas redondas. El color es muy variable, lo más habitual es pardo o verde oscuro, aunque pueden aparecer desde color gris hasta negro; con la parte inferior del cuerpo más clara. Presenta manchas negras. Algunos individuos muestran un collar característico de color amarillento o anaranjado. Es una especie de vida diurna que se alimenta de anfibios (especialmente de ranas y sapos), y puede llegar a cazar pequeños mamíferos y peces. Las hembras son mayores que los machos.','https://www.fishipedia.es/wp-content/uploads/2021/04/34888189801_2182df33f2_h.jpeg',16);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (21,'Zamenis scalaris','Culebra de escalera','Es una serpiente de cuerpo robusto y cola relativamente corta. Tiene la cabeza pequeña y poco prominente, y el morro agudo. Alcanza una longitud media de 157 cm, siendo las hembras un poco mayores que los machos. Cabeza de culebra de escalera. Su patrón de color varía con la edad; los ejemplares juveniles son de color gris, salpicado con motas negras, y con un diseño de manchas negras a lo largo de su espalda con forma de «H» que se asemeja a una escalera de mano, al que debe la especie su nombre común. En cambio, los adultos son de color pardo amarillento, también con algunas motas negras diseminadas, con dos líneas negras paralelas recorriendo longitudinalmente su espalda. Sus pupilas son redondas y de color negro. La culebra de escalera no es venenosa. Cuando son crías se pueden mostrar más violentas pero su mordedura es inofensiva.','https://www.vertebradosibericos.org/reptiles/identificacion/rhiscaid1.jpg',17);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (22,'Buthus occitanus','alacrán','Su coloración es amarillenta, de un tono oscuro en el dorso y más claro en el resto del cuerpo. Es un escorpión. Las pinzas son bastante delgadas y la glándula del veneno es redonda y tan larga como el aguijón. Puede llegar a medir 8 cm de largo.','https://granadanatural.com/imagenes/fauna_fichas/buthus-occitanus-1.jpg',18);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (23,'Buthus ibericus','alacrán ibérico','Se encuentra en la península ibérica, tanto en España (Andalucía Occidental y Extremadura) como en Portugal (Alentejo, Trás-os-Montes y Algarve). Habita en zonas áridas y pedregosas. En general rehúye las zonas húmedas. Miden unos 60-65 mm de longitud total. Tiene grandes capacidades trepadoras: puede encontrársele en paredes y techos. Es normalmente activo en los meses calurosos. Se oculta durante el día bajo piedras, hojarasca o en grietas. De noche sale a cazar y tiene una cierta afinidad por la luz, probablemente a causa de los insectos que allí puede encontrar. Su picadura normalmente no es mortal, aunque puede resultar peligrosa en animales pequeños, niños, ancianos y personas alérgicas. El tratamiento para su picadura consiste en aplicar un torniquete suave cuanto antes y tomar antihistamínicos, después de lo cual hay que visitar lo antes posible a un médico, que puede administrar un suero para evitar la atrofia celular de la zona afectada.','https://www.biodiversidadvirtual.org/insectarium/data/media/9033/Buthus-ibericus-1-de-2-972736.jpg',18);
insert into Especie (id,nombre,descripcion,detalles,foto,genero_id) values (24,'Herpestes ichneumon','Meloncillo','El meloncillo tiene una silueta alargada y afilada, con el pelaje de coloración uniforme pardo grisáceo y los pelos color negro con la punta crema, los cuales son largos, midiendo entre 6 y 8 cm, bajo los que se encuentra una borra densa y suave. Las patas son oscuras y cortas, con cinco dedos en cada pie y garras afiladas y curvadas que utiliza para excavar y no son retráctiles. Tiene la cola ancha en su base y con mechón de pelos largos y negros en su punta y las orejas son cortas anchas y redondeadas. Un rasgo distintivo de esta especie es que tiene la pupila horizontal, algo excepcional entre los carnívoros. Además presenta una bolsa anal de gran tamaño, con dos aberturas glandulares.','https://cazaworld.com/wp-content/uploads/2018/10/Meloncillo.jpg',19);



insert into Encuentro (id,usuario_id,especie_id,fecha,descripcion,foto,zona,tamanio,peso,sexo) values (1,1,1,'2023-01-01','encuentro de un bicho','https://lahuertinadetoni.es/wp-content/uploads/2015/01/233-163-Copiar.jpg','Gerena',10,5,'f');

alter sequence hibernate_sequence restart with 100;
