# Labirinto

**Parte 1)** Criar um método chamado " carregaLabirinto ", que recebe por parâmetro uma  String   fileName  e retorna  um   array  bidimensional de caracteres. Este método abre o arquivo indicado por  fileName  e retorna um  array  de caracteres, representado no arquivo. O conteúdo do arquivo segue o modelo abaixo:  

    8 
    20 
      XXXXXXXXX   XXXXXX 
    X XXXXXXXXX X   XXXX 
    X   XXXXXXX XXX XXXX 
    XXX XXXXXX  XXX XXXX 
    XXX    XX  XXXX     
    XXX XX X  XXXXX XXX 
    XXXXXX X XXXXXX   X 
    XXXXXX   XXXXXX XXXD 

A primeira linha do arquivo (vamos chamar de L) indica o número de linhas do  array  e a segunda linha (vamos chamar de C) indica o número de colunas. Em seguida, existem L linhas, cada uma com C colunas, preenchidas de forma a criar o  array  do labirinto. O método cria um  array  bidimensional de caracteres com as informações do arquivo e retorna este  array . Dica: pesquise e utilize o método  charAt  da classe  String  para percorrer todos os caracteres de uma linha.  

**Parte 2)** Criar um método  **recursivo**  (com métodos público e privado) chamado labirinto, que recebe um  array  de caracteres e retorna verdadeiro caso exista pelo menos um caminho para chegar ao destino e falso caso não exista. No método público, para criar o  array , você deve chamar o método  carregaLabirinto , criado na parte 1.  

**Parte 3)**  Crie uma classe chamada  PrincipalLabirinto . Nela, crie o método  main . No  main , faça o trecho de código necessário para executar os métodos criados, percorrendo um determinado labirinto (o nome do arquivo do labirinto deve ser indicado pelo usuário via teclado). Ao final do  main , deve ser criado um arquivo chamado "saidaLabirinto.txt" com a frase: "Existe um caminho para o labirinto" ou "Não existe um caminho para o labirinto", de acordo com o resultado do método recursivo criado.  