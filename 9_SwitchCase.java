class SwitchCase{
    public static void main(String ar[]){
        
        //old version
        switch(/*condition*/2){
            case 1:
                //statement
                System.out.println("one");
                break;
            case 2:
                //statement
                System.out.println("two");
                break;
            default:
                System.out.println("not found");
                //statement
        }


        // new version type 1

        switch(/*condition*/2){
            case 1->System.out.println("one");
            case 2->System.out.println("two");
            default ->System.out.println("not found");
    
        }


        // new version type 2
        int rs;
        rs = switch(/*condition*/2){
            case 1 -> 1;
            case 2 -> 2;
            default -> 0;
        };

        System.out.println(rs);


        // new version type 3
        int res;
        res = switch(/*condition*/147){
            case 1 : yield 1;
            case 2 : yield 2;
            default : yield 0;
        };

        System.out.println(res);


    
    }
}