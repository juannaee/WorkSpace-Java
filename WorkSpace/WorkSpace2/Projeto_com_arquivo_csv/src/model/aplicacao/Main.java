package model.aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entidade.Funcionario;

public class Main {

	public static void main(String[] args) {
		List<Funcionario> list = new ArrayList<Funcionario>();

		String caminho = "C:\\Users\\User\\Desktop\\Java\\WorkSpace2\\Projeto_com_arquivo_csv\\text.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String funcionarioCsv = br.readLine();
			while (funcionarioCsv != null) {
				String[] fields = funcionarioCsv.split(",");
				list.add(new Funcionario(fields[0], Double.parseDouble(fields[1])));
				funcionarioCsv = br.readLine();

			}

			Collections.sort(list);
			for (Funcionario func : list) {
				System.out.println(func.getNomeFuncionario() + "," + func.getSalarioFuncionario());

			}

		} catch (IOException e) {
			System.out.println(e.getMessage());

		}

	}

}
