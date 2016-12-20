/**
	 * 冒泡排序，时间复杂度 O（log2n）
	 * @param array
	 */
	public static void sort(int array[]) {
		
		int bound = array.length - 1;
		while(bound > 0) {
			int changePoint = 0;
			for(int i = 0; i < bound; i++) {
				if(array[i] > array[i + 1]){
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					changePoint = i;
				}
			}
			bound = changePoint;
		}
	}
