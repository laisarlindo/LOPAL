
/*  Descrição:
 * 
 * 	Este exemplo ilustra o uso do laço "faca-enquanto", simulando uma eleição entre 
 * 	dois candidatos. O exemplo ilustra também o uso do comando "escolha" para contabilizar
 * 	os votos de cada candidato.
 * 	
 *  Autor: Leandro Gaudio Rosa
 * 	
 */

programa
{
	funcao inicio()
	{
		inteiro candidato1 = 0, candidato2 = 0
		
		inteiro brancos = 0, nulos = 0, total_votos = 0
		
		real porcentagem_candidato1, porcentagem_candidato2
		
		real porcentagem_brancos, porcentagem_nulos
		
		inteiro voto
    cadeia candidato1
    cadeia candidato2
    inteiro quantidade
    inteiro resposta
    
		
    escreva("Quantos candidatos serão?")
    leia(quantidade)
    se(quantidade < 2){
    escreva("Não podemos ajudar\n")
    inicio()
    }
    senao{
    escreva("Qual é o seu candidato1\n")
    leia(candidato1)
    escreva("Qual é o seu candidato2\n")
    leia(candidato2)
    }
    
    
    faca
		{
      
      
			escreva("Escolha seu candidato ou tecle zero para encerrar\n\n")
			
			escreva("  1 ->",candidato1,"\n")
			escreva("  2 -> ",candidato2,"\n")
			escreva("  3 -> Branco\n")
			
			escreva("\nQualquer número diferente de 0, 1, 2 e 3 anulará o seu voto\n")
			escreva("Digite seu voto: ")
			
			leia(voto)
			limpa()

			escolha (voto)
			{
				caso 0:
					escreva ("Votação encerrada!\n")
				pare
				
				caso 1: 
			 		candidato1 = candidato1 + 1 // Soma um voto para o candidato A
			 	pare
			 	
			 	caso 2: 
			 		candidato2 = candidato2 + 1 // Soma um voto para o candidado B
			 	pare
			 	
			 	caso 3: 
			 		brancos = brancos + 1 // Soma um voto em branco
			 	pare
			 	
			 	caso contrario:
			 		nulos = nulos + 1 // Opção inválida. Soma um voto nulo
			}			 
		}
		enquanto(voto != 0)

		// Calcula o total de votos
		total_votos = porcentagem_candidato1 + porcentagem_candidato2 + brancos + nulos

		// Se houve votos, calcula a porcentagem de votos de cada candidato
		
		se (total_votos > 0)
		{
			porcentagem_candidato1 = (candidato1 * 100.0) / total_votos  
			porcentagem_candidato2 = (candidato2 * 100.0) / total_votos
			porcentagem_brancos = (brancos * 100.0) / total_votos
			porcentagem_nulos = (nulos * 100.0) / total_votos

			escreva("\n")
			
			escreva("Total de votos: ", total_votos, "\n\n")
			escreva("Candidato A: " , candidato1, " voto(s). ", porcentagem_candidato1, " % do total\n" )
			escreva("Candidato B: ", candidato2, " voto(s). ", porcentagem_candidato2, " % do total\n" )
			escreva("Brancos: ", brancos, " voto(s). ", porcentagem_brancos, " % do total\n")
			escreva("Nulos: ", nulos, " voto(s). ", porcentagem_nulos, " % do total\n")

    escreva("Deseja realizar uma nova eleição?")
    leia(resposta)
    se(resposta=="sim" ){
    limpa()
   inicio()   
    }
      senao{
        
        escreva("Agradeçemos o seu voto")
	}
  }
  }
}