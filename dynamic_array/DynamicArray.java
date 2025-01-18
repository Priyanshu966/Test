package dynamic_array;

public class DynamicArray {
    private int data[];
    private int nextElementIndex;
    public DynamicArray(){
        data = new int[5];
        nextElementIndex = 0;
    }
    public int size(){
        return nextElementIndex;
    }
    public boolean isEmpty(){
        return nextElementIndex == 0;
    }
    public int get(int index){
        if(index >= nextElementIndex){
            return 0;
        }
        return data[index];
    }
    public void set(int index,int num){
        if(index >= nextElementIndex){
            return;
        }
        data[index] = num;
    }
    public void add(int num){
        if(nextElementIndex == data.length){
            expand();
        }
        data[nextElementIndex] = num;
        nextElementIndex++;

    }
    public void add(int index, int num){
        if(index < 0){
            return;
        }
        if(index < nextElementIndex){
            data[index] = num;
            // int temp[] = data;
            // int k = 0;
            // data = new int[temp.length + 1];
            // for(int i = 0; i < index; i++){
            //     data[i] = temp[k]; 
            //     System.out.println(temp[k]);
            //     k++;
            // }

            // data[index] = num;

            // for(int i = index + 1; i < data.length; i++){
            //     data[i] = temp[k];
            //     k++;
            // }
            // nextElementIndex++;

        }else if(index >= nextElementIndex && index < data.length){
            data[index] = num;
            nextElementIndex = index + 1;
        }else if(index >= data.length){
            while(index >= data.length){
                expand();
            }
            data[index] = num;
            nextElementIndex = index + 1;
        }
    }
    public void removeLast(){
        if(nextElementIndex == 0){
            return;
        }
        data[nextElementIndex - 1] = 0;
        nextElementIndex--;
    }
    private void expand(){
        int temp[] = data;
        data = new int[temp.length * 2];
        for(int i = 0; i < temp.length; i++){
            data[i] = temp[i];
        }
    }
    public void print(){
        for(int i = 0; i < nextElementIndex; i++){
            System.out.println(data[i]);
        }
    }
    
}
