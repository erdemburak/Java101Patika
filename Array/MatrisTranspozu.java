package Array;

public class MatrisTranspozu {

    static void printArray(int[][] ary){
        for(int[] row : ary){
            for(int col : row){
                System.out.print(col+ "   ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] list1 = {
            {1,2,3},
            {4,5,6}
        };
        int[][] list2 = new int[3][2];

        System.out.println("Matris : ");
        printArray(list1);
        
        for(int i=0; i<list1.length;i++){
            for(int j=0; j<list1[i].length;j++){
                list2[j][i] = list1[i][j];
            }
        }
        System.out.println("Transpose : ");
        printArray(list2);
    }
}
