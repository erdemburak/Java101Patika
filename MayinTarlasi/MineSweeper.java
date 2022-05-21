package MayinTarlasi;

import java.util.Scanner;

public class MineSweeper {

    String mine[][];
    String field[][];
    
    public void Run() {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen tarlanın boyutunu girin");
        System.out.print("Satır giriniz : ");
        int row = input.nextInt();
        System.out.print("Sütun giriniz : ");
        int col = input.nextInt();

        createField(row, col);
        AddMines(row, col);
        ShowField(row, col);



        int loopSize=(row*col)-(int)((row*col)/4);
        System.out.println("Dikkat *** Mayın Tarlası! ***");
        while (loopSize>0)
        {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.print("\n");
            }
            int sum = 0;
            System.out.print("Satır giriniz : ");
            int line = (input.nextInt()) - 1;
            System.out.print("Sütun giriniz : ");
            int column = (input.nextInt()) - 1;
            
            if (row >= line && col >= column && line >= 0 && column >= 0){
                if (mine[line][column] == "*"){
                    System.out.println("Game Over!");
                    break;
                }else{
                    if (line - 1 >= 0 && column - 1 >= 0){
                        if (mine[line - 1][column - 1] == "*"){
                            sum++;}
                    }
                    if (line - 1 >= 0){
                        if (mine[line - 1][column] == "*"){
                            sum++;}
                    }
                    if (line - 1 >= 0 && column + 1 < col){
                        if (mine[line - 1][column+1] == "*"){
                            sum++;}
                    }
                    if (column - 1 >= 0){
                        if (mine[line][column-1] == "*"){
                            sum++;}
                    }
                    if (column + 1 <col){
                        if (mine[line][column+1] == "*"){
                            sum++;}
                    }
                    if (line + 1 < row && column - 1 >= 0){
                        if (mine[line +1][column-1] == "*"){
                            sum++;}
                    }
                    if (line + 1 < row){
                        if (mine[line + 1][column] == "*"){
                            sum++;}
                    }
                    if (line + 1 < row && column + 1 < col){
                        if (mine[line + 1][column+1] == "*"){
                            sum++;}
                    }
                    if(field[line][column].equals(String.valueOf(sum))){
                        System.out.println("Seçilen hücreyi tekrar seçtiniz. Farklı bir seçim yapın!!!");
                    }else{
                        field[line][column] = String.valueOf(sum);
                        loopSize--;
                    }
                }
            }else{
                System.out.println("Yanlış değer girdiniz.");
            }
              
            System.out.println("=======================");
            
            if (loopSize==0){
                System.out.println("Oyunu Kazandınız !");

                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.print("\n");
                }

            }
        }
        input.close();
    }

    public void createField(int row,int col){
        
        mine = new String[row][col];
        field=new String[row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                mine[i][j]="-";
                field[i][j]="-";

            }
        }
    }

    public void AddMines(int row,int col){

        int mineNumber=(int)((row*col)/4);

        for (int i=0;i<mineNumber;i++)
        {
            int randomRow=(int)(Math.random()*row);
            int randomCol=(int)(Math.random()*col);
            if (mine[randomRow][randomCol]=="*"){
                mineNumber++;
            }
            else {
                mine[randomRow][randomCol]="*";
            }
        }
    }

    public void ShowField(int row,int col){

        System.out.println("Mayınların Konumu");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(mine[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.println("=======================");
    }
}