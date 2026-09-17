package fileReader;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LeitorTXT {
    public List<Map<String, String>> ler(List<String> linhas) {
        List<String> atributos = Arrays.asList(linhas.getFirst().split(";"));

        return linhas.stream()
                .skip(1)
                .map(linha -> {
                    String[] valores = linha.split(";");
                    Map<String, String> objeto = new LinkedHashMap<>();
                    for (int i = 0; i < atributos.size(); i++) {
                        objeto.put(atributos.get(i), valores[i]);
                    }
                    return objeto;
                })
                .toList();
    }
}