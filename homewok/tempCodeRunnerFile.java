package homewok;
Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Bien: ");
            int x = sc.nextInt();
            a[i] = x;
        }
        System.out.println();
        System.out.print("Mang: ");
        for(int out : a){
            System.out.print(out+ " ");
        }
        System.out.println();
        System.out.println("Check so nguyen to");
        for(int out : a){
            if(CheckPrime(out)){
                System.out.print(out + " ");
            }
        }
        System.out.println();       
        SumPrime(a);