programa {
  funcao inicio() 
  {
    inteiro opcao
    inteiro pagamento

    escreva("1) Hot dog 3 salsicha \n")
    escreva("2) Hot dog 3 queijo \n")
    escreva("3) Bauruz�o \n")
    escreva("4) X-salada \n")
    escreva("5) X-egg \n")
    escreva("6) X-calabacon \n")
    escreva("7) X-frang�o \n")
    escreva("8) X-churrasc�o \n")
    escreva("9) Lingui�a top \n")
    escreva("10) X-burguer \n")

    escreva("Escolha uma op��o")
    leia(opcao)

    limpa()

    escolha (opcao)
    {
    caso 1:
      escreva("3 salsicha, tomate, batata palha e catchup")
      escreva("12")
      pare
    caso 2:
      escreva("salsicha, bacon, calabresa, mussalera, catupiry, cheddar, tomate, batata palha, maionesse e catchup")
      escreva("12")
      pare
      caso 3: 
      escreva("presunto, mussarela, cheddar, bacon, calabresa, tomate, batata palha, maionesse e catchup")
      escreva("12")
      pare
      caso 4:
      pare
      escreva("Hamburg�o top, mussarela, cheddar, alface,tomate, maionesse, catchup e batata palha")
      escreva("12")
      pare
      caso 5 :
      pare
      escreva("Hamburg�o top, 2 ovos, mussarela, cheddar, tomate, maionesse, catchup e batata palha")
      escreva("12")
      caso 6:
      escreva("Hamburg�o top, bacon, calabresa, mussarela, cheddar, tomate, maionesse, catchup e batata palha")
      escreva("12")
      pare
      caso 7: 
      escreva("200g de peito de frango, mussarela, cheddar, tomate, maionesse, catchup e batata palha")
      escreva("12")
      pare
      caso 8: 
      escreva("200g de carne bovina, mussarela, cheddar , tomate, maionesse, catchup e batata palha")
      escreva("12")
      pare
      caso 9: 
      escreva("Lingui�a, mussarela, cheddar, tomate, batata palha, maionesse e catchup")
      escreva("12")
      pare
      caso 10:
      escreva("Hambuguer, mussareala, catupiry, batata palha, catchup e molho")
      escreva("12")
      pare
      caso contrario:
      escreva("op��o inv�lida ")
    }

    limpa()
    

    escreva("Qual a forma de pagamento")
    escreva("1) Pix\n")
    escreva("2) Cr�tico\n")
    escreva("3) D�bito\n")
    escreva("4) Dinheiro\n")
    leia(pagamento)

    limpa()
    escolha(pagamento)
    {
      caso 1: 
      escreva("O pix � 11 94135-8960")
      pare
      caso 2: 
      escreva("Comprotavante do pagamento ")
      pare
      caso 3:
      escreva("Comprovante de pagamento")
      pare
      caso 4:
      escreva("12")
      pare

     
    


     

    }
  }
}
