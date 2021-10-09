import java.util.Scanner;

class Homework3
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int n = input.nextInt(); // 입력받을 정수 개수
        Integer[] arr = new Integer[n]; // 정수 개수 저장
        System.out.print("수를 입력하세요 : ");
        for(int i=0;i<arr.length; i++){
            arr[i]=Integer.parseInt(input.next());
        }
        int min = arr[0]; //최소값
        int max = arr[0]; //최대값
        for(int i=1; i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("최대값:"+max);
        System.out.println("최소값:"+min);

    }
}

