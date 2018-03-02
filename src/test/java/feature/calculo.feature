#language: pt

Funcionalidade: Classificação de um triângulo quanto à medida de seus lados

	@equilatero
	Cenário: Classificação correta do tipo de um triângulo Equilátero
		Dado que estou com o app aberto
		Quando informo o tamnhao  3 , 3 , 3 dos lados do triângulo
		Então devo ver o texto "O triângulo é Equilátero"