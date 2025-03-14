// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.io.IOException;
import java.util.Scanner;
public class DIO {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		while (leitor.hasNext()) {
			int num = leitor.nextInt();
			int min = leitor.nextInt();
			int max = leitor.nextInt();
			int cont = 0;

// TODO: complete os espaços em branco com sua solução para o problema

			for (int i = 0; i <   num;   i++) {
				int altura = leitor.nextInt();
				if (  altura >= min && altura <= max  ) cont++;
			}
			System.out.println(  cont );
		}
	}
}

/*


Desafio

Todos os habitantes do Mundo Mágico estão super animados com a abertura do Dragão Berrador World, o mais novo parque de diversões do universo bruxo. 

Infelizmente foram impostas algumas restrições no momento da homologação do brinquedo pelo Ministério Bruxo. Por questões de segurança, há uma altura mínima e uma altura máxima que as pessoam devem ter para poder passear na montanha-russa.

Para o dia da inauguração do parque, todos os convidados realizaram um pré-cadastro no qual indicaram sua altura. Para reduzir filas e otimizar a operação do parque no primeiro dia, você foi contratado pela gerência do Dragão Berrador World para fazer um programa que, dado o número de visitantes, altura mínima, altura máxima e as alturas de todos os visitantes, calcule quantas pessoas poderão andar na montanha-russa.
Entrada

A entrada contém vários casos de teste. A primeira linha de cada caso consiste em três inteiros N (1 ≤ N ≤ 100), Amin e Amax (50 ≤ Amin ≤ Amax ≤ 250), o número de visitantes, a altura mínima e máxima em centímetros para andar na montanha-russa, respectivamente.

As N linhas seguintes contém, cada uma, um número inteiro representando a altura do visitantes, em centímetros.
Saída

Para cada caso de teste, imprima uma única linha com o número visitantes que podem passear na montanha-russa.
 
Exemplo de Entrada 	Exemplo de Saída

8 160 182
160
182
183
159
250
170
172
173
	

5

 

 
Exemplo de Entrada 	Exemplo de Saída

5 155 176
149
154
172
182
167
 
	

2

*/