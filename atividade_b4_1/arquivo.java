package atividade_b4_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* Os problemas do codigo sao:
* 1. Nao se pode capturar as excecoes mais especificas (FileNotFoundException)
* depois das excecoes mais genericas (IOException). A razao para isso eh
* que a FileNotFoundException eh a classe (classe de excecao) filha de
* IOException, logo, ela vai ser capturada por qualquer classe
* que esta acima na hierarquia (IOException -> Exception -> Throwable; veja a figura: https://bit.ly/2WG3g7z).
* Assim, quando o programa vai jogar uma excecao, ela vai ser capturada pelo
* primeiro catch (a que com IOExceotion) e nao passara a diante. Isso eh considerado o erro
* e o programa nao vai ser compilado.
*
* 2. Todos os recursos externos que foram abertos para o uso (arquivo, banco de dados,
* acesso para um site), devem ser fechados o mais breve possivel depois do seu uso.
* Isso diminui a chance de aparencer bugs e erros como memory leak (qunado o programa acomula muitas
* referencias que estao ativas mas nao sao de fato usadas).
* Um detalhe importante no caso de estrutura try/catch eh que nao se pode deixar simplismente o comando de
* fechamento do arquivo no try, pois caso a excecao sera produzida, o controle passara
* para o proximo catch que eh compativel com a excecao que foi produzida. Sendo assim, o arquivo
* nao vai ser fechado e permanecerá "pindurado" na memoria.
* O local mais propicio para o fechamento do arquivo geralmente na estrutura try/catch eh na clausula
* finally, pois o finally sempre sera executado (mesmo se tem um return antes). Porem no caso desse
* excercicio, seria necessario criar um outro try/catch (para verificar se a referencia esta ativa,
* caso o arquivo nao exista na hora de ser aberto) que faria com que o codigo seja bem poluido.
* A melhor solucao eh colocar a abertura do arquivo como parametro
* de try (como esta no codigo abaixo), assim, logo que a estrutura try/catch sera finalizada, qualquer coisa que foi aberta no lugar
* de paramentro sera fechada.
*
* 3. (completando 1) O polimorfismo, nesse caso, se caracteriza da forma que as excecoes tambem possuem propriedades
* de heranca (todo mundo herda da classe Throwable. As excecoes checked herdam a classe Exception) e as
* excecoes unchecked herdam RuntimeException. E isso resulta que as classes de excecoes mais genericas
* podem capturar as execoes mais especificas. Um exemplo (mas nao o melhor uso) disso seria que quando
* nao se sabe qual execao sera produzida pelo codigo e colocar a mais generica (Exception) que ira
* capturar todas as excecoes possiveis, pois todas elas sao suas filhas.
* */
public class arquivo {
    public static void main(String[] args) {
        // tentando abrir o arquivo ja no corpo da estrutura try/catch
        // assim o arquivo vai ser fechado assim que a estrutura chegara ao fim
        try (FileReader leitor = new FileReader("arquivo.txt")){
            var valor = leitor.read();
        }
        // sempre tem que capturar a excecao excecao mais especifica e ir subindo na hierarquia
        // ate as excecoes mais genericas
        catch (FileNotFoundException e) {
            System.out.println("Foi capturada a FileNotFoundException (mais espeficica)");
        } catch (IOException e) {
            System.out.println("Foi capturada a IOException (generica)");
        }
    }
}