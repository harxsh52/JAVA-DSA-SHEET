package Bianrysearch.Medium;

public class kthelement2array {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int i=0,j=0,count=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                count++;
                if(count==k){
                    return a[i];
                }
                i++;
            }else{
                count++;
                if(count==k){
                    return b[j];
                }
                j++;
            }
        }
        while(i<a.length){
            count++;
            if(count==k){
                return a[i];
            }
            i++;
        }
        while(j<b.length){
            count++;
            if(count==k){
                return b[j];
            }
            j++;
        }
        return -1;
    }
}
