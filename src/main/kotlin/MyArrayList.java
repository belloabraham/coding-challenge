

public class MyArrayList {

    int[] numbers;
    int count =0;

    public MyArrayList(int length){
        numbers = new int[length];
    }

    public  void insert(int item){
        if (count != numbers.length) {
            var arrayWithNewLength = new int[numbers.length * 2];
            for (int i = 0; i <= numbers.length; i++) {
                arrayWithNewLength[i] = numbers[i];
            }
            numbers = arrayWithNewLength;
        }

        numbers[count++] = item;
    }

    public void removeAt(int index){
        if(index < 0 || index >= count ){
             throw new IndexOutOfBoundsException("Index out of range");
        }

        for (int i = index; i < count; i++){
            numbers[i] = numbers[1+1];
        }
        count--;
    }

    public void print (){
        for (int number : numbers) {
            System.out.println(number);
        }

    }

}
