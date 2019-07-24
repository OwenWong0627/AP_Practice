
public class AP2011Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public class Sound{
		private int[] samples = {40,2532,17,-2300,-17,-4000,2000,1048,-420,33,15,-32,2030,3223};
		
		public int limitAmplitude(int limit) {
			int Changed = 0;
			for (int i=0; i< samples.length;i++) {
				if (samples[i]<-limit) {
					samples[i] = -limit;
					Changed++;
				}else if(samples[i]>limit) {
					samples[i] = limit;
					Changed ++;
				}
			}
			return Changed;
		}
	public void trimSilenceFromBeginning(){
		int i = 0;
		while(samples[i]==0) {
			i++;
		}
		int[] newA = new int[samples.length-i];
		for (int j=0; j<newA.length; j++) {
			newA[j]=samples[j+i];
		}
		samples = newA;
	}
}
}
