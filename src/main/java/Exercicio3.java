import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Exercicio3 {
	public static void main(String[] args) {

		List<Double> valor = new ArrayList<>();

		double maior = 0, total = 0, media, menor;
		int cont = 0, contMedia = 0;

		try {

			File file = new File("./src/main/java/dados.json");
			FileReader reader = new FileReader(file);

			JSONParser parser = new JSONParser();

			JSONArray array = (JSONArray) parser.parse(reader);

			for (Object object : array) {
				JSONObject json = (JSONObject) object;

				valor.add(Double.parseDouble(json.get("valor").toString()));

			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		valor.forEach(json -> System.out.println(json));

		for (int i = 0; i < valor.size(); i++) {
			if (valor.get(i) != 0.0) {
				cont++;
				total += valor.get(i);
				System.out.println(valor.get(i));
			}
		}

		media = total / cont;

		for (int j = 0; j < valor.size(); j++) {
			if (valor.get(j) > media) {
				contMedia++;
			}
		}

		for (int x = 0; x < valor.size(); x++) {
			if (valor.get(x) > maior) {
				maior = valor.get(x);
			}
		}

		menor = maior;
		for (int y = 0; y < valor.size(); y++) {
			if (valor.get(y) != 0.0 && valor.get(y) < menor) {
				menor = valor.get(y);
			}
		}

		System.out.println();
		System.out.println("Menor valor de faturamento: " + menor);
		System.out.println("Maior valor de faturamento: " + maior);
		System.out.println("Quantidade de dia superior à média mensal: " + contMedia);

	}
}