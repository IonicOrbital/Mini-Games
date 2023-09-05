

public class ttt{
	int x;
	int y;
	public char[][] arr = new char[3][3];
	
	
	public ttt(){
		this.x=x;
		this.y=y;
		this.arr=arr;
		set();
	}
	
	public void set(){
		for(int i=0;i!=3;i++){
			for(int j=0;j!=3;j++){
				arr[i][j] = '-';
				
			}
		}
	}
	
	public void play1(int x,int y){
		if(arr[x][y] != '-'){
		System.out.print(arr[x][y]);
		System.out.print("full");
		}
		else{
		arr[x][y] = 'X';
		}
	}
	
	public void play2(int x,int y){
		if(arr[x][y] != '-'){
		System.out.print("\n Space full too bad\n");
		}
		else{
		arr[x][y] = 'O';
		}
	}
	
	public void print(){
		
		for(int i=0;i!=3;i++){
			System.out.print("\n");
			for(int j=0;j!=3;j++){
				System.out.print(" "+arr[j][i]);
			}
		}
		System.out.print("\n");
	}
	
	public void win(){
		
		if(arr[0][0] == 'X' && arr[0][1] =='X' && arr[0][2] == 'X'){
			System.out.print("\n P1 wins"); print();
			System.exit(0);
		}
		if(arr[0][0] == 'O' && arr[0][1] =='O' && arr[0][2] == 'O'){
			System.out.print("\n P2 wins");print();System.exit(0);
		}
		if(arr[1][0] == 'X' && arr[1][1] =='X' && arr[1][2] == 'X'){
			System.out.print("\n P1 wins");print();System.exit(0);
		}
		if(arr[1][0] == 'O' && arr[1][1] =='O' && arr[1][2] == 'O'){
			System.out.print("\n P2 wins");print();System.exit(0);
		}
		if(arr[2][0] == 'X' && arr[2][1] =='X' && arr[2][2] == 'X'){
			System.out.print("\n P1 wins");print();System.exit(0);
		}
		if(arr[2][0] == 'O' && arr[2][1] =='O' && arr[2][2] == 'O'){
			System.out.print("\n P2 wins");print();System.exit(0);
		}
		if(arr[0][0] == 'X' && arr[1][0] =='X' && arr[2][0] == 'X'){
			System.out.print("\n P1 wins");print();System.exit(0);
		}
		if(arr[0][0] == 'O' && arr[1][0] =='O' && arr[2][0] == 'O'){
			System.out.print("\n P2 wins");print();System.exit(0);
		}
		if(arr[0][1] == 'X' && arr[1][1] =='X' && arr[2][1] == 'X'){
			System.out.print("\n P1 wins");print();System.exit(0);
		}
		if(arr[0][1] == 'O' && arr[1][1] =='O' && arr[2][1] == 'O'){
			System.out.print("\n P2 wins");print();System.exit(0);
		}
		if(arr[0][2] == 'X' && arr[1][2] =='X' && arr[2][2] == 'X'){
			System.out.print("\n P1 wins");print();System.exit(0);
		}
		if(arr[0][2] == 'O' && arr[1][2] =='O' && arr[2][2] == 'O'){
			System.out.print("\n P2 wins");print();System.exit(0);
		}
		if(arr[0][0] == 'X' && arr[1][1] =='X' && arr[2][2] == 'X'){
			System.out.print("\n P1 wins");print();System.exit(0);
		}
		if(arr[0][0] == 'O' && arr[1][1] =='O' && arr[2][2] == 'O'){
			System.out.print("\n P2 wins");print();System.exit(0);
		}
		if(arr[0][2] == 'X' && arr[1][1] =='X' && arr[2][0] == 'X'){
			System.out.print("\n P1 wins");print();System.exit(0);
		}
		if(arr[0][2] == 'O' && arr[1][1] =='O' && arr[2][0] == 'O'){
			System.out.print("\n P2 wins");print();System.exit(0);
		}
		
		
		
		
	}


 
}