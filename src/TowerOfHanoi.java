public class TowerOfHanoi {

    public static void main(String[] args) {
        towerOfHanoi(3, 'A','C','B');
    }

    public static void towerOfHanoi(int n, char from_rod,
                             char to_rod, char aux_rod)
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from rod "+
                    from_rod+" to rod "+to_rod);
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk "+ n + " from rod " +
                from_rod +" to rod " + to_rod );
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }

}


//    Take an example for 2 disks :
//        Let rod 1 = 'A', rod 2 = 'B', rod 3 = 'C'.
//
//        Step 1 : Shift first disk from 'A' to 'B'.
//        Step 2 : Shift second disk from 'A' to 'C'.
//        Step 3 : Shift first disk from 'B' to 'C'.
//
//        The pattern here is :
//        Shift 'n-1' disks from 'A' to 'B'.
//        Shift last disk from 'A' to 'C'.
//        Shift 'n-1' disks from 'B' to 'C'.
