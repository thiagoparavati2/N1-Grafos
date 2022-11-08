import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class lerArquivo {
    public static void main(String[] args) {

        Path caminho = Paths.get("C:/Users/Vinic/OneDrive/Documentos/Faculdade/grafo.txt");
        try{
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);

            System.out.println(leitura);

        } catch (Exception erro){
            System.out.println("Arquivo não encontrado!");
        }

    }

}