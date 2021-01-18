import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class isSibling {

    public static void main(String[] args) {
        int input1 = 6;
        int[] input2 = {1, 2, 3, 4, 5, 6};
        int input3 = 5;
//        int input1 = 5;
//        int[] input2 = {1, 2, 3, 4, 5};
//        int input3 = 1;

        int[] results = findSibling(input1, input2, input3);
        System.out.println(".......");
        for (int i = 0; i < results.length; i++) {
            //be aware of output arrays item by item. println cant print arrays as well
            System.out.print(String.valueOf(results[i]) + ",");
        }
    }

    public static int[] findSibling(int input1, int[] input2, int input3) {
        int[] results=new int[] {-1};
        if (input2[0] == input3) {
            return results;
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        int input2Trav = 0;
        boolean flag1 = false;
        boolean flag2= false;
        while(q.isEmpty()==false && flag1 == false && flag2 == false ){
            int  qSize = q.size();
            int curNum;
            for (int i = 0; i < qSize; i++){
                curNum = q.peek();
                if (2*curNum+1>=input1){
                    q.remove();
                    break;
                }
                if (input2[2*curNum+1] == input3){
                    flag1 = true;
                }
                if (flag1!= true){
                    q.add(2*curNum+1);
                }

                if (2*curNum+2>=input1){
                    q.remove();
                    break;
                }
                if (input2[2*curNum+2] == input3){
                    flag2 = true;
                }
                if (flag2!= true){
                    q.add(2*curNum+2);
                }
                q.remove();
            }
        }

        int newarr[] = new int[q.size()];
        int theSize = q.size();
        int i = 0;
        while(i <theSize){
            System.out.println(i + ": "+q.peek());
            newarr[i]=input2[q.peek()];
            q.remove();
            i++;
        }
        return newarr;
    }

//    public static void main(String[] args) throws IOException {
//
//        int[] inputArray = new int[] {1, 2, 3, 4, 5};
//        int siblingsToFindOf = 1;
//        int[] results = findSiblings(inputArray.length, inputArray, siblingsToFindOf);//lenth as array len
//
//        for(int i=0;i<results.length;i++){ //be aware of output arrays item by item. println cant print arrays as well
//            System.out.print(String.valueOf(results[i]) + ",");
//        }
//
//    }
//
//    public static int[] findSiblings(int input1, int[] input2, int input3) {
//        int[] result = new int[] {-1};
//        if (input2[0] == input3) {
//            return result;
//        }
//
//        int siblingFindIndex = -1;
//        for(int i=0;i<input2.length;i++){
//            if(input2[i]==input3) { //If element at i position is search element
//                siblingFindIndex = i;
//                break; // end loop
//            }
//        }
//        if(siblingFindIndex>-1){ //index was found in integer array
//            result = new int[]{input2[siblingFindIndex-1],input2[siblingFindIndex+1]};
//            // add found index+1 as upper sibling and found Index -1 as lower sibling
//            //to do -> check if both elements exists so there can be no array out of bounds
//        }
//
//        return result;
//
//    }
//    public static void main(String[] args) {
//
//        int input1 = 6;
//        int[] input2={1,2,3,4,5,6};
//        int input3 = 5;
//        findSibling(input1, input2,input3);
//    }
//
//    public static int[] findSibling( int input1, int[] input2, int input3) {
//        int[] retArr;
//
//        if ( 1 == input1) { //1 is the root of the tree and has no sibling
//            retArr = new int[1];
//            retArr[0] = -1;
//            return retArr;
//        } else {
//            int startPos =0, endPos = 0;
//            int iLen = input2.length;
//            System.out.println(iLen);
//            for (int ind=0; ind < iLen; ind++) {
//                startPos = endPos +1;
//                endPos += input2[ind+1];
//                System.out.println("startPos: " + startPos + " endPos: " + endPos);
//
//                if ( endPos >= input1-1 || endPos >= input3) {
//                    if ( endPos >= input1-1) endPos = input1-1;
//                    break;
//                }
//            }
//            endPos = Math.max( input3, endPos);
//            int size = endPos - startPos +1;
//            if ( 1 == size) {
//                retArr = new int[1];
//                retArr[0]=-1;
//                return retArr;
//            }
//            retArr = new int[size-1];
//            for ( int ind=0, indS =0; indS <= endPos; indS++) {
//                if ( indS == input3) continue;
//                retArr[ind++] = input2[ indS -1];
//            }
//        }
//
//        for (int i = 0; i < retArr.length; i++){
//            System.out.println(retArr[i]+ "kkkk");
//        }
//        return retArr;
//    }
}

//
//
//public Class customExecption extends {
//    public CustomException(String message){
//        ResponseBuilderImp builder = new ResponseBuilderImpl();
//        builder status(Response.Status.COMFLICT);
//        builder entity(message);
//        Super(builder.build());
//    }
//}

