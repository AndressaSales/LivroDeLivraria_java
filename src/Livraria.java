import java.util.Scanner;

public class Livraria {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindos a LIVRARIA ONLINE");

        Scanner tela = new Scanner(System.in);
        /*
         * Preços dos livros todos pegados no site da amazon
        */
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Romance \n2 - Ficção \n3 - Suspense \n4 - Ficção Científica \n5 - Terror");
        int escolha = tela.nextInt();

        Livros livro01 = new Livros();
        livro01 .nomeDoLivro = "A culpa é das Estrelas";
        livro01 .genero = "Romance";
        livro01 .nomeDoAutor = "Jonh Green";
        livro01 .anoDaPublicacao =  2012;
        livro01 .preco = 12;
        livro01 .paginas = 314;


        Livros livro02 = new Livros();
        livro02 .nomeDoLivro = "Amor e Redenção";
        livro02 .genero = "Ficção";
        livro02 .nomeDoAutor = "Francine Rivers";
        livro02 .anoDaPublicacao = 1991;
        livro02 .preco = 51.92;
        livro02 .paginas = 462;

        Livros livro03 = new Livros();
        livro03 .nomeDoLivro = "A ponte de Haven";
        livro03 .genero = "Ficção";
        livro03 .nomeDoAutor = "Francine Rivers";
        livro03 .anoDaPublicacao = 2015;
        livro03 .preco = 42.90;
        livro03 .paginas = 647;

        Livros livro04 = new Livros();
        livro04 .nomeDoLivro = "A Seleção";
        livro04 .genero = "Romance";
        livro04 .nomeDoAutor = "Kiara Cass";
        livro04 .anoDaPublicacao = 2012;
        livro04 .preco = 50;
        livro04 .paginas = 363;

        Livros livro05 = new Livros();
        livro05 .nomeDoLivro = "Duna";
        livro05 .genero = "Ficção científica";
        livro05 .nomeDoAutor = "Frank Herbert";
        livro05 .anoDaPublicacao = 2015;
        livro05 .preco = 60;
        livro05 .paginas = 883;

        Livros livro06 = new Livros();
        livro06 .nomeDoLivro = "Neuromancer";
        livro06 .genero = "Ficção científica";
        livro06 .nomeDoAutor = "Willian Gibson";
        livro06 .anoDaPublicacao = 2016;
        livro06 .preco = 49.68;
        livro06 .paginas = 320;

        Livros livro07 = new Livros();
        livro07 .nomeDoLivro = "O Ilumidado";
        livro07 .genero = "Terror";
        livro07 .nomeDoAutor = "Stephen King";
        livro07 .anoDaPublicacao = 2012;
        livro07 .preco = 56.73;
        livro07 .paginas = 464;

        Livros livro08 = new Livros();
        livro08 .nomeDoLivro = "O Exorcista";
        livro08 .genero = "Terror";
        livro08 .nomeDoAutor = "Willian Peter Blatty";
        livro08 .anoDaPublicacao = 2019;
        livro08 .preco = 41.63;
        livro08 .paginas = 336;

        Livros livro09 = new Livros();
        livro09 .nomeDoLivro = "O Colecionador";
        livro09 .genero = "Suspense";
        livro09 .nomeDoAutor = "Jhon Fowles";
        livro09 .anoDaPublicacao = 1997;
        livro09 .preco = 74.56;
        livro09 .paginas = 320;

        if(escolha == 1){

            System.out.println("Você escolheu a opção Romance");
            System.out.println("Aqui está os livros de romance que temos");
            System.out.println("Escolha opção 1 ou 2");
            System.out.println("opção 1: A culpa é das estrelas");
            System.out.println("opção 2: A Seleção");
            int res01 = tela.nextInt();

            System.out.println();

            if(res01 == 1){
                System.out.println("Aqui está tudo sobre o livro " + livro01.nomeDoLivro);
                System.out.println("Nome do autor: " +livro01.nomeDoAutor);
                System.out.println("Gênero: " +livro01.genero);
                System.out.println("ano: "  + livro01.anoDaPublicacao);
                System.out.println("Quantidades de pág: " + livro01.paginas);
                System.out.println("Preço: " + livro01.preco);
                
                System.out.println();

            }else{
                System.out.println("Aqui está tudo sobre o livro " + livro04.nomeDoLivro);
                System.out.println("Nome do autor: " +livro04.nomeDoAutor);
                System.out.println("Gênero: " +livro04.genero);
                System.out.println("ano: "  + livro04.anoDaPublicacao);
                System.out.println("Quantidades de pág: " + livro04.paginas);
                System.out.println("Preço: " + livro04.preco);
                
            }

        }else if(escolha == 2){

            System.out.println("Você escolheu a opção de ficção");
            System.out.println("Aqui está os livros de ficção que você escolheu: ");
            System.out.println("Escolha opção 1 ou 2");
            System.out.println("opção 1: Amor e rendenção");
            System.out.println("opção 2: A ponte de Haven");
            int res02 = tela.nextInt();

            System.out.println();

            switch (res02) {
                case 1:
                    System.out.println("Aqui está tudo sobre o livro " + livro02.nomeDoLivro);
                    System.out.println("Nome do autor: " +livro02.nomeDoAutor);
                    System.out.println("Gênero: " +livro02.genero);
                    System.out.println("ano: "  + livro02.anoDaPublicacao);
                    System.out.println("Quantidades de pág: " + livro02.paginas);
                    System.out.println("Preço: " + livro02.preco);
                    break;
            
                default:
                    System.out.println("Aqui está tudo sobre o livro " + livro03.nomeDoLivro);
                    System.out.println("Nome do autor: " +livro03.nomeDoAutor);
                    System.out.println("Gênero: " +livro03.genero);
                    System.out.println("ano: "  + livro03.anoDaPublicacao);
                    System.out.println("Quantidades de pág: " + livro03.paginas);
                    System.out.println("Preço: " + livro03.preco);
                    break;
            }

        }else if(escolha == 3){

            System.out.println("Você escolheu a opção Suspense");
            System.out.println("Aqui está os livros de suspense que temos");
            System.out.println("Aqui está tudo sobre o livro " + livro09.nomeDoLivro);
            System.out.println("Nome do autor: " +livro09.nomeDoAutor);
            System.out.println("Gênero: " +livro09.genero);
            System.out.println("ano: "  + livro09.anoDaPublicacao);
            System.out.println("Quantidades de pág: " + livro09.paginas);
            System.out.println("Preço: " + livro09.preco);

            System.out.println();

        }else if(escolha == 4){

            System.out.println("Você escolheu a opção Ficção Científica");
            System.out.println("Aqui está os livros de ficção cinetífica que temos");
            System.out.println("Escolha opção 1 ou 2");
            System.out.println("opção 1: Duna");
            System.out.println("opção 2: Neuromancer");
            int resp03 = tela.nextInt();

            System.out.println();

            if(resp03 == 1){
                System.out.println("Aqui está tudo sobre o livro " + livro05.nomeDoLivro);
                System.out.println("Nome do autor: " +livro05.nomeDoAutor);
                System.out.println("Gênero: " +livro05.genero);
                System.out.println("ano: "  + livro05.anoDaPublicacao);
                System.out.println("Quantidades de pág: " + livro05.paginas);
                System.out.println("Preço: " + livro05.preco);
            }else{
                System.out.println("Aqui está tudo sobre o livro " + livro06.nomeDoLivro);
                System.out.println("Nome do autor: " +livro06.nomeDoAutor);
                System.out.println("Gênero: " +livro06.genero);
                System.out.println("ano: "  + livro06.anoDaPublicacao);
                System.out.println("Quantidades de pág: " + livro06.paginas);
                System.out.println("Preço: " + livro06.preco);
            }
        } else{
            System.out.println("Você escolheu a opção de Terror");
            System.out.println("Aqui está os livros de terror que você escolheu: ");
            System.out.println("Escolha opção 1 ou 2");
            System.out.println("opção 1: O iluminado");
            System.out.println("opção 2: O Exorcista");
            int res04 = tela.nextInt();

            System.out.println();

            switch (res04) {
                case 1:
                    System.out.println("Aqui está tudo sobre o livro " + livro07.nomeDoLivro);
                    System.out.println("Nome do autor: " +livro07.nomeDoAutor);
                    System.out.println("Gênero: " +livro07.genero);
                    System.out.println("ano: "  + livro07.anoDaPublicacao);
                    System.out.println("Quantidades de pág: " + livro07.paginas);
                    System.out.println("Preço: " + livro07.preco);
                    break;
            
                default:
                    System.out.println("Aqui está tudo sobre o livro " + livro08.nomeDoLivro);
                    System.out.println("Nome do autor: " +livro08.nomeDoAutor);
                    System.out.println("Gênero: " +livro08.genero);
                    System.out.println("ano: "  + livro08.anoDaPublicacao);
                    System.out.println("Quantidades de pág: " + livro08.paginas);
                    System.out.println("Preço: " + livro08.preco);
                    break;
            }
        }
        System.out.println();

        System.out.println("Boas compras");

        System.out.println();
    }
}
