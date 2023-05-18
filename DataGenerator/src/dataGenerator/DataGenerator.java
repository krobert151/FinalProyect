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
				
				double especie = r.nextInt(6);
				double foto = r.nextInt(6);
				double sexo = r.nextInt(2)*5;
				double total = (especie+foto+sexo)/3;
				
				System.out.printf("%s%d,%d,%d,%.0f,%.0f,%.0f,%1.2f %s %n",insertInto,count,j,i,especie,foto,sexo,total,insertInto2);
				count ++;
			}
			
		}
		

	}

}
