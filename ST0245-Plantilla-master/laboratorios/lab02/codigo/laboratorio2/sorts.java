package laboratorio2;

public class sorts
{
public static int[] insertionSort (int[] array){
	int j=0;
	int temp=0;
	for(int i=0;i<array.length;i++){
	    j = i;
	    temp = array[j];
	    while(j > 0 && array[j-1] > temp){
		array[j] = array[j-1];
		j -- ;
	    }
	    array[j] = temp;
	}
	return array;
    }
public static void merge(int arr[], int beg, int mid, int end)  
    {  
    
    int l = mid - beg + 1;  
    int r = end - mid;  
    
    int LeftArray[] = new int [l];  
    int RightArray[] = new int [r];  
    
    for (int i=0; i<l; ++i){  
        LeftArray[i] = arr[beg + i];  
    }
    for (int j=0; j<r; ++j){  
        RightArray[j] = arr[mid + 1+ j];  
    }
    
    int i = 0, j = 0;  
    int k = beg;  
    while (i<l&&j<r)  
    {  
        if (LeftArray[i] <= RightArray[j])  
        {  
            arr[k] = LeftArray[i];  
            i++;  
        }  
        else{  
            arr[k] = RightArray[j];  
            j++;  
        }  
    k++;  
    }  
    while (i<l)  
    {  
    arr[k] = LeftArray[i];  
    i++;  
    k++;  
    }  
    
    while (j<r)  
        {  
        arr[k] = RightArray[j];  
        j++;  
        k++;  
        }  
    }
public static void mergeSort(int arr[], int beg, int end)  
{
    if (beg<end)  
    {  
        int mid = (beg+end)/2;  
        mergeSort(arr, beg, mid);  
        mergeSort(arr , mid+1, end);  
        merge(arr, beg, mid, end);  
    }  
} 
} 