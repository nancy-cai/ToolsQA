
public class Loop {

	public static void main(String[] args) {
		
		for(int row = 10;row>0;){
			int col=row;
			while(col>=0){
				System.out.println(col);
				col -= 2;
			}
			
			row=row/col;
		}

	}

}
