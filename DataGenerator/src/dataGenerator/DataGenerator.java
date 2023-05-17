package dataGenerator;

import java.util.Random;

public class DataGenerator {

	public static void main(String[] args) {
		
		
		int usuarios = 21, encuentros=16;
		int count = 1;
		Random r = new Random();
		
		String insertInto = "insert into Valoracion(id,encuentro_id,usuario_id,especie,foto,sexo,puntuacion_total) values (";
		String insertInto2 = ");";
		for (int i = 1; i < usuarios; i++) {
			
			for (int j = 1; j < encuentros; j++) {
				
				int especie = r.nextInt(6);
				int foto = r.nextInt(6);
				int sexo = r.nextInt(2)*5;
				int total = (especie+foto+sexo)/3;
				
				System.out.printf("%s%d,%d,%d,%d,%d,%d,%d%s %n",insertInto,count,j,i,especie,foto,sexo,total,insertInto2);
				count ++;
			}
			
		}
		

	}

}
