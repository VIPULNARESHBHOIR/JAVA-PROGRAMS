class table
{
	public static void main(String[] args) {
	int j,i;
        int[][] arr=new int[10][6];
        arr[0][0]=10;arr[1][0]=20;arr[2][0]=30;arr[3][0]=40;arr[4][0]=50;arr[5][0]=60;arr[6][0]=70;arr[7][0]=80;arr[8][0]=90;arr[9][0]=100;
        for(i=0;i<10;i++)
        {
            for(j=1;j<6;j++)
            {
              arr[i][j]=arr[i][j-1]+i+1;

            }
            
        }
        
        for(i=0;i<10;i++)
        {
            for(j=0;j<6;j++)
            {
                System.out.print(arr[i][j]+"   ");
                if(j==5)
                System.out.println(" ");
                
            }
        }
    }
}