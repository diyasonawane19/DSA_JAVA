
public class day1 {

    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }

    //Linear search

    public static int linearSearch(int marks[],int key){
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
            }
        }
        return -1;
        

    }
    public static void main(String[] args) {
        // int marks[] = new int[5];
        // int num[]={1,2,3,4,5,6,7,8,9,10};
        // String mau[] ={"apple","a","b","c","d"};
        // Scanner sc = new Scanner(System.in);

        // System.out.println(marks[1]);
        // System.out.println("Enter the marks of physics:");


        // int phy = sc.nextInt();
        // System.out.println(phy);

        int marks[] = {97, 98, 99, 100, 95,67};
        int key=67; 

        int index=linearSearch(marks, key);
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("Key found at index: " + index);
        }
        
        // update(marks);
        //  for(int i=0;i<marks.length;i++){
        //     System.out.print(marks[i] + " ");
        // }
        //  System.out.println();
    }
}
