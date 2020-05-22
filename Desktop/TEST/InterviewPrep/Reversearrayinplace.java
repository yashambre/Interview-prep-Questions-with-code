class Reversearrayinplace{

	public void reversearray(int arr[]){
		int n = arr.length;
		System.out.println(n);
		for(int i =0 ; i < n/2 ; i++){
			int temp = arr[i];
			arr[i] =  arr[n-i-1];
			arr[n-i-1] =  temp;
		}

	}
	public static void main(String[] args) {
		Reversearrayinplace obj = new Reversearrayinplace();
		int[] arr = {10,2,3,45,67,7};
		obj.reversearray(arr);
		for(int i =0; i<arr.length; i++){
			System.out.println(" " + arr[i]);
		}
	}
	
