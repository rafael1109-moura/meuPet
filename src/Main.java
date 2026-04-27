import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import main.java.com.meupet.model.Animal;
import main.java.com.meupet.model.AutenticacaoException;
import main.java.com.meupet.model.Cachorro;
import main.java.com.meupet.model.Cachorro.RacaCachorro;
import main.java.com.meupet.model.DadoInvalidoException;
import main.java.com.meupet.model.Gato;
import main.java.com.meupet.model.Gato.RacaGato;
import main.java.com.meupet.model.PetSaude;
import main.java.com.meupet.model.Usuario;

// novas bibliotecas para JSON
import main.java.com.meupet.model.Vacina;
import com.google.gson.Gson;
import java.io.FileWriter;
//leitura e escrita do JSON
import java.io.FileReader;
import java.io.FileWriter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PetSaude saude = new PetSaude();

        
        //=========================================
        //tentando armazenar o usuario
        //=================================================
        //criando usuarios
        Usuario usuario1 = new Usuario(1, "João Silva", "joao.silva@email.com", "senha123");
        Usuario usuario2 = new Usuario(2, "Maria Oliveira", "maria.oliveira@email.com", "senha123");
        //armazenando usuarios em uma lista
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        //convertendo lista de usuarios para JSON
        String jsonUser = new Gson().toJson(usuarios);
        System.out.println("JSON dos usuários: " + jsonUser);
        // escrevendo JSON em um arquivo
        try {
            FileWriter writer = new FileWriter("usuarios.json");
            writer.write(jsonUser);
            writer.close();

            System.out.println("Arquivo criado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
        }

        //leitura do JSON
        try {
            FileReader reader = new FileReader("usuarios.json");
            usuarios = gson.fromJson(reader, new TypeToken<List<Usuario>>(){}.getType());

            reader.close();
        } catch (Exception e) {
            usuarios = new ArrayList<Usuario>();
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        //como apagar: usuarios.clear();
        // como adicionar 
        //Usuario novo = new Usuario(3, "Novo Usuario", "novo@email.com", "123");
        //usuarios.add(novo);

         //=========================================
        
        //pega nome do cachorro
        System.out.print("Digite o nome do cachorro: ");
        String nomeCachorro = scanner.nextLine();
        
        //nome do gato
        System.out.print("Digite o nome do gato: ");
        String nomeGato = scanner.nextLine();
        
        System.out.println();
        
        Cachorro cachorro = new Cachorro(1,
            nomeCachorro,
            3,
            Animal.Sexo.MACHO,
            10.5f,
            false,
            false,
            "2024-06-01",
            "2024-06-02", 
            "2024-06-03",
            RacaCachorro.Golden_Retriever 
        );
        
        List<Vacina> vacinasCachorro = cachorro.buscarVacinas(saude.getMapaCompletoVacinas());
        
        System.out.println("Histórico de vacinas recomendadas para " + cachorro.getNome() + ":");
        
        for(Vacina v : vacinasCachorro) {
            System.out.println("- " + v.getNome() + ", previne " + v.getDoenca().getNome());
        }
        
        System.out.println();
        
        Gato gato = new Gato(2,
            nomeGato,
            2,
            Animal.Sexo.FEMEA,
            4.0f,
            false,
            true,
            true,
            RacaGato.Siames
        );
        
        List<Vacina> vacinasGato = gato.buscarVacinas(saude.getMapaCompletoVacinas());
        
        System.out.println("Histórico de vacinas recomendadas para " + gato.getNome() + ":");
        for(Vacina v : vacinasGato) {
            System.out.println("- " + v.getNome() + ", previne " + v.getDoenca().getNome());
        }
        
        System.out.println();
        
        System.out.println("Data do último banho: " + cachorro.getData_last_banho());
        System.out.println("Data da última tosa: " + cachorro.getData_last_tosa());
        System.out.println("Data do último passeio: " + cachorro.getData_ultimo_passeio());
        
        
        System.out.println();
        
        System.out.println("A areia está suja? " + gato.isAreia_suja());

        gato.limparAreia();

        System.out.println("A areia está suja? " + gato.isAreia_suja());

        System.out.println("Sugestão de brincadeira: " + cachorro.sugestoesBrincadeiras());
        System.out.println("Sugestão de brincadeira: " + gato.sugestoesBrincadeiras());
        System.out.println(cachorro.exibirAnimal());
        System.out.println(gato.exibirAnimal());
        
        System.out.println("\n\n\n");
        
        try {
            cachorro.setIdade(-5); 
        } catch (DadoInvalidoException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            cachorro.atualizarPerfil("Rex Segundo", 5);
            System.out.println("Perfil atualizado com sucesso!");
        } catch (DadoInvalidoException e) {
            System.out.println("Erro:  " + e.getMessage());
        }

        System.out.println(cachorro.exibirAnimal());

        System.out.println("\n");
        Usuario user = new Usuario(1, "Usuario", "user@email.com", "senha123");

        try {
            user.login("user@email.com", "12345");
        } catch (AutenticacaoException e) {
            System.out.println("Erro: "+ e.getMessage());
        }

        try {
            user.login("user@email.com", "senha123");
        } catch (AutenticacaoException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}