package regression;

public class test1 {

	public void tain(){
	double input[] = {1,2,3,4,5,6,7};
	double expectResult[] = {3,4,2,4,5,3,3};
	double w[] = {0,0};
	double learningRate = 0.01;
	double loss = 100;
	
	for(int i = 0; i < 100 && loss > 0.01 ; i++){
		double err_sum = 0;
		for(int j = 0;j<7;j++){
			double h = 0;
			h = w[0] + input[j]*w[1];
			err_sum = expectResult[j] - h;
			for(int k = 0 ; k < 2 ;k++){
				w[k] = w[k] - learningRate * err_sum * input[j];
			}
		}
		
	}
	}
}
